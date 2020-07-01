

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    Scanner teclado = new Scanner(System.in);
    Cliente Cliente = new Cliente();
    ItemPedido item = new ItemPedido();
    List<Cliente> listclientes;
    List<ItemPedido> listpedido;
    private int opcao;
    private String nome;
    private int pedidoID;
    private String dataEmissao;
    private float valorTotal;
    private int quantidade=0;
    private int continuar;
    private float totalValor;
    private int ver=1;
 
    public Pedido(){
        listclientes = new ArrayList<>();
        listpedido = new ArrayList<>();
    }
    public void buscarPorCliente(){
        if(!listclientes.isEmpty()){
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nID - "+1);
            System.out.println("Nome: "+ listclientes.get(0).getNome());
            System.out.println("Email: "+ listclientes.get(0).getEmail());
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");    
        }
    }
    public void removerPorCliente(){
        if(!listclientes.isEmpty()){
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\n       Cliente:");
            System.out.println("\nID - "+listclientes.get(0).getClienteID());
            System.out.println("Nome: "+ listclientes.get(0).getNome());
            System.out.println("Email: "+ listclientes.get(0).getEmail());
            System.out.println("\nRemovido com Sucesso!");
            listclientes.remove(0);
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");
        }
    }
    public void atualizarCliente(){
        if(!listclientes.isEmpty()){         
                System.out.println("---  ---  ---  ---  ---  ---");
                System.out.println("    1-Atualizar nome");
                System.out.println("    2-Atualizar email");
                System.out.println("---  ---  ---  ---  ---  ---");
            do{
                System.out.print("Opcao: ");
                opcao = teclado.nextInt();               
                switch(opcao){
                    case 1:
                        System.out.println("---  ---  ---  ---  ---  ---");
                        System.out.print("\nQual novo nome? ");
                        listclientes.get(0).setNome(teclado.next());
                        System.out.println("\nAlteração Realizada com Sucesso! ");
                        break;
                    case 2:
                        System.out.println("---  ---  ---  ---  ---  ---");
                        System.out.print("\nQual novo email? ");
                        listclientes.get(0).setEmail(teclado.next());
                        System.out.println("\nAlteração Realizada com Sucesso! ");
                        break;
                    default:
                        System.out.println("\nEntrada Invalida! Escolha uma das opcoes na Tela. \n");
                }
            }while(opcao<1 || opcao>=3);
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");        
        }
    }
    public void inserirCliente(Cliente c){
        if(listclientes.isEmpty()){
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nSeu ID - "+1);
            c.setClienteID(1);
            System.out.print("Qual o seu nome: ");
            c.setNome(teclado.next());
            System.out.print("Qual o seu Email: ");
            c.setEmail(teclado.next());
            listclientes.add(c);
            System.out.println("\nCadastro Realizado com Sucesso! ");
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nUsuario ja Cadastrado! ");
        }
    }
    public void buscarPorItem(){
        if(!listclientes.isEmpty()){
            if(!listpedido.isEmpty()){
                System.out.println("---  ---  ---  ---  ---  ---");
     
                System.out.println("\n      - Pedidos - ");
                for(int i=0;i<listpedido.size();i++){
                    System.out.println("\nID - "+listpedido.get(i).getItemPedidoID());
                    System.out.println("Item: "+ listpedido.get(i).getItem());
                    System.out.println("Quantidade: "+ listpedido.get(i).getQuantidade());
                    System.out.println("Preço[Un]: "+listpedido.get(i).getPrecoUnitario());
                }
            }else{
                System.out.println("\nNao existe Pedido para ser Visualizado! Tente novamente.");
            }
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");    
        }
    }
    public void removerPorItem(){
        if(!listclientes.isEmpty()){
            System.out.println("---  ---  ---  ---  ---  ---");
            if(!listpedido.isEmpty()){
                System.out.print("ID do Pedido: ");
                pedidoID = teclado.nextInt();
                for(int i=0;i<listpedido.size();i++){
                    if(listpedido.get(i).getItemPedidoID()==pedidoID){
                        System.out.println("---  ---  ---  ---  ---  ---");
                        System.out.println("\n       Pedido:");
                        System.out.println("\nID - "+listpedido.get(i).getItemPedidoID());
                        System.out.println("Item: "+ listpedido.get(i).getItem());
                        System.out.println("Quantidade: "+ listpedido.get(i).getQuantidade());
                        System.out.println("Preço[Un]: "+listpedido.get(i).getPrecoUnitario());
                        System.out.println("\nRemovido com Sucesso!");
                        listpedido.remove(i);
                    }
                }        
            }else{
                System.out.println("\nNao existe Pedido para ser Removido! Tente novamente.");
            }
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");
        }
    }
    public void atualizarPorItem(){
        if(!listclientes.isEmpty()){         
                System.out.println("---  ---  ---  ---  ---  ---");
                if(!listpedido.isEmpty()){
                    System.out.print("\nQual ID do Pedido: ");
                    pedidoID = teclado.nextInt(); 
                    for(int i=0;i<listpedido.size();i++){
                        if(listpedido.get(i).getItemPedidoID()==pedidoID){
                            System.out.println("\n       Pedido:");
                            System.out.println("\nID - "+listpedido.get(i).getItemPedidoID());
                            System.out.println("Item: "+ listpedido.get(i).getItem());
                            System.out.println("Quantidade: "+ listpedido.get(i).getQuantidade());
                            System.out.println("Preço[Un]: "+listpedido.get(i).getPrecoUnitario());
                            System.out.println("\n---  ---  ---  ---  ---  ---");
                            System.out.println("Nova Quantidade: ");
                            listpedido.get(i).setQuantidade(teclado.nextInt());
                            System.out.println("\nQuantidade Alterada com Sucesso!");
                        }
                    }
                }else{
                    System.out.println("\nNao existe Pedido para ser Alterado! Tente novamente.");
                }
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");        
        }
    }
    public void inserirItemPedido(){
        if(!listclientes.isEmpty()){
            do{
                    ItemPedido item = new ItemPedido();
                    System.out.print("Opcao: ");
                    opcao = teclado.nextInt();
                    switch(opcao){      
                        case 1:
                            item.setItemPedidoID(1);
                            item.setItem("X-Burguer");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(10);
                            break;
                        case 2:            
                            item.setItemPedidoID(2);
                            item.setItem("X-Salada");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(12);
                            break;
                        case 3:
                            item.setItemPedidoID(3);
                            item.setItem("X-Tudo");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(15);
                            break;
                        case 4:
                            item.setItemPedidoID(4);
                            item.setItem("X-Bacon");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(12);
                            break;
                        case 5:
                            item.setItemPedidoID(5);
                            item.setItem("X-Bagunça");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(18);
                            break;
                        case 6:
                            item.setItemPedidoID(6);
                            item.setItem("HotDog");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(10);
                            break;
                        case 7:
                            item.setItemPedidoID(7);
                            item.setItem("Pizza");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(12.5F);
                            break;
                        case 8:
                            item.setItemPedidoID(8);
                            item.setItem("Coca-Cola 2L");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(7);
                            break;
                        case 9:
                            item.setItemPedidoID(9);
                            item.setItem("Coca-Cola Lata");
                            item.setQuantidade(quantidade);
                            item.setPrecoUnitario(3);
                            break;
                        case 0:
                            System.out.println("\nCardápio Finalizado!");
                            break;
                        default:       
                            System.out.println("\nEntrada Invalida! Tente Novamente.\n");                        
                    }
                    ver=1;
                    do{
                        if(opcao!=0){
                            System.out.print("Quantidade: ");
                            quantidade = teclado.nextInt();
                            item.setQuantidade(quantidade);
                            if(quantidade>0){
                                 listpedido.add(item);
                                 ver=0;
                            }else{
                                 System.out.println("\nQuantidade Invalida! Quantidade Minima é 1.\n");
                            }
                        }else{
                            ver = 0;
                        }
                    }while(ver!=0);
            }while(opcao<0||opcao>9); 
                if(opcao!=0){    
                    do{
                        System.out.print("\nDeseja Continuar o Pedido? [1-Sim/2-Nao]: ");
                        continuar = teclado.nextInt();
                        if(continuar!=1&&continuar!=2){
                            System.out.println("\nEntrada Invalida! Escolha 1-Sim ou 2-Nao.\n");
                        }                         
                    }while(continuar!=1&&continuar!=2);
                    if(continuar==1)listaPedidos(); 
                }                     
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");
        }
    }
    public void listaPedidos(){
        if(!listclientes.isEmpty()){
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\n     -- Cardápio --");
            System.out.println("\n 1 - [R$10,00] X-Burguer");
            System.out.println(" 2 - [R$12,00] X-Salada");
            System.out.println(" 3 - [R$15,00] X-Tudo");
            System.out.println(" 4 - [R$12,00] X-Bacon");
            System.out.println(" 5 - [R$18,00] X-Bagunça");
            System.out.println(" 6 - [R$10,00] HotDog");
            System.out.println(" 7 - [R$12,50] Pizza");
            System.out.println(" 8 - [R$7,00] Coca-Cola 2L");
            System.out.println(" 9 - [R$3,00] Coca-Cola Lata");
            System.out.println(" 0 - Sair");
            System.out.println("\n---  ---  ---  ---  ---  ---");
            System.out.println("  - Pedido Mínimo[R$20,00] -");
            System.out.println("---  ---  ---  ---  ---  ---");
            inserirItemPedido();
        }else{
            System.out.println("---  ---  ---  ---  ---  ---");
            System.out.println("\nOperação nao Realizada! Nao existe Clientes Cadastrados.");
            
        }
    }
    public void finalizarPedido(){
        if(!listclientes.isEmpty()){
            if(!listpedido.isEmpty()){ 
                totalValor=0;
                for(int i=0;i<listpedido.size();i++){
                     totalValor+=(listpedido.get(i).getPrecoUnitario()) * (listpedido.get(i).getQuantidade());       
                }
                if(totalValor>=20){
                    buscarPorItem();
                    System.out.println("\n");
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.println(" Valor Total [R$]: "+totalValor);
                    System.exit(0);
                }else{
                    System.out.println("---  ---  ---  ---  ---  ---");
                    System.out.println(" Valor Minimo para compra é R$20,00! ");                
                }
                
            }else{
                System.out.println("\nNao Existe Pedido Feito para ser Finalizado!");
            }
        }else{
            System.out.println("\nNao Existe Cliente Cadastrado! Tente Novamente.");
        }
        
       
    }
    public int getPedidoID() {
        return pedidoID;
    }
    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
    }
    public String getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }  
}
