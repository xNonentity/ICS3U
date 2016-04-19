import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import hsa_new.Console;

public class SuicideForest {

	public static void main(String[] args) 
			throws InterruptedException, Exception{
		/*
		 * Jennifer Nguyen and Sharon Quan / April 6th 2016 / SuicideForest.Java Creating an
		 * adventure game
		 * Jennifer's task: All code, pictures in West & background music 
		 * Sharon's Task: all of the code under East direction and Play Again loop, text colour and background colour 
		 * This is an adventure program that allows the users to pick their own paths and actions 
		 */
		Console c = new Console(100, 150);
		c.setTextColor(Color.white);
		c.setTextBackgroundColor(Color.black);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit ();
		Image jpgbackground = toolkit.getImage ("backgound.jpg");

		// Variables
		String play;
		String direction;
		String frndOne;
		String frndTwo;
		String frndThree;
		
		boolean again = true; 
		
		
		try 
		{
			Clip themeBgm = AudioSystem.getClip(); //create the clip object
			themeBgm.open(AudioSystem.getAudioInputStream(new File("Haunted_Forest.wav")));
			themeBgm.loop(Clip.LOOP_CONTINUOUSLY);
		
		// WHILE LOOP, PLAY AGAIN
		while (again == true) {
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("Welcome to Suicide Forest..");
			c.println("please enter 3 friends to explore this journey with you.");
			frndOne = c.readLine();
			frndTwo = c.readLine();
			frndThree = c.readLine();
			c.clear(); // CLEAR
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("...While exploring the forest, you get knocked out.");
			Thread.sleep(1000);
			c.println("When you woke up, your friends were gone...");
			Thread.sleep(1000);
			c.println("Now it is your mission to find your friends and get out of the forest alive.");
			Thread.sleep(1000);
			c.println("Please note that inputs would be either 'Yes' or 'No' if said otherwise.");
			Thread.sleep(1000);
			c.println("Which direction do you want to go? East or West?");
			direction = c.readLine();
			c.clear(); //CLEAR
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			if (direction.equalsIgnoreCase("West")) // Jennifer's Code
			{
				// Variables
				String squirrel;
				String fllwLaugh;
				String cave;
				String wolves;
				String jumpBridge;
				String girl;
				String run;
				String runCave;
				String jumpLog;
				String climbsFence;
				String leftRight;
				String helpMan;
				String hyena;
				String strikePlank;
				String water;
				String answerPill;
				String addPill;
				String appchFnd;
				String power;
				String ansOne;
				String ansTwo;
				String ansThree;
				String throwSquirrel;
				String convoA;
				String convoB;
			
				int numAns;
				int log;
				int bridge;
				int fence;

				// Boolean
				boolean killSquirrel = false;
				boolean key = false;
				boolean pill = false;
				boolean friendOne = false;
				boolean friendTwo = false;
				boolean friendThree = false; 
				
				Image squirrelpic = toolkit.getImage ("squirrel.jpg");
				Image deadsquirrelpic = toolkit.getImage ("deadsquirrel.jpg");
				Image keypic = toolkit.getImage ("key.png");
				Image pillpic = toolkit.getImage ("pill.png");
				Image girlsitting = toolkit.getImage ("girlsitting.jpg");
				Image screamgirl = toolkit.getImage ("screamgirl.jpg");
				Image slender = toolkit.getImage ("slender.jpg");
				Image slenderman = toolkit.getImage ("slenderman.jpg");
				Image bridgepic = toolkit.getImage ("bridge.jpg");
				Image cavepic = toolkit.getImage ("Cave.jpg");
				Image cellar = toolkit.getImage ("cellar.jpg");
				Image eyelessjack = toolkit.getImage ("eyelessjack.jpg");
				Image insideshack = toolkit.getImage ("insideshack.jpg");
				Image jack = toolkit.getImage ("jack.jpg");
				Image jeffone = toolkit.getImage ("jeffone.jpg");
				Image jefftwo = toolkit.getImage ("jefftwo.jpg");
				Image jeffthree = toolkit.getImage ("jeffthree.jpg");
				Image mantree = toolkit.getImage ("mantree.jpg");
				Image whiteman = toolkit.getImage ("whiteman.jpg");
				Image woodshack = toolkit.getImage ("woodshack.jpg");
				Image hammer = toolkit.getImage("hammer.png");
				Image sandman = toolkit.getImage("sandman.jpg");
				
				c.println("As you're walking, you hear a faint laughter in the forest.");
				Thread.sleep(1000);
				c.println("Then you suddenly hear loud shuffling.");
				Thread.sleep(1000);
				c.println("Do you follow the shuffling?"); // Shuffling
				squirrel = c.readString();
				c.clear(); // CLEAR
				c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
				if (squirrel.equalsIgnoreCase("Yes")) // Killing the squirrel?
				{
					c.println("There was a squirrel.");
					c.drawImage(squirrelpic, 500, 300, 300, 300, null);
					Thread.sleep(1000);
					c.println("Do you kill the squirrel?");
					squirrel = c.readString();
					c.clear(); // CLEAR
					c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
					if (squirrel.equalsIgnoreCase("Yes")) // YES TO SQUIRREL
					{
						c.println("You grabbed the squirrel and broke it's neck.");
						Thread.sleep(1000);
						c.drawImage(deadsquirrelpic, 500, 300, 300, 300, null);
						c.println("You hold the squirrel for the rest of the journey.");
						killSquirrel = true;
						Thread.sleep(3500);
						c.clear(); //CLEAR
						c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
					}
				}
				c.println("You hear the laughter but now it seems to be closer.");
				Thread.sleep(1000);
				c.println("Do you follow the laughter?");
				fllwLaugh = c.readString();
				c.clear(); // CLEAR
				c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
				if (fllwLaugh.equalsIgnoreCase("Yes")) // YOU HEAR LAUGHING
				{
					c.println("You see a man chained to a tree, historically laughing at you.");
					try 
					{
						Clip laughtwo = AudioSystem.getClip();
						laughtwo.open(AudioSystem.getAudioInputStream(new File("madlaughter.wav"))); 
						laughtwo.start();
					} catch (Exception e) {
						e.printStackTrace();
					}
					c.drawImage(mantree, 500, 300, 300, 300, null);
					Thread.sleep(1000);
					c.println("Man: key.. key.. Set me free..");
					Thread.sleep(1000);
					// Conversation
					c.println("Your response: (Insert the letter of response.) ");
					Thread.sleep(1000);
					c.println("(A): ...I don't know.");
					Thread.sleep(1000);
					c.println("(B): Should I? ");
					Thread.sleep(1000);
					c.println("(C): Oh hell naw, you make me feel like pooping my pants.");
					convoA = c.readString();
					c.clear(); // CLEAR
					c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
					if (convoA.equalsIgnoreCase("A")) // CONVERSATION
					{
						c.println("You: ...I don't know.");
					} else if (convoA.equalsIgnoreCase("B")) {
						c.println("You: Should I?");
					} else {
						c.println("You: Oh hell naw, you make me feel like pooping my pants.");
					}
					c.println("Man: I know where your friends are.");
					Thread.sleep(1000);
					c.println("You both hear shuffling.");
					Thread.sleep(1000);
					c.println("Man: Hurry before it's too late.");
					Thread.sleep(1000);
					c.println("Do you want to flee the site or go find the key? (Key or Flee)");
					run = c.readString();
					c.clear(); // CLEAR
					c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
					if (run.equalsIgnoreCase("Key")) {
						c.println("The footsteps get louder.");
						Thread.sleep(1000);
						c.println("You see a cave, do you run in?");
						c.drawImage(cavepic, 0, 190, 1250, 750, null); 
						runCave = c.readString();
						c.clear(); //CLEAR
						c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
						if (runCave.equalsIgnoreCase("Yes")) {
							c.println("You're caught at a dead end.");
							Thread.sleep(1000);
							c.println("You see a mysterious man.");
							Thread.sleep(1000);
							c.println("He smiles at you, and splits your head in half.");
							Thread.sleep(1000);
							c.println("DEAD.");
							// GAME OVER
						} else {
							c.println("You're running now, you see a log.");
							Thread.sleep(1000);
							c.println("Do you jump?");
							jumpLog = c.readString();
							c.clear(); // CLEAR
							c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
							if (jumpLog.equalsIgnoreCase("Yes")) {
								log = (int) (Math.random() * 10) + 1;
								if (log >= 4) {
									c.println("You jumped over.");
									Thread.sleep(1000);
									c.println("You bump into a tall faceless man in a suit.");
									Thread.sleep(1000);
									c.drawImage(slenderman, 500, 300, 300, 300, null);
									c.println("CROSSOVER!");
									Thread.sleep(1000);
									c.println("YOU FOUND SLENDERMAN!");
									c.drawImage(squirrelpic, 0, 190, 1250, 750, null);
									Thread.sleep(1000);
									c.println("DEAD.");
									// GAME OVER
								}

								else {
									c.println("You tripped over the log.");
									Thread.sleep(1000);
									c.println("You've been caught by a mysterious man.");
									Thread.sleep(1000);
									c.drawImage(whiteman, 0, 190, 1250, 750, null);
									c.println("He smiles, slits your throat and carves a smile on your face.");
									Thread.sleep(1000);
									c.println("DEAD.");
									// GAME OVER
								}
							}

						}
					}

					else // Fleeing
					{
						c.println("You're running now, you see a fence.");
						Thread.sleep(1000);
						c.println("Do you climb the fence?");
						climbsFence = c.readString();
						c.clear(); //CLEAR
						c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
						if (climbsFence.equalsIgnoreCase("Yes")) {
							fence = (int) (Math.random() * 10) + 1;
							if (fence >= 4) {
								c.println("You climbed the fence successfully.");
								Thread.sleep(1000);
								c.println("You bump into a boy with no eyesockets.");
								Thread.sleep(1000);
								c.println("CROSSOVER!");
								Thread.sleep(1000);
								c.println("YOU FOUND EYELESS JACK");
								Thread.sleep(1000);
								c.drawImage(eyelessjack, 0, 190, 1250, 750, null);
								c.println("DEAD.");
								//GAME OVER. 
							}

							else {
								c.println("Your pants got caught in the fence.");
								Thread.sleep(1000);
								c.println("The mysterious man smiles.");
								c.drawImage(whiteman, 0, 190, 1250, 750, null);
								Thread.sleep(1000);
								c.println("He starts skinning you alive."); 
								Thread.sleep(1000);
								c.println("DEAD.");
								// GAME OVER
							}
						}
						//If you don't climb the fence.
						else {
							c.println("You get caught.");
							Thread.sleep(1000);
							c.println("The mysterious man smiles.");
							c.drawImage(whiteman, 0, 190, 1250, 750, null);
							Thread.sleep(1000);
							c.println("He pours bleach on you and sets you on fire."); 
							Thread.sleep(1000);
							c.println("DEAD.");
							// Game Over
						}
					}

				}

				else // You don't follow the laughter
				{
					c.println("You continue walking.");
					Thread.sleep(1000);
					c.println("You find a cave, do you go inside it?");
					c.drawImage(cavepic, 0, 190, 1250, 750, null);
					cave = c.readString();
					c.clear(); //CLEAR
					c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
					if (cave.equalsIgnoreCase("Yes")) {
						c.println("You found a key inside the cave as your were looking around.");
						key = true;
						c.drawImage(keypic, 500, 300, 300, 300, null);
						Thread.sleep(1000);
						c.println("Do you go left or right?");
						leftRight = c.readString();
						c.clear(); //CLEAR
						c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
						if (leftRight.equalsIgnoreCase("Right")) // Go to the right									
						{
							c.println("You see a man chained to a tree, historically laughing at you.");
							c.drawImage(mantree, 500, 300, 300, 300, null);
							Thread.sleep(1000);
							c.println("Man: key.. key.. Set me free..");
							Thread.sleep(1000);
							// Conversation
							c.println("Your response: (Insert the letter of response.) ");
							Thread.sleep(1000);
							c.println("(A): ...I don't know.");
							Thread.sleep(1000);
							c.println("(B): Should I? ");
							Thread.sleep(1000);
							c.println("(C): Oh hell naw, you make me feel like pooping my pants.");
							convoA = c.readString();
							c.clear(); // CLEAR
							c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
							if (convoA.equalsIgnoreCase("A")) {
								c.println("You: ...I don't know.");
							}
							else if (convoA.equalsIgnoreCase("B")) {
								c.println("You: Should I?");
							}
							else {
								c.println("You: Oh hell naw, you make me feel like pooping my pants.");
							}
							c.println("Man: I know where your friends are.");
							Thread.sleep(1000);
							c.println("You both hear shuffling.");
							Thread.sleep(1000);
							c.println("Man: Hurry before it's too late.");
							Thread.sleep(1000);
							c.println("Do you help him?");
							helpMan = c.readString();
							c.clear(); //CLEAR
							c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
							if (helpMan.equalsIgnoreCase("Yes")) // Help the man
							{
								c.println("The man starts laughing.");
								Thread.sleep(1000);
								c.println("Your response (Input the letter of response)"); 
								Thread.sleep(1000);
								c.println("(A): Uhm, are you okay?"); 
								Thread.sleep(1000);
								c.println("(B): Dude, you need serious help."); 
								Thread.sleep(1000);
								c.println("(C): -Sigh- I think I'm going to regret this.");
								convoB = c.readString();
								c.clear(); //CLEAR
								c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
								if (convoB.equalsIgnoreCase("A"))
								{
									c.println("You: Uhm, are you okay?");
								}
								else if (convoB.equalsIgnoreCase("B"))
								{
									c.println("You: Dude, you need serious help.");
								}
								else
								{
									c.println("You: -Sigh- I think I'm going to regret this."); 
								}
								Thread.sleep(1000);
								c.println("The man ignores your comment.");
								Thread.sleep(1000);
								c.println("Man: Hey, hey, its been a while since I played games!");
								Thread.sleep(1000);
								c.println("Man: Pick a number between 1-10!"); //NUMBER GAME 
								Thread.sleep(1000);
								c.println("Man: You got three tries, guess it right and I'll help you!");
								numAns = c.readInt();
								c.clear(); //CLEAR 
								c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
								int numChance = 2;
								//NUMBER WHILE LOOP
								while (numAns != 4 && numChance > 0) {
									numChance--;
									c.println("Man: Haha! Try again!");
									Thread.sleep(1000);
									c.println("Man: Pick a number between 1-10!");
									numAns = c.readInt();
									c.clear(); //CLEAR
									c.drawImage(jpgbackground, 0, 190, 1250, 750, null);	
									}
									if (numAns == 4) {
										c.println("Man: Ok! I'll help you.");
										Thread.sleep(1000);
										c.println("Hey, I'm on these real fancy pills, you want some?");
										c.drawImage(pillpic, 500, 300, 300, 300, null);
										Thread.sleep(1000);
										c.println("Your resposne (Input the letter of response)");
										Thread.sleep(1000);
										c.println("(A) : Uhm, no thanks?");
										Thread.sleep(1000);
										c.println("(B) : uh, okay?");
										answerPill = c.readString();
										c.clear(); //CLEAR
										c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
										if (answerPill.equalsIgnoreCase("B")) {
											c.println("He hands you a pill.");
											Thread.sleep(1000);
											c.println("You look at the pill.");
											Thread.sleep(1000);
											c.println("You: Thanks?");
											Thread.sleep(1000);
											c.clear(); // CLEAR
											c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
											pill = true;
										}

										else // No to the pill
										{
											c.println("Man: Whatever you say! More for me!");
										}
										c.println("The man leads you to a wooden shack with hyenas surrounding the entrance.");
										c.drawImage(woodshack, 500, 300, 300, 300, null);
										c.println("Do you approach the entrance?");
										hyena = c.readString();
										c.clear(); //CLEAR
										c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
										if (hyena.equalsIgnoreCase("Yes")) // Approach Hyena
										{
											if (killSquirrel == true) {
												c.println("You realize you have a squirrel in your hand.");
												Thread.sleep(1000);
												c.println("Do you throw the squirrel?");
												throwSquirrel = c.readString();
												c.clear(); //CLEAR
												c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
												c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
												if (throwSquirrel.equalsIgnoreCase("Yes")) {
													c.println("You throw the squirrel and the hyenas chase after it. ");
													Thread.sleep(1000);
													c.println("The entrance is now clear, you enter.");
													c.drawImage(insideshack, 500, 300, 300, 300, null);
													Thread.sleep(1000);
													c.println("There was nothing inside but old blood stains and bones.");
													Thread.sleep(1500);
													c.println("The man gives you a hammar.");
													c.drawImage(hammer, 500, 300, 300, 300, null);
													Thread.sleep(1500);
													c.println("Man: Your friends are in the basement.");
													Thread.sleep(1500);
													c.println("Man(laughs): But you gotta hit the right plank to get the basement to open.");
													Thread.sleep(3000);
													c.clear(); //CLEAR
													c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
													c.println("You smell smoke, the shack is now on fire.");
													Thread.sleep(2000);
													c.println("Man: Looks like we're running out of time!");
													Thread.sleep(2000);
													c.println("Do you strike the left plank or the right?");
													strikePlank = c.readString();
													c.clear(); //CLEAR 
													c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
													if (strikePlank.equalsIgnoreCase("Left")) {
														c.println("The basement cellar opens and you two both fall.");
														c.drawImage(cellar, 500, 300, 300, 300, null);
														Thread.sleep(2000);
														c.println("The man starts laughing as you look around.");
														Thread.sleep(2500);
														c.clear(); //CLEAR
														c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
														c.println("You see your friends strapped down on the floor with a lawnmower above their heads.");
														Thread.sleep(2500);
														c.println("You see another man, sitting there with a carved smile, bleached face and no eyelids.");
														c.drawImage(jeffone, 500, 300, 300, 300, null);
														Thread.sleep(2500);
														c.println("You realize he is the famous Jeff the Killer.");
														Thread.sleep(3000);
														c.clear(); //CLEAR
														c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
														c.println("Jeff: Hello there, your friends are quite scared there.");
														Thread.sleep(1500);
														c.println("Jeff: Must be a brave one to think you can save them.");
														Thread.sleep(1500);
														c.println("Jeff: Do you mind if you get me some water over there?)");
														Thread.sleep(1000);
														c.println("Input 'No': No I don't mind or 'Yes': Yes I do mind.");
														water = c.readString();
														c.clear(); //CLEAR
														c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
														if (water.equalsIgnoreCase("No")) // No you do not mind
														{
															c.println("You go grab water.");
															Thread.sleep(1000);
															if (pill == true) // if they have the pill 
															{
																c.println("Do you want to add the pill into the water?");
																addPill = c.readString();
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																if (addPill.equalsIgnoreCase("Yes")) {
																	c.println("You give the cup to the killer.");
																	Thread.sleep(2000);
																	c.println("He takes it, and drinks it.");
																	Thread.sleep(3000);
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	c.println("Jeff passes out cold.");
																	Thread.sleep(1000);
																	c.println("Do you approach your friends?");
																	appchFnd = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	if (appchFnd.equalsIgnoreCase("Yes")) // Approach friends
																	{
																		c.println("The lawnmower had a sensor and turned on.");
																		Thread.sleep(1000);
																		c.println("Your friends face got shredded from the lawnmower.");
																		Thread.sleep(1000);
																		c.println("FAILED.");
																		// GAME OVER
																	}
																	else // Do not approach friends
																	{
																		c.println("You look around and you find the power box.");
																		Thread.sleep(1000);
																		c.println("Do you turn the power off?");
																		power = c.readString();
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																		if (power.equalsIgnoreCase("Yes")) {
																			c.println("The power is turned off!");
																			c.println("You safetly approach " + frndOne + ", " + frndTwo + ", " + frndThree + "."); 
																			c.println("You run out of the back door of the basement to safety leaving the crazy man behind.");
																			// WINNER
																		}
																		else {
																			c.println("The man stares at you.");
																			c.drawImage(sandman, 0, 190, 1250, 750, null);
																			Thread.sleep(1000);
																			c.println("He smiles and laughs.");
																			Thread.sleep(1000);
																			c.println("Man: I think I want you with me."); 
																			Thread.sleep(1000);
																			c.println("DEAD.");
																		}
																	}
																} // End of if player does not want to add pill
																else // WHILE LOOP: THREE RIDDLES
																{
																	c.println("Jeff: Thank you, you're very kind.");
																	Thread.sleep(1000);
																	c.println("You roll your eyes.");
																	Thread.sleep(1000);
																	c.println("Jeff: Now, about your friends..");
																	Thread.sleep(2500);
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	c.println("Jeff: I can't release them to you, they're my pets.");
																	Thread.sleep(2500);
																	c.println("You see that your friends had their nails flipped off and cuts on their arms.");
																	Thread.sleep(2500);
																	c.println("Jeff: Since you've been nice enough to get me water, I'll give you three riddles.");
																	Thread.sleep(2500);
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	c.println("Jeff: One riddle correct means one friend saved!");
																	Thread.sleep(1000);
																	c.println("Jeff: You only have two chances for each riddle, if you can't guess any of them, you'll join us.");
																	Thread.sleep(1000);
																	c.println("Jeff: Seems fair enough.");
																	Thread.sleep(1000);
																	c.println("Jeff: Ready or not, I don't care.");
																	Thread.sleep(1000);
																	c.println("Jeff: When is a door, not a door?");
																	ansOne = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	int chancesOne = 1;
																	while (!ansOne.equalsIgnoreCase("Ajar") && chancesOne > 0) // LOOP ONE
																	{
																		chancesOne--;
																		c.println("Jeff: You got one more chance for this riddle.");
																		Thread.sleep(1000);
																		c.println("Jeff: Come on, don't you want to save your friends?");
																		Thread.sleep(1000);
																		c.println("Jeff: Let me repeat; when is a door, not a door?");
																		ansOne = c.readString();
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	} // End of while loop one
																	if (ansOne.equalsIgnoreCase("Ajar")) {
																		c.println("Jeff: Good job, you saved " + frndOne);
																		friendOne = true;
																		Thread.sleep(1000);
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	}
																	else
																	{
																		c.println("Jeff: Looks like " + frndOne + " dies.");
																	}
																	c.println("Jeff: Alright, on to the second.");
																	Thread.sleep(1000);
																	c.println("Jeff: There is a certain crime, that if it is attempted, is punishable, but if it is committed, is not punishable. What is the crime?");
																	ansTwo = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	int chancesTwo = 1;
																	while (!ansTwo.equalsIgnoreCase("Suicide") && chancesTwo > 0) // LOOP TWO
																	{
																		chancesTwo--;
																		c.println("Jeff: You got one more chance for this riddle.");
																		Thread.sleep(1000);
																		c.println("Jeff: Don't tell me you're giving up now.");
																		Thread.sleep(1000);
																		c.println("Jeff: Again, there is a certain crime, that if it is attempted, is punishable, but if it is committed, is not punishable. What is the crime?");
																		ansTwo = c.readString();
																		c.clear(); //CLEAR)
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	} // End of while loop two
																	if (ansTwo.equalsIgnoreCase("Suicide")) {
																		c.println("Jeff: Good job, you saved " + frndTwo);
																		friendTwo = true;
																	}
																	else
																	{
																		c.println("Jeff: Looks like " + frndTwo + " dies.");
																	}
																	c.println("Jeff: Last riddle!");
																	Thread.sleep(1000);
																	c.println("Jeff: What does the rich man need, a blind man see and the dead man eat? ");
																	ansThree = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	int chancesThree = 1;
																	while (!ansThree.equalsIgnoreCase("Nothing") && chancesThree > 0) // LOOP THREE
																	{
																		chancesOne--;
																		c.println("Jeff: You got one more chance for this riddle.");
																		Thread.sleep(1000);
																		c.println("Jeff: Don't tell me you're giving up now.");
																		Thread.sleep(1000);
																		c.println("Jeff: What does the rich man need, a blind man see, and the dead man eat?");
																		ansThree = c.readString();
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	} // End of while loop three
																	if (ansThree.equalsIgnoreCase("Nothing")) {
																		c.println("Killer: Good job, you saved one so far");
																		friendThree = true;
																		c.clear(); // CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	}
																	else
																	{
																		c.println("Killer: Looks like " + frndThree + " dies.");
																	}
																	if (friendOne == true && friendTwo == true && friendThree == true) {
																		c.println("Jeff: Congratulations, you can free your friends if you can.");
																		Thread.sleep(1000);
																		c.println("The man comes from behind with a hammar and splits the killer's head in half.");
																		Thread.sleep(1000);
																		c.println("The man laughs.");
																		Thread.sleep(1000);
																		c.println("You see your friends, do you approach them?");
																		appchFnd = c.readString();
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																		if (appchFnd.equalsIgnoreCase("Yes")) // Approach friends
																		{
																			c.println("The lawnmower had a sensor and turned on.");
																			Thread.sleep(1000);
																			c.println("Your friends face got shredded from the lawnmower.");
																			Thread.sleep(1000);
																			c.println("FAIL.");
																			//GAME OVER
																		}
																		else // Does not approach friends
																		{
																			c.println("You look around and you find the power box.");
																			Thread.sleep(1000);
																			c.println("Do you turn the power off?");
																			power = c.readString();
																			c.clear(); //CLEAR
																			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																			if (power.equalsIgnoreCase("Yes")) {
																				c.println("The power is turned off!");
																				Thread.sleep(1000);
																				c.println("You safetly approach " + frndOne + ", " + frndTwo + ", " + frndThree + ".");
																				Thread.sleep(1000);
																				c.println("You run out of the back door of the basement to safety with your friends.");
																				Thread.sleep(1000);
																				c.println("WINNER.");
																				// WINNER
																			}
																			else {
																				c.println("DEAD."); 
																			}
																		}
																	}
																	else // Else if all friends die
																	{
																		c.println("Jeff: Darn, you couldn't save all of them. I guess you're stuck with me!");
																		c.drawImage(jefftwo, 0, 190, 1250, 750, null);
																		// GAME OVER
																	}
																}
															}
															else // You don't have the pill (REPEAT OF CODE OF 'WHILE LOOP OF RIDDLES' FROM ABOVE)
															{
																c.println("Jeff: Thank you, you're very kind.");
																Thread.sleep(1000);
																c.println("You roll your eyes.");
																Thread.sleep(1000);
																c.println("Jeff: Now, about your friends..");
																Thread.sleep(2500);
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																c.println("Jeff: I can't release them to you, they're my pets.");
																Thread.sleep(2500);
																c.println("You see that your friends had their nails flipped off and cuts on their arms.");
																Thread.sleep(2500);
																c.println("Jeff: Since you've been nice enough to get me water, I'll give you three riddles.");
																Thread.sleep(2500);
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																c.println("Jeff: One riddle correct means one friend saved!");
																Thread.sleep(1000);
																c.println("Jeff: You only have two chances for each riddle, if you can't guess any of them, you'll join us.");
																Thread.sleep(1000);
																c.println("Jeff: Seems fair enough.");
																Thread.sleep(1000);
																c.println("Jeff: Ready or not, I don't care.");
																Thread.sleep(1000);
																c.println("Jeff: When is a door, not a door?");
																ansOne = c.readString();
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																int chancesOne = 1;
																while (!ansOne.equalsIgnoreCase("Ajar") && chancesOne > 0) // LOOP ONE
																{
																	chancesOne--;
																	c.println("Jeff: You got one more chance for this riddle.");
																	Thread.sleep(1000);
																	c.println("Jeff: Come on, don't you want to save your friends?");
																	Thread.sleep(1000);
																	c.println("Jeff: Let me repeat; when is a door, not a door?");
																	ansOne = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																} // End of while loop one
																if (ansOne.equalsIgnoreCase("Ajar")) {
																	c.println("Jeff: Good job, you saved " + frndOne);
																	friendOne = true;
																	Thread.sleep(1000);
																	c.clear();
																}
																else
																{
																	c.println("Jeff: Looks like " + frndOne + " dies.");
																}
																c.println("Jeff: Alright, on to the second.");
																Thread.sleep(1000);
																c.println("There is a certain crime, that if it is attempted, is punishable, but if it is committed, is not punishable. What is the crime?");
																ansTwo = c.readString();
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																int chancesTwo = 1;
																while (!ansTwo.equalsIgnoreCase("Suicide") && chancesTwo > 0) // LOOP TWO
																{
																	chancesTwo--;
																	c.println("Jeff: You got one more chance for this riddle.");
																	Thread.sleep(1000);
																	c.println("Jeff: Don't tell me you're giving up now.");
																	Thread.sleep(1000);
																	c.println("Jeff: Again, there is a certain crime, that if it is attempted, is punishable, but if it is committed, is not punishable. What is the crime?");
																	ansTwo = c.readString();
																	c.clear(); //CLEAR)
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																} // End of while loop two
																if (ansTwo.equalsIgnoreCase("Suicide")) {
																	c.println("Jeff: Good job, you saved " + frndTwo);
																	friendTwo = true;
																}
																else
																{
																	c.println("Jeff: Looks like " + frndTwo + " dies.");
																}
																c.println("Jeff: Last riddle!");
																Thread.sleep(1000);
																c.println("Jeff: What does the rich man need, a blind man see and the dead man eat? ");
																ansThree = c.readString();
																c.clear(); //CLEAR
																c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																int chancesThree = 1;
																while (!ansThree.equalsIgnoreCase("Nothing") && chancesThree > 0) // LOOP THREE
																{
																	chancesOne--;
																	c.println("Jeff: You got one more chance for this riddle.");
																	Thread.sleep(1000);
																	c.println("Jeff: Don't tell me you're giving up now.");
																	Thread.sleep(1000);
																	c.println("Jeff: What does the rich man need, a blind man see, and the dead man eat?");
																	ansThree = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																} // End of while loop three
																if (ansThree.equalsIgnoreCase("Nothing")) {
																	c.println("Killer: Good job, you saved " + frndThree);
																	Thread.sleep(1000);
																	friendThree = true;
																	c.clear(); // CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																}
																else
																{
																	c.println("Killer: Looks like " + frndThree + " dies.");
																}
																if (friendOne == true && friendTwo == true && friendThree == true) {
																	c.println("Jeff: Congratulations, you can free your friends if you can.");
																	Thread.sleep(1000);
																	c.println("The man comes from behind with a hammar and splits the killer's head in half.");
																	Thread.sleep(1000);
																	c.println("The man laughs.");
																	Thread.sleep(1000);
																	c.println("You see your friends, do you approach them?");
																	appchFnd = c.readString();
																	c.clear(); //CLEAR
																	c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																	if (appchFnd.equalsIgnoreCase("Yes")) // Approach friends
																	{
																		c.println("The lawnmower had a sensor and turned on.");
																		Thread.sleep(1000);
																		c.println("Your friends face got shredded from the lawnmower.");
																		Thread.sleep(1000);
																		c.println("FAIL.");
																		//GAME OVER
																	}
																	else // Does not approach friends
																	{
																		c.println("You look around and you find the power box.");
																		Thread.sleep(1000);
																		c.println("Do you turn the power off?");
																		power = c.readString();
																		c.clear(); //CLEAR
																		c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
																		if (power.equalsIgnoreCase("Yes")) {
																			c.println("The power is turned off!");
																			Thread.sleep(1000); 
																			c.println("You look at the man as he laughs crazily.");
																			c.println("You safetly approach " + frndOne + ", " + frndTwo + ", " + frndThree + ".");
																			Thread.sleep(1000);
																			c.println("You run out of the back door of the basement to safety with your friends.");
																			Thread.sleep(1000);
																			c.println("WINNER.");
																			// WINNER
																		}
																		else {
																			c.println("DEAD.");
																		}
																	}
																}
																else // Else if all friends die
																{
																	c.println("Jeff: Darn, you couldn't save all of them. I guess you're stuck with me!");
																	c.drawImage(jefftwo, 0, 190, 1250, 750, null);
																	// GAME OVER
																}
															} // End of you don't have the pill 
														} // End of you do not mind
														else // You do mind pouring glass of water
														{
															c.println("Jeff: Oh, you have the audacity to say you do mind?");
															c.drawImage(jeffthree, 0, 190, 1250, 750, null);
															c.println("DEAD.");
														}
													}
													else // Strike the right plank
													{
														c.println("Wrong.");
														Thread.sleep(1000);
														c.println("You got caught in fire.");
														Thread.sleep(1000);
														c.println("DEAD.");
														// GAME OVER
													}
												} // end of throw squirrel
												else // does not throw squirrel
												{
													c.println("The hyenas attack you two.");
													Thread.sleep(1000);
													c.println("DEAD.");
												}
											}

										} else // If player does not approach hyena
										{
											c.println("You decide that there must be another way.");
											Thread.sleep(1000);
											c.println("You quietly walk around to avoid the hyenas finding you.");
											Thread.sleep(1000);
											c.println("As you reach to the back of the shack, there is a bridge with broken planks.");
											c.drawImage(bridgepic, 0, 190, 1250, 750, null);
											Thread.sleep(1000);
											c.println("Do you jump?");
											c.readString();
											c.clear(); // CLEAR
											c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
											c.println("The man decided to push you into the water.");
											Thread.sleep(1000);
											c.println("The man starts waving and laughing.");
											c.println("DEAD.");
											// GAME OVER
										}
									}
									else
									{
										c.println("Man: Opps, oh well.");
										Thread.sleep(1000);
										c.println("Man: I guess you're not worthy."); 
										Thread.sleep(1000);
										c.println("The man knocks you off your feet and grabs your mouth.");
										Thread.sleep(1000);
										c.println("He breaks your jaw, takes out your eyes and eats them."); 
										Thread.sleep(1000);
										c.println("He laughs crazily.");
										Thread.sleep(1000);
										c.println("DEAD.");
										//Game over
								}
							} // End of if Yes to help man
							else // Don't help the mannnnnnnnnnnnnnnnn
							{
								c.println("You're running now, you see a log.");
								Thread.sleep(1000);
								c.println("Do you jump?");
								jumpLog = c.readString();
								c.clear(); //CLEAR
								if (jumpLog.equalsIgnoreCase("Yes")) {
									log = (int) (Math.random() * 10) + 1;
									if (log >= 4) {
										c.println("You jumped over.");
										Thread.sleep(1000);
										c.println("You bump into a tall faceless man in a suit.");
										c.drawImage(slenderman, 500, 300, 300, 300, null);
										Thread.sleep(1000);
										c.println("CROSSOVER!");
										Thread.sleep(1000);
										c.drawImage(slender, 0, 190, 1250, 750, null);
										c.println("YOU FOUND SLENDERMAN!"); 
									}

									else {
										c.println("You tripped over the log.");
										Thread.sleep(1000);
										c.println("You fell face forward into a bear trap.");
										Thread.sleep(1000);
										c.println("DEAD.");
										// GAME OVER
									}
								}
							}

						} // End of if to go to right

						else // Going left
						{
							c.println("You found Laughing Jack!");
							Thread.sleep(1000);
							c.drawImage(jack, 500, 300, 300, 300, null);
							c.println("DEAD."); 
						}
					}

					else {
						c.println("You continue walking and as you squint, you see a shack in the distance");
						c.drawImage(woodshack, 0, 190, 1250, 750, null);
						Thread.sleep(1000);
						c.println("As you get closer, you see that there are wolves around the entrance.");
						Thread.sleep(1000);
						c.println("Do you approach the wolves?");
						wolves = c.readString();
						c.clear(); //CLEAR
						c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
						if (wolves.equalsIgnoreCase("Yes")) {
							if (killSquirrel == true) {
								c.println("You realize you have a squirrel in your hand.");
								Thread.sleep(1000);
								c.println("You throw the squirrel and the wolves chase after it. ");
								Thread.sleep(1000);
								c.println("The entrance is now clear, you enter.");
								Thread.sleep(3000);
								c.clear(); //CLEAR
								c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
								c.println("There was nothing inside but old blood stains and bones.");
								Thread.sleep(1000);
								c.println("The door closes shut, you try to get it open but it wouldn't budge.");
								Thread.sleep(1000);
								c.println("You smell smoke.");
								Thread.sleep(1000);
								c.println("The shack is on fire.");
								Thread.sleep(1000);
								c.println("You get caught in the fire and slowly burn.");
								Thread.sleep(1000);
								c.println("DEAD.");
								// GAME OVER
							}
							else {
								c.println("The wolves run to you, biting and tearing your legs.");
								Thread.sleep(1000);
								c.println("You scream in agony.");
								Thread.sleep(1000);
								c.println("DEAD.");
								// GAME OVER
							}
						}
						else {
							c.println("You: There must be another way..");
							Thread.sleep(1000);
							c.println("You quietly walk around to avoid the wolves finding you.");
							Thread.sleep(1000);
							c.println("As you reach to the back of the shack, there is a bridge with broken planks.");
							c.drawImage(bridgepic, 0, 190, 1250, 750, null);
							Thread.sleep(1000);
							c.println("Do you jump?");
							jumpBridge = c.readString();
							c.clear(); //CLEAR
							c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
							if (jumpBridge.equalsIgnoreCase("Yes")) {
								bridge = (int) (Math.random() * 10) + 1; // GENERATOR
								if (bridge >= 60) // Success of jumping
								{
									c.println("You jumped over, barely making it.");
									Thread.sleep(1000);
									c.println("Congratulations.");
									Thread.sleep(1000);
									c.println("You walk inside.");
									Thread.sleep(1000);
									c.println("You look around, your friends aren't there.");
									Thread.sleep(1000);
									c.println("But you see a girl sitting on the chair.");
									c.drawImage(girlsitting, 500, 300, 300, 300, null);
									Thread.sleep(2000);
									c.clear(); // CLEAR
									c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
									c.println("Do you approach the person?");
									girl = c.readString();
									if (girl.equalsIgnoreCase("Yes")) {
										c.drawImage(screamgirl, 0, 190, 1250, 7500, null);
										c.println("DEAD.");
										// GAME OVER
									}
									else {
										c.println("She slowly turns around");
										Thread.sleep(1000);
										c.println("She smiles.");
										c.drawImage(screamgirl, 0, 190, 1250, 7500, null);
										Thread.sleep(1000);
										c.println("DEAD.");
										// POP UPPPPPPPPPPPPPPPPPPPPPPPPPPPP
										// GAME OVER
									}
								} else {
									c.println("You fell into the water.");
									c.println("Dead.");
								}
							}
							else {
								c.println("The mysterious man caught you.");
								c.drawImage(whiteman, 0, 190, 1250, 7500, null);
								Thread.sleep(1000);
								c.println("The man has an axe and chops your legs.");
								Thread.sleep(1000);
								c.println("He starts to eat them in front of you.");
								Thread.sleep(1000);
								c.println("DEAD.");
								// GAME OVER
							}
						}
					}
				}
			} else // Sharon's code 
			{
 
			//Declaring and assigning images 
			Image sam = toolkit.getImage("sam.png");
			Image device = toolkit.getImage("device.jpg");
			Image broken = toolkit.getImage("broken.jpg");
			//Declaring variables 
			String join;
			String pickup;
			String turnBack;
			String climbFence;
			String keep;
			String type;
			String answer;
			
			c.clear();
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("While wandering around the forest, a stranger runs into you.");
			c.println("He's name is Sam Silver and has been lost in the forest for the past two days..");
			Thread.sleep(1000);
			c.drawImage(sam, 400, 50, 200, 200, null);
			c.println("He asks to join you on your search for your friends, do you said yes?");
			join = c.readLine(); //input from user 
			c.clear();

			if (join.equalsIgnoreCase("yes")) // Sam joins
			{
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("You both keep on walking deeper in to the forest. The fog is thick and your flashlight barely provides enough light for you to see where you two are going...");
			c.println("As you keep on walking, you trip over a device on the ground");
			Thread.sleep(1000);
			c.println("Do you pick it up?");
			pickup = c.readLine(); //input from user
			if (pickup.equalsIgnoreCase("yes")) // Pick up the device
			{

			c.println("It's a human & ghost detector! You try to turn it on.");
			int work = (int) (Math.random() * 10) + 1; // generator
			if (work <= 4) //if the device does work 
			{
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("The device starts up, the green dots around you indicate the ghosts and the red dots indicate humans");
			Thread.sleep(1000);
			c.println("Do you head towards the ghosts or humans? (Please enter 'humans' or 'ghosts'."); //asking who the user want to go to
			c.drawImage(device, 600, 150, 150, 150, null); //image of the device 
			type = c.readLine(); //input from user
			if (type.equalsIgnoreCase("humans")) 
			{
			c.fillRect(600, 150, 200, 200);
			work = (int) (Math.random() * 10) + 1; // regenerate
			if (work >= 7) // bridge
			{
			c.println("You're forced to cross a unstable bridge in order to find these humans seem on the detector.");
			c.println("You two barely made it across!");

			Thread.sleep(2000);
			c.println("You find your friends in a cage guarded by a ghost.. Behind the cage, is the exit of the forest.");
			Thread.sleep(1000);
			c.println("The ghost gives you a riddle with 3 chances; if you successfully answer it, you can save (some of) your friends");
			c.println("What can run but never walks. Has a mouth but never talks. Has a bed but never sleeps. Has a head but never weeps?");
			c.println("A. A Flower");
			Thread.sleep(1000);
			c.println("B. A Mountain System");
			Thread.sleep(1000);
			c.println("C. A River");
			Thread.sleep(1000);
			c.println("D. A Truck");
			c.println("Please enter the correct LETTER..");


			int chance = 3; //user is give chances to solve the riddle
			do  
			{
			answer = c.readLine(); //input from user
			if (answer.equalsIgnoreCase("C")) // seeing if the answer is right 
			{
			c.println("You have successfully saved " + chance + " of your friends!");
			c.println("CONGRATS! You have made it out of Suicide Forest with " + chance + " of your friends!");
			}
			else if (chance > 0) //when the answer is not C 
			{
			chance--;
			c.println("Unfornately, one of you friends have died..");

			}
			else 
			{
			c.println("What a shame, all of your friends have died.");
			c.println("You and Sam were thrown into the cage with your dead friends!");
			}

			} while (!answer.equalsIgnoreCase("C") && chance > 0); // Loop 

			} else // <= 3
			{
			c.println("You're forced to cross a unstable bridge in order to find these humans seem on the detector.");
			c.println("Sadly, the bridge collapses and you both fall into a never-ending black hole!");
			c.println("You have failed to save you and your friends!");
			// GAME OVER
			}
			} else // if the user goes towards the ghosts
			{
			c.println("The ghosts demolishes you and you turn in to a zombie! You have failed to save yourself and your friends");
			Thread.sleep(1000);
			}

			} else 
			{
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("Oh no, the screen of the device appears to be broken.. Do you wish to keep it?");
			c.drawImage(broken, 100, 300, 200, 200, null);
			keep = c.readLine();//input from user
			if (keep.equalsIgnoreCase("yes")) // keep the device
			{
			c.println("You & Sam keep on wandering. Luckily, you two run in to the Old Wise Man and he guides you and Sam out. But you aren't able to save your friends.");

			} else // throw the device
			{
			c.println("You proceed with just trying to find your friends and the way out");
			Thread.sleep(1000);
			c.println("Sadly, you AND Sam get bitten by a massive ghost snake!");
			c.println("You have failed to save yourself & your friends");
			// GAME OVER
			}

			}

			} // End of Pick up Device
			else // Don't pick it up
			{
			c.println("You keep on wandering in the forest with Sam, the fog gets thicker and thicker as you walk..");
			c.println("Trying to look around, you realized that all the trees in the forest have disappeared..");
			c.println("You call out Sam's name but there's no responds..");
			Thread.sleep(1000);
			c.println("Eventually you realized you've entered some sort of forest black hole and there is no escape.");
			c.println("You have failed to save yourself and your friends.");
			// GAME OVER
			}

			} // End of Sam joins
			else // Sam doesn't join
			{
			c.drawImage(jpgbackground, 0, 190, 1250, 750, null);
			c.println("You pick up your pace and walk away from Sam");
			c.println("After walking about only 10 steps, you hear a loud scream from behind.. Do you turn around?");

			turnBack = c.readLine(); //input from user
			if (turnBack.equalsIgnoreCase("yes")) {
			c.println("You run back to  where Sam was standing and he can't be found, you look around and realize the fog got even thicker");
			c.println("The fog became so thick that you can't find you way out of the forest. You have failed to save yourself and your friends..");
			// GAME OVER
			} else // no
			{
			c.println("You run away from the scream as fast as you can. Running in to a 10 ft. fence, do you climb over it?");

			climbFence = c.readLine(); //input from user
			if (climbFence.equalsIgnoreCase("yes")) 
			{
			c.println("Luckily you, you find all your friends behind the fence, they discovered the way out and have been searching for you for the entire day!");
			c.println("You follow them out of the forest. Congrats, you have successfully escaped the forest..");
			Thread.sleep(1000);
			c.println("..but you were suppose to SAVE your friends, not be saved by them..");
			// GAME OVER
			} else // don't climb fence
			{
			c.println("You run towards your left side and fall into a ditch of mutated rats and get eatten alive.");
			c.println("Sorry, you have failed to save your friends and yourself.");
			// GAME OVER
			}
			}

			}

			
		} //end of East
			c.println("Do you wish to play again? (Please enter Yes or No)");
			play = c.readLine();
			if (play.equalsIgnoreCase("yes")) {
				again = true;
				c.clear();
			} else {
				again = false;
				c.clear();
			}
	} //End of while loop of play again
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
} //Static void 
} //Public class 