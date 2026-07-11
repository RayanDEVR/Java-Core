interface A {
    void show();
}

interface B {
    void config();
}

interface C extends A,B {
    void run();
}

class X implements C {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

}



class InterfaceInheritance {
    public static void main(String[] args) {
        C obj;
        obj = new X();
        obj.show();
        obj.config();
        obj.run();
    }
}

