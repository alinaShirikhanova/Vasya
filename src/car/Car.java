package car;



class Car {
    protected String model;
    public final void drive(){
        System.out.println("Машина едет" + model);
    }

}

//private - видно только внутри класса
//default - package visible
// protected - видно только в наследниках либо в классах, лежащих в том же пакете
//public - видно вообще везде

//class Helicopter{
//
//}



