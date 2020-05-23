package examples;

public class VariablesExample {
    
    public static void main(String[] args) {
        
        boolean myBoolean = false; // true or false

        byte myByte = 2; // -128 to 127 
                            //8 bits of memory (1 byte)

        short myShort = 3; // -2^15 to 2^15 -1 
                            //16 bits (2 bytes)

        char myChar = 'b'; // unicode = '\u0000' to '\uffff'
                            // 16 bits (2 bytes)

        int myInt = 5;  // -2^31 to 2^31 -1
                        // 32 bits (4 bytes)

        float myFloat = 0.25f; // -2^31 to 2^31 -1
                                // 32 bits (4 bytes)
                                // non for precise valutes

        long myLong = 999999999999999999L; // -2^63 to 2^63 -1
                                            // 64 bits (8) bytes)

        double myDouble = 5.999d; // -2^63 to 2^63 -1
                                    // 64 bits (8) bytes)

        String myString = new String("This is a String object, created with a constructor!");

        System.out.println("'2 + 3 = " + (myByte + myShort));
        myBoolean = myInt < 6;
        System.out.println("Is myInt < 6? " + myBoolean);
        System.out.println("Here's some floating point division (myDouble / myFloat)");
        System.out.println((myDouble / myFloat));
        System.out.println("But what happens when we divide integers? 5 / 2 = ");
        System.out.println(myInt / myByte);
        System.out.println("There's no decimal, and no remainder!");

    }
}