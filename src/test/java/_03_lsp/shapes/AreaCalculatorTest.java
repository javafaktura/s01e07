package _03_lsp.shapes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCalculatorTest {

    @Test
    void should_CalculateAreaFor_Rectangle(){
        //given
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWight(4);

        //when
        int area = AreaCalculator.calculateArea(rectangle);

        //then
        assertThat(area, is(20));
    }

    @Test
    void should_CalculateAreaFor_Square(){
        //given
        Rectangle rectangle = new Square();
        rectangle.setHeight(5);
        rectangle.setWight(4);

        //when
        int area = AreaCalculator.calculateArea(rectangle);

        //then
        //assertThat(area, is(20));
    }
}