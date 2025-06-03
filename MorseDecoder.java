public class MorseDecoder {
    BTree<String> morseTree;
    public MorseDecoder() {
        morseTree=new BTree<String>();
        morseTree.addByPath("start","");
        morseTree.addByPath("E","L");
        morseTree.addByPath("T","R");
        morseTree.addByPath("M","RR");
        morseTree.addByPath("O","RRR");
        morseTree.addByPath("N","RL");
        morseTree.addByPath("K","RLR");
        morseTree.addByPath("D","RLL");
        morseTree.addByPath("B","RLLL");
        morseTree.addByPath("Y","RRRR");
        morseTree.addByPath("C","RLRL");
        morseTree.addByPath("X","RLLR");
        morseTree.addByPath("G","RRL");
        morseTree.addByPath("Q","RRLR");
        morseTree.addByPath("Z","RRLL");
        morseTree.addByPath("A","LR");
        morseTree.addByPath("W","LRR");
        morseTree.addByPath("J","LRRR");
        morseTree.addByPath("R","LRL");
        morseTree.addByPath("L","LRLL");
        morseTree.addByPath("I","LL");
        morseTree.addByPath("U","LLR");
        morseTree.addByPath("S","LLL");
        morseTree.addByPath("H","LLLL");
        morseTree.addByPath("V","LLLR");
        morseTree.addByPath("F","LLRL");
        morseTree.addByPath("P","LRRL");
}
    @Override
    public String toString() {
        return morseTree.pre();
    }
    public String decode(String moresStr){
        String s ="";
        for (int i = 0; i <moresStr.length() ; i++) {
            if(moresStr.charAt(i)!='.'&&moresStr.charAt(i)!='-'){
                return "";
            }
            else if (moresStr.charAt(i)=='.'){
                s+="L";
            }
            else if(moresStr.charAt(i)=='-'){
                s+="R";
            }
        }
        return morseTree.findByPath(s);

    }
}
