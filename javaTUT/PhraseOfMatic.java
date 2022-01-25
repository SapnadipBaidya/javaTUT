public class PhraseOfMatic {
    public static void main(String[] args) {
        String[] wodListOne = { "4/7", "multiTier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "sixsigma", "critical-path", "dynamic" };
        String[] wodListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
                "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted",
                "shared", "leveraged",
                "aligned", "targeted", "shared", "cooperative", "accelerated" };
        String[] wodListThree = { "process", "tippinpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision",
                "paradigm", "mission" };

        // .random() The default random number always generated between 0.0 and 1.0
        int oneLength = wodListOne.length;
        int twoLength = wodListTwo.length;
        int threeLength = wodListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wodListOne[rand1] + " " + wodListTwo[rand2] + " " + wodListThree[rand3];
        System.out.println(phrase);
    }
}
