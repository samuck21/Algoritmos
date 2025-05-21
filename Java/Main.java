public class Main {
    public static String  Traslator(String  word){
        String Alphabet[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
        int sizeWord=word.length();
        String traduction="";
        for (int i = 0; i <sizeWord;i++){
                 String letter=Character.toString(word.charAt(i));
                 for(int j=0; j<5;j++){
                   int comp=letter.compareTo(Alphabet[0][j]);
                    if(comp==0){
                        traduction+=Alphabet[1][j];
                    }
                 }

         }
        return traduction;

    }
    public static void main(String[] args) {
        
        String t=Traslator("abcedef");
        System.out.println(t);
    }

  
}
