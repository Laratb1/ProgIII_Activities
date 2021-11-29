public class Funcionario {
    private String nome;
    private float salario;

    public String getNomeFuncionario(){
        return this.nome;
    }
    public float getSalarioFuncionario(){
        return this.salario;
    }

    public void setFuncionario(String nome, float num){
        this.nome = nome;
        this.salario = num;
    }

    // fuctions 
    public void aumentaSalarioFuncionario(float percent){
        this.salario = this.salario * (1 + (percent/100));
    }
}
