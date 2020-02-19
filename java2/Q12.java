package java2;
// 12.What will be the  output on new Child(); ?
public class Q12 {
    public static void main(String[] args) {
        Grandparent gp = new Child();
       System.out.println("**************");
        Parent p = new Child();
        System.out.println("**************");
        Child c = new Child();

    }
}
class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Parent extends Grandparent {

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }

    static {
        System.out.println("static - parent");
    }
}


class Child extends Parent {

    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}
