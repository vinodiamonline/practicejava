package SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationToFIle {
	public void doSerialize(String filename, ClassToBeSerialized obj,ClassToBeSerialized2 obj2) {
		FileOutputStream fio = null;
		ObjectOutputStream oos = null;
		try {
			fio = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fio);

			oos.writeObject(obj);
			oos.writeObject(obj2);
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
		
	}
}
