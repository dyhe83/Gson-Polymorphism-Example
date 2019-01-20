package AdapterFactory;

import Animal.Animal;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

public class AnimalTypeAdapterFactory implements TypeAdapterFactory {

	@Override
	@SuppressWarnings("unchecked")
	public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
		if (!Animal.class.isAssignableFrom(type.getRawType())) {
			return null;
		}
		return (TypeAdapter<T>) new AnimalTypeAdapter(this, gson).nullSafe();
	}
}
