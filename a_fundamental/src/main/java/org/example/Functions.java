package org.example;

public class Functions {
    //    AccessSpecifier ReturnType NameOfMethod/Function (Parameter List)
    int a;
    int b;

    public Functions(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int hasil() {
        return a + b;
    }
}
