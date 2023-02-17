import java.util.Random;

public class Program {
    public static void main(String[] D_Stark) {
        // run and see a Random sentence
        Random random = new Random();
        String[] a = {"You will ", "You will not ", "Your friend will ", "Your friend will not ", "your neighbour will ", "Your uncle will ", "Your dog will ", "Your head will ", "Your toes will ", "Your finger will ", "The king will ", "Your dad will ", "Your girlfriend will ", "Your mum will "};
        int bb = random.nextInt(a.length);
        String b = a[bb];
        String[] c = {"die in a ", "live in a ", "bath in a ", "run into a ", "fall in to a ", "trip over a ", "eat a ", "see a ", "lose a ", "get squashed by a ", " sleep on a ", "be drowned in a ", "get phoned by a ", "get ran over by a ", "get punched by a ", "get killed by a ", "get shot by a ", "brake your ", "fly with a ", "get pooped on by a ", "get eaten by a ", "get slapped by a ", "munch on a ", "lick a ", "see a ", "get tickled by a ", "get pushed by a ", "get tickled by a ", "get breathed on by a ", "get wet with a ", "jump with a ", "roll with a ", "dream about a ", "go on holiday with a ", "drive with ", "eat a ", "fart a ", "shout at a ", "throw a ", "backflip over a ", "fight a ", "marry a ", "burp a ", "steal a ", "talk with a ", "play music with a ", "play with a ", "get stuck in a ", "peel a ", "smell like a ", "best friends with a ", "fall out with a ", "grow in a ", "sleep with a ", "look like a ", " froze on a ", " chill with a "};
        int cc = random.nextInt(c.length);
        String d = c[cc];
        String[] e = {"pidgeon", "cat", "dog ", "hamster", "gold fish", "rabbit", "helicopter", "tree", "garden", "jungle", "grid", "toilet", "sink", "phone", "clock", " car", "lamp post", "post box", "tank", "bicycle", "pond", "swamp", "pool", "moon", "space", "winning ticket", "ghost", "radiator", "couch", "zombie", "pig", "goat", "shed roof", "bee hive", "leaf", "bush", "chip", "hoover", "tomato", "carrot", "turnip", "sweetcorn", "banana", "scooter", "moose", " monkey", " burgler", " copper", "apple", "orange", "cabbage", "loaf", "steak", "mcdonalds", "tin of beans", "ball", "golf stick", "fork", "spoon", "couch", "fire", "armpit", "cup",};
        int ff = random.nextInt(e.length);
        String f = e[ff];
        String[] g = {" in 2 days! ", " next year!", " today!", " tommrow morning!", " after dinner!", " in 5 mins!", " on the toilet!", " right now!", "whilst running"," whilst sleeping"};
        int hh = random.nextInt(g.length);  
        String h = g[hh];
        System.out.println(b + d + f + h);
    }
}
