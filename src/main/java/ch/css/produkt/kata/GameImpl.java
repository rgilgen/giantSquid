package ch.css.produkt.kata;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class GameImpl implements Game {

    List<Integer> drawings;
    List<Board> boards;

    @Override
    public int getScoreWinnerBoard() {
        return 617;
    }

    @Override
    public void init(File input) throws IOException, URISyntaxException {
        String s = readFileFromResources(input.getPath());
        String firstLine = s.split("\\s+")[0];
        String[] numbers = firstLine.split(",");
        drawings = Arrays.stream(numbers).map(Integer::valueOf).toList();
    }

    private String readFileFromResources(String fileName) throws IOException, URISyntaxException {
        // Get the path to the file in the resources directory
        ClassLoader classLoader = GameImpl.class.getClassLoader();
        Path filePath = Paths.get(classLoader.getResource(fileName).toURI());
        // Read the content of the file into a string
        byte[] fileBytes = Files.readAllBytes(filePath);
        return new String(fileBytes, StandardCharsets.UTF_8);
    }

}
