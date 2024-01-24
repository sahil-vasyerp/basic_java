import java.io.FileOutputStream;

public class FileOutputStreamExp {
    public static void main(String[] args) {

        fileOutputStream();
        fileOpStreamString();

    }

    private static void fileOpStreamString() {

//  -------------write string in file output stream-------------------------
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "welcome to java";
            byte[] b = s.getBytes();
            fout.write(b);

            fout.close();
            System.out.println("successfully run ...");

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    private static void fileOutputStream() {

        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream("D:\\testout.txt");

            fileOutputStream.write(123);
            fileOutputStream.close();
            System.out.println("Successfully saved...");
        } catch (Exception e) {
            System.out.println("error something in file output stream" + e);
        }

    }
}
