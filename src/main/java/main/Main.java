package main;

import dao.IteamDA0;
import model.Item;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IteamDA0 dao = new IteamDA0();

        // Add some items
        dao.addItem(new Item("Pen", 15.5));
        dao.addItem(new Item("Pencil", 10.0));
        dao.addItem(new Item("Marker", 20.5));
        dao.addItem(new Item("Refil", 5.6));

        // Fetch all items
        List<Item> items = dao.getAllItems();
        System.out.println("All items:");
        items.forEach(System.out::println);

        // Fetch item by ID
        Item item = dao.getItemById(1);
        System.out.println("Item with ID 1: " + item);

        // Update item price
        if (item != null) {
            item.setPrice(20.0);
            dao.updateItem(item);
            System.out.println("Updated Item: " + dao.getItemById(1));
        }

        // Delete item with ID 2
        dao.deleteItem(2);
        System.out.println("After deleting item with ID 2:");
        dao.getAllItems().forEach(System.out::println);
    }
}

/*
 Hibernate: 
    insert 
    into
        Item
        (name, price) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        Item
        (name, price) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        Item
        (name, price) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        Item
        (name, price) 
    values
        (?, ?)
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
All items:
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=Pen, price=15.5]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Item with ID 1: Item [id=1, name=Pen, price=20.0]
Hibernate: 
    update
        Item 
    set
        name=?,
        price=? 
    where
        id=?
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Updated Item: Item [id=1, name=Pen, price=20.0]
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
After deleting item with ID 2:
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=Pen, price=15.5]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
*/
