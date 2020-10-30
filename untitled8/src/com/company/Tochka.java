package com.company;

public class Tochka {
    private double X;
    private double Y;

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public Tochka slogenie (Tochka slogaemoe) {
    Tochka rez = new Tochka();
    rez.X = this.X + slogaemoe.X;
    rez.Y = this.Y + slogaemoe.Y;
    return  rez;
    }
    public Tochka vichitanie (Tochka vichitaemoe) {
        Tochka rez = new Tochka();
        rez.X = this.X - vichitaemoe.X;
        rez.Y = this.Y - vichitaemoe.Y;
        return  rez;
    }

    @Override
    public String toString() {
        return X +" "+ Y;
    }


}
