package _02_ocp;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OcpGrainFilter {

    List<Grain> filterByPredicate(List<Grain> grains, Predicate<Grain> predicate) {
        return grains.stream().filter(predicate).collect(Collectors.toList());
    }
}
