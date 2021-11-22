public class App{
    public static void main(String[] args) {
        // set Empresa
        Empresa atacadojava = new Empresa();
        atacadojava.setNomeEmpresa("AtacadoJava");;
        atacadojava.setCnpjEmpresa(123456789);

        // set Funcionarios
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
        moda.contrataFuncionarioFixo(ff1);
        moda.contrataFuncionarioFixo(ff2);
        moda.contrataFuncionarioFixo(ff3);
        casa.contrataFuncionarioFixo(ff4);
        brinquedos.contrataFuncionarioFixo(ff5);
        moda.contrataFuncionarioPassageiro(fp1);
        casa.contrataFuncionarioPassageiro(fp2);
        brinquedos.contrataFuncionarioPassageiro(fp3);

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
        System.out.println("\n");

        System.out.println("============= PANORAMA DOS DEPARTAMENTOS =============");
        atacadojava.imprimeInfosDepartamentos();
    }
}