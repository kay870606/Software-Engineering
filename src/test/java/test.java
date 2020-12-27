import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void test() {
        assertEquals('A', LetterGrade.letterGrade(95));
        assertEquals('B', LetterGrade.letterGrade(85));
        assertEquals('C', LetterGrade.letterGrade(75));
        assertEquals('D', LetterGrade.letterGrade(65));
        assertEquals('F', LetterGrade.letterGrade(30));
        assertEquals('X', LetterGrade.letterGrade(-5));
    }

    @Test
    public void test2() {
        assertEquals('A', LetterGrade.letterGrade(100));
        assertEquals('A', LetterGrade.letterGrade(90));
        assertEquals('B', LetterGrade.letterGrade(89));
        assertEquals('B', LetterGrade.letterGrade(80));
        assertEquals('C', LetterGrade.letterGrade(79));
        assertEquals('C', LetterGrade.letterGrade(70));
        assertEquals('D', LetterGrade.letterGrade(69));
        assertEquals('D', LetterGrade.letterGrade(60));
        assertEquals('F', LetterGrade.letterGrade(59));
        assertEquals('F', LetterGrade.letterGrade(0));
        assertEquals('X', LetterGrade.letterGrade(-1));
        assertEquals('X', LetterGrade.letterGrade(101));
    }

}
