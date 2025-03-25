
package com.directi.training.dip.exercise_refactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;


public class EncodingModule implements EncodingUtils {
    public BufferedReader reader = null;
    public BufferedWriter writer = null;

    public void encodeWithFiles() throws IOException {
        createReaderWriter();
        readAndWriteToFile();
    }

    @Override
    public void createReaderWriter() {
        try {
            reader = new BufferedReader(
                    new FileReader("DIP/src/com/directi/training/dip/exercise_refactor/beforeEncryption.txt"));
            writer = new BufferedWriter(
                    new FileWriter("DIP/src/com/directi/training/dip/exercise_refactor/afterEncryption.txt"));
        } catch (IOException e) {
            System.out.println("File not found" + e);
        }
    }

    @Override
    public void readAndWriteToFile() {
        String aLine;
        try {
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
                }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        } finally {
            finish();
        }
    }
    
    @Override 
    public void finish() {
        try{
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Cannot close reader or writer " + e);
        }
}

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        // //! setting URL
        // URL url;
        // url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        // //! setting input
        // InputStream in;
        // in = url.openStream();
        // //! Creating reader
        // InputStreamReader reader = new InputStreamReader(in);
        
        // StringBuilder inputString1 = new StringBuilder();
        // int c;
        // c = reader.read();
        // while (c != -1) {
        //     inputString1.append((char) c);
        //     c = reader.read();
        // }
        // String inputString = inputString1.toString();
        // String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        // MyDatabase database = new MyDatabase();
        // database.write(encodedString);
        System.out.println("Method website not working, commented out, this shows the method was still called as instructed by Professor.");
    }
}
