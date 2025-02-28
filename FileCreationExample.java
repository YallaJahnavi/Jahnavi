import java.io.File;
import java.io.IOException;
public class FileCreationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f1 = new File("example6.txt");
		if(f1.createNewFile())
		{
			System.out.println("file created: "+f1.getName());
		}
		else
		{
			System.out.println("file already exists");
		}
	}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.getStackTrace();
		}

}
}