import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static ArrayList<String> splitStringAndShow(String string, String delim) {
        ArrayList<String> separated = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(string, delim);
        while (stringTokenizer.hasMoreTokens()) {
            separated.add(stringTokenizer.nextToken());
        }
        return separated;
    }

    public static boolean isStringDate(String string) {
        Pattern pattern = Pattern.compile("(([012]\\d)|(3[01]))/((0[1-9])|(1[0-2]))/((19\\d{2})|([2-9]\\d{3}))");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean isStringEmail(String string) {
        Pattern pattern = Pattern.compile("([\\w.]+)@(\\w+)\\.(\\w+)");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean isPasswordGood(String string) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])\\w{8,}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
