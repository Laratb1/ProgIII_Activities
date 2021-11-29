import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class Departamento {
    private String nome;
    private int totalFuncionarios = 0;
    private Set<Funcionario> funcionarios = new HashSet<>();
    private Set<FuncionarioPassageiro> funcionariosPassageiros = new HashSet<>();

    //getters
    public String getNomeDepartamneto(){
        return this.nome;
    }
    public int getTotalFuncionarios(){
        return this.totalFuncionarios;
    }
    public List<Funcionario> getFuncionariosFixosList(){
        return new LinkedList<Funcionario>(funcionarios);
    }
    public List<FuncionarioPassageiro> getFuncionariosPassageirosList(){
        return new LinkedList<FuncionarioPassageiro>(funcionariosPassageiros);
    }

    //setters
    public void setNomeDepartamento(String nome){
        this.nome = nome;
    }

    //functions
    public void contrataFuncionario(Funcionario p){
        funcionarios.add(p);
        this.totalFuncionarios++;
    }

    public void contrataFuncionarioPassageiro(FuncionarioPassageiro p){
        funcionariosPassageiros.add(p);
        this.totalFuncionarios++;
    }
    
    public void contabilizaDepartamento(){
        int soma = 0;
        for(int i = 0; i < funcionarios.size(); i++){
          soma += 1;  
        }
        for(int i = 0; i < funcionariosPassageiros.size(); i++){
            soma += 1;  
        }
        this.totalFuncionarios = soma;
    }

    public float calculaSalMedioDepartamento(){
        contabilizaDepartamento();
        float soma = 0;
        for(Funcionario ff : funcionarios){
            soma += ff.getSalarioFuncionario();
        }
        for(FuncionarioPassageiro fp : funcionariosPassageiros){
            soma += fp.getSalarioFuncionario();
        }
        soma = soma / (this.totalFuncionarios);
        return soma;
    }

    public float totalHoras(){
        float soma = 0;
        for(FuncionarioPassageiro fp : funcionariosPassageiros){
            soma += fp.getHorasFuncionarioPassageiro();
        }
        return soma;
    }

    public void transfereFuncionario(Funcionario f1, Departamento d){
        for(Funcionario f : this.getFuncionariosFixosList()){
            if(f1 == f){
                this.getFuncionariosFixosList().remove(f);
                d.getFuncionariosFixosList().add(f);
            }
        }
    }
    
    public void aumentaSalarioDepartamento(float percent){
        for(Funcionario f : this.funcionarios){
            f.aumentaSalarioFuncionario(percent);
        }
        
    }
}
