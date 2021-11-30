public class App{
    public static void main(String[] args) {
        // set Empresa
        Empresa atacadojava = new Empresa();
        atacadojava.setNomeEmpresa("AtacadoJava");;
        atacadojava.setCnpjEmpresa(123456789);
        atacadojava.setPresidente("Lara");

        // set Funcionarios
        Funcionario ff1 = new Funcionario();
        Funcionario ff2 = new Funcionario();
        Funcionario ff3 = new Funcionario();
        Funcionario ff4 = new Funcionario();
        Funcionario ff5 = new Funcionario();

        FuncionarioPassageiro fp1 = new FuncionarioPassageiro();
        FuncionarioPassageiro fp2 = new FuncionarioPassageiro();
        FuncionarioPassageiro fp3 = new FuncionarioPassageiro();

        ff1.setFuncionario("Pedro", 2000);
        ff2.setFuncionario("Laura", 5000);
        ff3.setFuncionario("Maria", 9000);
        ff4.setFuncionario("Carlos", 2500);
        ff5.setFuncionario("Henrique", 6500);


        fp1.setFuncionario("Tales", 3700);
        fp2.setFuncionario("Livia", 9850);
        fp3.setFuncionario("Joana", 5600);
        fp1.setHorasFuncionarioPassageiro(7);
        fp2.setHorasFuncionarioPassageiro(3);
        fp3.setHorasFuncionarioPassageiro(5);

        // set Departamentos
        Departamento moda = new Departamento();
        Departamento casa = new Departamento();
        Departamento brinquedos = new Departamento();

        moda.setNomeDepartamento("Moda");
        casa.setNomeDepartamento("Casa");
        brinquedos.setNomeDepartamento("Brinquedos");

        atacadojava.setDepartamento(moda);
        atacadojava.setDepartamento(casa);
        atacadojava.setDepartamento(brinquedos);

        // Contrata funcionarios
        moda.contrataFuncionario(ff1);
        moda.contrataFuncionario(ff2);
        moda.contrataFuncionario(ff3);
        casa.contrataFuncionario(ff4);
        brinquedos.contrataFuncionario(ff5);
        moda.contrataFuncionarioPassageiro(fp1);
        casa.contrataFuncionarioPassageiro(fp2);
        brinquedos.contrataFuncionarioPassageiro(fp3);

        // Trasfere funcionarios
        System.out.println("Transferindo "+ff1.getNomeFuncionario()+" para o departamento "+casa.getNomeDepartamneto()+"...\n");
        moda.transfereFuncionario(ff1, casa);

        // Calcula total de funcionarios da empresa e media salarial total
        atacadojava.totalFuncionariosEmpresa();
        float mediaSal = atacadojava.mediaSalarialEmpresa();

        // Imprime resultados
        System.out.println("============= PANORAMA DA ATACADOJAVA =============");
        System.out.println(">> Descricao da empresa:");
        System.out.println("Nome: " + atacadojava.getNomeEmpresa());
        System.out.println("CNPJ: " + atacadojava.getcnpjEmpresa());
        System.out.println("Departamentos: ");
        atacadojava.imprimeDepartamentos();
        System.out.println("Total de funcionarios: " + atacadojava.getQuantTotalFuncionariosEmpresa());
        System.out.println("Media salarial da empresa: " + mediaSal);
        System.out.println("Quantidade de funcionarios de tempo parcial: " + atacadojava.totalFuncionariosParciais());
        System.out.println("\n");

        System.out.println("============= PANORAMA DOS DEPARTAMENTOS =============");
        atacadojava.imprimeInfosDepartamentos();

        // Aumento salaria do funcionario, departamento e da empresa
        System.out.println("Realizando o reajusta anual salarial...\n");
        ff1.aumentaSalarioFuncionario(20);
        moda.aumentaSalarioDepartamento(50);
        atacadojava.aumentaSalarioEmpresa(10);
        mediaSal = atacadojava.mediaSalarialEmpresa();

        System.out.println("============= REAJUSTE DA EMPRESA =============");
        System.out.println("Total de funcionarios: " + atacadojava.getQuantTotalFuncionariosEmpresa());
        System.out.println("Media salarial da empresa: " + mediaSal);
        System.out.println("\n");
    }
}