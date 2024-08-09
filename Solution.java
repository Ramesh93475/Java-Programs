class Revvowel {

    public String reverseVowels(String s) {
        char[] stringArray = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left = 0, right = stringArray.length - 1;
        while (left < right) 
       {
            if (vowels.contains(stringArray[left])) 
              {
                if (vowels.contains(stringArray[right])) 
                   {
                    swap(stringArray, left, right);
                    left++;
                    right--;
                   } 
                else 
                 {
                    right--;
                 }
            } 
            else
            {
                left++;
            }
        }

        return String.valueOf(stringArray);
    }

    public char[] swap(char[] array, int left, int right) 
   {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        return array;
    }
  Revvowel r=new Revvowel();
  System.out.println(r.reverseVowels(s);

}