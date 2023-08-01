
package associacao;


public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }
    
    public void print(){
        System.out.println("********* Relatorio de professores *********");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Seminarios participado ");
        for(Seminario sem1 : seminarios){
            System.out.println(sem1.getTitulo()+ " ");
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
