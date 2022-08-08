import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student[]array;
	private Scanner sc;
	private File file;
	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");
			System.out.println("File founded.");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		this.file = file;
	}
	
	public void fileinput() {
		for(int i = 0; i<this.array.length;i++) {
			String line = this.sc.nextLine();
			//System.out.println(line);
			//String [] values = line.split("\\s+");
			//System.out.println(values[1]);
			Scanner myscanner = new Scanner(line);
			myscanner = myscanner.useDelimiter("\\s+");
			this.array[i]=new Student(myscanner.next(),myscanner.next(),
					myscanner.nextInt(),myscanner.nextInt(),myscanner.nextInt(),myscanner.nextInt());
//			myscanner.next();myscanner.next();
//			int kor = myscanner.nextInt();
//			System.out.println(kor);
		}
	}
	
}
