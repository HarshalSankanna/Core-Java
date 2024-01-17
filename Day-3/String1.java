public class String1 {
    public static void main(String[] args) {
        String s = "Babulal";

        // System.out.println(s.startsWith("B"));
        // System.out.println(s.startsWith("Babu"));
        // System.out.println(s.startsWith("Babulal"));
        // System.out.println(s.startsWith("babulal"));
        // System.out.println(s.startsWith("lal"));

        // System.out.println(s.endsWith("B"));
        // System.out.println(s.endsWith("Babu"));
        // System.out.println(s.endsWith("Babulal"));
        // System.out.println(s.endsWith("babulal"));
        // System.out.println(s.endsWith("lal"));

        // String s1 = "Ashish";
        // boolean b = s1.equals("ashish");
        // System.out.println(b);
        // System.out.println(s1.equals("Ashish"));
        // String s2 = "Prashant";
        // boolean b1 = s1.equals(s2);
        // System.out.println(b1);

        // String s1 = "Ashish";
        // boolean b = s1.equalsIgnoreCase("ashish");
        // System.out.println(b);
        // System.out.println(s1.equalsIgnoreCase("Ashish"));
        // String s2 = "Prashant";
        // boolean b1 = s1.equalsIgnoreCase(s2);
        // System.out.println(b1);

        // String str1 = "ASHISH";
        // String str2 = str1.toLowerCase();
        // System.out.println(str2);
        // System.out.println(str2.toUpperCase());

        // String str3 = " I Love JAVA ";
        // System.out.println(str3.trim());
        // System.out.println(str3);

        // String str1 = "GunGun";
        // String str2 = str1.replace('u', 'i');
        // System.out.println(str1);
        // System.out.println(str2);

        // String str1 = "Ramlal";
        // String str2 = str1.substring(4);
        // System.out.println(str2);
        // System.out.println(str1.substring(2));
        // System.out.println(str1.substring(0));
        // System.out.println(str1.substring(2, 4));
        // System.out.println(str1.substring(2, 5));

        String str1 = "ABCD";
        byte b[] = str1.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
