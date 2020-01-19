package Random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.*;

public class RandomAccessFiles {

        public void writeFile(){
            String sb1 = "I love you!";
            File creatFile = new File ("C:\\test\\save1.txt");
            try(RandomAccessFile file = new RandomAccessFile(creatFile, "rw")){
                file.write(sb1.getBytes("UTF8"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        public void readFile(){
            StringBuilder sb = new StringBuilder();
            try(RandomAccessFile file = new RandomAccessFile("C:\\test\\save.txt", "r")){
                int b = file.read();
                while(b != -1){
                    sb.append((char)b);
                    b = file.read();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(sb);
        }

        public static void main(String[] args) throws IOException{

            RandomAccessFiles randomAccessFiles1 = new RandomAccessFiles();
            randomAccessFiles1.readFile();

            RandomAccessFiles randomAccessFiles = new RandomAccessFiles();
            randomAccessFiles.writeFile();


        }
    }