package t2;

import java.util.ArrayList;

class Animal{

	public void move() {
		
		System.out.println("��������");
	}
}
class Human extends Animal{
	
	
	public void move() {
	System.out.println("�ι�two");	
	}
}
class Tiger extends Animal{
	
	
	public void move() {
	System.out.println("�׹�f");	
	}
}
class Eagle extends Animal{
	
	
	public void move() {
	System.out.println("����fly");	
	}
}

public class AnimalTest{
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human ();
		Animal tAnimal = new Tiger ();
		Animal eAnimal = new Eagle ();
		
		AnimalTest test = new AnimalTest ();
//		
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
//		
		
		ArrayList<Animal>animlList = new ArrayList<>();
		animlList.add(hAnimal);
		animlList.add(tAnimal);
		animlList.add(eAnimal);
		
		for(Animal animal : animlList) {
			animal.move();
			
			System.out.println(animlList);
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
