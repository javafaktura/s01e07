package _06_kiss;

import java.util.Map;
import java.util.Optional;

public class SilosNames {

    public String getSilosNameVer1(int silosNumber) {
        switch (silosNumber) {
            case 1:
                return "Sam";
            case 2:
                return "Bob";
            case 3:
                return "Ted";
            case 4:
                return "Greg";
            default:
                throw new IllegalArgumentException("silosNumber must be in range 1..4");
        }
    }

    public String getSilosNameVer2(int silosNumber) {

        final Map<Integer, String> siloses = Map.of(
                1, "Sam",
                2, "Bob",
                3, "Ted",
                4, "Greg");

        return Optional.ofNullable(siloses.get(silosNumber))
                .orElseThrow(() -> new RuntimeException("silosNumber must be in range 1..4"));
    }

}
