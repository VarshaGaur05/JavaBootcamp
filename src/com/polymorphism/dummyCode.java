package com.polymorphism;

public class dummyCode {
    /*public static void main (String args[]) {
		List<Scientist> team = new ArrayList<>();
		team.add(new Godel());
		team.add(new Tesla());

		System.out.println("Scientist list");
		for(Scientist scientist : team){
			scientist.printTheory();
		}
	}*/
	/*public static class superclass
	{
		void print()
		{
			System.out.println("superclass.");
		}
	}

	public static class subclass extends superclass
	{

		void print()
		{
			System.out.println("subclass.");
		}
	}

	public static void main(String[] args)
	{
		superclass A = new superclass();
		superclass B = new subclass();
		A.print();
		B.print();
	}*/
    public static class superclass
    {
        static void print()
        {
            System.out.println("superclass.");
        }
    }
    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}

/*class Scientist {
 private String theory = ("Science");
 public void printTheory() {
 System.out.println(theory);
 }
 }
 class Godel extends Scientist {
 private String theory = ("Mathematics");
 public void printTheory() {
 System.out.println(theory);
 }
 }

 class Tesla extends Scientist {
 private String theory = ("Physics");
 public void printTheory() {
 System.out.println(theory);
 }
 }*/
