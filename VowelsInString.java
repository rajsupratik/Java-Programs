public class vowel {

  // public static boolean containsVowel(String input) {
  // String vowels = "aeiou";
  // return input.toLowerCase().chars().anyMatch(ch -> vowels.indexOf(ch) != -1);
  // }

  // public static void main(String[] args) {
  // String str = "There is a tall building near the river that no one has ever
  // seen";
  // System.out.println(containsVowel(str)); // Output: true
  // }
  public static int[] countvowel(String input) {
    int[] vowelCount = new int[5];
    for (char ch : input.toCharArray()) {
      switch (Character.toLowerCase(ch)) {
        case 'a':
          vowelCount[0]++;
          break;
        case 'e':
          vowelCount[1]++;
          break;
        case 'i':
          vowelCount[2]++;
          break;
        case 'o':
          vowelCount[3]++;
          break;
        case 'u':
          vowelCount[4]++;
          break;
      }
    }
    return vowelCount;

  }

  public static void main(String args[]) {
    String str = "There is a tall building near the river that no one has ever seen";
    int[] vowelCount = countvowel(str);

    System.out.println("Vowel Counts:");
    for (int i = 0; i < vowelCount.length; i++) {
      char vowel = (char) ('a' + i);
      System.out.println(vowel + ": " + vowelCount[i]);
    }
  }
}
