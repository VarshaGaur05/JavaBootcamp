package com.objectOriented;

public class FoodInhertitence {
    /*
    Description
Complete the following code to implement the inheritance. Write a third class named Dish and its constructor, and define the class such that on creating the object of the Dish class prints the following as shown below.
Input: No input required
Output:
Food: Eat
Type: Spanish
Have: Gazpacho
     */
    /*
    class Food{
     Food(){
        System.out.println("Food: Eat");
    }
}

class Spanish extends Food {
     Spanish(){
        System.out.println("Type: Spanish");
    }
}
// Define the third class here.
class Dish extends Spanish{
    Dish(){
        System.out.println("Have: Gazpacho");
    }
}
public class Source
{
	public static void main(String[] args) {
	  Dish bird = new Dish();
	}
}
     */

    public static void main(String[] args) {
        Dish bird = new Dish();
    }
}

    class Food{
        Food(){
        System.out.println("Food: Eat");
        }
        }

class Spanish extends Food {
    Spanish(){
        System.out.println("Type: Spanish");
    }
}

class Dish extends Spanish {
    Dish() {
        System.out.println("Have: Gazpacho");
    }
}
