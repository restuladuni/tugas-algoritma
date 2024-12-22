public class PALINDROME {
    public static boolean isPalindrome(String str, interface  start, int end) {
        if  (start == end) {
            System.out.println(str + " adalah Palindrme");
            return true;
            
        }
        if  (str.charAt(start) == str.charAt(end)) 
             return isPalindrome(str, start + 1, end - 1);
        System.out.println(str + " bukan palindrome");   
        return false;  
            
  }

  
    
  }
    
        
    
    

