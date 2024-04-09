package heranca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        Professor p = new Professor();
        Funcionario f = new Funcionario();

        boolean continuar = true;

        Scanner lerTexto = new Scanner(System.in);
        Scanner lerNum = new Scanner(System.in);
        

        System.out.println("Quantas pessoas deseja cadastrar? ");
        int tam = lerNum.nextInt();

        Aluno alunoObj[] = new Aluno[tam];
        Professor profObj[] = new Professor[tam];
        Funcionario funcObj[] = new Funcionario[tam];

        System.out.println("Escolha qual das opções deseja cadastrar: ");

        while (continuar) {

            System.out.println("1. Aluno");
            System.out.println("2. Professor");
            System.out.println("3. Funcionário");
            System.out.println("4. Sair");

            int opcao = lerNum.nextInt();

            switch (opcao) {
                case 1:
                    
                    for (int i = 0; i < alunoObj.length; i++) {

                        alunoObj[i] = new Aluno();

                        System.out.print("Informe o Nome: ");
                        alunoObj[i].setNome(lerTexto.nextLine());

                        System.out.print("Infome o RG: ");
                        alunoObj[i].setRg(lerTexto.next());

                        System.out.print("Informe o CPF: ");
                        alunoObj[i].setCpf(lerTexto.next());

                        System.out.print("Informe o CEP: ");
                        alunoObj[i].setCep(lerTexto.next());

                        System.out.print("Informe a Cidade: ");
                        alunoObj[i].setCidade(lerTexto.next());
                        lerTexto.nextLine(); // Consumir quebra de linha
                        

                        System.out.print("Informe o Bairro: ");
                        alunoObj[i].setBairro(lerTexto.nextLine());

                        System.out.print("Informe a Rua: ");
                        alunoObj[i].setRua(lerTexto.nextLine());

                        System.out.print("Informe o número residêncial: ");
                        alunoObj[i].setNum(lerNum.nextInt());

                        System.out.print("Informe o Registro do Aluno(RA): ");
                        alunoObj[i].setRegistroAluno(lerNum.nextInt());

                        System.out.print("Infome a Nota do Vestibular: ");
                        alunoObj[i].setNotaVestibular(lerNum.nextFloat());

                        System.out.print("Informe o Curso: ");
                        alunoObj[i].setCurso(lerTexto.nextLine());

                        System.out.print("Informe a data da matrícula: ");
                        alunoObj[i].setDataMatricula(lerTexto.next());
                    }
                    break;
                case 2:
                    
                    for (int i = 0; i < profObj.length; i++) {

                        profObj[i] = new Professor();

                        System.out.print("Informe o Nome: ");
                        profObj[i].setNome(lerTexto.nextLine());

                        System.out.print("Infome o RG: ");
                        profObj[i].setRg(lerTexto.next());

                        System.out.print("Informe o CPF: ");
                        profObj[i].setCpf(lerTexto.next());

                        System.out.print("Informe o CEP: ");
                        profObj[i].setCep(lerTexto.next());

                        System.out.print("Informe a Cidade: ");
                        profObj[i].setCidade(lerTexto.nextLine());
                        lerTexto.nextLine(); // Consumir quebra de linha

                        System.out.print("Informe o Bairro: ");
                        profObj[i].setBairro(lerTexto.nextLine());

                        System.out.print("Informe a Rua: ");
                        profObj[i].setRua(lerTexto.nextLine());

                        System.out.print("Informe o número residêncial: ");
                        profObj[i].setNum(lerNum.nextInt());

                        System.out.print("Informe o número da Matrícula: ");
                        profObj[i].setMatriculaProfessor(lerNum.nextInt());

                        System.out.print("Informe a data de Admissão: ");
                        profObj[i].setDataAdmissao(lerTexto.next());

                        System.out.print("Informe o Salário de Horista: ");
                        profObj[i].setSalarioHorista(lerNum.nextDouble());

                    }
                    break;
                case 3:
                   

                    for (int i = 0; i < funcObj.length; i++) {

                        funcObj[i] = new Funcionario();

                        System.out.print("Informe o Nome: ");
                        funcObj[i].setNome(lerTexto.nextLine());

                        System.out.print("Infome o RG: ");
                        funcObj[i].setRg(lerTexto.next());

                        System.out.print("Informe o CPF: ");
                        funcObj[i].setCpf(lerTexto.next());

                        System.out.print("Informe o CEP: ");
                        funcObj[i].setCep(lerTexto.next());

                        System.out.print("Informe a Cidade: ");
                        funcObj[i].setCidade(lerTexto.nextLine());
                        lerTexto.nextLine(); // Consumir quebra de linha

                        System.out.print("Informe o Bairro: ");
                        funcObj[i].setBairro(lerTexto.nextLine());

                        System.out.print("Informe a Rua: ");
                        funcObj[i].setRua(lerTexto.nextLine());

                        System.out.print("Informe o número residêncial: ");
                        funcObj[i].setNum(lerNum.nextInt());

                        System.out.print("Informe o número da Matrícula: ");
                        funcObj[i].setMatriculaFuncionario(lerNum.nextInt());

                        System.out.print("Informe a data de Admissão: ");
                        funcObj[i].setDataAdmissao(lerTexto.next());

                        System.out.print("Informe o salário mensal: ");
                        funcObj[i].setSalarioMensal(lerNum.nextDouble());

                    }
                    break;
                case 4:
                    System.out.println("Saindo do Programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("[Opção inválida, tente novamente.]");
                    break;

            }
        }

        System.out.println("Deseja imprimir os dados dos Alunos, Professores ou Funcionários? ");
        String esc = lerTexto.next();

        switch (esc) {
            case "Alunos":
                for (int i = 0; i < alunoObj.length; i++) {
                    if (!(alunoObj[i] == null)) {
                        System.out.println("\n");
                        System.out.println("\t - Dados de Alunos:  " + "-\n");
                        System.out.println("\n");
                        System.out.println(alunoObj[i].retornaDadosAluno());
                    }
                }
                break;

            case "Professores":
                for (int i = 0; i < profObj.length; i++) {
                    if (!(profObj[i] == null)) {
                        System.out.println("\n");
                        System.out.println("\t - Dados de Professores:  " + "-\n");
                        System.out.println("\n");
                        System.out.println(profObj[i].retornaDadosProfessor());
                    }
                }
                break;

            case "Funcionários":
                for (int i = 0; i < funcObj.length; i++) {
                    if (!(funcObj[i] == null)) {
                        System.out.println("\n");
                        System.out.println("\t - Dados de Funcionários:  " + "-\n");
                        System.out.println("\n");
                        System.out.println(funcObj[i].retornaDadosFuncionario());
                    }
                }
                break;
            default:
                System.out.println("[Opção Incorreta!]");
        }

        lerTexto.close();
        lerNum.close();
        
    }

}
