package Classes;


import java.util.UUID;

public class ChecklistItem {

    private String uuidCheck;

    private String nomeCheck;

    private String descriçãoCheck;

    private boolean completaCheck;

    private int ordemCheck;

    public ChecklistItem() {
        this.setUuidCheck(UUID.randomUUID().toString());

    }

    public void completar() {
        this.setCompletaCheck(true);
    }

    public String getUuidCheck() {
        return uuidCheck;
    }

    public void setUuidCheck(String uuidCheck) {
        this.uuidCheck = uuidCheck;
    }

    public String getNomeCheck() {
        return nomeCheck;
    }

    public void setNomeCheck(String nomeCheck) {
        this.nomeCheck = nomeCheck;
    }

    public String getDescriçãoCheck() {
        return descriçãoCheck;
    }

    public void setDescriçãoCheck(String descriçãoCheck) {
        this.descriçãoCheck = descriçãoCheck;
    }

    public boolean isCompletaCheck() {
        return completaCheck;
    }

    public void setCompletaCheck(boolean completaCheck) {
        this.completaCheck = completaCheck;
    }

    public int getOrdemCheck() {
        return ordemCheck;
    }

    public void setOrdemCheck(int ordemCheck) {
        this.ordemCheck = ordemCheck;
    }
//
//    public int getOrdemCheck() {
//        return ordemCheck;
//    }
//
//    public void setOrdemCheck(int ordemCheck) {
//        this.ordemCheck = ordemCheck;
//    }
//}



