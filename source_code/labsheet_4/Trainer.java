package source_code.labsheet_4;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.stream.Collectors;

public class Trainer {
    public static Vector<Pokeball> pokeballs = new Vector<Pokeball>();

    public static void capturePokemon(Pokemon pokemon) {
        pokeballs.add(new Pokeball(pokemon));
    }

    public static Pokemon[] getPokemonWithType(String type) {
        List<Pokemon> pokemonList = pokeballs.stream().map(Pokeball::getPokemon).filter(pokemon -> Objects.equals(pokemon.getType(), type)).collect(Collectors.toList());

        Pokemon[] pokemons = new Pokemon[pokemonList.size()];
        for (int i = 0; i < pokemonList.size(); i++) {
            pokemons[i] = pokemonList.get(i);
        }
        return pokemons;
    }

    public static Pokemon[] getPokemonWithGivenTypes(String[] types) {
        HashSet<String> pokemonTypes = new HashSet<>(List.of(types));
        List<Pokemon> pokemonList = pokeballs.stream().map(Pokeball::getPokemon).filter(pokemon -> pokemonTypes.contains(pokemon.getType())).collect(Collectors.toList());

        Pokemon[] pokemons = new Pokemon[pokemonList.size()];
        for (int i = 0; i < pokemonList.size(); i++) {
            pokemons[i] = pokemonList.get(i);
        }
        return pokemons;
    }

    public static Pokemon[] getPokemonsInRange(int minIndex, int maxIndex) {
        List<Pokemon> pokemonList = pokeballs.stream().map(Pokeball::getPokemon).filter(pokemon -> pokemon.getId() >= minIndex && pokemon.getId() <= maxIndex).collect(Collectors.toList());

        Pokemon[] pokemons = new Pokemon[pokemonList.size()];
        for (int i = 0; i < pokemonList.size(); i++) {
            pokemons[i] = pokemonList.get(i);
        }
        return pokemons;
    }

}
