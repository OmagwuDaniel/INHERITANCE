class Physics{
    public void display(){
        System.out.println("he studies physics");


    }
}

class James extends Physics {
    public void details() {
        System.out.println("james studies Physics");

    }
}

class Peace extends Physics {
    public void show() {
        System.out.println("Peace studies Physics");

    }
    public static void main(String[] args) {
        James input=new James();
        input.display();
        input.details();



        Peace done=new Peace();
        done.show();
        done.display();






    }
}