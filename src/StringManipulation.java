public class StringManipulation {
    public static void main(String[] args) {
        String name = "saihl";
        String nameChanges = name.replace("saihl", "sahil");

        System.out.println(nameChanges);
        System.out.println(nameChanges.toUpperCase());
        System.out.println(nameChanges.toLowerCase());


//        string builder append
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(nameChanges);
//        reverse string-----------------------------------
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
