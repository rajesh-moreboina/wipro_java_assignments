package core_java_assignment1;

//Abstract class Person
abstract class Person
{
 public abstract void eat();
 public abstract void exercise();
}

//Athlete subclass
class Athlete extends Person 
{
 @Override
 public void eat() {
     System.out.println("Athlete eats a balanced diet with lots of proteins and carbs.");
 }

 @Override
 public void exercise() {
     System.out.println("Athlete trains intensely every day to stay in shape.");
 }
}

//LazyPerson subclass
class LazyPerson extends Person {
 @Override
 public void eat() {
     System.out.println("LazyPerson eats junk food and snacks all day.");
 }

 @Override
 public void exercise() {
     System.out.println("LazyPerson avoids exercise and prefers resting.");
 }
}

//Main class 
public class Question21 {
 public static void main(String[] args) {
     Person athlete = new Athlete();
     Person lazyPerson = new LazyPerson();

     athlete.eat();
     athlete.exercise();

     lazyPerson.eat();
     lazyPerson.exercise();
 }
}

/*
 Athlete eats a balanced diet with lots of proteins and carbs.
Athlete trains intensely every day to stay in shape.
LazyPerson eats junk food and snacks all day.
LazyPerson avoids exercise and prefers resting.
*/
