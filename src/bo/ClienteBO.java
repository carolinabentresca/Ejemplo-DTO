package bo;

import vo.ClienteVO;
import java.util.*;

public class ClienteBO {

    List<ClienteVO> clientes;

    //Insertamos Clientes
    public ClienteBO() {
        clientes = new ArrayList();
        ClienteVO cliente1 = new ClienteVO(100, "Mery", "Shelldon", "MeryS@gmail.com");
        ClienteVO cliente2 = new ClienteVO(101, "Pablo", "Lescano", "PabloL@gmail.com");
        ClienteVO cliente3 = new ClienteVO(102, "Carito", "King", "CaritoKing@gmail.com");
        ClienteVO cliente4 = new ClienteVO(103, "Sofia", "Pachita", "SofiaPachita@gmail.com");
        ClienteVO cliente5 = new ClienteVO(104, "Eliana", "Fernandez", "ElianaELY@gmail.com");
        ClienteVO cliente6 = new ClienteVO(105, "Marcos", "Benites", "MarcosB@gmail.com");
        ClienteVO cliente7 = new ClienteVO(106, "Federico", "Reyez", "FedericoR@gmail.com");
        ClienteVO cliente8 = new ClienteVO(107, "Romina", "Fort", "RominaFort@gmail.com");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
        clientes.add(cliente8);
    
    }

    //Obtener una Lista de Clientes
    public List<ClienteVO> obtenerClientes() {
        return clientes;
    }
}
