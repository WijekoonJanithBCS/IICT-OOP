package ik.ikman.oop;

public class Car {

        int id;
        String brand;
        String model;
        String color;

        Car(int id, String brand, String model, String  color){
            this.id=id;
            this.brand=brand;
            this.model=model;
            this.color=color;
            }
        public void sayHi(){
            System.out.println("say hi 01");
        }
        public void sayHi(int a){
            System.out.println("say hi 02");
        }
        public void sayHi(int a,int b){
            System.out.println("say hi 03");
        }
        public void sayHi(int a,String b){
            System.out.println("say hi 04");
        }

}

