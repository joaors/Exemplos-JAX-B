//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.03.31 às 02:02:20 PM BRT 
//


package edu.furb.pedido;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.furb.pedido package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cliente_QNAME = new QName("", "cliente");
    private final static QName _Item_QNAME = new QName("", "item");
    private final static QName _Itens_QNAME = new QName("", "itens");
    private final static QName _Produto_QNAME = new QName("", "produto");
    private final static QName _Pedido_QNAME = new QName("", "pedido");
    private final static QName _Pedidos_QNAME = new QName("", "pedidos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.furb.pedido
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Itens }
     * 
     */
    public Itens createItens() {
        return new Itens();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Pedidos }
     * 
     */
    public Pedidos createPedidos() {
        return new Pedidos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "itens")
    public JAXBElement<Itens> createItens(Itens value) {
        return new JAXBElement<Itens>(_Itens_QNAME, Itens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "produto")
    public JAXBElement<Produto> createProduto(Produto value) {
        return new JAXBElement<Produto>(_Produto_QNAME, Produto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pedido")
    public JAXBElement<Pedido> createPedido(Pedido value) {
        return new JAXBElement<Pedido>(_Pedido_QNAME, Pedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pedidos")
    public JAXBElement<Pedidos> createPedidos(Pedidos value) {
        return new JAXBElement<Pedidos>(_Pedidos_QNAME, Pedidos.class, null, value);
    }

}
