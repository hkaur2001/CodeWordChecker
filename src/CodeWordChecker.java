public class CodeWordChecker implements StringChecker
{
    private int minLength;
    private int maxLength;
    private String notAllowed;

    public CodeWordChecker(int minLen, int maxLen, String symbol)
    {
        minLength = minLen;
        maxLength = maxLen;
        notAllowed = symbol;
    }
    public CodeWordChecker(String symbol) {
        minLength = 6;
        maxLength = 20;
        notAllowed = symbol;
    }
    public boolean isValid(String str) {
        return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1; } }
