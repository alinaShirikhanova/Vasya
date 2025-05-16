package l_16_05_2025;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        FileReader reader = null;
//        try {
//             reader = new FileReader("input.txt");
//            // потенциально опасный код
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        } finally {
//            // закрытие ресурсов
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
////            System.out.println();
//        }

        try (FileReader reader = new FileReader("input.txt")) {
          // какой-то код
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
