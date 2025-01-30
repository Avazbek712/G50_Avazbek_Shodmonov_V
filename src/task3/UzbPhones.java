package task3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UzbPhones {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\+998(99|98|97|77|88|78|90|91|93|94|33)\\d{7}$");
        try (BufferedReader br = new BufferedReader(new FileReader("PhoneNumbers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
