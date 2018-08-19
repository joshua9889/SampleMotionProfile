package com.team9889.lib;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author joshua9889
 * @version 4.5.18
 *
 * Class to log data quickly in any format
 */

public class Logger {
    private FileOutputStream logger = null;
    private Charset charset;

    /**
     * @param filename The file name. wow.
     */
    public Logger(String fileName){
        charset = Charset.forName("US-ASCII");
        try {
            logger = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param object Data to write to a file.
     */
    public void write(Object object){
        String printString = String.valueOf(object) + "\n";
        try {
            logger.write(printString.getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close the file
     */
    public void close(){
        try {
            logger.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
