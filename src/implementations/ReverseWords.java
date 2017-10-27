package implementations;

public class ReverseWords{
    public String reverseWords(String input){
        String output ="";
        String result = "";
        for(int i = 0 ; i<input.length();i++){
            result += input.charAt(i);
            if(input.charAt(i) == ' '|| i == input.length()-1){
                result = result.trim();
                for(int j = result.length()-1;j>-1;j--){
                    output += result.charAt(j);
                }
                if(i!=input.length()-1){
                    output +=" ";
                }
                result="";
            }
        }
        return output;
    }
}