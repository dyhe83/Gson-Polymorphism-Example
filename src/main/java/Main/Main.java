package Main;

import AdapterFactory.AnimalTypeAdapterFactory;
import Animal.Animal;
import Animal.Bird;
import Animal.Cat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// create gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping()
				.registerTypeAdapterFactory(new AnimalTypeAdapterFactory())
				.create();

		// create animal lists
		Animal[] original_animals = {new Animal(), new Bird(), new Cat()};

		// write to Json string
		String jsonString = gson.toJson(original_animals);

		// read from Json string
		Animal[] animals = gson.fromJson(jsonString, Animal[].class);

		// print information
		for (Animal animal : animals) {
			animal.printInfo();
			System.out.println();
		}
	}
}
