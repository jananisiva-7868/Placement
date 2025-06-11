package Placement;
//[HANDLE DIVIDE-BY-ZERO EXCEPTION]
//import java.util.Arrays;
//public class task01 {
//	public static void main(String[] args) {
//		try {
//			int div=10/0;
//		}catch(ArithmeticException e) {
//			System.out.println("Infinite");
//		}finally {
//			System.out.println("Try program completed");
//		}
//	}
//
//}




//[READ FROM A TEXT FILE AND DISPLAY THE CONTENT]
//import java.io.*;
//public class task01{
//    public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("Example.txt");
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        fr.close();
//    }
//}




//[WRITING STRINGS TO A FILE LINE BY LINE]
//import java.io.FileWriter;
//
//public class task01 {
//    public static void main(String[] args) throws Exception {
//        FileWriter fw = new FileWriter("output.txt");
//
//        fw.write("Line 1\n");
//        fw.write("Line 2\n");
//        fw.write("Line 3\n");
//
//        fw.close();
//        System.out.println("File written successfully.");
//    }
//}




//[RESULT PROCESSING FROM FILE]
//import java.io.*;
//
//public class task01 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
//        FileWriter fw = new FileWriter("result.txt");
//
//        int total = 0, count = 0;
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            total += Integer.parseInt(line);
//            count++;
//        }
//
//        double average = total / (double) count;
//
//        fw.write("Total: " + total + "\n");
//        fw.write("Average: " + average + "\n");
//
//        br.close();
//        fw.close();
//
//        System.out.println("Done.");
//    }
//}






