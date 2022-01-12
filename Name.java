package Main;

class Name {

    static String NameGiver() {

        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","Q","P","R","S","T","U","V","W","X","Y","Z"};
        String[] consonants = {"B","C","D","F","G","H","J","K","L","M","N","Q","P","R","S","T","V","W","X","Z"};
        String[] vowels = {"A","E","I","O","U","Y"};
        String[] preLastLetter = {"A","E","H","I","L","N","O","R","S","U","Y"};
        String[] lastLetter = {"Z","Y","X","W","V","U","T","S","R","P","Q","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};

        int index = (int) (alphabet.length * Math.random());
        int index0 = (int) (lastLetter.length * Math.random());

            switch (index) {

                //Checking if letter is 'A'
                case 0:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (alphabet.length * Math.random());
                        System.out.print(alphabet[index1]);
                        //Drawing a consonant if second is a vowel
                        if ((index1==0)||(index1==4)||(index1==8)||(index1==14)||(index1==20)||(index1==24)){
                            int index2 = (int) (consonants.length * Math.random());
                            System.out.print(consonants[index2]);}
                        int index3 = (int) (index0 * Math.random());
                        System.out.println(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'B'
                case 1:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (preLastLetter.length * Math.random());
                        System.out.print(preLastLetter[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'C'
                case 2:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (preLastLetter.length * Math.random());
                        System.out.print(preLastLetter[index3]);

                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'D'
                case 3:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'E'
                case 4:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (consonants.length * Math.random());
                        System.out.print(consonants[index1]);
                        int index2 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index2]);
                        int index3 = (int) (preLastLetter.length * Math.random());
                        System.out.print(preLastLetter[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'F'
                case 5:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index2 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'G'
                case 6:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'H'
                case 7:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index2 * Math.random());
                        System.out.print(alphabet[index3]);
                        int index4 = (int) (index3 * Math.random());
                        System.out.print(alphabet[index4]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'I'
                case 8:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (consonants.length * Math.random());
                        System.out.print(consonants[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'J'
                case 9:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'K'
                case 10:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (preLastLetter.length * Math.random());
                        System.out.print(preLastLetter[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'L'
                case 11:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'M'
                case 12:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (Math.random() * index);
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index2 * Math.random());
                        System.out.print(alphabet[index3]);
                        int index4 = (int) (index3 * Math.random());
                        System.out.print(alphabet[index4]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'N'
                case 13:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'O'
                case 14:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (index * Math.random());
                        System.out.print(alphabet[index1]);

                        //Drawing a consonant if second is a vowel
                        if ((index1==0)||(index1==4)||(index1==8)||(index1==14)||(index1==20)||(index1==24)){
                        int index2 = (int) (consonants.length * Math.random());
                        System.out.print(consonants[index2]);}
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'Q'
                case 15:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'P'
                case 16:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'R'
                case 17:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'S'
                case 18:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.println(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'T'
                case 19:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'U'
                case 20:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (consonants.length * Math.random());
                        System.out.print(consonants[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'V'
                case 21:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'W'
                case 22:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'X'
                case 23:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'Y'
                case 24:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (index * Math.random());
                        System.out.print(alphabet[index1]);
                        int index2 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index2]);
                        int index3 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;

                    //Checking if letter is 'Z'
                case 25:
                    try {
                        System.out.print(alphabet[index]);
                        int index1 = (int) (vowels.length * Math.random());
                        System.out.print(vowels[index1]);
                        int index2 = (int) (index1 * Math.random());
                        System.out.print(alphabet[index2]);
                        int index3 = (int) (preLastLetter.length * Math.random());
                        System.out.print(preLastLetter[index3]);
                    } catch (ArithmeticException | ArrayIndexOutOfBoundsException ignored) {
                    }
                    break;
            }
            return lastLetter[index0];
    }
}
