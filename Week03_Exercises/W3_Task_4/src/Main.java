public class Main {
    public static void main(String[] args){

        String poem = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        int dotcount = 0, comacount =0, hyphonecount = 0, exclamation = 0, questioncount = 0, coloncount = 0, semicoloncount =0;

        for (char c: poem.toCharArray()) {
            switch (c){
                case '.':
                    dotcount++;
                    break;
                case ',':
                    comacount++;
                    break;
                case '-':
                    hyphonecount++;
                    break;
                case '!':
                    exclamation++;
                    break;
                case '?':
                    questioncount++;
                    break;
                case ':':
                    coloncount++;
                    break;

                case ';':
                    semicoloncount++ ;
                    break;
            }
        }
        System.out.println("\n----------------\t-----");
        System.out.println("Punctuation Mark\tCount");
        System.out.println("----------------\t-----");
        System.out.println(".\t\t\t\t\t" + dotcount);
        System.out.println(",\t\t\t\t\t" + comacount);
        System.out.println("-\t\t\t\t\t" + hyphonecount);
        System.out.println(";\t\t\t\t\t" + semicoloncount);
        System.out.println(":\t\t\t\t\t" + coloncount);
        System.out.println("!\t\t\t\t\t" + exclamation);
        System.out.println("?\t\t\t\t\t" + questioncount);

    }
}