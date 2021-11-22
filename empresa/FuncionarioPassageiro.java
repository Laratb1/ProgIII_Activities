public class FuncionarioPassageiro {
    private String nome;
    private float salario;
    private float horas;

    // getters
    public String getNomeFuncionarioPassageiro(){
        return this.nome;
    }
    public float getSalarioFuncionarioPassageiro(){
        return this.salario;
    }
    public float getHorasFuncionarioPassageiro(){
        return this.horas;
    }

    // setters
    public void setFuncionarioPassageiro(String nome, float num, float horas){
        this.nome = nome;
        this.salario = num;
        this.horas = horas;
    }

}
