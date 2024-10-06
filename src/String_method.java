public class String_method {
    public static void main(String[] args) {
        String name = "Vijeta";
        //int value = name.length();
        //String lstring = name.toLowerCase();
        //System.out.println(lstring);
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        String untrim = "         vijeta         ";
//        System.out.println(untrim);

//        String trim = name.trim();
//        System.out.println(trim);
        System.out.println(name.substring(5));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('i','e'));
        System.out.println(name.replace("ije","ght"));
        System.out.println(name.startsWith("Vij"));
        System.out.println(name.endsWith("era"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("vij"));
        System.out.println(name.equals("bhf"));
        System.out.println(name.equals("Vijeta"));
        System.out.println(name.equalsIgnoreCase("viJeTA"));
        System.out.println("Dear Harry,\n\t This Java course is nice .\n\t Thanks");

    }
}
