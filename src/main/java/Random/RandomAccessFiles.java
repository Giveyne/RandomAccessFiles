package Random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.*;

public class RandomAccessFiles {

        public void writeFile(String string){
            File creatFile = new File ("C:\\test\\save1.txt");
            try(RandomAccessFile file = new RandomAccessFile(creatFile, "rw")){
                file.write(string.getBytes("UTF8"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        public void readFile(){
            StringBuffer stringBuffer = new StringBuffer();
            try(RandomAccessFile file = new RandomAccessFile("C:\\test\\save.txt", "r")){
                int b = file.read();
                while(b != -1){
                    stringBuffer.append((char)b);
                    b = file.read();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(stringBuffer);
        }

        public static void main(String[] args) throws IOException{

            RandomAccessFiles randomAccessFiles1 = new RandomAccessFiles(); // Create one Object for read and write
            randomAccessFiles1.readFile();

            randomAccessFiles1.writeFile("Write me in you file");


        }
    }