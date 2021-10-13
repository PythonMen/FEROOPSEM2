package LABVJ3;

public class Zadatak1 {

    public static class Peppa{
        static String[] characters = {"c1","c2","c3"};
        public static String[] getAllCharacters(){
            return characters;
        }
    }

    class InvalidPeppaPigCharacterException extends RuntimeException{
        public InvalidPeppaPigCharacterException (String errorMessage){
            super(errorMessage);
            System.out.println(errorMessage);
        }
    }

    class CartoonChecker{
        public void processCharacter(String character) throws InvalidPeppaPigCharacterException{
            int i=0;
            for(i=0;i<Peppa.getAllCharacters().length;i++){
                    if (Peppa.getAllCharacters()[i].equals(character)) {
                        System.out.println(character + " JE lik u crtanom filmu Peppa Pig");
                        break;
                    } else if (i == Peppa.getAllCharacters().length - 1) throw new InvalidPeppaPigCharacterException(character + " NIJE lik u crtanom filmu Peppa Pig");
            }
        }
    }

    //public static void main(String[] args){
        //CartoonChecker.processCharacter("c1");
        //CartoonChecker.processCharacter("c2");
        //CartoonChecker.processCharacter("c30");
        //CartoonChecker.processCharacter("c1");
    //}

}
