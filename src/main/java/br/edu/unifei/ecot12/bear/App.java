package br.edu.unifei.ecot12.bear;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Ocean ocean = new Ocean("Atlantic Ocean", 3980, 20);
        Tree tree0 = new Tree(10, 190);
        Tree tree1 = new Tree(12, 182);

        ArrayList<Tree> treeList = new ArrayList<>();
        treeList.add(tree0);
        treeList.add(tree1);

        CoastalHabitat coastalHabitat = new CoastalHabitat("Deserto", "Frio", false,
                "Fitoplancton, Crustaceos e Peixes", ocean);
        ForestHabitat forestHabitat = new ForestHabitat("Selva", "Umido", 98, "mato", treeList);
        MountainHabitat mountainHabitat = new MountainHabitat("Montanhoso", "Quente", 3983, "Rasa");
        TundraHabitat tundraHabitat = new TundraHabitat("Tundra", "Frio", true, "nda");

        Salmon salmon = new Salmon(0, "Escamas", coastalHabitat, 30, false);
        Seal seal = new Seal(0, "liso", tundraHabitat, true, 1300);

        Awake awake = new Awake();
        Park park = new Park("Parque Nacional Foz", "Norte, Brasil");
        BlackBear blackBear = new BlackBear(2, "Pelo", forestHabitat, 2, "preta", awake, park);

        City city = new City("Itajuba", "Sul de Minas, Brasil");
        Human human = new Human(2, "pele", mountainHabitat, "Rodrigo", 23, city, blackBear);

        God god = new God();
        god.getAnimais().add(blackBear);
        god.getAnimais().add(human);
        god.getAnimais().add(seal);
        god.getAnimais().add(salmon);

        god.multiply();

        // mudando status do urso
        System.out.println("# Mudando Status");
        System.out.println(blackBear.getState().toString());
        blackBear.toggle();
        System.out.println(blackBear.getState().toString());
        blackBear.toggle();
        System.out.println(blackBear.getState().toString());

        System.out.println("----------------------------------");

        // criando clone do blackBear
        System.out.println("# Criando Clone");
        Bear cloneBearBlack = blackBear.clone();
        System.out.println("Original: " + blackBear.toString());
        System.out.println("Clone: " + cloneBearBlack.toString());

        System.out.println("----------------------------------");

        //testando blackBear
        System.out.println("# Metodos de BlackBear");
        blackBear.forageForFood();

        System.out.println("----------------------------------");

        // Criando outros tipos de ursos
        GrizzlyBear grizzlyBear = new GrizzlyBear(2, "Pelos", tundraHabitat, 2, "Pardo", awake);
        PolarBear polarBear = new PolarBear(2, "Pelo", coastalHabitat, 3, "branca", awake);

        grizzlyBear.climbTrees();
        polarBear.huntingSeals();
    }
}
