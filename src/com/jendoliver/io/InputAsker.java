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
import java.util.List;

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
     * @return = List of Integers input by the user
     */
    public static List<Integer> askIntList(String msg, int listSize)
    {
        List<Integer> integerList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            integerList.add(askInt((i + 1) + ": "));
        }
        return integerList;
    }

    /**
     * Asks the user for an int between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @return = int input by the user
     */
    public static int askIntBetween(String msg, int a, int b)
    {
        int num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Integer.parseInt(br.readLine());
                if (a <= b) {
                    if (num < a || num > b) {
                        System.out.println("Please input an integer between " + a + " and " + b);
                    } else {
                        error = false;
                    }
                } else {
                    if (num < b || num > a) {
                        System.out.println("Please input an integer between " + b + " and " + a);
                    } else {
                        error = false;
                    }
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input an integer (example: 5)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user for an arraySize number of ints between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @param arraySize = Size of the array
     * @return = Plain array of ints between a and b input by the user
     */
    public static int[] askIntBetweenArray(String msg, int a, int b, int arraySize)
    {
        int[] intArray = new int[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            intArray[i] = askIntBetween((i+1) + ": ", a, b);
        }
        return intArray;
    }

    /**
     * Asks the user for a listSize number of ints between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @param listSize = size of the ArrayList
     * @return = List of Integers between a and b input by the user
     */
    public static List<Integer> askIntBetweenList(String msg, int a, int b, int listSize)
    {
        List<Integer> integerList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            integerList.add(askIntBetween((i + 1) + ": ", a, b));
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
     * @return = List of unsigned Integers input by the user
     */
    public static List<Integer> askUnsignedIntList(String msg, int listSize)
    {
        List<Integer> unsignedIntegerList = new ArrayList<>();
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
     * @return = List of Doubles input by the user
     */
    public static List<Double> askDoubleList(String msg, int listSize)
    {
        List<Double> doubleList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            doubleList.add(askDouble(i + ": "));
        }
        return doubleList;
    }

    /**
     * Asks the user for a double between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @return = double input by the user
     */
    public static double askDoubleBetween(String msg, double a, double b)
    {
        double num = 0;
        boolean error = true;
        do {
            System.out.print(msg);
            try {
                num = Double.parseDouble(br.readLine());
                if (a <= b) {
                    if (num < a || num > b) {
                        System.out.println("Please input a double between " + a + " and " + b);
                    } else {
                        error = false;
                    }
                } else {
                    if (num < b || num > a) {
                        System.out.println("Please input a double between " + b + " and " + a);
                    } else {
                        error = false;
                    }
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Please, input a double (example: 5.6)");
            }
        } while (error);
        return num;
    }

    /**
     * Asks the user for an arraySize of doubles between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @param arraySize = Size of the array
     * @return = Plain array of doubles between a and b, input by the user
     */
    public static double[] askDoubleBetweenArray(String msg, double a, double b, int arraySize)
    {
        double[] doubleArray = new double[arraySize];
        System.out.println(msg);
        for(int i = 0; i < arraySize; i++) {
            doubleArray[i] = askDoubleBetween((i+1) + ": ", a, b);
        }
        return doubleArray;
    }

    /**
     * Asks the user for a listSize of doubles between a and b, without minding the order
     * @param msg = Message to print to the user
     * @param a = Bound
     * @param b = Bound
     * @param listSize = Size of the ArrayList
     * @return = List of Doubles between a and b input by the user
     */
    public static List<Double> askDoubleBetweenList(String msg, double a, double b, int listSize)
    {
        List<Double> doubleList = new ArrayList<>();
        System.out.println(msg);
        for(int i = 0; i < listSize; i++) {
            doubleList.add(askDoubleBetween((i+1) + ": ", a, b));
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
     * @return = List of Doubles input by the user
     */
    public static List<Double> askUnsignedDoubleList(String msg, int listSize)
    {
        List<Double> unsignedDoubleList = new ArrayList<>();
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
     * @return = List of Strings input by the user
     */
    public static List<String> askStringList(String msg, int listSize)
    {
        List<String> stringList = new ArrayList<>();
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
     * @return = List of no-empty Strings input by the user
     */
    public static List<String> askNonEmptyStringList(String msg, int listSize)
    {
        List<String> nonEmptyStringList = new ArrayList<>();
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
