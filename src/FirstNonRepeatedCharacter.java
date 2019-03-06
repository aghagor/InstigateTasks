public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aanadzor";
        boolean found = false;
        for(int i = 0; i < str.length(); i++){
            found = true;
            char c = str.charAt(i);
            for(int j = 0; j < str.length(); j++){
                if(c == str.charAt(j) && j != i){
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.println("Character is "  + c);
                break;
            }
        }
        if(!found){
            System.out.println("No single character found");
        }

    }
}
