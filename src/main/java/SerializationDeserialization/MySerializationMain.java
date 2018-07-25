package SerializationDeserialization;

public class MySerializationMain {
	public static void main(String [] args) {
		String str = "serializedoutputfile.txt";
		ClassToBeSerialized obj = new ClassToBeSerialized();
		obj.setBoard(200);
		ClassToBeSerialized2 obj2 = new ClassToBeSerialized2();
		obj2.setUsername("hello world");
		obj2.setParentx(1213);
		
		SerializationToFIle srf = new SerializationToFIle();
		srf.doSerialize(str,obj, obj2);
		
		DeserializationFromFile  dsf = new DeserializationFromFile();
		Object o1 = dsf.doDeserialize(str);
		
		if(o1 instanceof ClassToBeSerialized2) {
			ClassToBeSerialized2 sobj = (ClassToBeSerialized2) o1;
				System.out.println("non transient variables " + sobj.getBoard());		
				System.out.println("transient variables password " + sobj.getPassword());
				System.out.println("transient variables pin " + sobj.getPinnumber());
				System.out.println("static variables " + sobj.getTeacher());
				System.out.println("normal variables " + sobj.getUsername());
				System.out.println("normal variables " + sobj.getChalk());
				System.out.println("parent variable " + sobj.getParentx());

		} else if (o1 instanceof ClassToBeSerialized) {
			ClassToBeSerialized sobj = (ClassToBeSerialized) o1;
				System.out.println("non transient variables " + sobj.getBoard());		
				System.out.println("transient variables password " + sobj.getPassword());
				System.out.println("transient variables pin " + sobj.getPinnumber());
				System.out.println("static variables " + sobj.getTeacher());
				System.out.println("normal variables " + sobj.getUsername());
				System.out.println("normal variables " + sobj.getChalk());
		}
				
	}
}
