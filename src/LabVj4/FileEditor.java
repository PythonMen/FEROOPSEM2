package LabVj4;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class FileEditor {
    /**
     * Reads input file encoded in UTF-8, process content and writes it to output file.
     * @param inputFile input file
     * @param outputFile output file
     * @throws IOException
     */

    public static void processFile(Path inputFile, Path outputFile) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        String contentIF = new String(Files.readAllBytes(inputFile), charset);
        for(int i=0; i<contentIF.length(); i++){
            if(contentIF.charAt(i) == '\n' && contentIF.charAt(i+1) == ' '){
                String newContent = contentIF.substring(0,i) + contentIF.substring(i+1,contentIF.length());
                contentIF = newContent;
            }
            if(contentIF.charAt(i) == ' ' && contentIF.charAt(i+1) == ' ' && contentIF.charAt(i+2) == ' '){
                String newContent = contentIF.substring(0,i) + contentIF.substring(i+2,contentIF.length());
                contentIF = newContent;
            }
        }
        Files.write(outputFile, contentIF.getBytes(charset));
    }
}



/*
Charset charset = StandardCharsets.UTF_8;
String contentIF = new String(Files.readAllBytes(inputFile), charset);
contentIF = contentIF.replaceAll("  ", "");
Files.write(outputFile, contentIF.getBytes(charset));
*/

/**
 * int i=0;
 *
 * reader = new BufferedReader(new FileReader(inputFile.toString()));
 *             String line = reader.readLine();
 *             while(line != null){
 *                 if (line.charAt(0) == ' '){
 *                     outputLine = line.replaceFirst(" ","");
 *                 }
 *                 writer = new BufferedWriter(new FileWriter(outputFile.toString()));
 *                 writer.write(outputLine);
 *                 line = reader.readLine();
 *             }
 */

/*
FileWriter fw = new FileWriter(outputFile.toString());
        FileReader fr = new FileReader(inputFile.toString());

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (br.ready()){
            if(line.charAt(0) == ' ') {
                fw.write(line.replaceFirst(" ", ""));
            }
            else{
                line = br.readLine();
            }
        }
 */