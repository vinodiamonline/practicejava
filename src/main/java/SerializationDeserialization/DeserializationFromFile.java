package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationFromFile {
	public Object doDeserialize(String filename) {
		Object obj = null;
		FileInputStream fio = null;
		ObjectInputStream oos = null;
		try {
			fio = new FileInputStream(filename);
			oos = new ObjectInputStream(fio);

			obj = oos.readObject();
			obj = oos.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fio != null) fio.close();
				if (oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return obj;
	}

}
