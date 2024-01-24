import java.io.FileInputStream;

public class FileInputStreamExp {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("D:\\testout.txt");

            int i=0;

            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }


//            close fileStream
            fileInputStream.close();
        }
        catch (Exception e)
        {
            System.out.println("errrorrrr here"+e);

        }
    }
}
