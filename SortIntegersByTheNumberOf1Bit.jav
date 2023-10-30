class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap();
        for(int num: arr){
            int oneBit=oneBit(num);
            map.putIfAbsent(oneBit, new ArrayList<Integer>());
            ArrayList<Integer> l = map.get(oneBit);
            l.add(num);
            map.put(oneBit, l);
        }
        int i = 0;
        int[] result = new int[arr.length];
        for(List<Integer> list: map.values()){
            Collections.sort(list);
            for(int num: list)
                result[i++]=num;
        }
        return result;
    }
    private int oneBit(int num){
        int result = 0;
        while(num>0){
            result+=num%2;
            num/=2;
        }
        return result;
    }
}