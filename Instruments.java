package musgen;

import java.util.Random;
/**
 * Represents the {@code Instruments} that are used
 * for each genre which are randomly chosen.
 * @author parkerciaramella, zanbeaver, andrewdecker
 *
 */
public class Instruments {
	Random random = new Random();
	private static int[] instrumentNumbers = {0,5,7,10,11,16,19,20,21,22,28,35,38,39,40,41,44,50,51,52,55,
			64,65,65,66,67,77,88,94,96,102,104,108,114};
	private static int[] Brass = {56,57,58,59,60,61,62,63};
	private static int[] Reed = {64,65,66,67,68,69,70,71};
	private static int[] Guitar = {24,25,26,27,28,29,30,31,32,33,34,35,36,37};
	private static int[] Ensemble = {48,49,50,51,52,53,54,55};
	private static int[] Piano = {0};
	private static int[] Percussion = {113,114,115,116,117,118,119,120};
	/**
	 * Returns a random set of instruments based on the genre of music.
	 * @param n the genre of music
	 * @return an int representing a random integer.
	 */
	public int randomInstrument(int n) {
		if (n == 1) {
			int randomNumber = random.nextInt(instrumentNumbers.length);
			return instrumentNumbers[randomNumber];
		} else if (n == 2) {
			int randomNumber = random.nextInt(Brass.length);
			return Brass[randomNumber];
		} else if (n == 3) {
			int randomNumber = random.nextInt(Reed.length);
			return Reed[randomNumber];
		} else if (n == 4) {
			int randomNumber = random.nextInt(Guitar.length);
			return Guitar[randomNumber];
		} else if (n == 5) {
			int randomNumber = random.nextInt(Ensemble.length);
			return Ensemble[randomNumber];
		} else if (n==6){
			int randomNumber = random.nextInt(Piano.length);
			return Piano[randomNumber];
		}
		else { 
			int randomNumber = random.nextInt(Percussion.length);
			return Percussion[randomNumber];
		}
		
	}
}
