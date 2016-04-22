// Ch. 9 Practice Problem 1
// Filename: Problem_1.cs
// Description: Prompts the user to input a sentence
//              and displays the words alphabetically.

using System;
using System.Linq;

public class Problem_1
{
    public static void Main(string[] args)
    {
        // Prompt the user for sentence, and read input
        Console.WriteLine("Please enter a sentence (no punctuation): \n");
        string sentence = Console.ReadLine();

        // Split sentence into individual words, and assign the words to an array
        string[] words = sentence.Split();

        // Use LINQ to convert the the words to lowercase, and sort them alphabetically
        var sortedWords =
            from word in words
            let lowerCaseWord = word.ToLower()
            orderby lowerCaseWord
            select lowerCaseWord;

        // Display label for output
        Console.WriteLine(
            "\n\nThe distinct words in your sentence, in alphabetical order, are:\n");

        // Display only the distinct (non-duplicate) words
        foreach (var word in sortedWords.Distinct())
            Console.Write(" {0}", word);

        Console.WriteLine("\n");

    }// end main method

}// End class
