import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("dragon.jpg");
            FileOutputStream outputStream = new FileOutputStream("dragon_copy.jpg")){
            byte[] bytes = new byte[256];
            int i = -1;
            while ((i = inputStream.read(bytes)) != -1 )
                outputStream.write(bytes);
            System.out.println("Copy completed.");

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
