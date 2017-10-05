package com.jendoliver.io;
/**
 *
 *  @author = Jendoliver ;)
 *       TY Mar <3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputAsker
{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private InputAsker() {}

    /**
     * Asks the user for an int, checking for exceptions
     * @param msg = Message to print to the user
     * @return = int input by the user
     */
    public static int askInt(String msg)
    {
        int num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input an integer (example: 5)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user for an arraySize number of ints, checking for exceptions
     * @param msg = Message to print to the user
     * @param arraySize = Size of the array
     * @return = Plain array of ints input by the user
     */
    public static int[] askIntArray(String msg, int arraySize)
    {
        int[] intArray = new int[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            intArray[i] = askInt((i+1) + ": ");
        }
        return intArray;
    }

    /**
     * Asks the user for a listSize number of ints, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = size of the ArrayList
     * @return = ArrayList of Integers input by the user
     */
    public static ArrayList<Integer> askIntArrayList(String msg, int listSize)
    {
        ArrayList<Integer> integerList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            integerList.add(askInt((i + 1) + ": "));
        }
        return integerList;
    }

    /**
     * Asks the user for an unsigned int, checking for exceptions
     * @param msg = Message to print to the user
     * @return = Unsigned int input by the user
     */
    public static int askUnsignedInt(String msg)
    {
        int num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Integer.parseInt(br.readLine());
                if (num < 0) {
                    System.out.println("Please provide an unsigned integer ( > 0 )");
                } else {
                    error = false;
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input an unsigned integer (example: 5)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user an arraySize number of ints, checking for exceptions
     * @param msg = Message to print to the user
     * @param arraySize = Size of the array
     * @return = Plain array of unsigned ints input by the user
     */
    public static int[] askUnsignedIntArray(String msg, int arraySize)
    {
        int[] unsignedIntArray = new int[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            unsignedIntArray[i] = askUnsignedInt((i+1) + ": ");
        }
        return unsignedIntArray;
    }

    /**
     * Asks the user a listSize number of ints, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = Size of the ArrayList
     * @return = ArrayList of unsigned Integers input by the user
     */
    public static ArrayList<Integer> askUnsignedIntArrayList(String msg, int listSize)
    {
        ArrayList<Integer> unsignedIntegerList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            unsignedIntegerList.add(askUnsignedInt((i + 1) + ": "));
        }
        return unsignedIntegerList;
    }

    /**
     * Asks the user for a double, checking for exceptions
     * @param msg = Message to print to the user
     * @return = double input by the user
     */
    public static double askDouble(String msg)
    {
        double num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input a double (example: 5.2)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user for an arraySize of doubles, checking for exceptions
     * @param msg = Message to print to the user
     * @param arraySize = Size of the array
     * @return = Plain array of doubles input by the user
     */
    public static double[] askDoubleArray(String msg, int arraySize)
    {
        double[] doubleArray = new double[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            doubleArray[i] = askDouble((i+1) + ": ");
        }
        return doubleArray;
    }

    /**
     * Asks the user for a listSize of doubles, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = Size of the ArrayList
     * @return = ArrayList of Doubles input by the user
     */
    public static ArrayList<Double> askDoubleArrayList(String msg, int listSize)
    {
        ArrayList<Double> doubleList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            doubleList.add(askDouble(i + ": "));
        }
        return doubleList;
    }

    /**
     * Asks the user for an unsigned double, checking for exceptions
     * @param msg = Message to print to the user
     * @return = double input by the user
     */
    public static double askUnsignedDouble(String msg)
    {
        double num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Double.parseDouble(br.readLine());
                if (num < 0) {
                    System.out.println("Please provide an unsigned double ( > 0 )");
                } else {
                    error = false;
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input an unsigned double (example: 5.2)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user for an arraySize of doubles, checking for exceptions
     * @param msg = Message to print to the user
     * @param arraySize = Size of the array
     * @return = Plain array of doubles input by the user
     */
    public static double[] askUnsignedDoubleArray(String msg, int arraySize)
    {
        double[] unsignedDoubleArray = new double[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            unsignedDoubleArray[i] = askUnsignedDouble((i+1) + ": ");
        }
        return unsignedDoubleArray;
    }

    /**
     * Asks the user for a listSize of doubles, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = Size of the ArrayList
     * @return = ArrayList of Doubles input by the user
     */
    public static ArrayList<Double> askUnsignedDoubleArrayList(String msg, int listSize)
    {
        ArrayList<Double> unsignedDoubleList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            unsignedDoubleList.add(askUnsignedDouble(i + ": "));
        }
        return unsignedDoubleList;
    }

    /**
     * Asks the user for a String, checking for exceptions
     * @param msg = Message to print to the user
     * @return = String input by the user
     */
    public static String askString(String msg)
    {
        String str = "";
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                str = br.readLine();
                error = false;
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            }
        } while (error);
        return str;
    }

    /**
     * Asks the user for listSize of Strings, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = Size of the ArrayList
     * @return = ArrayList of Strings input by the user
     */
    public static ArrayList<String> askStringArrayList(String msg, int listSize)
    {
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            stringList.add(askString((i+1) + ": "));
        }
        return stringList;
    }

    /**
     * Asks the user for a String which can't be empty, checking for exceptions
     * @param msg = Message to print to the user
     * @return = String input by the user
     */
    public static String askNonEmptyString(String msg)
    {
        String str = "";
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                str = br.readLine();
                if(str.equals(""))  {
                    System.out.println("Please don't provide an empty string");
                } else {
                    error = false;
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            }
        } while (error);
        return str;
    }

    /**
     * Asks the user for a listSize strings which can't be empty, checking for exceptions
     * @param msg = Message to print to the user
     * @param listSize = Size of the ArrayList
     * @return = ArrayList of no-empty Strings input by the user
     */
    public static ArrayList<String> askNonEmptyStringArrayList(String msg, int listSize)
    {
        ArrayList<String> nonEmptyStringList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            nonEmptyStringList.add(askNonEmptyString((i+1) + ": "));
        }
        return nonEmptyStringList;
    }

    /**
     * Asks the user a yes/no question, checking for String exceptions
     * @param msg = Message to print to the user, with an automatically added "(y/n)
     * @return = true if the users input y or Y, false if it inputs n or N
     */
    public static boolean askYNQuestion(String msg)
    {
        String str;
        do {
            str = askNonEmptyString(msg + " (y/n): ");
            if(str.equals("y") || str.equals("Y")) {
                return true;
            } else if (str.equals("n") || str.equals("N")) {
                return false;
            } else {
                System.out.println("Please answer with the letter Y (yes) or N (no)");
            }
        } while (true);
    }
}
