package l_25_04_2025.abstract_classes;

public interface Animal {
    void breathe();
}

interface Cat extends Animal{
    void meow();
}

class WildCat implements Cat {
    private String name;

    public WildCat(String name) {
        this.name = name;
    }

    @Override
    public void meow() {

    }

    @Override
    public void breathe() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        Cat cat = new WildCat("Мурзик");
        System.out.println(((WildCat) cat).getName());
        if (cat instanceof WildCat){

        }
    }
}