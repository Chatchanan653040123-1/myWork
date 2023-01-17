package exercise;

abstract class EnKKUStudent22 {
    abstract public void register();
}

class COEStudent22 extends EnKKUStudent22 {

    public void register() {
        System.out.println("A COE student register EN811301 and EN811302");
    }
}

class DMEStudent22 extends EnKKUStudent22 {

    public void register() {
        System.out.println("A DME student register EN843204 and EN843205");
    }
}
