package Homework;

 public interface cat {
    class Cat {
    public  String name;
    public  int age;
    public Cat(String name , int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    }
}

class Owner{
    private String name ;
    public Owner(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
