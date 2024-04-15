import java.util.Arrays;

class ResistorColor {
    public final String[] colorCode = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int value = 0; value < colorCode.length; value++) {
            if (colorCode[value].compareToIgnoreCase(color)==0) return value;
        }
        return colorCode.length;
    }

    String[] colors() {
        return colorCode;
    }
}

