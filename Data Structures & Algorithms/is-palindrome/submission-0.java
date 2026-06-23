class Solution {
    public boolean isPalindrome(String s) {
        String[] ch = s.split(" ");
        String str = String.join("", ch).replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        int x=0, y=str.length()-1;
        while(x<y){
            if(str.charAt(x) == str.charAt(y)){
                x++;
                y--;
            }else{
                return false;
            }
        }
        return true;
    }
}
