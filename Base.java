abstract class Base {
    int x;
    int y;

    void show() {
        System.out.print(x);
        System.out.print(y);
    }

    abstract void display();
}

class MyRegister {
    void register(Base c) {
        c.display();
    }
}

class Child extends Base {
    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.print("display");
    }

    public static void main(String... s) {
        Child c1 = new Child();
        //c1.get(10, 20);

        MyRegister m = new MyRegister();
        m.register(c1);
    }
}