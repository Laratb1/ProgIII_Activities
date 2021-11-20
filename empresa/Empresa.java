import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nome;
    private int cnpj;
    private int quantFuncionarios;
    private Set<Departamento> departamentos = new HashSet<>();
    //private Set<FuncionarioFixo> funcionariosFixos = new HashSet<>();

    //getters
    public String getNomeEmpresa(){
        return this.nome;
    }
    public int getcnpjEmpresa(){
        return this.cnpj;
    }
    public List<Departamento> getDepartamentosEmpresa(){
        return new LinkedList<Departamento>(departamentos);
    }
    /*public List<FuncionarioFixo> getFuncionariosFixos(){
        return new LinkedList<FuncionarioFixo>(funcionariosFixos);
    }*/

    //setters
    public void setNomeEmpresa(String nome){
        this.nome = nome;
    }
    public void setCnpjEmpresa(int num){
        this.cnpj = num;
    }

    //functions
    

    
}
