
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Loja {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        List<Pedido> clientos = new ArrayList<>();
        Pedido pedido = new Pedido();
        int Escolha=0;
        System.out.println("   -   Skina Lanches  - ");
        try{
                do{
                    System.out.printf("\n");
                    System.out.println("---  ---  ---  ---  ---  ---");  
                    System.out.println(" -- Pedidos  de Clientes --");
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.println(" 1 - Cadastar Cliente");
                    System.out.println(" 2 - Buscar Cliente");
                    System.out.println(" 3 - Atualizar Cliente");
                    System.out.println(" 4 - Remover Cliente");
                    System.out.println(" 5 - Solicitar Pedido");
                    System.out.println(" 6 - Buscar Pedido");
                    System.out.println(" 7 - Remover Item");
                    System.out.println(" 8 - Alterar Item");
                    System.out.println(" 9 - Finalizar Pedido");
                    System.out.println(" 0 - Sair");
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.print("Opcao: ");
                    Escolha = teclado.nextInt();
                      switch(Escolha){
                          case 1:
                              pedido.inserirCliente(pedido.Cliente);
                              break;
                          case 2:             
                              pedido.buscarPorCliente();
                              break;
                          case 3:
                              pedido.atualizarCliente();
                              break;
                          case 4:
                              pedido.removerPorCliente();
                              break;
                          case 5:
                              pedido.listaPedidos();
                              break;
                          case 6:
                              pedido.buscarPorItem();
                              break;
                          case 7:
                              pedido.removerPorItem();
                              break;
                          case 8:
                              pedido.atualizarPorItem();
                              break;
                          case 9:
                              pedido.finalizarPedido();
                              break;
                          case 0:
                              System.out.println("---  ---  ---  ---  ---  ---");
                              System.out.println("\nPrograma Finalizado com Sucesso!\n");
                              break;
                          default:
                              System.out.println("---  ---  ---  ---  ---  ---");
                              System.out.println("\nEntrada Invalida! Tente Novamente.");
                        }
                }while(Escolha!=0);
            }catch(Exception ex){  
                    teclado.nextLine();
                    System.out.println("\nEntrada Invalida! Entre com um número . (Última tentativa)");
                   do{
                    System.out.printf("\n");
                    System.out.println("---  ---  ---  ---  ---  ---");  
                    System.out.println(" -- Pedidos  de Clientes --");
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.println(" 1 - Cadastar Cliente");
                    System.out.println(" 2 - Buscar Cliente");
                    System.out.println(" 3 - Atualizar Cliente");
                    System.out.println(" 4 - Remover Cliente");
                    System.out.println(" 5 - Solicitar Pedido");
                    System.out.println(" 6 - Buscar Pedido");
                    System.out.println(" 7 - Remover Item");
                    System.out.println(" 8 - Alterar Item");
                    System.out.println(" 9 - Finalizar Pedido");
                    System.out.println(" 0 - Sair");
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.print("Opcao: ");
                    Escolha = teclado.nextInt();
                      switch(Escolha){
                          case 1:
                              pedido.inserirCliente(pedido.Cliente);
                              break;
                          case 2:             
                              pedido.buscarPorCliente();
                              break;
                          case 3:
                              pedido.atualizarCliente();
                              break;
                          case 4:
                              pedido.removerPorCliente();
                              break;
                          case 5:
                              pedido.listaPedidos();
                              break;
                          case 6:
                              pedido.buscarPorItem();
                              break;
                          case 7:
                              pedido.removerPorItem();
                              break;
                          case 8:
                              pedido.atualizarPorItem();
                              break;
                          case 9:
                              pedido.finalizarPedido();
                              break;
                          case 0:
                              System.out.println("---  ---  ---  ---  ---  ---");
                              System.out.println("\nPrograma Finalizado com Sucesso!\n");
                              break;
                          default:
                              System.out.println("---  ---  ---  ---  ---  ---");
                              System.out.println("\nEntrada Invalida! Tente Novamente.");
                        }
                }while(Escolha!=0);
            }finally{       
                System.exit(0);          
            }          
        }    
}
 

