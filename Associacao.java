
package associacao;

public class Associacao {

    
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ashley Saint Louis",24);
        Aluno aluno1 = new Aluno("Emma", 22);
        
        Seminario sem = new Seminario("Voce consegue!");
        Seminario sem1 = new Seminario("Nao tem medo de errar");
        
        Professor prof = new Professor("Samuel","Programacao 1");
        
        Local end = new Local("Efapi", "Rua Surucue");
        
        aluno.setSeminario(sem);
        aluno1.setSeminario(sem1);
        
        sem.setProfessor(prof);
        sem.setAluno(new Aluno[]{aluno,aluno1});
        sem.setLocal(end);
        
        sem1.setProfessor(prof);
        sem1.setAluno(new Aluno[]{aluno,aluno1});
        sem1.setLocal(end);
        
        Seminario[] semArray = new Seminario[7]; //criando um array de seminario
        semArray[0] = sem;
        semArray[1] = sem1;
        prof.setSeminarios(semArray);
        
        aluno.print();
        System.out.println("\n");
        aluno1.print();
        System.out.println("\n");
        sem.print();
        System.out.println("\n");
        sem1.print();
        System.out.println("\n");
        prof.print();
        
        
    }
    
}
