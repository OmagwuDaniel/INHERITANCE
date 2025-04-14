//SINGLE INHERITANCE
class Person{
    public void show(){
        System.out.println("the person is a student");
    }
}

class Student extends Person{
    public void display(){
        System.out.println("new student");
    }
    public static void main(String[] args) {
        Student input=new Student();
        input.display();
        input.show();

    }

}
