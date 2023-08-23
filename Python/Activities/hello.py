print("hello world")
myVariable = 5
print(myVariable)
a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a) 
name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2020 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )

#RecurssionExample
# Calculate the sum of numbers
# using recursion
def sum(n):
  if n <= 1:
    return n
  else:
    return n + sum(n-1)
  
num = int(input("Enter a number: "))
print("The sum is: ", sum(num))

