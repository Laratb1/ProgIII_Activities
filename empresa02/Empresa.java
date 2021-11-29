import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nome;
    private int cnpj;
    private String presidente;
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
    public String getPresidente(){
        return this.presidente;
    }
    public List<Departamento> getDepartamentosEmpresa(){
        return new LinkedList<Departamento>(departamentos);
    }
    public int getQuantTotalFuncionariosEmpresa(){
        return this.quantFuncionarios;
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
    public void setPresidente(String p){
        this.presidente = p;
    }
    public void setDepartamento(Departamento d){
        departamentos.add(d);
    }

    //functions
    public void totalFuncionariosEmpresa(){
        int soma = 0;
        for(Departamento d : departamentos){
            soma += d.getTotalFuncionarios();
        }
        this.quantFuncionarios = soma;
    }

    public int totalFuncionariosParciais(){
        int soma = 0;
        for(Departamento d : this.departamentos){
            soma += d.getFuncionariosFixosList().size();
            soma += d.getFuncionariosPassageirosList().size();
        }
        return soma;
    }

    public float mediaSalarialEmpresa(){
        float soma = 0;
        for(Departamento d : departamentos){
            for(Funcionario ff : d.getFuncionariosFixosList()){
                soma += ff.getSalarioFuncionario();
            }
            for(FuncionarioPassageiro fp : d.getFuncionariosPassageirosList()){
                soma += fp.getSalarioFuncionario();
            }
        }
        return soma / this. quantFuncionarios;
    }

    public void imprimeDepartamentos(){
        int i = 1;
        for(Departamento d : departamentos){
            System.out.println(i + " - " + d.getNomeDepartamneto());
            i++;
        }
    }

    public void imprimeInfosDepartamentos(){
        for(Departamento d : this.getDepartamentosEmpresa()){
            System.out.println("Tipo: " + d.getNomeDepartamneto());
            System.out.println("Total de funcionários: " + d.getTotalFuncionarios());
            System.out.println("Media salarial do departamento: " + d.calculaSalMedioDepartamento());
            System.out.println("Total de horas trabalhadas por funcionarios de tempo parcial: " + d.totalHoras());
            System.out.println("\n");
        }
    }

    public void alteraPresidente(String novo){
        this.presidente = novo;
    }

    public void aumentaSalarioEmpresa(float percent){
        for(Departamento d : this.departamentos){
            d.aumentaSalarioDepartamento(percent);
        }
    }
    
}
