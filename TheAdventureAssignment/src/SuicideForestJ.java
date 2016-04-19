import hsa_new.Console;

public class SuicideForestJ {

	/*
	 * Jennifer Nguyen / April 6th 2016 / SuicideForest.Java Creating an
	 * adventure game
	 */


	public static void main(String[] args) {

		/*
		 * Jennifer Nguyen / April 6th 2016 / SuicideForest.Java Creating an
		 * adventure game
		 */
			Console c = new Console(50, 150);

			// Variables
			String direction;
			String squirrel;
			String fllwLaugh;
			String flee;
			String cave;
			String wolves;
			String jumpBridge;
			String girl;
			String run;
			String runCave;
			String jumpLog;
			String climbFence;
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
			
			String frndOne;
			String frndTwo; 
			String frndThree; 


			c.println("Welcome to Suicide Forest, please enter three friends to explore with during this journey.");
			frndOne = c.readString(); 
			frndTwo = c.readString(); 
			frndThree = c.readString(); 
			c.clear(); 
			
			c.println("...While exploring the forest, you get knocked out.");
			c.println("When you woke up, your friends were gone...");
			c.println("Now it is your mission to find your friends and get out of the forest alive.");

			


			direction = c.readString(); // DELETE LATERRRRRRRRRR!!!!!

			if (direction.equalsIgnoreCase("West")) // Jennifer's Code
			{
				c.println("As you're walking, you hear a faint laughter in the forest.");
				c.println("Then you suddenly hear loud shuffling.");

				c.clear(); // CLEAR

				c.println("Do you follow the shuffling?"); // Shuffling
				squirrel = c.readString();

				if (squirrel.equalsIgnoreCase("Yes")) // Killing the squirrel?
				{
					c.println("There was a squirrel.");
					c.println("Do you kill the squirrel?");
					squirrel = c.readString();

					if (squirrel.equalsIgnoreCase("Yes")) // YES TO SQUIRREL

					{
						c.println("You grabbed the squirrel and broke it's neck.");
						c.println("You hold the squirrel for the rest of the journey.");

						killSquirrel = true;
					}

				}

				c.println("You hear the laughter but now it seems to be closer.");
				c.println("Do you follow the laughter?");
				fllwLaugh = c.readString();

				if (fllwLaugh.equalsIgnoreCase("Yes")) // YOU HEAR LAUGHING
				{
					c.println("You see a man chained to a tree, historically laughing at you.");
					c.println("Man: key.. key.. Set me free..");
					// Add Decision for conversation?
					c.println("Man: I know where your friends are.");
					// Conversation??

					//c.clear(); // CLEAR

					c.println("You both hear shuffling.");
					c.println("Man: Hurry before it's too late.");

					//c.clear(); // CLEAR
					c.println("Do you want to flee the site or go find the key?");
					run = c.readString();

					if (run.equalsIgnoreCase("Key")) {
						c.println("The footsteps get louder.");
						c.println("You see a cave, do you run in?");
						runCave = c.readString();

						if (runCave.equalsIgnoreCase("Yes")) 
						{
							c.println("You're caught at a dead end.");
							// DEAD
						}

						else {
							c.println("You're running now, you see a log.");
							c.println("Do you jump?");
							jumpLog = c.readString();

							if (jumpLog.equalsIgnoreCase("Yes")) {
								log = (int) (Math.random() * 10) + 1;
								if (log >= 4) {
									c.println("You jumped over.");
									c.println("You bump into a tall faceless man in a suit.");
									//c.clear(); // CLEAR

									// POPUP

									c.println("CROSSOVER!");
									c.println("YOU FOUND SLENDERMAN!");

								}

								else {
									c.println("You tripped over the log.");
									// GAME OVER
								}
							}

						}
					}

					else //Fleeing 
					{
						c.println("You're running now, you see a fence.");
						c.println("Do you climb the fence?");
						climbFence = c.readString();

						if (climbFence.equalsIgnoreCase("Yes")) {
							fence = (int) (Math.random() * 10) + 1;
							if (fence >= 4) {
								c.clear(); //CLEAR
								
								c.println("You climbed the fence successfully.");
								c.println("You bump into a tall faceless man in a suit.");
								//c.clear(); // CLEAR
								//Thread.sleep(1000);
								// POPUP

								c.println("CROSSOVER!");
								c.println("YOU FOUND SLENDERMAN!");
								
								

							}

							else
							{
								c.println("Your pants got caught in the fence.");
								// GAME OVER
							}
						}
						
						else 
						{
							c.println("You get caught.");
							//Game Over 
						}
					}

				}

				else // You don't follow the laughter
				{
					c.println("You continue walking.");
					c.println("You find a cave, do you go inside it?");
					cave = c.readString();

					if (cave.equalsIgnoreCase("Yes")) {
						c.println("You found a key inside the cave as your were looking around.");

						key = true;
						
						c.println("Do you go left or right?");
						leftRight = c.readString();

						if (leftRight.equalsIgnoreCase("Right")) // Go to the Right
						{
							c.println("You see a man chained to a tree, historically laughing at you.");
							c.println("Man: key.. key.. Set me free..");
							// Add Decision for conversation?
							c.println("Man: I know where your friends are.");
							// Conversation??
							//c.clear(); // CLEAR

							c.println("You both hear shuffling.");
							c.println("Man: Hurry before it's too late.");

							c.println("Do you help him?");
							helpMan = c.readString();

							if (helpMan.equalsIgnoreCase("Yes")) // Help the man
							{
								c.println("The man starts laughing.");
								// Conversation If

								c.println("Hey, hey, pick a number between 1-10!");
								numAns = c.readInt();
								
								int numChance = 2; 
								while (numAns != 4 && numChance > 0)
								{
									numChance--;
									c.println("Man: Haha! Try again!");
									c.println("Man: Pick a number between 1-10!"); 
									numAns = c.readInt();
									
									if (numChance == 0)
									{
										c.println("Man: Opps, oh well.");
										//Game Over
									}
								}
								
								if (numAns == 4)
								{
									c.println("Man: Ok! I'll help you."); 
									
									c.println("Hey, I'm on these real fancy pills, you want some?");
									c.println("(A) : Uhm, no thanks?");
									c.println("(B) : uh, okay?");
									answerPill = c.readString();

									if (answerPill.equalsIgnoreCase("B")) {
										c.println("You look at the pill.");
										c.println("Thanks?");
										
										c.clear(); //CLEAR
										pill = true;
									}

									else // No to the pill
									{
										c.println("Man: Whatever you say! More for me!");
									}
									
									
									c.println("The man leads you to a wooden shack with hyenas surrounding the entrance.");
									c.println("Do you approach the entrance?");
									hyena = c.readString(); 

									if (hyena.equalsIgnoreCase("Yes")) // Approach  hyena
									{
										if (killSquirrel == true) {

											c.println("You realize you have a squirrel in your hand.");
											c.println("You throw the squirrel and the hyenas chase after it. ");
											c.println("The entrance is now clear, you enter.");
											//c.readString();
											//c.clear(); // CLEAR

											c.println("There was nothing inside but old blood stains and bones.");

											c.println("The man gives you a hammar.");
											c.println("Man: Your friends are in the basement.");
											c.println("Man(laughs): But you gotta hit the right plank to get the basement to open.");
											//c.readString();
											//c.clear(); // CLEAR

											c.println("You smell smoke, the shack is now on fire.");
											c.println("Man: Looks like we're running out of time!");
											//c.readString();
											//c.clear(); // CLEAR

											c.println("Do you strike the left plank or the right?");
											strikePlank = c.readString();

											c.clear();

											if (strikePlank.equalsIgnoreCase("Left")) {
												c.println("The basement cellar opens and you two both fall.");
												c.println("The man starts laughing as you look around.");
												c.println("You see your friends strapped down on the floor with a lawnmower above their heads.");
												//c.readString();
												//c.clear(); // CLEAR

												c.println("You see another man, sitting there with a carved smile.");

												c.println("Killer: Hello there, your friends are quite scared there.");
												c.println("Killer: Must be a brave on to think you can save them.");
												c.println("Killer: Mind if you get me some water over there?");
												water = c.readString();

												if (water.equalsIgnoreCase("No")) // No you do
																					// not mind

												{
													c.println("You go grab water.");

													if (pill == true) // if they have the pill
													{
														c.println("Do you want to add the pill into the water?");
														addPill = c.readString();

														if (addPill.equalsIgnoreCase("Yes")) {
															c.println("You give the cup to the killer.");
															c.println("He takes it, and drinks it.");
															//c.readString();
															//c.clear(); //CLEAR

															c.println("The man passes out cold.");
															c.println("Do you approach your friends?");
															appchFnd = c.readString();

															if (appchFnd.equalsIgnoreCase("Yes")) // Approach
																									// friends
															{
																c.println("The lawnmower had a sensor and turned on.");
																c.println("Your friends face got shredded from the lawnmower.");

																// GAME OVER
															}

															else // Do not approach friends
															{
																c.println("You look around and you find the power box.");
																c.println("Do you turn the power off?");
																power = c.readString();

																if (power.equalsIgnoreCase("Yes")) {
																	c.println("The power is turned off!");
																	c.println("You safetly approach"); // Add
																										// friends
																										// name.
																	c.println(
																			"You run out of the back door of the basement to safety.");
																	// WINNER
																}

																else {
																	// GAME OVER
																}
															}
														}
													}

													else // You don't have the pill
													{
														c.println("Killer: Thank you, you're very kind.");
														c.println("Killer: Now, about your friends..");
														c.println("Killer: I can't release them to you, they're my pets.");
														//c.readString();
														//c.clear(); // CLEAR
														c.println("You see that your friends had their nails flipped off and cuts on their arms.");
														c.println("Killer: Since you've been nice enough to get me water, I'll give you three riddles.");
														c.println("Killer: One riddle correct means one friend saved!");
														c.println("Killer: You only have two chances for each riddle, if you can't guess any of them, you'll join us.");
														c.println("Killer: Seems fair enough.");
														// Add conversation?
														c.readString();
														c.clear(); // CLEAR

														c.println("READY FOR RIDDLE ONE?");
														c.readString();

														c.println("RIDDLE ONE");
														ansOne = c.readString();

														int chancesOne = 1;

														while (!ansOne.equalsIgnoreCase("") && chancesOne > 0) //LOOP ONE
														{
															chancesOne--;
															c.println("Killer: You got one more chance for this riddle.");
															c.println("Killer: Come on, don't you want to save your friends?");
															c.println("Riddle one");
															ansOne = c.readString();
															
															if (chancesOne == 0) 
															{
																c.println("Killer: Looks like _____ dies.");
															}

														} // End of while loop one 
														
														if (ansOne.equalsIgnoreCase("Answer"))
														{
															c.println("Killer: Good job, you saved one so far");
															friendOne = true; 
															
														}
														
														c.println("READY FOR RIDDLE TWO?");
														c.readString();

														c.println("RIDDLE TWO");
														ansTwo = c.readString();
															
														int chancesTwo = 1;
														while (!ansTwo.equalsIgnoreCase("") && chancesTwo > 0) //While loop two 
														{
															chancesTwo--;
															c.println("Killer: You got one more chance for this riddle.");
															c.println("Killer: Don't tell me you're giving up now.");
															c.println("Riddle Two");
															ansTwo = c.readString(); 

															if (chancesTwo == 0) 
															{
																c.println("Killer: Looks like _____ dies.");
															}

														} // End of while loop two
														
														if (ansTwo.equalsIgnoreCase("Answer"))
														{
															c.println("Killer: Good job, you saved _____");
															friendTwo = true; 
															
														}
														
														c.println("READY FOR RIDDLE THREE?");
														c.readString();

														c.println("RIDDLE THREE");
														ansThree = c.readString();
															
														int chancesThree = 1;
														while (!ansThree.equalsIgnoreCase("") && chancesThree > 0) //While loop three 
														{
															chancesOne--;
															c.println("Killer: You got one more chance for this riddle.");
															c.println("Killer: Don't tell me you're giving up now.");
															c.println("Riddle Two");
															ansThree = c.readString(); 

															if (chancesThree == 0) 
															{
																c.println("Killer: Looks like _____ dies.");
															}

														} // End of while loop three
														
														if (ansThree.equalsIgnoreCase("Answer"))
														{
															c.println("Killer: Good job, you saved one so far");
															friendThree = true; 
															
														}
				
														if (friendOne == true && friendTwo == true && friendThree == true)
														{
															c.println("Killer: Congratulations, you can free your friends if you can.");
															c.println("The man comes from behind with a hammar and splits the killer's head in half."); 
															c.println("The man laughs."); 
															c.clear(); 
															c.println("You see your friends, do you approach them?");
															appchFnd = c.readString();

															if (appchFnd.equalsIgnoreCase("Yes")) // Approach
																									// friends
															{
																c.println("The lawnmower had a sensor and turned on.");
																c.println("Your friends face got shredded from the lawnmower.");

																// GAME OVER
															}

															else // Do not approach friends
															{
																c.println("You look around and you find the power box.");
																c.println("Do you turn the power off?");
																power = c.readString();

																if (power.equalsIgnoreCase("Yes")) {
																	c.println("The power is turned off!");
																	c.println("You safetly approach"); // Add friends name
																										
																	c.println(
																			"You run out of the back door of the basement to safety with your friends.");
																	// WINNER
																}

																else {
																	// GAME OVER
																}
														       }
														}
														
														else //Else of if all friends died 
														{
															c.println("Killer: Darn, you couldn't save all of them. I guess you're stuck with me!");
															//GAME OVER
														} 

													} // End of you don't have the pill else
														// statement
												} // End of you do not mind

												else // You do mind pouring a glass of water
												{
													c.println("Oh, you have the audacity to say you do mind?");
													// GAME OVER
												}
											}

											else // Strike the right plank
											{
												// GAme OVER
											}

										}

										else // If player goes right
										{
											c.println("Wrong.");
											c.println("You got caught in fire.");
											c.print("_______________");

											// GAME OVER
										}

									} else // If player does not approach hyena
									{
										c.println("You decide that there must be another way.");
										c.println("You quietly walk around to avoid the hyenas finding you.");

										c.clear(); // CLEAR

										c.println("As you reach to the back of the shack, there is a bridge with broken planks.");
										c.println("Do you jump?");
										c.readString();

										c.clear(); // CLEAR

										c.println("The man decided to push you into the water.");
										c.println("The man starts waving and laughing.");

										// GAME OVER
									}
								}
								

					

							} // End of if Yes to help man
							
							else //Don't help the mannnnnnnnnnnnnnnnn 
							{
								c.println("");
							}

						} // End of if to go to right

						else // Going left 
						{
							c.println(" -Dead- ");
						}
					}

					else {
						c.println("You continue walking and as you squint, you see a shack in the distance");
						c.println("As you get closer, you see that there are wolves/Hynas? around the entrance.");

						c.println("Do you approach the wolves?");
						wolves = c.readString();

						if (wolves.equalsIgnoreCase("Yes")) {
							if (killSquirrel == true) {

								c.println("You realize you have a squirrel in your hand.");
								c.println("You throw the squirrel and the wolves chase after it. ");
								c.println("The entrance is now clear, you enter.");

								c.println("There was nothing inside but old blood stains and bones.");
								c.println("The door closes shut, you try to get it open but it wouldn't budge.");
								c.println("You smell smoke.");
								c.println("The shack is on fire.");
								c.println("You die with __________");

								// GAME OVER
							}

							else {
								c.println("The wolves run to you, biting and tearing your legs.");
								c.println("You scream in agony.");
								// GAME OVER
							}
						}

						else {
							c.println("You decide that there must be another way.");
							c.println("You quietly walk around to avoid the wolves finding you.");
							c.println("As you reach to the back of the shack, there is a bridge with broken planks.");
							c.println("Do you jump?");
							jumpBridge = c.readString();

							if (jumpBridge.equalsIgnoreCase("Yes")) {
								bridge = (int) (Math.random() * 10) + 1; // GENERATOR

								if (bridge >= 60) // Success of jumping
								{
									c.println("You jumped over, barely making it.");
									c.println("Congratulations.");
									c.println("You walk inside.");
									c.println("You look around, your friends aren't there.");
									c.println("But you see a person sitting on the chair.");
									c.clear(); // CLEAR

									c.println("Do you approach the person?");
									girl = c.readString();

									if (girl.equalsIgnoreCase("Yes")) {
										// POP UP
										// GAME OVER
									}

									else {
										c.println("The person stands up, you realize its a girl.");
										c.println("She slowly turns around");
										c.println("She smiles.");
										// POP UP
										// GAME OVER
									}
								} else {
									c.println("You fell into the water.");
									// MAKE UP DEATH
									// GAME OVER
								}
							}

							else {
								c.println("The ___ caught you.");
								c.println("You got eaten alive.");
								// GAME OVER
							}

						}

					}

				}



			} else // Went Left
			{
				// DEAD
			}
	}

}
