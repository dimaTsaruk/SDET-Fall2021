package tutorials;

public class test {
    public static void main(String[] args) {


//        //SwitchSample
//                FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
//                    for (char x = 'a'; x <= 'c'; x++) {
//                         if (a == 2 || x == 'b')
//                             continue FIRST_CHAR_LOOP;
//                    System.out.print(" " + a + x);  //1a 3a 4a
//                    }
//                 }


        // Search sample
//        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
//        int searchValue = 2;
//        int positionX = -1;
//        int positionY = -1;
//        PARENT_LOOP:
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//                if (list[i][j] == searchValue) {
//                    positionX = i;
//                    positionY = j;
//                    break PARENT_LOOP;
//                }
//            }
//        }
//        if (positionX == -1 || positionY == -1) {
//            System.out.println("Value " + searchValue + " not found");
//        } else {
//            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
//        }


        // adding labels
//        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
//            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++)
//            { System.out.print(mySimpleArray[i]+"\t");
//            }
//            System.out.println(); }

//        int x = 20; while(x>0) {
//            do {
//                x -= 2
//            } while (x>5);
//            x--;                      this line not related to while, exec. after finish while;
//            System.out.print(x+"\t");
//        }


//        int i = new Integer(9);
//        System.out.println(i);

//        int[] values = new int[3];
//        values[0] = 10;
//        values[1] = new Integer(5);
//        values[2] = 15;
//        for(int i=1; i<values.length; i++)  // array "length" NOT same as String "length()" !!!
//        { System.out.print(values[i]-values[i-1]);  // output -510;
//        }

        // comma after object Solution using if statement
//        java.util.List<String> names = new java.util.ArrayList<String>();
//        names.add("Lisa");
//        names.add("Kevin");
//        names.add("Roger");
//        for(int i=0; i<names.size(); i++)
//        { String name = names.get(i);
//            if(i>0) {
//            System.out.print(", "); }
//            System.out.print(name); }

        // same as next
//        for(String name : names) { System.out.print(name + ", ");
//        }
        // Same as previous
//        for(int i=0; i < names.length; i++) {
//            String name = names[i];
//            System.out.print(name + ", "); }

//        String[] names = new String[3]; // array init with 3 null pointer values
//        for(int name : names) { // DOES NOT COMPILE, incompatible types
//            System.out.print(name + " "); }

//        String names = "Lisa";
//        for(String name : names) { // DOES NOT COMPILE , String is not array or Iterable;
//            System.out.print(name + " "); }

        // ArrayList
//        java.util.List<String> values = new java.util.ArrayList<String>();
//        values.add("Lisa");
//        values.add("Kevin");
//        values.add("Roger");
//        for(String value : values)
//        { System.out.print(value + ", ");
//        }

        // simple array
//        final String[] names = new String[3];
//        names[0] = "Lisa";
//        names[1] = "Kevin";
//        names[2] = "Roger";
//        for(String name : names)
//        { System.out.print(name + ", ");  // output : Lisa, Kevin, Roger,
//        }

        // using loop variables outside the loop:
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++)
//        { System.out.print(y + " ");
//        }
//        System.out.print(x); // DOES NOT COMPILE

////        for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
////            // System.out.print(x + " ");
//        }

//        int x = 0;
//        long y = 10;
//        for( y = 0, x = 4; x < 5 && y < 10; x++, y++) { // works
//            System.out.print(x + " "); }

//        int x = 0;
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // COMPILE ERROR
//            System.out.print(x + " "); }

        // Multiple terms
//        int x = 0;
//        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++)
//        { System.out.print(y + " ");
//        } System.out.print(x);

        // Infinite loop
//        for( ; ; ) {
//            System.out.println("Hello World"); } // demonstrate that loop components are optional


//        for(int i = 0; i < 10; i++)
//        { System.out.print(i + " ");
//        }
        // i - outside the block

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
