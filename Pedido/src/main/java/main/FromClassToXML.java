/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import edu.furb.pedido.Cliente;
import edu.furb.pedido.Item;
import edu.furb.pedido.Itens;
import edu.furb.pedido.ObjectFactory;
import edu.furb.pedido.Pedido;
import edu.furb.pedido.Pedidos;
import edu.furb.pedido.Produto;
import java.io.File;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author joao / joao
 */
public class FromClassToXML {
    
    static final Logger log = Logger.getLogger(FromClassToXML.class.getName());    
    
    public static void main(String[] args) {
        try {           
            Pedidos pedidos = new Pedidos();
            /* Pedido 1 */
            Cliente cliente = getCliente(BigInteger.ONE, "Jhony");
            Pedido pedido1 = getPedido(cliente, BigInteger.ONE);
            
            Produto produto = getProduto(BigInteger.TEN, "Poderoso Picanha");
            Item item = getItem(20, BigInteger.ONE, produto);
            pedido1.getItens().getItem().add(item);                                  
                        
            pedidos.getPedido().add(pedido1);          
            
            JAXBContext context = JAXBContext.newInstance("edu.furb.pedido");
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            JAXBElement<Pedidos> element = new ObjectFactory().createPedidos(pedidos);
            String nomeArquivo = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
            nomeArquivo += ".xml";
            mar.marshal(element, new File(nomeArquivo));
        } catch (JAXBException ex) {
           log.info(ex.getLocalizedMessage());
        }
    }          
    
    private static Pedido getPedido(Cliente cliente, BigInteger nroPedido) {        
        Pedido pedido1 = new Pedido();
        pedido1.setNumero(nroPedido);
        pedido1.setCliente(cliente);
        pedido1.setItens(new Itens());
        return pedido1;        
    }
    
    private static Cliente getCliente(BigInteger codigo, String nome) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(codigo);
            cliente.setNome(nome);
            return cliente;
    }
    
    private static Item getItem(float preco, BigInteger qtd, Produto produto) {
            Item item = new Item();
            item.setPreco(preco);
            item.setQtde(qtd);
            item.setProduto(produto);
            return item;
    }
    
    private static Produto getProduto(BigInteger codigo, String descricao) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setDescricao(descricao);        
        return produto;
    }
    
    
}
