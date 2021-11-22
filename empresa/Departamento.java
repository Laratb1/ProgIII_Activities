import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class Departamento {
    private String nome;
    private int totalFuncionarios = 0;
    private Set<FuncionarioFixo> funcionariosFixos = new HashSet<>();
    private Set<FuncionarioPassageiro> funcionariosPassageiros = new HashSet<>();

    //getters
    public String getNomeDepartamneto(){
        return this.nome;
    }
    public int getTotalFuncionarios(){
        return this.totalFuncionarios;
    }
    public List<FuncionarioFixo> getFuncionariosFixosList(){
        return new LinkedList<FuncionarioFixo>(funcionariosFixos);
    }
    public List<FuncionarioPassageiro> getFuncionariosPassageirosList(){
        return new LinkedList<FuncionarioPassageiro>(funcionariosPassageiros);
    }

    //setters
    public void setNomeDepartamento(String nome){
        this.nome = nome;
    }

    //functions
    public void contrataFuncionarioFixo(FuncionarioFixo p){
        funcionariosFixos.add(p);
        this.totalFuncionarios++;
    }

    public void contrataFuncionarioPassageiro(FuncionarioPassageiro p){
        funcionariosPassageiros.add(p);
        this.totalFuncionarios++;
    }
    
    public void contabilizaDepartamento(){
        int soma = 0;
        for(int i = 0; i < funcionariosFixos.size(); i++){
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
        for(FuncionarioFixo ff : funcionariosFixos){
            soma += ff.getSalarioFuncionarioFixo();
        }
        for(FuncionarioPassageiro fp : funcionariosPassageiros){
            soma += fp.getSalarioFuncionarioPassageiro();
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

}
