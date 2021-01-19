package eu.senla.task1;

public class Main {
    byte aByte;
    short aShort;
    int anInt;
    double aDouble;
    float aFloat;
    char aChar;
    long aLong;
    boolean aBoolean;

    Byte byteWrapper;
    Short shortWrapper;
    Integer integerWrapper;
    Double doubleWrapper;
    Float floatWrapper;
    Character characterWrapper;
    Long longWrapper;
    Boolean booleanWrapper;


    public static void main(String[] args){

    Number number = new Number();
    System.out.println("__________________________________");
    System.out.print("get and set:");
    System.out.println("\n");
    number.setaByte((byte) 100);
    System.out.println("byte:" + number.getaByte());

    number.setaShort((short) 12345);
    System.out.println("short: "+number.getaShort());

    number.setAnInt((int) 1234567890);
    System.out.println("int: " +number.getAnInt());

    number.setaDouble((double) 1234567890.12);
    System.out.println("double: " + number.getaDouble());

    number.setaFloat((float) 3.14f);
    System.out.println("float: "+ number.getaFloat());

    number.setaChar((char) 'A');
    System.out.println("char: "+ number.getaChar());

    number.setaLong((long) 1234567890123L);
    System.out.println("long: "+ number.getaLong());

    number.setaBoolean((boolean) false);
    System.out.println("bool: "+ number.getaBoolean());

    System.out.println("__________________________________");

    byte aByte = 127;
    int aInt = aByte;
    double aDouble = (double) aInt;
    System.out.println("byte to int to double: " + aDouble);

    double a = (double) number.getaChar();
    System.out.println("char to double" + a);

    Integer aInte = 1000000000;
    Float aFlo = (float) aInte;
    System.out.println("Integer to Float: " + aFlo);

    float flo = 10.47f;
    int intt = (int) flo;
    System.out.println("float to int: " + intt);

    short shh = (short) number.getaLong();
    System.out.println("long to short: " + shh);






    }
}
