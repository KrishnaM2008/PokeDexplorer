import java.util.*;
public class mainClass {

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner (System.in)) {
            System.out.println("Hello, Welcome to Pokemon World!");
            System.out.println("Please enter your name:");
            String name = scan.nextLine();
            System.out.println();
            String actionResponse="";
            pokemon newPokemon;
            
            while(!actionResponse.equals("4")){
                System.out.println("Hello " + name + ", What would you like to do today?\n" + "1. Evolve\n" + "2. Visit a Pokemon\n" + "3. Add a pokemon\n" + "4. Exit");
                actionResponse = scan.nextLine();
                System.out.println();
                switch (actionResponse) {
                    case "1" ->                     {
                        System.out.println("Which Pokemon would you like to evolve? Enter the name of the Pokemon?");
                        String pokemonName = scan.nextLine();
                        pokemon.userEvolve(pokemonName);
                    }
                    case "2" ->                     {
                        System.out.println("Which Pokemon would you like to visit?");
                        String pokemonName = scan.nextLine();
                        System.out.println(pokemon.evoStage(pokemonName));
                    }
                    case "3" ->                     {
                        System.out.println("Name of the Pokemon?");
                        String pokemonName = scan.nextLine();
                        System.out.println("Stage 1?");
                        String stage1 = scan.nextLine();
                        System.out.println("Stage 2?");
                        String stage2 = scan.nextLine();
                     newPokemon = new pokemon(pokemonName, stage1, stage2);
                    }
                    case "4" -> {
                    }
                    default -> {
                    }
                }
                System.out.println();
            }
        }
    }
}
