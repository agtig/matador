package matador;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;
import java.util.ArrayList;

public class Matadorspil
{
	ArrayList<Felt> felter = new ArrayList<Felt>(); // indeholder alle felter

	ArrayList<Spiller> spillere = new ArrayList<Spiller>();  // alle spillere

	int spillersTur = 0;

	public Matadorspil() 
	{
            // manuel oprettelse af spillebrættet
//          felter.add(new Start(5000));
//          felter.add(new Gade("Rødovrevej", 10000, 400,1000));
//          felter.add(new Gade("Hvidovrevej",10000, 400,1000));
//          felter.add(new Rederi("Maersk", 17000,4200));
//          felter.add(new Gade("Gade 3", 12000, 500,1200));
//          felter.add(new Gade("Gade 4", 12000, 500,1200));
//          felter.add(new Gade("Gade 5", 15000, 700,1500));
//          felter.add(new Helle(15000));
//          felter.add(new Gade("Frederiksberg Allé", 20000,1100,2000));
//          felter.add(new Gade("Rådhuspladsen",      20000,1100,2000));
            
            // indlæs spillebrættet fra fil
            try {
                File file = new File("Plade.conf");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
//                FileInputStream fstream = new FileInputStream("Plade.conf");
//                DataInputStream in = new DataInputStream(fstream);
//                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                int lineNo = 1;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] feltData = line.split(";");
                    switch(feltData[0]) {
                        case "START" :
                            // format: [1]Primær tekst;[2]Sekundær tekst;[3]Gevinst
                            felter.add(new Start(feltData[1], feltData[2].trim(), Double.parseDouble(feltData[3])));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "GADE" :
                            // format: [1]Primær tekst;[2]Købspris;[3]Afgift;[4]Afgift v/1 hus;[5]Afgift v/2 huse;[6]Afgift v/3 huse;[7]Afgift v/4 huse;[8]Afgift v/hotel;[9]Pris for huse
                            felter.add(new Gade(feltData[1], Double.parseDouble(feltData[2]), Double.parseDouble(feltData[3]), /** Double.parseDouble(feltData[4]), Double.parseDouble(feltData[5]), Double.parseDouble(feltData[6]), Double.parseDouble(feltData[7]), Double.parseDouble(feltData[8]), */ Double.parseDouble(feltData[9]) ));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "LØKKEN" :
                            // format: [1]Primær tekst
                            felter.add(new Loekken(feltData[1]));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "SKAT" :
                            // format: [1]Primær tekst;[2]Type
                            felter.add(new Skat(feltData[1], Integer.parseInt(feltData[2]) ));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "REDERI" :
                            // format: [1]Primær tekst;[2]Sekundær tekst;[3]Købspris;[4]Afgift;[5]Afgift v/2 rederier;[6]Afgift v/3 rederier;[7]Afgift v/4 rederier
                            felter.add(new Rederi(feltData[1], feltData[2], Double.parseDouble(feltData[3]), Double.parseDouble(feltData[4])/**, Double.parseDouble(feltData[5]), Double.parseDouble(feltData[6]), Double.parseDouble(feltData[7]) */ ));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "FÆNGSEL" :
                            // format : [1]Primær tekst;[2]Sekundær tekst;[3]Type
                            felter.add(new Faengsel(feltData[1], feltData[2], feltData[3]));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "BRYGGERI" :
                            // format: [1]Primær tekst;[2]Købspris
                            felter.add(new Bryggeri(feltData[1], Double.parseDouble(feltData[2]) ));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        case "PARKERING" :
                            // format: [1]Primær tekst
                            felter.add(new Parkering(feltData[1]));
                            System.out.println("Felt nr: " + lineNo + " " + feltData[1] + " tilføjet til spillepladen.");
                            lineNo ++;
                            break;
                        default:
                            System.out.println("Ugyldig felttype! (" + feltData[1] + ")");

                    } 
                    //felter.add(new "line");
                    //stringBuffer.append(line);
                    //stringBuffer.append("\n");
                }
                fileReader.close();
                System.out.println("Spilleplade indlæst!");
                //System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
            
            
	}
}