package app;

import dao.IteamDA0;
import model.Item;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IteamDA0 dao = new IteamDA0();
        int choice;

        do {
            System.out.println("\nHIBERNATE:");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    dao.addItem(new Item(name, price));
                    System.out.println("Item added.");
                    break;

                case 2:
                    List<Item> items = dao.getAllItems();
                    System.out.println("All Items:");
                    for (Item item : items) {
                        System.out.println(item);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Item updateItem = dao.getItemById(updateId);
                    if (updateItem != null) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new price: ");
                        double newPrice = sc.nextDouble();
                        updateItem.setName(newName);
                        updateItem.setPrice(newPrice);
                        dao.updateItem(updateItem);
                        System.out.println("Item updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteItem(deleteId);
                    System.out.println("Item deleted if ID existed.");
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Item foundItem = dao.getItemById(id);
                    if (foundItem != null) {
                        System.out.println("Found: " + foundItem);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}

/*
 
HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: Book
Enter price: 87.98
Aug 05, 2025 3:33:20 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Aug 05, 2025 3:33:20 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Aug 05, 2025 3:33:21 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Aug 05, 2025 3:33:21 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_demo]
Aug 05, 2025 3:33:21 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
Aug 05, 2025 3:33:21 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Aug 05, 2025 3:33:21 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Aug 05, 2025 3:33:22 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Aug 05, 2025 3:33:23 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@4bb8855f] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Aug 05, 2025 3:33:23 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: 
    insert 
    into
        Item
        (name, price) 
    values
        (?, ?)
Item added.

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
All Items:
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=Pen, price=15.5]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
Item [id=7, name=Pen, price=15.5]
Item [id=8, name=Pencil, price=10.0]
Item [id=9, name=Marker, price=20.5]
Item [id=10, name=Refil, price=5.6]
Item [id=11, name=Book, price=87.98]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 4
Enter ID to delete: 9
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Hibernate: 
    delete 
    from
        Item 
    where
        id=?
Item deleted if ID existed.

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
All Items:
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=Pen, price=15.5]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
Item [id=7, name=Pen, price=15.5]
Item [id=8, name=Pencil, price=10.0]
Item [id=10, name=Refil, price=5.6]
Item [id=11, name=Book, price=87.98]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 3
Enter ID to update: 2
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Item not found.

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
All Items:
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=Pen, price=15.5]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
Item [id=7, name=Pen, price=15.5]
Item [id=8, name=Pencil, price=10.0]
Item [id=10, name=Refil, price=5.6]
Item [id=11, name=Book, price=87.98]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 3
Enter ID to update: 3
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Enter new name: 2
Enter new price: 0
Hibernate: 
    update
        Item 
    set
        name=?,
        price=? 
    where
        id=?
Item updated.

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: 
    select
        item0_.id as id1_0_,
        item0_.name as name2_0_,
        item0_.price as price3_0_ 
    from
        Item item0_
All Items:
Item [id=1, name=Pen, price=20.0]
Item [id=3, name=2, price=0.0]
Item [id=4, name=Pencil, price=10.0]
Item [id=5, name=Marker, price=20.5]
Item [id=6, name=Refil, price=5.6]
Item [id=7, name=Pen, price=15.5]
Item [id=8, name=Pencil, price=10.0]
Item [id=10, name=Refil, price=5.6]
Item [id=11, name=Book, price=87.98]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 4
Enter ID to delete: 3
Hibernate: 
    select
        item0_.id as id1_0_0_,
        item0_.name as name2_0_0_,
        item0_.price as price3_0_0_ 
    from
        Item item0_ 
    where
        item0_.id=?
Hibernate: 
    delete 
    from
        Item 
    where
        id=?
Item deleted if ID existed.

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 
*/
