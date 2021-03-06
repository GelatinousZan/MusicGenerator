package musgen;
import java.util.Random;
import java.util.Scanner;
/**
 * Driver class that creates and plays .MIDI files.
 * @author parkerciaramella, zanbeaver, andrewdecker
 *
 */
public class Driver {
	/**
	 * Main method that lets you choose your genre of music to
	 * play. Also saves the .MIDI file to the directory where 
	 * you run the .java project.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Instruments ins = new Instruments();
		System.out.println("Pick a Genre\n"
							+ "1. All Instruments\n"
							+ "2. Brass\n"
							+ "3. Reed\n"
							+ "4. Guitar\n"
							+ "5. Ensemble\n"
							+ "6. Piano\n"
							+ "7. Percussion");
		int genre = scan.nextInt();
		MusicName musicName = new MusicName();
		String title = musicName.makeTitle();
		System.out.println("Now listening to: " + "\"" + title + "\"");
		System.out.println("Like what you hear? You can find the MIDI file in the same directory as this program!");
		Random random = new Random();
		int bpm = random.nextInt(61) + 60;
		int i1 = ins.randomInstrument(genre);
		int i2 = ins.randomInstrument(genre);
		WriteRandomMidi.writeMidi(Generator.play(i1, i2, bpm),
									bpm, title + ".midi");
		
	}

}
