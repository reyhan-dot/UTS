import java.io.*;
import java.util.ArrayList;

public class DataManager {
    private ArrayList<Mahasiswa> mahasiswaList;

    public DataManager() {
        mahasiswaList = new ArrayList<>();
    }

    // Method to save mahasiswa data to file
    public void simpanData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mahasiswa_data.txt"))) {
            for (Mahasiswa m : mahasiswaList) {
                writer.write(m.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception (e.g., print to console)
        }
    }

    // Method to load mahasiswa data from file
    public void muatData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("mahasiswa_data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assume a method `fromString` exists in Mahasiswa class to convert line to Mahasiswa object
                mahasiswaList.add(Mahasiswa.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception (e.g., print to console)
        }
    }
}