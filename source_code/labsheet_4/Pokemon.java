package source_code.labsheet_4;

import java.util.StringTokenizer;

public class Pokemon {
    private String name;
    private int id;
    private String type;

    public Pokemon(String pokemonDetails) {
        boolean firstFormat = pokemonDetails.contains("|");
        String delimiter = firstFormat ? "|" : ";";
        StringTokenizer stringTokenizer = new StringTokenizer(pokemonDetails, delimiter);
        if (firstFormat) {
            this.name = stringTokenizer.nextToken();
            this.id = Integer.parseInt(stringTokenizer.nextToken());
        } else {
            this.id = Integer.parseInt(stringTokenizer.nextToken());
            this.name = stringTokenizer.nextToken();
        }
        this.type = stringTokenizer.nextToken();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getPokemon() {
        return "#" + String.valueOf(id) + "\n" + name + "\n" + type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
