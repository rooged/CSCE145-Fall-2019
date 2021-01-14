//written by Timothy Gedney
import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("unused")
public class chooseYourOwnAdventure {
	
	//misc unchangeable stats
	public static final int BROKEN_SWORD = (int) (Math.random() * 10);
	public static final int GUARDS_SWORD = (int) (Math.random() * 100);
	public static final int MASTER_SWORD = (int) (Math.random() * 1000);
	public static final int GUARDS_ATTACK = (int) (Math.random() * 25);
	public static final int WOLF_ATTACK = (int) (Math.random() * 75);
	public static final int LESHEN_ATTACK = (int) (Math.random() * 100);
	public static final int HEALING = 50;

	public static void main(String[] args) {
		
		//stats that change based on player choices
		int HP = 150;
		int guardsHP = 10;
		int wolfHP = 100;
		int leshenHP = 1000;
		int sword = BROKEN_SWORD;
		boolean drunk = false;
		boolean food = false;
		int foods = 0;

		//story set up
		System.out.println("In a bustling tavern, nestled deep in the Skjegorn forests, you finish the last of your pint. The ale is one of the "
				+ "worst you've tasted during all of your travels but \nyou needed it after the stories that you heard from the villagers. You pitied "
				+ "them when they tracked you down in Skelle and begged you to help them. They aren't able to \nenter the forest anymore, any that "
				+ "do are mauled by the beast. Your job in Skelle was meant to be your last but something about the fear you saw in their eyes bothered \nyou. "
				+ "It was the same look of fear you saw in the villagers from Skjegorn 20 years ago.");
		
		//choices to drink, heavily affects story (try drinking 5 ale's)
		System.out.println("\nYou are tired. But you must go soon. You must track down this beast and end it, again. You killed it 20 years ago but it has returned. "
				+ "You don't know if you have the \nstrength to finish it off this time but you must try. Should you have another pint before you go? (Yes/No)");
		Scanner input = new Scanner(System.in);
		String drink = input.next().toUpperCase();
		int drinks = 1;
		while (drink.compareTo("YES") == 0 || drink.compareTo("Y") == 0) {
			System.out.print("\nYou have another ale. Time passes slowly but you finish the ale quickly. ");
			if (drinks == 1) {
				System.out.println("The bar wench gives you a shank of the pig roast that had been cooking and smiles. You stow it \nfor later, you might need it. "
						+ "Should you have another? (Yes/No)");
				food = true;
				foods++;
			} else if (drinks == 2) {
				System.out.println("You begin to feel the affects of the ale. You aren't sure if you're sober enough to \n"
						+ "fight anymore. Should you really continue drinking? (Yes/No)");
				drunk = true;
			} else if (drinks == 4) {
				System.out.println("How much time has passed? How many drinks have you had? You feel if you have \nanother, something weird might "
						+ "happen. Should you have another? (Yes/No)");
			} else if (drinks == 5) {
				System.out.println("\nThe fear started to set in the moment you stepped into town. Drowning yourself in alcohol was not how you wanted to "
						+ "go but the fear has taken hold. If you face the \nbeast you will die. You've had so much to drink that you're almost unable "
						+ "to stand up. You stumble outside but can't feel anything. You fall over, unable to move and \npass out... You awake, laying "
						+ "in grass. Time has passed but you're not sure how much. You stand up, slightly disoriented and look around.");
				System.out.println("\nYou are standing in an open field west of a white house, with a boarded front door. There is a small mailbox here...");
				System.exit(0);
			} else {
				System.out.println("Should you have another? (Yes/No)");
			}
			drink = input.next().toUpperCase();
			drinks++;
		}
		if (drunk == true) {
			sword = sword / 2;
		}
		
		//check that the user put in a known value (n or no)
		if (drink.compareTo("NO") != 0 && drink.compareTo("N") != 0 && drink.compareTo("YES") != 0 && drink.compareTo("Y") != 0) {
			System.out.println("\nYou're old and weary. You can't decide what to do next. It seems that dementia has set in.");
			System.out.println("\nYou entered an unknown value. Try the story again.");
			System.exit(0);
		}
		
		//exit town and 1st choice at crossroad's
		System.out.println("\nYou grab your old, rusty sword and exit the tavern, ready to begin your hunt. You head towards the outskirts of town. It takes "
				+ "longer than you remember to reach the \nedge of town. The town has grown a lot since you were last here. You take a last breath of "
				+ "civilization, of sanity, and enter the forest. After walking in the forest \nfor awhile you stop, you can't remember which way you came from. "
				+ "How deep in the forest are you? Through the tree's to your left you see royal guards trying to \nbreak into a small hut, to the right you "
				+ "hear a distant waterfall, and directly in front of you the forest darkens as if it's midnight. You feel your hair stand as you \ndecide where "
				+ "to go. (Left/Right/Forward)");
		String choice1 = input.next().toUpperCase();
		switch (choice1) {
		
		//goes forward, after beast first. unavoidable death
		case "FORWARD":
		case "F": {
			
			//fight with wolf, choices to attack or heal
			System.out.println("\nYou enter the dark shroud of vegetation in front of you. As you continue walking the forest somehow continues to get darker. "
					+ "You hear a low growl from the shadows and \ndraw your rusty sword, you wish you'd found a new weapon. A wolf leaps from the shadows and "
					+ "lands in front of you.");
			for (;HP > 0 && wolfHP > 0;) {
				System.out.println("Do you attack or heal?");
				String wolfFight = input.next().toUpperCase();
				if (wolfFight.compareTo("ATTACK") == 0 || wolfFight.compareTo("A") == 0) {
					HP = HP - WOLF_ATTACK;
					wolfHP = wolfHP - sword;
					if (HP < 0) {
						HP = 0;
					}
					if (wolfHP < 0) {
						wolfHP = 0;
					}
				} else if (wolfFight.compareTo("HEAL") == 0 || wolfFight.compareTo("H") == 0) {
					if (food == true) {
						HP += HEALING;
						foods = foods - 1;
						System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
						if (foods == 0) {
							food = false;
						}
					} else {
						System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
						HP = HP - (int)(WOLF_ATTACK * 1.5);
						if (HP < 0) {
							HP = 0;
						}
					}
				} else {
					System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the wolf lunges and strikes true. You die.");
					System.out.println("\nYou entered an unknown value. Try the story again.");
					System.exit(0);
				}
				System.out.println("\nYou have " + HP + "HP left.\nThe wolf has " + wolfHP + "HP left.");
			}
			if (HP == 0) {
				System.out.println("\nYou have been killed by the wolf. Next time, try exploring more before going after the beast.");
				System.exit(0);
			} else {
				System.out.println("\nYou killed the wolf but not without losing parts of yourself. Tired and bloody you limp forward. It's still so dark and "
						+ "your vision is blurred by the blood. You \nstumble forward and slump against the tree in front of you. It shifts against your weight."
						+ "Terrified, you try to stand up and run but can't. The entire forest shifts \nas it moves towards you. The beast picks you up and you see it. "
						+ "Your last breath is a teror filled scream.");
				System.out.println("\nYou have been killed by the Leshen. Next time, try exploring more before going after the beast.");
				System.exit(0);
			}
			break;
		}
		
		//go right, towards oasis, unavoidable death
		case "RIGHT":
		case "R": {
			System.out.println("\nYou head towards the sound of the waterfall. As you walk through the forest towards the sound, the forest grows brighter, "
					+ "so bright that the tree's seem to shine. \nThe sound was distant but you reach the source quickly. You walk into an oasis, a crystal clear "
					+ "pond with what seems to be a cave behind the waterfall. What would you \nlike to do? Drink the water or explore the cave? (Drink/Cave)");
			String oasis = input.next().toUpperCase();
			if (oasis.compareTo("CAVE") == 0 || oasis.compareTo("C") == 0) {
				System.out.println("\nYou enter the cave. It's dark but there's a dull glow coming from the walls that gives enough light to see. You continue "
						+ "through the cave and begin to notice bones \nalong your path. As you go deeper into the cave, the number of bones grows. You begin to "
						+ "grow weary. Eventually, you reach a dead end. You study the wall and notice \nancient symbols written on it. In the center of all of "
						+ "the symbols is a small hole. You search around the ground and see what looks like a key. You pick it up and \nrealize it's a bone "
						+ "shaped into a key. Do you try it in the lock or leave the cave? (Key/Leave)");
				String lock = input.next().toUpperCase();
				if (lock.compareTo("KEY") == 0 || lock.compareTo("K") == 0) {
					System.out.println("\nYou insert the skeleton key and turn it. A sense of sudden dread suddenly overcomes you. Your legs feel weak, too weak "
							+ "to move. The symbols written on the wall \ndisappear as the cave begins to shift under your feet until you fall down. The walls "
							+ "begin to fall. You try to crawl away but you know you can't escape your fate.");
					System.out.println("\nYou have been crushed. Next time, try exploring more before going to the oasis.");
					System.exit(0);
				} else if (lock.compareTo("LEAVE") == 0 || lock.compareTo("L") == 0) {
					System.out.println("\nThe unease you feel in the cave makes you want to leave. You put the skeleton key down and head back down the "
							+ "tunnel. As you walk along your unease about the cave \nincreases as you realize that the tunnel you're walking down is unfamiliar "
							+ "to you. You continue walking but the tunnel doesn't seem to end. The skeleton's around you \nare endless and you fear you've made "
							+ "a wrong turn. You cotinue walking hoping you'll find the exit eventually.");
					System.out.println("\nYou have become lost in the cave. Next time, try exploring more before going to the oasis.");
					System.exit(0);
				} else {
					System.out.println("\nYou stand there in front of the ");
					System.out.println("\nYou entered an unknown value. Try the story again.");
					System.exit(0);
				}
			} else if (oasis.compareTo("DRINK") == 0 || oasis.compareTo("D") == 0) {
				System.out.println("\nThe water looks so pure and you're so thirsty. You decide to have a drink. You drink some. The water is the best you've "
						+ "ever had. You look around, the oasis is \nbeautiful. You forget why you're there. You decide to sit down and stay for a little while. "
						+ "Time passes but you don't seem to care. You can't move but you don't really \nwant to either. As you sit there, your roots begin to "
						+ "set into the ground. Your skin begins to turn to bark. You feel no worries as you let yourself go.");
				System.out.println("\nYou have become a part of the oasis. Next time, try a different path.");
				System.exit(0);
			} else {
				System.out.println("\nThe oasis is beautiful. You forget why you're there. You decide to sit down and stay for a little while. Time passes but "
						+ "you don't seem to care. You can't move but you \ndon't really want to either. As you sit there, your roots begin to set into the ground. "
						+ "Your skin begins to turn to bark. You feel no worries as you let yourself go.");
				System.out.println("\nYou entered an unknown value. Try the story again.");
				System.exit(0);
			}
			break;
		}
		
		//go left, towards hut, correct path
		case "LEFT":
		case "L": {
			System.out.println("\nYou decide to head towards the royal guards and the hut. As you approach the hut they take notice and draw their swords. They "
					+ "tell you to leave. You want to leave but \nsomething is drawing you to the hut. You draw your sword too. The guards look nervous.");
			for (;HP > 0 && guardsHP > 0;) {
				System.out.println("Do you attack or heal?");
				String guardFight = input.next().toUpperCase();
				if (guardFight.compareTo("ATTACK") == 0 || guardFight.compareTo("A") == 0) {
					HP = HP - GUARDS_ATTACK;
					guardsHP = guardsHP - sword;
					if (HP < 0) {
						HP = 0;
					}
					if (guardsHP < 0) {
						guardsHP = 0;
					}
				} else if (guardFight.compareTo("HEAL") == 0 || guardFight.compareTo("H") == 0) {
					if (food == true) {
						HP += HEALING;
						foods = foods - 1;
						System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
						if (foods == 0) {
							food = false;
						}
					} else {
						System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
						HP = HP - (int)(GUARDS_ATTACK * 1.5);
						if (HP < 0) {
							HP = 0;
						}
					}
				} else {
					System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the gaurds attack and strike true. You die.");
					System.out.println("\nYou entered an unknown value. Try the story again.");
					System.exit(0);
				}
				System.out.println("\nYou have " + HP + "HP left.\nThe guards have " + guardsHP + "HP left.");
			}
			if (HP == 0) {
				System.out.println("\nYou have been killed by the guards. Bad luck, try again.");
				System.exit(0);
			}
			break;
		}
		
		//system end if user put in an unknown value
		default: {
			System.out.println("\nYou're unable to decide about which path to take. As time passes, you begin to forget why you were there. Eventually you begin "
					+ "to forget who you are. Time goes on as \nyou wither, standing there, unable to decide. Years go on. Decades. You are only bones. Unable "
					+ "to decide.");
			System.out.println("\nYou entered an unknown value. Try the story again.");
			System.exit(0);
		}
		}
		
		//entirely story, no choices, reset statistics, gain food and key
		System.out.println("\nYou defeated the guards. They were easier than you'd thought they'd be. Your old sword broke during the fight so you take one of "
				+ "theirs. The royal guard's swords are \nsmithed by the best blacksmith's in the land. You can feel the difference the moment you picked it up. "
				+ "Next, your attention turns to the hut. You feel a presence inside \nas you head towards the entrance. The door is unlocked.");
		sword = GUARDS_SWORD;
		if (drunk == true) {
			sword = sword / 2;
		}
		System.out.println("\nThe air inside the hut is heavy and hard to breathe. A disfigured shape shifts in the corner. You shudder when you realize what it "
				+ "is. A Crone of the Forest. You aren't \nafraid for some reason. The Crone heals your wounds and provides you with mushrooms to keep for later. "
				+ "She then leaves and returns with a stone key covered in strange \nmarkings. When she hands you the key you feel an intense pain coursing through "
				+ "your body. You fall down and pass out from the pain.");
		HP = 150;
		foods = foods + 1;
		System.out.println("\nYou awaken, unsure of how much time passed. You're laying outside the remnants of the hut, it's only ashes now. On the ground next "
				+ "to you is the key, you're able to \nunderstand the writing on it. It tells of a master sword, forged from the tooth of the Jormungandr by "
				+ "Odin. The sword was hidden from the likes of men in an oasis. The \noasis preys on the greed of men with water that makes men forget and a "
				+ "twisting cave that protects the sword. With this knowledge you head back towards the way you came \nfrom, slightly less afraid of what's to come.");
		
		System.out.println("\nAfter walking in the forest for awhile you stop. You are back to where you started. Through the tree's to your left you see the "
				+ "remnants of the hut, to the right you \nhear a distant waterfall, and directly in front of you the forest darkens as if it's midnight. You "
				+ "feel your hair stand as you decide where to go. (Right/Forward)");
		String choice2 = input.next().toUpperCase();
		switch (choice2) {
		
		//goes forward, after beast first. unavoidable death
		case "FORWARD":
		case "F": {
			System.out.println("\nYou enter the dark shroud of vegetation in front of you. As you continue walking the forest somehow continues to get darker. "
					+ "You hear a low growl from the shadows and \ndraw your new sword, the weight puts you off slightly. A wolf leaps from the shadows and "
					+ "lands in front of you.");
			for (;HP > 0 && wolfHP > 0;) {
				System.out.println("Do you attack or heal?");
				String wolfFight = input.next().toUpperCase();
				if (wolfFight.compareTo("ATTACK") == 0 || wolfFight.compareTo("A") == 0) {
					HP = HP - WOLF_ATTACK;
					wolfHP = wolfHP - sword;
					if (HP < 0) {
						HP = 0;
					}
					if (wolfHP < 0) {
						wolfHP = 0;
					}
				} else if (wolfFight.compareTo("HEAL") == 0 || wolfFight.compareTo("H") == 0) {
					if (food == true) {
						HP += HEALING;
						foods = foods - 1;
						System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
						if (foods == 0) {
							food = false;
						}
					} else {
						System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
						HP = HP - (int)(WOLF_ATTACK * 1.5);
						if (HP < 0) {
							HP = 0;
						}
					}
				} else {
					System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the wolf lunges and strikes true. You die.");
					System.out.println("\nYou entered an unknown value. Try the story again.");
					System.exit(0);
				}
				System.out.println("\nYou have " + HP + "HP left.\nThe wolf has " + wolfHP + "HP left.");
			}
			if (HP == 0) {
				System.out.println("\nYou have been killed by the wolf. Next time, try exploring more before going after the beast.");
				System.exit(0);
			} else {
				System.out.println("\nYou killed the wolf. The forest shudder's as the wolf passes on. You hear a deep yell, half animal/half man coming from "
						+ "the darkness. A tree in front of you shifts and \nsteps forward. The figure moving towards you is tall with skin made of bark. It's head "
						+ "is a deer skull with antlers bigger than you've ever seen. This is the beast that \nthe villager's hired you to hunt. It's a Leshen. "
						+ "Overcome with a sense of dread, you step back and draw your sword, unsure if you'll make it out of this alive.");
				for (;HP > 0 && leshenHP > 0;) {
					System.out.println("Do you attack or heal?");
					String leshenFight = input.next().toUpperCase();
					if (leshenFight.compareTo("ATTACK") == 0 || leshenFight.compareTo("A") == 0) {
						HP = HP - LESHEN_ATTACK;
						leshenHP = leshenHP - sword;
						if (HP < 0) {
							HP = 0;
						}
						if (leshenHP < 0) {
							leshenHP = 0;
						}
					} else if (leshenFight.compareTo("HEAL") == 0 || leshenFight.compareTo("H") == 0) {
						if (food == true) {
							HP += HEALING;
							foods--;
							System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
							if (foods == 0) {
								food = false;
							}
						} else {
							System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
							HP = HP - (int)(LESHEN_ATTACK * 1.5);
							if (HP < 0) {
								HP = 0;
							}
						}
					} else {
						System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the Leshen attacks and strikes true. You die.");
						System.out.println("\nYou entered an unknown value. Try the story again.");
						System.exit(0);
					}
					System.out.println("\nYou have " + HP + "HP left.\nThe Leshen has " + leshenHP + "HP left.");
				}
				if (HP == 0) {
					System.out.println("\nYou have been killed by the Leshen. Next time, try exploring more before going after the Leshen.");
					System.exit(0);
				} else {
					System.out.println("\nYou have killed the Leshen. The entire forest shakes and you hear a loud sound, almost like a fog horn. Leaves begin "
							+ "to fall all around you as the vegetation around you\n begins to brown and whither. You hear the sound of animals dying, almost "
							+ "like all of them are at once. You realize what you've done. Leshen are woodland spirits that \nprotect their forests from men. The "
							+ "villagers had been taking more and more from the forest. Killing the forest. So the forest created the Leshen to protect itself, "
							+ "\nand without the Leshen the forest will die. As you stand there contemplating your actions. A lone root grows from the ground "
							+ "towards you as if reaching out a hand \nasking for help. The forest needs the Leshen to survive. Do you forfeit your life for the "
							+ "forest or retire from your life once and for all? (Stay/Leave)");
					String finalChoice = input.next().toUpperCase();
					if (finalChoice.compareTo("STAY") == 0 || finalChoice.compareTo("S") == 0) {
						System.out.println("\nYou reach out your hand and touch the root. You've lived a long life and don't have much to show for it, selling "
								+ "your sword to hunt monsters. Maybe this will mean you \ndid something important. You feel your spirit leave your body and in "
								+ "your last moments you see the Leshen rise again. You'll protect this forest from them.");
						System.exit(0);
					} else if (finalChoice.compareTo("LEAVE") == 0 || finalChoice.compareTo("L") == 0) {
						System.out.println("\nYou turn around and leave. You're tired. You've lived a long life, a life you never got to enjoy. You just want to "
								+ "go home and rest for a while. You turn around and \nstart walking. You don't know what direction your going but you'll find "
								+ "your way.");
						System.exit(0);
					} else {
						System.out.println("\nYou aren't sure what to do. As you try to decide the root begins to convulse and suddenly pierces your heart.");
						System.out.println("\nYou entered an unknown value. Try the story again.");
						System.exit(0);
					}
				}
			}
		}
		
		//go right, towards oasis, correct path
		case "RIGHT":
		case "R": {
			System.out.println("\nYou head towards the sound of the waterfall. As you walk through the forest towards the sound, the forest grows brighter, "
					+ "so bright that the tree's seem to shine. \nThe sound was distant but you reach the source quickly. You walk into an oasis, a crystal clear "
					+ "pond with what seems to be a cave behind the waterfall. What would you \nlike to do? Drink the water or explore the cave? (Drink/Cave)");
			String oasis = input.next().toUpperCase();
			if (oasis.compareTo("CAVE") == 0 || oasis.compareTo("C") == 0) {
				System.out.println("\nYou enter the cave. It's dark but there's a dull glow coming from the walls that gives enough light to see. You continue "
						+ "through the cave and begin to notice bones \nalong your path. As you go deeper into the cave, the number of bones grows. You begin to "
						+ "grow weary. Eventually, you reach a dead end. You study the wall and notice \n'Master Sword' written on it. In the center of the "
						+ "writing is a small hole. You search around the ground and see what looks like a key. You pick it up and \nrealize it's a bone "
						+ "shaped into a key. Then you remember the stone key you got from the Crone. Which key do you try in the lock? (Stone/Bone)");
				String lock = input.next().toUpperCase();
				if (lock.compareTo("STONE") == 0 || lock.compareTo("S") == 0) {
					System.out.println("\nYou insert the stone key and turn it. A sense of warmth suddenly overcomes you. The wall begins to fall away, revealing "
							+ "a cavern. You enter the cavern and walk \ntowards the center. As you get closer, you notice a glimmer from metal. The sword. You "
							+ "grab it's hilt. It's warm to the touch. You wield it and it feels perfectly \nbalanced. You feel rejuvenated from it. You wield "
							+ "the sword of great antiquity.");
					sword = MASTER_SWORD;
					if (drunk == true) {
						sword = sword / 2;
					}
					System.out.println("\nYou turn around and head out of the cave. The sword leads you in the right direction so you don't get lost. You exit "
							+ "the cave and head back to where you came from. You \nfeel no fear anymore. After walking in the forest for awhile you stop. You "
							+ "are back to where you started. Through the tree's to your left you see the remnants of the hut, \nto the right you hear the distant "
							+ "waterfall, and directly in front of you the forest darkens as if it's midnight. With the master sword in hand you enter the dark "
							+ "shroud \nof vegetation in front of you. As you continue walking the forest somehow continues to get darker. You hear a low growl "
							+ "from the shadows and draw the master sword. It \nfeels right in your grip. A wolf leaps from the shadows and lands in front of you.");
					for (;HP > 0 && wolfHP > 0;) {
						System.out.println("Do you attack or heal?");
						String wolfFight = input.next().toUpperCase();
						if (wolfFight.compareTo("ATTACK") == 0 || wolfFight.compareTo("A") == 0) {
							HP = HP - WOLF_ATTACK;
							wolfHP = wolfHP - sword;
							if (HP < 0) {
								HP = 0;
							}
							if (wolfHP < 0) {
								wolfHP = 0;
							}
						} else if (wolfFight.compareTo("HEAL") == 0 || wolfFight.compareTo("H") == 0) {
							if (food == true) {
								HP += HEALING;
								foods = foods - 1;
								System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
								if (foods == 0) {
									food = false;
								}
							} else {
								System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
								HP = HP - (int)(WOLF_ATTACK * 1.5);
								if (HP < 0) {
									HP = 0;
								}
							}
						} else {
							System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the wolf lunges and strikes true. You die.");
							System.out.println("\nYou entered an unknown value. Try the story again.");
							System.exit(0);
						}
						System.out.println("\nYou have " + HP + "HP left.\nThe wolf has " + wolfHP + "HP left.");
					}
					if (HP == 0) {
						System.out.println("\nYou have been killed by the wolf. Bad luck, try again.");
						System.exit(0);
					} else {
						System.out.println("\nYou killed the wolf. The forest shudder's as the wolf passes on. You hear a deep yell, half animal/half man coming from "
								+ "the darkness. A tree in front of you shifts and \nsteps forward. The figure moving towards you is tall with skin made of bark. It's head "
								+ "is a deer skull with antlers bigger than you've ever seen. This is the beast that \nthe villager's hired you to hunt. It's a Leshen. "
								+ "You step back and draw your sword, you feel the warmth of the master sword throughout your entire body. The warmth heals \nyour "
								+ "wounds. You feel confident that you'll make it out alive.");
						HP = 500;
						for (;HP > 0 && leshenHP > 0;) {
							System.out.println("Do you attack or heal?");
							String leshenFight = input.next().toUpperCase();
							if (leshenFight.compareTo("ATTACK") == 0 || leshenFight.compareTo("A") == 0) {
								HP = HP - LESHEN_ATTACK;
								leshenHP = leshenHP - sword;
								if (HP < 0) {
									HP = 0;
								}
								if (leshenHP < 0) {
									leshenHP = 0;
								}
							} else if (leshenFight.compareTo("HEAL") == 0 || leshenFight.compareTo("H") == 0) {
								if (food == true) {
									HP += HEALING;
									foods--;
									System.out.println("\nYou take some food and quickly eat it. You feel slightly better, your HP has increased.");
									if (foods == 0) {
										food = false;
									}
								} else {
									System.out.println("\nYou have no food to eat. While searching for the food you have left yourself open to attack.");
									HP = HP - (int)(LESHEN_ATTACK * 1.5);
									if (HP < 0) {
										HP = 0;
									}
								}
							} else {
								System.out.println("\nYou aren't sure what to do next. In your moment of hesitation the Leshen attacks and strikes true. You die.");
								System.out.println("\nYou entered an unknown value. Try the story again.");
								System.exit(0);
							}
							System.out.println("\nYou have " + HP + "HP left.\nThe Leshen has " + leshenHP + "HP left.");
						}
						if (HP == 0) {
							System.out.println("\nYou have been killed by the Leshen. Bad luck, try again.");
							System.exit(0);
						} else {
							System.out.println("\nYou have killed the Leshen. The entire forest shakes and you hear a loud sound, almost like a fog horn. Leaves begin "
									+ "to fall all around you as the vegetation around you \nbegins to brown and whither. You hear the sound of animals dying, almost "
									+ "like all of them are at once. You realize what you've done. Leshen are woodland spirits that \nprotect their forests from men. The "
									+ "villagers had been taking more and more from the forest. Killing the forest. So the forest created the Leshen to protect itself, "
									+ "\nand without the Leshen the forest will die. As you stand there contemplating your actions. A lone root grows from the ground "
									+ "towards you as if reaching out a hand \nasking for help. The forest needs the Leshen to survive. Do you forfeit your life for the "
									+ "forest or retire from your life of hunting once and for all? (Stay/Leave)");
							String finalChoice = input.next().toUpperCase();
							if (finalChoice.compareTo("STAY") == 0 || finalChoice.compareTo("S") == 0) {
								System.out.println("\nYou reach out your hand and touch the root. You've lived a long life and don't have much to show for it, selling "
										+ "your sword to hunt monsters. Maybe this will mean you \ndid something important. You feel your spirit leave your body and in "
										+ "your last moments you see the Leshen rise again. You'll protect this forest from them.");
								System.exit(0);
							} else if (finalChoice.compareTo("LEAVE") == 0 || finalChoice.compareTo("L") == 0) {
								System.out.println("\nYou turn around and leave. You're tired. You've lived a long life, a life you never got to enjoy. You just want to "
										+ "go home and rest for a while. You turn around and \nstart walking. You don't know what direction your going but you'll find "
										+ "your way.");
								System.exit(0);
							} else {
								System.out.println("\nYou aren't sure what to do. As you try to decide the root begins to convulse and suddenly pierces your heart.");
								System.out.println("\nYou entered an unknown value. Try the story again.");
								System.exit(0);
							}
						}
					}
				} else if (lock.compareTo("BONE") == 0 || lock.compareTo("B") == 0) {
					System.out.println("\nYou insert the skeleton key and turn it. A sense of sudden dread suddenly overcomes you. Your legs feel weak, too weak "
							+ "to move. The symbols written on the wall \ndisappear as the cave begins to shift under your feet until, you fall down. The walls "
							+ "begin to fall. You try to crawl away but you know you can't escape your fate.");
					System.out.println("\nYou have been crushed. Next time, try exploring more before going to the oasis.");
					System.exit(0);
				} else {
					System.out.println("\nYou stand there in front of the ");
					System.out.println("\nYou entered an unknown value. Try the story again.");
					System.exit(0);
				}
			} else if (oasis.compareTo("DRINK") == 0 || oasis.compareTo("D") == 0) {
				System.out.println("\nThe water looks so pure and you're so thirsty. You decide to have a drink. You drink some. The water is the best you've "
						+ "ever had. You look around, the oasis is \nbeautiful. You forget why you're there. You decide to sit down and stay for a little while. "
						+ "Time passes but you don't seem to care. You can't move but you don't really \nwant to either. As you sit there, your roots begin to "
						+ "set into the ground. Your skin begins to turn to bark. You feel no worries as you let yourself go.");
				System.out.println("\nYou have become a part of the oasis. Next time, try a different path.");
				System.exit(0);
			} else {
				System.out.println("\nThe oasis is beautiful. You forget why you're there. You decide to sit down and stay for a little while. Time passes but "
						+ "you don't seem to care. You can't move but you \ndon't really want to either. As you sit there, your roots begin to set into the ground. "
						+ "Your skin begins to turn to bark. You feel no worries as you let yourself go.");
				System.out.println("\nYou entered an unknown value. Try the story again.");
				System.exit(0);
			}
			break;
		}
		default: {
			System.out.println("\nYou're unable to decide about which path to take. As time passes, you begin to forget why you were there. Eventually you begin "
					+ "to forget who you are. Time goes on as \nyou wither, standing there, unable to decide. Years go on. Decades. You are only bones. Unable "
					+ "to decide.");
			System.out.println("\nYou entered an unknown value. Try the story again.");
			System.exit(0);
		}
		}
		input.close();
	}

}
