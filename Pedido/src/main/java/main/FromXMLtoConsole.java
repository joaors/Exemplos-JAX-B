/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import edu.furb.pedido.Item;
import edu.furb.pedido.Pedido;
import edu.furb.pedido.Pedidos;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author joao / joao
 */
public class FromXMLtoConsole {
    
    public static void main(String[] args) {
        try {           
            JAXBContext context = JAXBContext.newInstance("edu.furb.pedido");
            
            Unmarshaller umn = context.createUnmarshaller();
            File file = new File("pedidosEDI_tst2.xml");
            JAXBElement<Pedidos> element = (JAXBElement<Pedidos>) umn.unmarshal(file);
            Pedidos pedidos = element.getValue();
            for(Pedido pedido: pedidos.getPedido()) {
                System.out.println("---------------------------");                
                System.out.println("Nro Pedido: "+pedido.getNumero());
                System.out.println("Cliente: "+pedido.getCliente().getNome());
                System.out.println("---------------------------");
                System.out.println("Itens:");
                System.out.println("---------------------------");
                for (Item item : pedido.getItens().getItem()) {
                    System.out.println("Produto: "+item.getProduto().getDescricao());
                    System.out.println("Qtd: "+item.getQtde());
                    System.out.println("Preço: "+item.getPreco());
                    System.out.println("-------");
                }
                System.out.println("\n");                
            }
        } catch (JAXBException ex) {
           System.out.println(ex.getMessage());
        }

    }
    
}
