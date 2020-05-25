import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX = "^[CAP]{1}[0-9]{4}([GHIKLM]{1})$";

    public ValidateClassName() {
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
