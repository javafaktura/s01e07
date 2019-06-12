package _02_ocp;

import java.util.List;

import static java.util.stream.Collectors.*;

class GrainFilters {

     List<Grain> filterByType(List<Grain> grains, GrainType type){
        return grains.stream().filter($ -> $.getType() == type).collect(toList());
    }

    List<Grain> filterHeavierThan(List<Grain> grains, int weight){
        return grains.stream().filter($ -> $.getWeight() > weight).collect(toList());
    }

}
