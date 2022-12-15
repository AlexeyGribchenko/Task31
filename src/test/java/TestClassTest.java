import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestClassTest {

    @Test
    void splitStringAndShow_FIRST_TEST() {
        ArrayList<String> actual = RegExpr.splitStringAndShow("1 2$3 4 5_6", " ");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2$3");
        expected.add("4");
        expected.add("5_6");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void splitStringAndShow_SECOND_TEST() {
        ArrayList<String> actual = RegExpr.splitStringAndShow("1 2^3_4 5^6", "^");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1 2");
        expected.add("3_4 5");
        expected.add("6");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringDate_FIRST_TEST() {
        boolean actual = RegExpr.isStringDate("01/01/2001");
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringDate_SECOND_TEST() {
        boolean actual = RegExpr.isStringDate("32/12/3000");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringDate_THIRD_TEST() {
        boolean actual = RegExpr.isStringDate("15/07/1899");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringEmail_FIRST_TEST() {
        boolean actual = RegExpr.isStringEmail("gribchenko.2003@mail.ru");
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringEmail_SECOND_TEST() {
        boolean actual = RegExpr.isStringEmail("host@@@com.ru");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringEmail_THIRD_TEST() {
        boolean actual = RegExpr.isStringEmail("hello_world.ru");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isPasswordGood_FIRST_TEST() {
        boolean actual = RegExpr.isPasswordGood("PW0e_12");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isPasswordGood_SECOND_TEST() {
        boolean actual = RegExpr.isPasswordGood("AAAaaa999_1");
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isPasswordGood_THIRD_TEST() {
        boolean actual = RegExpr.isPasswordGood("213asd_asdad");
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }
}