package dto;

import bo.ClienteBO;

public class DTO {

    public static void main(String[] args) {
        //Instanciamos la clase ClienteBO
        ClienteBO clienteBusinessObject = new ClienteBO();
        //Mostramos por pantalla una Lista de Clientes
        clienteBusinessObject.obtenerClientes().forEach(System.out::println);
    }

}
