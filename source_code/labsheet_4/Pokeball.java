package source_code.labsheet_4;

public class Pokeball {
    private Pokemon pokemon;

    public Pokeball(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Pokeball{" +
                "pokemon=" + pokemon.toString() +
                '}';
    }
}
