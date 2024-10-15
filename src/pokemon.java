import java.util.ArrayList;

public class pokemon {
    public String name;
    public String originalName;
    public String Evol1;
    public String Evol2;
    public  static ArrayList<pokemon> pokemonList = new ArrayList<>();

public pokemon(String stage1, String stage2, String stage3){
    originalName = stage1;
    name = stage1;
    Evol1 = stage2;
    Evol2 = stage3;
    pokemonList.add(this);
}

    public void evolve(){
        if (!name.equals(Evol1)) {
            name = Evol1;
        }else{
            name = Evol2;
        }
    }

    public String getPokemon(){
        return originalName;
    }
    public String getCurrentPokemon(){
        return name;
    }
    public String getStage1(){
        return Evol1;
    }
    public String getStage2(){
        return Evol2;
    }

    public void CanMegaEvolve(){
            if(!name.equals(Evol2)) {
                System.out.println("Cannot be mega evolved!");
            }else{
                System.out.println("Can be mega evolved!");
            }
        }
        
    public static void userEvolve(String pokemonString){
        for(int i = 0; i < pokemonList.size(); i++){
            if(pokemonList.get(i).getPokemon().equals(pokemonString)){
                pokemonList.get(i).evolve();
            }
            break;
        }
    }



    public static String evoStage(String nameString){
        for(int i = 0; i < pokemonList.size();i++){
            if(pokemonList.get(i).getPokemon().equals(nameString)){
                return "Stage 1: " + pokemonList.get(i).getPokemon()+ "\nStage 2: " + pokemonList.get(i).getStage1() + "\nStage 3: " + pokemonList.get(i).getStage2();
            } else if (pokemonList.get(i).getStage1().equals(nameString)) {
                return "Stage 1: " + pokemonList.get(i).getPokemon()+ "\nStage 2: " + pokemonList.get(i).getStage1() + "\nStage 3: " + pokemonList.get(i).getStage2();
            }else if (pokemonList.get(i).getStage2().equals(nameString)) {
                return "Stage 1: " + pokemonList.get(i).getPokemon()+ "\nStage 2: " + pokemonList.get(i).getStage1() + "\nStage 3: " + pokemonList.get(i).getStage2();
            }
        }
        return "Pokemon not found!";
    }

    public static void listElements(){
       for(int i =0; i < pokemonList.size(); i++){
        System.out.println(pokemonList.get(i).getPokemon());
       }
    }
}