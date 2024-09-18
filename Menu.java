package ExercícioPetShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<Animal>();
        ArrayList<Tutor> tutores = new ArrayList<Tutor>();
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        int opt = 0;

        do {
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Categoria");
            System.out.println("2 - Cadastrar Tutor");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Categoria");
            System.out.println("5 - Listar Tutor");
            System.out.println("6 - Listar Animal");
            System.out.println("7 - Sair");
            try {
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
                continue;
            }
            switch(opt) {
                case 1:
                    System.out.println("Digite o ID da categoria:");
                    int idCategoria = scanner.nextInt();
                    System.out.println("Digite a descrição:");
                    String descricao = scanner.next();
                    Categoria categoria = new Categoria(idCategoria, descricao);   
                    categorias.add(categoria); 
                    break;
                case 2:
                    System.out.println("Digite o ID do tutor");
                    int idTutor = scanner.nextInt();
                    System.out.println("Digite o nome do tutor");
                    String nome = scanner.next();
                    System.out.println("Digite o telefone do tutor");
                    String telefone = scanner.next();
                    System.out.println("Digite o e-mail do tutor");
                    String email = scanner.next();
                    Tutor tutor = new Tutor(idTutor, nome, telefone, email);
                    tutores.add(tutor);
                    break;
                case 3:
                    System.out.println("Digite o ID do animal");
                    int idAnimal = scanner.nextInt();
                    System.out.println("Digite o nome do animal");
                    String nomeAnimal = scanner.next();
                    System.out.println("Digite a raça do animal");
                    String raca = scanner.next();
                    System.out.println("Digite o peso do animal");
                    double peso = scanner.nextDouble();
                    System.out.println("Digite o ID do tutor do animal");
                    int idTutorAnimal = scanner.nextInt();
                    System.out.println("Digite o ID da categoria");
                    int idCategoriaAnimal = scanner.nextInt();
                    Animal animal = new Animal(idAnimal, nomeAnimal, raca, peso, idCategoriaAnimal, idTutorAnimal);
                    animais.add(animal); 
                    break;
                case 4:
                    System.out.println("Listagem de categorias:");
                    for (Categoria categoriaPrint : categorias) {
                        int qtdAnimais = 0;
                        for (Animal animalPrint : animais) {
                            if (animalPrint.idCategoria == categoriaPrint.idCategoria) {
                                qtdAnimais++;
                            }
                        }
                        System.out.println("Categoria: " +categoriaPrint.descricao+ " - Quantidade de Animais: " + qtdAnimais);
                    }
                    break;
                case 5:
                    System.out.println("Listagem de tutores:");
                for (Tutor tutorPrint : tutores) {
                    int qtdTutores = 0;
                    for (Animal animalPrint : animais) {
                        if (animalPrint.idTutor == tutorPrint.idTutor) {
                            qtdTutores++;
                        }
                    }
                    System.out.println("Tutor: " +tutorPrint.nome+ " - Quantidade de Animais: " + qtdTutores);
                }
                    break;
                case 6:
                    System.out.println("Listagem de animais:");
                    for (Animal animalPrint : animais) {
                        System.out.println(animalPrint.nomeAnimal);
                    
                }
                    
            }

        }while (opt !=7);
    
    }
}
