
package exerciciofuncionario;
public class Funcionario {
    //ATRIBUTOS
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;
    //METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean getEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
    //METODOS
    public void bonificar(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    public void imprimir(){
        System.out.println("O nome.........: "+ this.getNome());
        System.out.println("O departamento.: "+ this.getDepartamento());
        System.out.println("O salario......: "+ this.getSalario());
        System.out.println("O RG...........: "+ this.getRg());
        //System.out.println("Esta na empresa: "+ this.getEstaNaEmpresa());
        if(this.getEstaNaEmpresa() == true){
            System.out.println("Você esta na empresa!!!");
        }else if(this.getEstaNaEmpresa() == false){
            System.out.println("Você não esta na empresa!!!");
        }
    }
}
