package AdapterFactory;

import Animal.Animal;
import Animal.Bird;
import Animal.Cat;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

class AnimalTypeAdapter extends TypeAdapter<Animal> {
    private TypeAdapter<JsonElement> jsonElementAdapter;
    private TypeAdapter<Animal> animalAdapter;
    private TypeAdapter<Bird> birdAdapter;
    private TypeAdapter<Cat> catAdapter;

    public AnimalTypeAdapter(AnimalTypeAdapterFactory oldFactory, Gson gson) {
        this.jsonElementAdapter = gson.getAdapter(JsonElement.class);
        this.animalAdapter = gson.getDelegateAdapter(oldFactory, TypeToken.get(Animal.class));
        this.birdAdapter = gson.getDelegateAdapter(oldFactory, TypeToken.get(Bird.class));
        this.catAdapter = gson.getDelegateAdapter(oldFactory, TypeToken.get(Cat.class));
    }

    @Override
    public void write(JsonWriter out, Animal value) throws IOException {
        if (value != null) {
            if (value instanceof Bird) {
                birdAdapter.write(out, (Bird) value);
            } else if (value instanceof Cat) {
                catAdapter.write(out, (Cat) value);
            } else {
                animalAdapter.write(out, value);
            }
        }
    }

    @Override
    public Animal read(JsonReader in) throws IOException {
        JsonObject objectJson = jsonElementAdapter.read(in).getAsJsonObject();
        String type = objectJson.get("type").toString().replace("\"", "");

        if (type.equals("Animal")) {
            return animalAdapter.fromJsonTree(objectJson);
        } else if (type.equals("Bird")) {
            return birdAdapter.fromJsonTree(objectJson);
        } else if (type.equals("Cat")) {
            return catAdapter.fromJsonTree(objectJson);
        }

        return null;
    }
}
