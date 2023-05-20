class Solution{
    static int cuts(String str)
    {
        for (int i = 22; i >= 0; i--)
			str = str.replaceAll(Long.toBinaryString((long) Math.pow(5, i)), "#");

		return str.contains("0") ? -1 : str.length();
    }
}