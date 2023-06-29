package com.company.Exercise2;

public class Application {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        Projector[] ps = new Projector[5];

        faculty.startProjector(projector);
        projector.name = "projector1";
        faculty.startProjector(projector.name);

        for(int i = 0; i < ps.length; i++){
            Projector p = new Projector();
            p.name = "Projector" + i;
            ps[i] = p;
        }

        faculty.removeProjector(ps);
    }
}
