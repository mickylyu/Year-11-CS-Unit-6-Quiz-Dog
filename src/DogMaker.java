public class DogMaker {
  
  public static void main(String[] args) {
    Dog dog = new Dog(2, "Jill", "Black and Tan");
    String jessie = dog.setName("Jessie");
    System.out.println(dog.getAge());
    System.out.println(dog.birthday());
    System.out.println(dog);
  }
    
}
  

