
package associacao;


public class Local {
    private String bairro;
    private String rua;

    public Local(String bairro, String rua) {
        this.bairro = bairro;
        this.rua = rua;
    }

    public Local() {
    }
    
    public void print(){
        System.out.println("******** Local ********");
        System.out.println("Bairro: "+this.bairro);
        System.out.println("Rua: "+this.rua);
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
}
