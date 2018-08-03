import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis= new FileInputStream("D:/Demo/vsc.exe");
		FileOutputStream fio= new FileOutputStream("D:/Demo/vsc2.exe");
		
		long starttime=System.currentTimeMillis();
		int ch = 0;
		while(true)
		{
			ch=fis.read();
			if(ch == -1)
				break;
			fio.write(ch);
		}
		
		System.out.println("Time: " + (System.currentTimeMillis() - starttime));
		fio.close();
		fis.close();
		
	}

}
