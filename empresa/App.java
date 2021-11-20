public class App{
    public static void main(String[] args) {
        FuncionarioFixo ff1 = new FuncionarioFixo();
        FuncionarioFixo ff2 = new FuncionarioFixo();
        FuncionarioFixo ff3 = new FuncionarioFixo();
        FuncionarioFixo ff4 = new FuncionarioFixo();
        FuncionarioFixo ff5 = new FuncionarioFixo();

        FuncionarioPassageiro fp1 = new FuncionarioPassageiro();
        FuncionarioPassageiro fp2 = new FuncionarioPassageiro();
        FuncionarioPassageiro fp3 = new FuncionarioPassageiro();

        ff1.setFuncionarioFixo("Pedro", 2000);
        ff2.setFuncionarioFixo("Laura", 5000);
        ff3.setFuncionarioFixo("Maria", 9000);
        ff4.setFuncionarioFixo("Carlos", 2500);
        ff5.setFuncionarioFixo("Henrique", 6500);

        fp1.setFuncionarioPassageiro("Juca", 7800, 5);
        fp2.setFuncionarioPassageiro("Joana", 3000, 3);
        fp3.setFuncionarioPassageiro("Roger", 5900, 10);

    }
}