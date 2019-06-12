package _02_ocp;

import java.util.List;

import static _02_ocp.GrainType.*;

public class GrainManagementSystem {

    private final Double MAX_HUMIDITY = 14.5;

    public static void main(String... args) {
        List<Grain> grains = List.of(
                new Grain(BARLEY, 13, 5),
                new Grain(OATS, 10, 10),
                new Grain(BARLEY, 15, 25),
                new Grain(BARLEY, 11, 40),
                new Grain(WHEAT, 12, 35));

        processUsingMultipleFilters(grains);
        //processUsingPredicateFilters(grains);
    }

    private static void processUsingMultipleFilters(List<Grain> grains) {
        GrainFilters filter = new GrainFilters();

        List<Grain> barleyGrains = filter.filterByType(grains, BARLEY);
        List<Grain> moreThanTenTons = filter.filterHeavierThan(barleyGrains, 10);

        moreThanTenTons.forEach(System.out::println);
    }

    private static void processUsingPredicateFilters(List<Grain> grains) {
        OcpGrainFilter filter = new OcpGrainFilter();

        List<Grain> barleyGrains = filter.filterByPredicate(grains, $ -> $.getType() == BARLEY);
        List<Grain> moreThanTenTons = filter.filterByPredicate(barleyGrains, $ -> $.getWeight() > 10);

        moreThanTenTons.forEach(System.out::println);
    }

}


