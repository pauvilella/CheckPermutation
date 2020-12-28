# CheckPermutation
Exercise related with Arrays and Strings.

## Exercise Challenge

Given two strings, write a method to decide if one is a permutation of the other.

### Solution
I have implemented it by creating a HashMap that is going to contain all characters in the first string along with its frequency. 
Then, we iterate through string b and every time we see a character we decrement its frequency count on the hash. 
We return true if the final map has all 0s, which mean that the two strings had the same length with the same set of characters and the same frequency. 
This algorithm takes O(N) runtime, which is the BCR in this exercise, so we can't do better.