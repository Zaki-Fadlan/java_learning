package org.example;

public class Main {
    public static void main(String[] args) {
        DataTypes myDataTypes = new DataTypes();
        myDataTypes.myByte = Byte.MAX_VALUE;
        myDataTypes.myInteger = Integer.MAX_VALUE;
        myDataTypes.myLong = 9223372036854775807L;
        myDataTypes.myShort = Short.MAX_VALUE;

        myDataTypes.myFloat = 3.3232323f;
        myDataTypes.myDouble = 23.544444444444444d;
        myDataTypes.myBoolean = false;
        myDataTypes.myChar = 65;

        myDataTypes.myString = "Hello World!";
        myDataTypes.myArray = new String[]{"Hello", "World"};

        Conditionals myConditional = new Conditionals(21, "Hujan");
        Functions myFunctions = new Functions(12, 20);
        System.out.println(myFunctions.hasil());


    }
}