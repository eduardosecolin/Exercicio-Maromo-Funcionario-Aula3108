
package exerciciofuncionario;

import java.util.Scanner;

public class ExercicioFuncionario {
    public static int TAM = 3;
    public int indice = 0;
    Funcionario[] f = new Funcionario[TAM];
    Scanner teclado = new Scanner(System.in);
    
    public void exeBonificar(){
        if(indice > 0){
            System.out.print("Qual posição do funcionario no banco de dados [0,1 ou 2]: ");
            int op = teclado.nextInt();
            if(op > indice){
                System.out.println("Posição invalida!");
            }else{
                System.out.print("Digite o valor da bonificação: ");
                double valor = teclado.nextDouble();
                f[op].bonificar(valor);
                System.out.println("Aumento realizado com sucesso!");
            }
        }else{
            System.out.println("Nenhuma conta cadastrada!");
        }
    }
    public void exeConsultar(){
        if(indice > 0){
            System.out.print("Digite a posição da conta [0,1 ou 2]: ");
            int op = teclado.nextInt();
            if((op < 0)||(op > 2)){
                System.out.println("Posição invalida!");
            }else{
                f[op].imprimir();
            }
        }else{
            System.out.println("Nenhuma conta cadastrada!");
        }
    }
    public void exeCadastro(){
        if(indice >= TAM){
            System.out.println("Todos os espaços para contas foram ocupados!");
            return;
        }
        f[indice] = new Funcionario();
        System.out.print("Digitar o nome......: ");
        f[indice].setNome(teclado.nextLine());
        System.out.print("Digite o departamento......: ");
        f[indice].setDepartamento(teclado.nextLine());
        System.out.print("Digite o salario....: ");
        f[indice].setSalario(Double.parseDouble(teclado.nextLine()));
        System.out.print("Digite o RG......: ");
        f[indice].setRg(teclado.nextLine());
        System.out.print("Você esta na empresa?: ");
        String s = teclado.nextLine();
        String n = teclado.nextLine();
        
        if(f[indice].getEstaNaEmpresa() == true && "s".equalsIgnoreCase(s)){
            System.out.print("Você esta na empresa!");
        }else if(f[indice].getEstaNaEmpresa() == false && "n".equalsIgnoreCase(n)){
            System.out.println("Você não esta na empresa!");
        }
        indice++;
    }
    public static void main(String[] args) {
        ExercicioFuncionario obj = new ExercicioFuncionario();
        Scanner t = new Scanner(System.in);
        int opc = 0;
        while(opc !=9){
            System.out.println("DADOS DE 03 CONTAS");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Bonificar");
            System.out.println("3 - Consultar");
            System.out.println("9 - Sair");
            System.out.print("Entr com a opçao: ");
            opc = t.nextInt();
            switch (opc){
                case 1:
                    obj.exeCadastro();
                    break;
                case 2:
                    obj.exeBonificar();
                    break;
                case 3:
                    obj.exeConsultar();
                    break;
                case 9:
                    break;
            }
        }
    }
    
}
