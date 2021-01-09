package Basic_Scripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File f = new File("G:/Softwares/ECLIPSE/Basics/basic.txt");

 f.createNewFile();

 FileWriter fw = new FileWriter("G:/Softwares/ECLIPSE/Basics/basic.txt");
 
 BufferedWriter bw = new BufferedWriter(fw);
 
 String basic[] = {"prasad","prasad2", "prasad","prasad2", "prasad","prasad2", "prasad","prasad2", "prasad","prasad2"};
 
 for(int i=0; i<basic.length; i++) {
	 
	bw.write(basic[i]);
	bw.newLine();
	//System.out.println(bw.write(basic[i]));
 }
 
bw.flush();
		
FileReader fr = new FileReader(f);

BufferedReader br = new BufferedReader(fr);

while(br.ready()) {
	System.out.println(br.readLine());
}
	}

}
