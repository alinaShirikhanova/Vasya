package Lesson14_1.inheritance;

public class Mitsubishi extends Car {
    private String colour;

    public Mitsubishi(String model, int year, String colour) {
        super(model, year);
        this.colour = colour;
    }

    public Mitsubishi(String model, int year) {
        this(model, year, null);
    }

    void stop(){
        super.stop();
        System.out.println("mitsubishi");
    }
}
