/*PROBLEM 3: STRING ANALYZER USING INNER 
CLASS 
(Strings + Inner Classes + Loops) 
Problem Statement: 
Create a program that analyzes a string using an inner class. 
Program requirements: 
1. Accept a sentence as input. 
2. Create an inner class named "Analyzer" inside a main class "StringTool". 
3. The inner class must have the following methods: 
o countVowels() 
o countWords() 
o reverse() 
4. The main class should: 
o Create an object of the inner class 
o Display: 
• Total number of vowels 
• Total number of words 
• The reversed string 
Sample Input: 
Enter a sentence: Java programming is fun 
Sample Output: 
Vowel Count: 7 
Word Count: 4 
Reversed String: nuf si gnimmargorp avaJ*/



class StringTool {

    
    class Analyzer {

      
        public int countVowels(String s) {
            int count = 0;
            
            for (int i = 0; i < s.length(); i++) 
	    {
		char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
                    count++;
                }
            }
            return count;
        }

        
        public int countWords(String s) {
         if (s.trim().isEmpty()) 
	{
		return 0;
	}

            int words = 1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }
            return words;
        }

        
        public String reverse(String s) {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            return rev;
        }
    }

    public static void main(String[] args) {

       
        String sentence = "Java programming is fun";

       
        StringTool s1 = new StringTool();

        StringTool.Analyzer ob =s1.new Analyzer();

        int vowels = ob.countVowels(sentence);
        int words = ob.countWords(sentence);
        String reversed = ob.reverse(sentence);

       
        System.out.println("Vowel Count: " + vowels);
        System.out.println("Word Count: " + words);
        System.out.println("Reversed String: " + reversed);
    }
}
