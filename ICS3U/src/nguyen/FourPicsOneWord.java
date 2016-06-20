package nguyen;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import hsa_new.Console;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FourPicsOneWord {

	static int x = 0, y = 0;
	static Console c = new Console(31, 95);
	static Toolkit toolkit = Toolkit.getDefaultToolkit();
	static int coins = 25;
	static boolean game = true;;

	public static void main(String[] args) throws InterruptedException, Exception {

		// pictures
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image gamePage = toolkit.getImage("gamepage.jpg");
		Image instructions = toolkit.getImage("instructions.jpg");
		Image levelOne = toolkit.getImage("levelOne.jpg");
		Image levelTwo = toolkit.getImage("levelEight.jpg");
		Image levelThree = toolkit.getImage("levelTwo.jpg");
		Image levelFour = toolkit.getImage("levelsix.jpg");
		Image levelFive = toolkit.getImage("levelThree.jpg");
		Image levelSix = toolkit.getImage("levelSeven.jpg");
		Image levelSeven = toolkit.getImage("levelfour.jpg");
		Image levelEight = toolkit.getImage("levelFive.jpg");

		// Arrays for the answers and images and hints for each level

		String answers[] = new String[] { "Mongrel", "Horror", "Elegant", "Slenderman", "Amphibian", "Samara", "Narnia",
				"Bughuul" };
		Image imagePics[] = new Image[] { levelOne, levelTwo, levelThree, levelFour, levelFive, levelSix, levelSeven,
				levelEight };
		String hints[] = new String[] { "It is not a pure-bred dog.", "A genre of movie.",
				"Another word for sophisticated!", "It was a popular horror game.",
				"Cold-blooded vertebrate typically living on land but breeding in water!",
				"She comes out when you finish watching a horror film.", "A movie with a forbidden closet.",
				"He eats children." };
		 music();
		// game page (game starts)
		c.drawImage(gamePage, 0, 0, 768, 614, null);

		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				x = me.getX();
				y = me.getY();
			}
		});

		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Sleep Interrupted");

			}
			// If mouse clicks for instructions
			if ((48 <= x && x <= 340) && (199 <= y && y <= 252)) {

				while (true) {
					clearXY();
					c.clear();
					c.drawImage(instructions, 0, 0, 768, 614, null);
					Thread.sleep(20);
					// to go back to the game page
					if ((34 <= x && x <= 166) && (610 <= y && y <= 660)) {

						clearXY();
						c.clear();
						c.drawImage(gamePage, 0, 0, 768, 614, null);
						break;

					}
				}

			} // to end the program
			if ((47 <= x && x <= 338) && (583 <= y && y <= 640)) {

				while (true) {
					clearXY();
					c.clear();
					c.close();
				}
			}
			// if you click start
			if ((456 <= x && x <= 749) && (586 <= y && y <= 635)) {

				while (true) {

					clearXY();
					c.clear();
					Thread.sleep(20);
					// to the levels method
					displayLevels(imagePics, answers, hints);
					Thread.sleep(50);
					break;

				}
			} // end of if
		} // end of while (true)

	} // end of main method

	public static void clearXY() {
		// clear the x and y coordinates
		y = 0;
		x = 0;
	}

	public static void music() {
		// the background music
		try {
			Clip omfgSongs = AudioSystem.getClip(); // create the clip object
			omfgSongs.open(AudioSystem.getAudioInputStream(new File("OMFG.wav")));
			omfgSongs.loop(Clip.LOOP_CONTINUOUSLY);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void coinsPic() {
		// pictures of coins
		Image twentyFive = toolkit.getImage("twentyfive.jpg");
		Image fifty = toolkit.getImage("fifty.jpg");
		Image seventyFive = toolkit.getImage("seventyfive.jpg");
		Image oneHundred = toolkit.getImage("hundred.jpg");
		Image oneTwentyFive = toolkit.getImage("onetwentyfive.jpg");
		Image oneFifty = toolkit.getImage("onefifty.jpg");
		Image oneSeventyFive = toolkit.getImage("oneseventyfive.jpg");
		Image twoHundred = toolkit.getImage("twoHundred.jpg");
		Image zero = toolkit.getImage("zero.jpg");

		// depending on how many coins you have will appear on the console
		if (coins == 0) {
			c.drawImage(zero, 120, 475, 50, 50, null);
		}

		else if (coins == 25) {
			c.drawImage(twentyFive, 120, 473, 50, 50, null);
		}

		else if (coins == 50) {
			c.drawImage(fifty, 120, 475, 50, 50, null);
		}

		else if (coins == 75) {
			c.drawImage(seventyFive, 120, 475, 55, 55, null);
		}

		else if (coins == 100) {
			c.drawImage(oneHundred, 120, 475, 50, 50, null);
		} else if (coins == 125) {
			c.drawImage(oneTwentyFive, 120, 475, 50, 50, null);
		} else if (coins == 150) {
			c.drawImage(oneFifty, 120, 475, 50, 50, null);
		} else if (coins == 175) {
			c.drawImage(oneSeventyFive, 120, 475, 50, 50, null);
		} else if (coins == 200) {
			c.drawImage(twoHundred, 120, 475, 50, 50, null);
		}
	}

	public static void displayLevels(Image[] pics, String[] answersTwo, String[] hintsTwo)
			throws InterruptedException, Exception {
		// variables
		String guess;
		String answer;
		boolean alrdyHint = false;
		// pictures
		Image congrat = toolkit.getImage("congratulations.jpg");
		Image tryAgain = toolkit.getImage("tryagain.jpg");
		Image endPage = toolkit.getImage("endpage.jpg");
		for (int i = 0; i < 8;) {
			c.drawImage(pics[i], 0, 0, 768, 614, null);
			coinsPic();
			c.println("What is the word?");
			guess = c.readLine();
			if (i == 7) {
				c.clear();
				break;
			} // If answer is right
			if (guess.equalsIgnoreCase(answersTwo[i])) {
				i++;
				coins = coins + 25;
				alrdyHint = false;
				c.drawImage(congrat, 319, 120, 435, 420, null);
				c.println("");
				while (true) {
					Thread.sleep(20);
					if ((650 <= x && x <= 755) && (613 <= y && y <= 661)) {

						clearXY();
						c.clear();
						Thread.sleep(20);
						c.drawImage(pics[i], 0, 0, 768, 614, null);
						break;
					} // end of If of the next level button
				} // End of while
			} // end of if
				// if answer is wrong
			else {
				c.drawImage(tryAgain, 319, 120, 435, 420, null);
				Thread.sleep(1000);
				c.clear();
				c.drawImage(pics[i], 0, 0, 768, 614, null);
				coinsPic();
				// if you haven't used a hint for the current level, a hint will
				// be offered.
				if (alrdyHint == false) {
					c.println("Do you want a hint? [requires 50 coins]");
					Thread.sleep(100);
					c.println("[Reminder, only one hint per level.]");
					answer = c.readLine();
					c.clear();
					Thread.sleep(20);
					c.drawImage(pics[i], 0, 0, 768, 614, null);
					if (answer.equalsIgnoreCase("Yes")) {
						alrdyHint = true; // So hint doesn't come up again
						coinsPic();
						if (i == 0) { // free hint! (first level only)
							c.println("Free hint for the first level!");
							Thread.sleep(750);
							c.println(hintsTwo[i]);
							Thread.sleep(2000);
							c.println("[Input 'Ready' when you're ready to answer.]");
							c.readLine();
							c.clear();
						} else { // only if the user has enough counts for a
									// hint
							if (coins >= 50) {
								coins = coins - 50;
								coinsPic();
								c.println(hintsTwo[i]);
								Thread.sleep(2000);
								c.println("[Input 'Ready' when you're ready to answer.]");
								c.readLine();
								c.clear();
							} else { // if user does not have enough coins
								c.println("Sorry, you don't have enough coins for a hint.");
								Thread.sleep(2000);
								c.clear();
							}
						}
					}
				}
			}
		} // end of for loop
		c.clear();
		c.drawImage(endPage, 0, 0, 768, 614, null);
		return;
	}

}
