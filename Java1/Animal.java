public class Animal {
    public static String woodPecker() {
        return "Peck Peck Peck!";
    }

    public static void doThings() {
            // Try/Catch function
            try {
                int shops = 10;

                if (shops == 10)
                System.out.println("We made it");

                else if(shops > 10)
                System.out.println("We exceeded what we needed, YAY!");

                else
                System.out.println("We need to do better!");

            } catch (Exception e) {
                System.out.println("There is an error");
            }
        }
    }