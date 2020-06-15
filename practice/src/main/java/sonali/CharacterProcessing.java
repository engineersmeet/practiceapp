package sonali;

public class CharacterProcessing
{
    public static void main(String[] args)
    {
        String s1 = "Sonali";
        String[] words = s1.split("");
        System.out.println("Character processing started....");
        for (String w : words)
        {
                System.out.println("Currently Processing word is: "+w);
        }
        System.out.println("Character processing finished....");
    }
}
