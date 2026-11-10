# Thingymajigs to add:
'''
Creature class:
    Variables: HP, Break bar, Weight, Atk-DV, Atk-BV
    Methods: Attack, Break Effect, Sub Effect

    Attack method:
        If the opponent's break bar is > 0, attack with user's BV on that break
        bar. Otherwise, attack with DV on enemy active.
    Break effect method:
        If a break is triggered, the computer will look at the type of break effect (ally,
        enemy, any) and see if it's valid to activate. The player will be asked to
        activate it if they so choose.
    Sub effect method:
        If the user enters the command to activate a sub effect, the sub effects that
        can be activated pop up. The user can then enter a number related to their board,
        triggering the hard-coded sub effect for that particular creature.


Break Method:
    When a Creature's break bar is <= 0, call Break function. It should reset the number
    of times the attacking player can attack that turn back to 1; the same applies for
    switching. It should also prompt the player what break effect they want to activate
    based on what break effects they CAN activate, then take user input. If they
    activate something, the prompt bounces to the enemy until someone chooses not to
    continue the link or there are no more effects to activate.


Menu:
    On boot: ask for user and password or play as guest. Then, start game.
    See below
        "What will you do?
        1. Check Deck
        2. Change deck
        3. Check card catalog
        4. Play
        5. Quit
        6. Delete user data"

Play:
    Modes: Rougelike, Stage Select, Tutorial

Gameplay:
    Start of turn, user and bot draw 5. Pre-generate the hand randomly; if it doesn't have
    a creature in it, it should be regenerated until a hand with at least 1 creature
    shows up. Then, a coin is flipped to decide who goes first. Person going first does
    not draw that turn.
    Play inputs various commands to interact with the board (until I learn buttons,
    that is). They type in actions, such as switch or attack, and they type in numbers
    when selecting a creature.
    Winning or losing prompts the player with the choice to return to the menu or keep
    playing.
    Store player data (user, score, deck) in a csv or something to be accessed. On boot,
    just ask if they want to play as a guest or not. If they say no, ask if they already
    have a user and then ask for it and the password.
'''
class BREAK:
    '''stuff'''
