
public class TagFinder {
    public String findProtein(String dna) {
        dna = dna.toLowerCase();
        System.out.println(dna);
        int start = dna.indexOf("atg");
        if ( start == -1) { //start codon is not found
            return "";
        }
        int stop = dna.indexOf("tag" , start+3);
        if((stop - start) % 3 == 0 ) {
            return dna.substring(start , stop + 3);
        }
        else {
            return "" ;
        }
        
    }
    
    public void testing() {
        String a = "cccatggggtttaaataataataggagagagagagagagttt";
        String ap = "atggggtttaaataataatag";
        String b = "ATGCCCTAG";
        String bp = "ATGCCCTAG";
        String result1 = findProtein(a);
        if(ap.equals(result1)) {
            System.out.println("success for " + ap +" Length " +ap.length());
        }
        else {
            System.out.println("mistake for input:" +a);
            System.out.println("got: " +result1);
            System.out.println("not " +ap);
        }
        String result2 = findProtein(b);
        if(bp.equals(result2.toUpperCase())) {
            System.out.println("success for " + bp +" Length " +bp.length());
        }
        else {
            System.out.println("mistake for input:" +b);
            System.out.println("got: " +result2);
            System.out.println("not " +bp);
        }
    }
    
    public static void main(String[] args){
        TagFinder t = new TagFinder();
        t.testing();
    }
    
    

}
