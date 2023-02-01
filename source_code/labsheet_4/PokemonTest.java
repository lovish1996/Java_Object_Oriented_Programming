package source_code.labsheet_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PokemonTest {
    public static Pokemon readPokemon(Scanner scanner) {
        String name = scanner.next();
        scanner.nextLine();

        String id = scanner.next();
        scanner.nextLine();

        String type = scanner.next();
        scanner.nextLine();

        int formatType = scanner.nextInt();
        scanner.nextLine();

        if (formatType == 1) {
            return new Pokemon(name + "|" + id + "|" + type);
        } else if (formatType == 2) {
            return new Pokemon(id + ";" + name + ";" + type);
        }

        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/lovisharora/Documents/Java_Object_Oriented_Programming/source_code/labsheet_4/pokemon_records.txt");
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 6; i++) {
            Trainer.capturePokemon(readPokemon(scanner));
        }

        System.out.println();
        for (Pokemon pokemon : Trainer.getPokemonWithType("FirstType")) {
            System.out.println(pokemon);
        }

        System.out.println();
        for (Pokemon pokemon : Trainer.getPokemonWithGivenTypes(new String[]{"FirstType", "ThirdType"})) {
            System.out.println(pokemon);
        }

        System.out.println();
        for (Pokemon pokemon : Trainer.getPokemonsInRange(3, 5)) {
            System.out.println(pokemon);
        }


    }
}
