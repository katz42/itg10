package main.java.ezhidkova.week02;

public class variablesExample {

    public static void main(String[] args) {
        //non-primitive data type

        String firstString = new String("\"First String\"");
        String itsAString = "\"Hello World\"";
        //primitive data types
        int i = 111111111;
        Integer intBoxed;
        intBoxed = Integer.valueOf(i);

        int i2 = 987654321;
        Integer intBoxed2;
        intBoxed2 = new Integer(i2);

        int i3 = 1234567890;
        Integer intBoxed3;
        intBoxed3 = i3;

        Integer intBoxed4 = 123456;
        Integer i4;
        i4 = intBoxed4.intValue();

        Integer intBoxed5 = -654321;
        Integer i5;
        i5 = intBoxed5;

        byte a = 127;
        Byte byteBoxed;
        byteBoxed = Byte.valueOf(a);

        byte a2 = -128;
        Byte byteBoxed2;
        byteBoxed2 = new Byte(a2);

        byte a3 = 0;
        Byte byteBoxed3;
        byteBoxed3 = a3;

        Byte byteBoxed4 = 42;
        Byte a4;
        a4 = byteBoxed4.byteValue();

        Byte byteBoxed5 = 13;
        Byte a5;
        a5 = byteBoxed5;

        short b = -32000;
        Short shortBoxed;
        shortBoxed = Short.valueOf(b);

        short b2 = 32000;
        Short shortBoxed2;
        shortBoxed2 = new Short(b2);

        short b3 = 0;
        Short shortBoxed3;
        shortBoxed3 = b3;

        Short shortBoxed4 = 123;
        Short b4;
        b4 = shortBoxed4.shortValue();

        Short shortBoxed5 = -123;
        Short b5;
        b5 = shortBoxed5;

        double c = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165F;
        Double doubleBoxed;
        doubleBoxed = Double.valueOf(c);

        double c2 = 9.3454575672342342346;
        Double doubleBoxed2;
        doubleBoxed2 = new Double(c2);

        double c3 = 0.12345678901234567890;
        Double doubleBoxed3;
        doubleBoxed3 = c3;

        Double doubleBoxed4 = 0.546446457567324;
        Double c4;
        c4 = doubleBoxed4.doubleValue();

        Double doubleBoxed5 = 223436556.3453645675674;
        Double c5;
        c5 = doubleBoxed5;

        float d = 0.000000000000000000000000000000000000000000001F;
        Float floatBoxed;
        floatBoxed = Float.valueOf(b);

        float d2 = 1.3445678887F;
        Float floatBoxed2;
        floatBoxed2 = new Float(d2);

        float d3 = 45768.457678789F;
        Float floatBoxed3;
        floatBoxed3 = d3;

        Float floatBoxed4 = 45857034.4095680495F;
        Float d4;
        d4 = floatBoxed4.floatValue();

        Float floatBoxed5 = 23424.34534F;
        Float d5;
        d5 = floatBoxed5;

        long e = -2222222222222222222L;
        Long longBoxed;
        longBoxed = Long.valueOf(e);

        long e2 = 3333333333333333333L;
        Long longBoxed2;
        longBoxed2 = new Long(e2);

        long e3 = 12345678L;
        Long longBoxed3;
        longBoxed3 = e3;

        Long longBoxed4 = 55555555555L;
        long e4;
        e4 = longBoxed4.longValue();

        Long longBoxed5 = 33333333333L;
        long e5;
        e5 = longBoxed5;

        char z = 1025;
        Character charBoxed;
        charBoxed = Character.valueOf(z);

        char z2 = 1024;
        Character charBoxed2;
        charBoxed2 = new Character(z2);

        char z3 = 1023;
        Character charBoxed3;
        charBoxed3 = z3;

        Character charBoxed4 = 1022;
        Character z4;
        z4 = charBoxed4.charValue();

        Character charBoxed5 = 1021;
        Character z5;
        z5 = charBoxed4;

        boolean x = true;
        Boolean booleanBoxed;
        booleanBoxed = Boolean.valueOf(x);

        boolean x2 = false;
        Boolean booleanBoxed2;
        booleanBoxed2 = new Boolean(x2);

        boolean x3 = true;
        Boolean booleanBoxed3;
        booleanBoxed3 = x3;

        Boolean booleanBoxed4 = false;
        Boolean x4;
        x4 = booleanBoxed4.booleanValue();

        Boolean booleanBoxed5 = true;
        Boolean x5;
        x5 = booleanBoxed5;

        // different ways to initialize "ы"
        char first = 'ы';
        char second = '\u044B';
        char third = 1099;

        System.out.println("That's a string - " + itsAString + ".");
        System.out.println("That's a string too - " + firstString + ".");
        System.out.println("Also there are some numbers: int = " + i + ", byte = " + a + ", short = " + b + ", double = " + c + ", float = " + d + ", long = " + e + ".");
        System.out.println("And other primitive data types: char = " + z + ", boolean = " + x + ".");
        System.out.println("Welcome first \"" + first + "\", second \"" + second + "\", third \"" + third + "\".");

        //task 6

        int triangleBase = 5;
        int triangleHeight = 8;
        int rightTriangleArea = triangleBase * triangleHeight / 2;
        double triangleHypotenuse = Math.sqrt((triangleBase*triangleBase) + (triangleHeight * triangleHeight));
        double rightTrianglePerimeter = triangleBase + triangleHeight + triangleHypotenuse;
        boolean perimeter15 = rightTrianglePerimeter > 15;
        boolean area30 = rightTriangleArea < 30;
        System.out.println("Гипотенуза прямоугольного треугольника со сторонами " + triangleBase + " и " + triangleHeight + " равна " + triangleHypotenuse);
        System.out.println("Площадь прямоугольного треугольника со сторонами " + triangleBase + " и " + triangleHeight + " равна " + rightTriangleArea);
        System.out.println("Периметр прямоугольного треугольника со сторонами " + triangleBase + " и " + triangleHeight + " равна " + rightTrianglePerimeter);
        System.out.println("Периметр больше 15? " + perimeter15);
        System.out.println("Площадь меньше 30? " + area30);

        //task 7

        int k = 50;
        int l = 20;

        ++k;
        --l;

        System.out.println(k);
        System.out.println(l);
        System.out.println(k < 22 && k >= 50);

        //task 8

        String trainingJava = "Training Java";

        System.out.println(trainingJava.length());
        System.out.println(trainingJava.charAt(4));
        System.out.println(java.time.LocalDate.now());
    }

}
