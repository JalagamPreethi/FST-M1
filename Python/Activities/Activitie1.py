#Activity1
import numbers


name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2020 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )

#Activity2
num  = int(input("Enter a num: "))
mod = num % 2
if mod>0:
    print("You picked odd number.")
else:
    print("You picked even number.")
   
#Activity3
#UserNames
user1 = input("what is player1 name?")
user2 = input("what is player2 name?")
#UsersChoice
user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()
#Who wins 
	
if user1_answer == user2_answer:
    print("It's a tie!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

    #Activity5
    #Multiplication
    num = int(input("Input a number: "))
# use for loop to iterate 10 times
for i in range(1,11):
   print(num, ' x ', i, ' = ', num*i)

#Activity6
for i in range(10):
    print(str(i) * i)

#Activity10
# Given tuple
num_tuple = (10, 20, 33, 46, 55)
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)

#Activity11
fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
