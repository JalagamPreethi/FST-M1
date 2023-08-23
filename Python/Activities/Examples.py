example_list = ["apple", "banana", "cherry"]
print(example_list)

#Index
example_list = ["apple", "banana", "cherry"]
print(example_list[1]) 

#ReverseIndex
example_list = ["apple", "banana", "cherry"]
print(example_list[-1]) 
#indexes by specifying where to start and where to end the range.
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[2:5]) 

#the range will start at the first item
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[:2]) 

#the range will go on to the end of the list:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[5:]) 

#To change the value of a specific item, refer to the index number:
example_list = ["apple", "banana", "cherry"]
example_list[0] = "blackcurrant"
print(example_list) 

example_list = ["apple", "banana", "cherry"]
for item in example_list:
  print(item) 

  #Len Fun
  example_list = ["apple", "banana", "cherry"]
print(len(example_list)) 

#append() method
example_list = ["apple", "banana", "cherry"]
example_list.append("orange")
print(example_list) 

#insert() method:
example_list = ["apple", "banana", "cherry"]
example_list.insert(0, "orange")
print(example_list)

#Remove method
example_list = ["apple", "banana", "cherry"]
example_list.remove("apple")
print(example_list)

#Pop method()
example_list = ["apple", "banana", "cherry"]
example_list.pop()
print(example_list)

#Copy list
example_list = ["apple", "banana", "cherry"]
mylist = example_list.copy()
print(mylist) 

#concatinate(+) operator
list1 = ["a","b","c"]
list2 = ["apple","banana","cherry"]
list3 = list1 + list2
print(list3)

#tupple
example_tuple = ("apple", "banana", "cherry")
print(example_tuple) 

example_tuple = ("apple", "banana", "cherry")
for item in example_tuple:
  print(item) 

  #Sets
  example_set = {"apple", "banana", "cherry"}

for item in example_set:
  print(item)

  #Add Method
  example_set = {"apple", "banana", "cherry"}

example_set.update(["orange","peaches"])  

print(example_set)

#Remove n discard
example_set = {"apple", "banana", "cherry"}

example_set.remove("apple")
print(example_set)

#Dictionaries
example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(example_dict)



