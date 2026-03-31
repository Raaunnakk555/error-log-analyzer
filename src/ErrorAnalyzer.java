import java.io.*;
import java.util.*;

public class ErrorAnalyzer {
    private HashMap<String, String> errorMap = new HashMap<>();

    public ErrorAnalyzer(String filePath) {
        loadErrors(filePath);
    }

    private void loadErrors(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    errorMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error loading file.");
        }
    }

    public String analyzeError(String error) {
        return errorMap.getOrDefault(error, "Unknown error. Try checking syntax or documentation.");
    }
}
