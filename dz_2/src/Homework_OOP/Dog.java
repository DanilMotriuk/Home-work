package Homework_OOP;

public class Dog {

    private String name;

    private int weight;

    private int height;

    private int age;

    public Dog(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(int weight){
        if (weight > 0){
            this.weight = weight;
        }
    }

    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
      if(height > 0){
          this.height = height;
      }
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void printToConsole(){
        System.out.println("Our " + getName() + " is " + getAge() + " years old " + "his height is " + getHeight() +  " cm " + "and his weight is " + getWeight() + "kg");
    }
}
