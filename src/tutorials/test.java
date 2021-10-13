package tutorials;

public class test {
    public static void main(String[] args) {

//        int x = 0;
//        do {
//            x++;
//        } while(false);
//        System.out.println(x); // Outputs 1

//            private int getSortOrder(String firstName, final String lastName) {
//            String middleName = "Patricia";
//            final String suffix = "JR";
//            int id = 0;
//            switch(firstName) {
//                case "Test": return 52; // we can use a return statement like a break to exit the switch;
//                case middleName: // DOES NOT COMPILE id = 5; is not a final variable even its has assigned;
//                    break;
//                    case suffix: // compiles because its final
//                    id = 0;
//                    break;
//                case lastName: // DOES NOT COMPILE, because its a final variable not constant;
//                    id = 8;
//                    break;
//                case 5: // DOES NOT COMPILE // not maching type String
//                    id = 7;
//                    break;
//                case 'J': // DOES NOT COMPILE // not maching type String
//                    id = 10;
//                    break;
//                case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE // not maching type String (represent enums)
//                    id=15;
//                    break; }
//            return id; }



            // Switch without "break" operator
//        int dayOfWeek = 5; switch(dayOfWeek) {
//            case 0: System.out.println("Sunday");
//            default: System.out.println("Weekday");
//            case 6: System.out.println("Saturday"); break;
//        }

//        int dayOfWeek = 5;
//        switch(dayOfWeek) {
//            default: System.out.println("Weekday"); break; // default is not required to be in the end
//            case 0: System.out.println("Sunday"); break;
//            case 6: System.out.println("Saturday"); break;
//        }


//        int y = 1;
//        int z = 1;
//        final int x = y>=10 ? y++ : z++; // right side evaluates
//        System.out.println(y+","+z); // Outputs 1,2

//        int y = 1;
//        int z = 1;
//        final int x = y<10 ? y++ : z++; // only one side evaluates
//        System.out.println(y+","+z); // Outputs 2,1

//        System.out.println((y > 5) ? 21 : "Zebra");
//        int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

//        int x = 1;
//        if(x = 5) { // DOES NOT COMPILE, using assignment operator instead of equals (==)
//        }

//        int x = 1;
//        if(x) { // DOES NOT COMPILE, x is not a boolean expression
//             }

        // The order is important
//        if(hourOfDay < 15) { System.out.println("Good Afternoon");
//        } else if(hourOfDay < 11) {
//            System.out.println("Good Morning"); // UNREACHABLE CODE
//        } else {
//            System.out.println("Good Evening");
//        }


//        if(hourOfDay < 11)
//            System.out.println("Good Morning");
//            morningGreetingCount++;  // trick with indentation . Its not related to the if statement;


//        File x = new File("myFile.txt");
//        File y = new File("myFile.txt");
//        File z = x;
//        System.out.println(x == y); // Outputs false System.out.println(x == z); // Outputs true

//        boolean y = false;
//        boolean x = (y == true);
//        System.out.println(x); // false

//        boolean y = false;
//        boolean x = (y = true);
//        System.out.println(x); // true


//        Right side is never evaluated , since left is true!
//        int x = 6;
//        boolean y = (x >= 6) || (++x <= 7);
//        System.out.println(x);

//        long x = 5;
//        long y = (x = 3);
//        System.out.println(x);
//        System.out.println(y);

//        long x = 10;
//        int y = 5;
//        y *= x;

//        long x = 10;
//        int y = 5;
//        y = (int) (y * x);

       // int x , z = 3;
        //  x = x * z;

//        short x = 10;
//        short y = 3;
//       short z = (short) (x * y); // explicit casting


//        long[] arr = {3, 4};
//        //for (int x: arr) { // cast to int
//           // System.out.println(x);
//        }

//      int x = 3;
//      int y = ++x * 5 / x-- + --x;
//        System.out.println(x);
//        System.out.println(y);
//
//        int a = 4;
//        float b = 44f;
//
//        byte c = 127;
//        byte d = (byte) (c +3);
//        System.out.println(d);

//        int var1 = 10;
//        int var2 = 9;
//       // System.out.println("the value3 : " + var1 + var2);
//        System.out.println("the value3 : " + (var1 + var2));
//        System.out.println("the value3 : " + var1 % var2);
//        System.out.println("the value3 : " + var1 / var2);
//        System.out.println("the value3 : " + (var1 - var2));

//        int i = 1;
//        System.out.println(i = 5);
//        System.out.println(i);

//        int x = 0;
//        System.out.println(++x==x++);


    }
}
