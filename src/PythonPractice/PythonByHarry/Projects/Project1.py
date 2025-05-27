import random
# PROJECT 1: SNAKE, WATER, GUN GAME

# We all have played snake, water gun game in our childhood. If you haven’t, google the rules of this game and write a python program capable of playing this game with the user.

print("\t\t::Welcome::")

while True:
    print("\t Starting........")
    print("{1} => Water || {2} => Gun || {3} => Snake")
    computer = random.randrange(1, 4)
    user = int(input("User Turn: "))
    print("Your: ", user,)
    print("Computer: ", computer)
    print("\n")

    # condition 1 :- Snake vs. Water: Snake drinks the water and wins.\
    # condition 2 :- Water vs. Gun: The gun gets drowned in the water, and Water wins.
    # condition 3 :- Gun vs. Snake: The gun shoots and kills the snake, and Gun wins.
    # Ties: If both players choose the same option (e.g., both choose Snake), it's a tie, and the round is replayed. 
    if (computer == 3 and user == 1) or (computer == 1 and user == 2) or (computer == 2 and user == 3):
        print("Computer Won.")
    elif (user == 3 and computer == 1) or (user == 1 and computer == 2) or (user == 2 and computer == 3):
        print("User Won.")
    else:
        print("Tie")
    
    check = input("\nPress U for Next Game & other key for exit the game: ")
    if check.lower() != 'u':
        print("Game Over!!!!\n")
        break