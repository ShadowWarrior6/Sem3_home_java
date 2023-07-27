package Homework;



   class task01 implements cat{
    public static void main(String[] args) {
    Ivalue value;
    value = ()->"Я Сёма это мой интерфейс ";
    System.out.println(value.getValue());
    Cat cat=new Cat("Семён", 5);
    Owner owner=new Owner("Jhon");
    System.out.println("Мяу! Меня зовут:" +  cat.getName()+ "  мне " +cat.getAge() + "  лет моего хозяиня зовут " + owner.getName());

}

}