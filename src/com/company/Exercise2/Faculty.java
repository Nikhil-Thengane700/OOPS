package com.company.Exercise2;

public class Faculty {
    public String name = " f1";

    public void startProjector(String name){
        System.out.println(name+" projector has been started ");
    }


    public void startProjector(Projector p){
        System.out.println(p+  " projector has been started");
    }


    public void removeProjector ( Projector [] projectors ){


        System.out.println("All projector has been removed");



    }
}

