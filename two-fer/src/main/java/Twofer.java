public class Twofer {
    public String twofer(String name) {
        if (name!=null) return String.format("One for %s, one for me.", name);
        return "One for you, one for me.";
    }
}
