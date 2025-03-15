package oop;

public class Square {
    int side;
    static int counter;
    static Square[] squares = new Square[3];
    public Square(int side) {
        this.side = side;
        squares[counter++] = this;

    }

    }

//    static int getCounter(){
//        return counter;
//    }

//    static int getArea(){
//        return this.side * 4;
//    }

//    int getArea(){
//        System.out.println(counter);
//    }

