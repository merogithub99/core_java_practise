package dataTypes;

import java.sql.SQLOutput;

public class DataType {

    public static void main(String[] args) {
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("| S.N   | DataType    |Size     |  MIN_VALUE   | MAX_VALUE|");
//        System.out.println("-----------------------------------------------------------");
//        System.out.println("|1      |  Byte       |" + Byte.SIZE + "        |   " + Byte.MIN_VALUE + "            |" + Byte.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|2      |  Short       |" + Short.SIZE + "        |   " + Short.MIN_VALUE + "      |" + Short.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|3      |  Long       |" + Long.SIZE + "        |   " + Long.MIN_VALUE + "            |" + Long.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|4      |  Integer       |" + Integer.SIZE + "        |   " + Integer.MIN_VALUE + "            |" + Integer.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|5      |  Float       |" + Float.SIZE + "        |   " + Float.MIN_VALUE + "            |" + Float.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|6      |  Double       |" + Double.SIZE + "        |   " + Double.MIN_VALUE + "            |" + Double.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//         System.out.println("|7      |  Boolean       |" +   "        |   " +   "            |" + Double.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
//        System.out.println("|1      |  Character       |" + Character.SIZE + "        |   " + Character.MIN_VALUE + "            |" + Character.MAX_VALUE + "   |");
//        System.out.println("|----------------------------------------------------------|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| S.N | DataType   | Size (bits) |  MIN_VALUE             | MAX_VALUE             |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21d | %-21d |%n", 1, "Byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21d | %-21d |%n", 2, "Short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21d | %-21d |%n", 3, "Long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21d | %-21d |%n", 4, "Integer", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21e | %-21e |%n", 5, "Float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21e | %-21e |%n", 6, "Double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12s | %-21s | %-21s |%n", 7, "Boolean", "N/A", "false", "true");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-3d | %-10s | %-12d | %-21s | %-21d |%n", 8, "Character", Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.println("----------------------------------------------------------------------------------");
    }
}
