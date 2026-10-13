import java.util.*;
 
public class vowels {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int count = 0;
    for (int i=0; i<s.length(); i++){
      char c = s.toLowerCase().charAt(i);
      if(c=='a'|| c=='e'||c=='i'||c=='o'||c =='u'){
        count++;

      }
    }
    System.out.println("vowels count: "+count);
  }

  
}