package util;

import config.GlobalData;

import java.io.*;

public class FileUtility  {

    private static final String fileName = "contestant.txt";


    public static void write() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(GlobalData.contestantList));
        bufferedWriter.flush();
    }
}









