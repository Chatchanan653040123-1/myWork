interface Interface {
    void sayHello();

    void sayWebsite();
}

class Sample implements Interface {
    public void sayHello() {
        System.out.println("amplysoft");
    }

    public void sayWebsite() {
        System.out.println("www.amplysoft.com");
    }
}

class Test {
    public static void main(String args[]) {
        Sample s = new Sample();
        s.sayHello();
        s.sayWebsite();
    }
}