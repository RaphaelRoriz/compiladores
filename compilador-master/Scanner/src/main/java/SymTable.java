import java.util.ArrayList;

public class SymTable {

    private ArrayList<Sym> symList;
    private int countKey;

    public SymTable() {
        this.symList = new ArrayList<Sym>();
        countKey = 0;
    }

    public Sym addSym(String id){
        for (Sym s:
             symList) {
            if (s.getKey().equals(id)){
                return s;

            }
        }
        countKey++;
        Sym sim = new Sym(id, countKey);
        symList.add(sim);
        return sim;
    }

    public void printTable() {
        System.out.print("\n\nTabela de Símbolos");
        for (Sym s:
             symList) {
                System.out.printf("\n< %s , %s>", s.getKey(), String.valueOf(s.getValue()));
        }
    }
}
