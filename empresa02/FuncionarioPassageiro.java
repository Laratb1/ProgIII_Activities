public class FuncionarioPassageiro extends Funcionario {
    private Funcionario funcionario;
    private float horas;

    // getters
    public Funcionario getFuncionario(){
        return funcionario;
    }
    public float getHorasFuncionarioPassageiro(){
        return this.horas;
    }

    // setters
    public void setFuncionarioPassageiro(Funcionario f, float horas){
        this.funcionario = f;
        this.horas = horas;
    }

}
