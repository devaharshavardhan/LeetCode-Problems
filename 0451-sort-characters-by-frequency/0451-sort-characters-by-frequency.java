class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> t=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        int cou=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            t.add(entry.getValue());
        }
        Collections.sort(t, Collections.reverseOrder());;
        System.out.println(t);
        System.out.println(map);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
            res.append(ch);
    }
}
        return res.toString();
    }
}