package core_java_assignment1;

import org.animals.*;
public class Question18 {
	   public static void main(String[] args) {
	        Lion lion = new Lion();
	        Tiger tiger = new Tiger();
	        Deer deer = new Deer();
	        Monkey monkey = new Monkey();
	        Elephant elephant = new Elephant();
	        Giraffe giraffe = new Giraffe();

	        lion.printDetails();
	        System.out.println();

	        tiger.printDetails();
	        System.out.println();

	        deer.printDetails();
	        System.out.println();

	        monkey.printDetails();
	        System.out.println();

	        elephant.printDetails();
	        System.out.println();

	        giraffe.printDetails();
	    }
	}
/*
 * Lion -> Color: Golden, Weight: 190kg, Age: 8
Vegetarian: false, Can Climb: false, Sound: Roar

Tiger -> Color: Orange with black stripes, Weight: 220kg, Age: 7
Vegetarian: false, Can Climb: true, Sound: Growl

Deer -> Color: Brown, Weight: 80kg, Age: 4
Vegetarian: true, Can Climb: false, Sound: Bleat

Monkey -> Color: Grey, Weight: 40kg, Age: 5
Vegetarian: true, Can Climb: true, Sound: Chatter

Elephant -> Color: Grey, Weight: 5000kg, Age: 25
Vegetarian: true, Can Climb: false, Sound: Trumpet

Giraffe -> Color: Spotted yellow, Weight: 800kg, Age: 12
Vegetarian: true, Can Climb: false, Sound: Hum

 */


