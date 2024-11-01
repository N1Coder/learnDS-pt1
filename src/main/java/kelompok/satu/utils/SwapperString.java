package kelompok.satu.utils;

public class SwapperString {
    public SwapperString() {
    }

    public String swapChars(String stringSample, int firstIndex, int secondIndex) {
        StringBuilder sb = new StringBuilder(stringSample);
        char l = sb.charAt(firstIndex), r = sb.charAt(secondIndex);

        sb.setCharAt(firstIndex, r);
        sb.setCharAt(secondIndex, l);

        return sb.toString();
    }
}
