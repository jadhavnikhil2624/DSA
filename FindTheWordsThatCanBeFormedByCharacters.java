class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];

        for(int i=0;i<chars.length();i++){
            arr[chars.charAt(i)-'a']++;
        }//End for 

        boolean c = false;

        int sum =0;

        for(int i=0;i<words.length;i++){
            String temp = words[i];
            HashMap<Character,Integer> map = new HashMap();

            for(int j=0;j<temp.length;j++){
                map.put(temp.charAt(j),map.getOrDefault(temp.charAt(j),0)+1)
            }//End for j

            for(int k=0;k<temp.length();k++){
                if(!arr[temp.charAt(k)-'a']>=map.get(temp.charAt(k))){
                    c = true;
                    break;
                }//End if
            }//End for k

            if(!c){
                sum +=temp.length();
            }//End if
            c=false;
        }//End for i

        return sum; 
    }//End method
}//End class