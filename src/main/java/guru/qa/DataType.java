package guru.qa;

public class DataType {
    public static void main(String[] arg){
        boolean aBolean;

        byte aByte = 20; //-128 ... 127 ( 8 bit)
        short ashort= 300; // -32768 ... 32767 (16 bit)
        int aInt = 1499900; // 	от -2,147,483,648 до 2,147,483,647 (32 bit)
        long along = 109998800; // от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807 (64 bit)  --2^(bit-1)
        char summChar = '+';
        char subtractionChar = '-';
        char multiplicationChar = '*';
        char chardivision = '/';
        char equallyChar = '=';


//        //Шаблон для комментариев
//        System.out.printf("%d %c %d %c %d \n",*, summChar,*,equallyChar, * );
//        System.out.printf("%d %c %d %c %d \n",*, subtractionChar,*,equallyChar, * );
//        System.out.printf("%d %c %d %c %d \n",*, multiplicationChar,*,equallyChar, * );
//        System.out.printf("%d %c %d %c %d \n",*, chardivision,*,equallyChar, * );

        System.out.println("\n Type byte \n");

        byte secondByte = 50;
        byte multiplicationBytePerem = 5;
        byte divisionBytePerem = 2;

        byte summaByte = (byte) (aByte + secondByte);
        byte subtractionByte = (byte)(aByte - secondByte);
        byte multiplicationByte = (byte)(aByte * multiplicationBytePerem);
        byte divisionByte = (byte)(aByte / divisionBytePerem);

        System.out.printf("Summa %d and %d = %d \n", aByte, secondByte, summaByte);
        System.out.printf("%d %c %d %c %d \n",aByte, subtractionChar,secondByte,equallyChar, subtractionByte );
        System.out.println("multiplicationByte = " + multiplicationByte);
        System.out.printf("%d %c %d %c %d \n",aByte,chardivision,divisionBytePerem,equallyChar,divisionByte);

        System.out.println("\n Type short \n");

        short secondShort = 200;
        short summaShort = (short) (ashort + secondShort);
        short subtractionShort = (short) (ashort - secondShort);
        short multiplicationShort = (short) (ashort * 100);
        short divisionShort = (short) (ashort / 10);

        System.out.printf("%d %c %d %c %d \n",ashort, summChar,secondShort,equallyChar, summaShort );
        System.out.printf("%d %c %d %c %d \n",ashort, subtractionChar,secondShort,equallyChar, subtractionShort );
        System.out.printf("%d %c 1000 %c %d \n",ashort, multiplicationChar,equallyChar, multiplicationShort );
        System.out.printf("%d %c 10 %c %d \n",ashort, chardivision,equallyChar, divisionShort );


        System.out.println("\n Type int \n");
        int secondInt = 888888;

        int summaInt = aInt + secondInt;
        int subtractionInt = aInt - secondInt;
        int multiplicationInt = aInt * 100;
        int divisionInt = aInt / 10;

        System.out.printf("%d %c %d %c %d \n",aInt, summChar,secondInt,equallyChar, summaInt);
        System.out.printf("%d %c %d %c %d \n",aInt, subtractionChar,secondInt,equallyChar, subtractionInt );
        System.out.printf("%d %c 100 %c %d \n",aInt, multiplicationChar,equallyChar, multiplicationInt );
        System.out.printf("%d %c 10 %c %d \n",aInt, chardivision,equallyChar, divisionInt );


        System.out.println("\n Type long \n");
        long secondLong = 344422200;

        long summaLong = (long)(along + secondLong);
        long subtractionLong = (long) (along-secondLong);
        long multiplicationLong = (long)(along * 44);
        long divisionLong = (long) (along / 100);

        System.out.printf("%d %c %d %c %d \n",along, summChar,secondLong,equallyChar, summaLong );
        System.out.printf("%d %c %d %c %d \n",along, subtractionChar,secondLong,equallyChar, subtractionLong);
        System.out.printf("%d %c 44 %c %d \n",along, multiplicationChar,equallyChar, multiplicationLong );
        System.out.printf("%d %c 100 %c %d \n",along, chardivision,equallyChar, divisionLong );


        System.out.println("\n double");
        double peremenDoubleOne = 1.90;
        double peremenDoubletwo = 8.61;
        double summDouble = peremenDoubleOne + peremenDoubletwo;
        System.out.printf( "%f %c %f %c %f \n" ,peremenDoubleOne,summChar,peremenDoubletwo, equallyChar,summDouble);


        System.out.println("\n Marks");

        boolean checkBoolean= true;

        if (checkBoolean == true) {
            System.out.println("\n Marks on \n");
            aInt = 2147483647;
            secondInt = 2147483647;
            peremenDoubleOne = 999999999999.9999999;
            int multiplicationPerem = 5000;
            summaInt = aInt + secondInt;
            subtractionInt = aInt - secondInt * multiplicationPerem;
            multiplicationInt = aInt * multiplicationPerem;
            divisionInt = multiplicationPerem / aInt;
            double peremenSecondMarks = peremenDoubleOne + multiplicationPerem;

            System.out.printf("%d %c %d %c %d \n" ,aInt,summChar,secondInt, equallyChar, summaInt);
            System.out.printf("%d %c %d * %d %c %d \n",aInt, subtractionChar,secondInt,multiplicationPerem,equallyChar, subtractionInt );
            System.out.printf("%d %c %d %c %d \n",aInt,multiplicationChar,multiplicationPerem,equallyChar,multiplicationInt);
            System.out.printf("%d %c %d %c %d \n",multiplicationPerem ,chardivision,aInt , equallyChar,divisionInt);
            System.out.printf("%f %c %d %c %f \n",peremenDoubleOne,summChar,multiplicationPerem,equallyChar,peremenSecondMarks);
        } else {
            System.out.println("\n Marks off \n");
        }





    }
}
