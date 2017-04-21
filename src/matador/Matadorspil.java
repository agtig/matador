package matador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matadorspil
{
	ArrayList<Felt> felter = new ArrayList<Felt>(); // indeholder alle felter

	ArrayList<Spiller> spillere = new ArrayList<Spiller>();  // alle spillere

	int spillersTur = 0;

	public Matadorspil() 
	{
            // manuel oprettelse af spillebrættet
//		felter.add(new Start(5000));
//		felter.add(new Gade("Rødovrevej", 10000, 400,1000));
//		felter.add(new Gade("Hvidovrevej",10000, 400,1000));
//		felter.add(new Rederi("Maersk", 17000,4200));
//		felter.add(new Gade("Gade 3", 12000, 500,1200));
//		felter.add(new Gade("Gade 4", 12000, 500,1200));
//		felter.add(new Gade("Gade 5", 15000, 700,1500));
//		felter.add(new Helle(15000));
//		felter.add(new Gade("Frederiksberg Allé", 20000,1100,2000));
//		felter.add(new Gade("Rådhuspladsen",      20000,1100,2000));
            
            // indlæs spillebrættet fra fil
            try {
			File file = new File("Plade.conf");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			//StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				felter.add(new "line");
                                //stringBuffer.append(line);
				//stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Spilleplade indlæst!");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}