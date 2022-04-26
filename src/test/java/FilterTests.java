import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterTests {

    Filter sut;

    @BeforeEach
    public void initEach() {
        System.out.println("Тест для метода класса Filter запущен");
    }

    @AfterEach
    public void finishEach(){
        System.out.println("Тест для метода класса Filter завершен");
    }

    @ParameterizedTest
    @MethodSource("sourceFilterOut")
    void testFilterOut(int threshold, List<Integer> source, List<Integer> expected) {
        sut = new Filter(threshold);

        List<Integer> result =  sut.filterOut(source);

        Assertions.assertEquals(expected, result);

    }

    private static Stream<Arguments> sourceFilterOut() {
        return Stream.of(Arguments.of(7, Arrays.asList(3, 4, 7, 8, 9, 9), Arrays.asList(8, 9, 9)),
                Arguments.of(9, Arrays.asList(3, 4, 7, 8, 9, 9), Arrays.asList()));
    }


}
