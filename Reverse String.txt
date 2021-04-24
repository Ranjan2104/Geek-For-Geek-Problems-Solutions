class Reverse
{
    public static String reverseWord(String str)
    {
        int end = str.length() - 1;
		String string = "";
		for(int i = end; i >= 0; i--) {
			string = string + str.charAt(i);
		}
        return string;
    }
}
// Contributed by Amresh Ranjan.