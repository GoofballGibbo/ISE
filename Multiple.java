public class Main {
   public static void main(String[] args) {
   
   Dog dog = new Dog("Chris", 20);
   dog.setAge(7);
   dog.setName("Chris");
   System.out.println("Woof! My name is " + dog.getName())
   }
}


class Dog {
   private String name;
   private int age;
   
   public Dog(String inName, int inAge) {
      this.name = inName;
      this.age = inAge;
   }
   
   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
   
}