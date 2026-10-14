class MushroomIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Does your mushroom have a ring? (yes/no): ");
        String ring = input.nextLine().trim().toLowerCase();

        if (ring.equals("yes")) {
            System.out.print("Does it grow in a forest? ");
            if (input.nextLine().trim().toLowerCase().equals("yes")) {
                System.out.println("Your mushroom is: Amanite tue-mouche");
            } else {
                System.out.print("Does it have a convex cup? ");
                if (input.nextLine().trim().toLowerCase().equals("yes")) {
                    System.out.println("Your mushroom is: Agaric Jaunissant");
                } else {
                    System.out.println("Your mushroom is: Coprin chevelu");
                }
            }
        } else {
            System.out.print("Does it have gills? ");
            if (input.nextLine().trim().toLowerCase().equals("no")) {
                System.out.println("Your mushroom is: Cepe de bordeau");
            } else {
                System.out.print("Does it have a convex cup? ");
                if (input.nextLine().trim().toLowerCase().equals("yes")) {
                    System.out.println("Your mushroom is: Pied bleu");
                } else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }
    }
}