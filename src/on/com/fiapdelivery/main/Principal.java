package on.com.fiapdelivery.main;

import on.com.fiapdelivery.model.Caminhao;
import on.com.fiapdelivery.model.Moto;
import on.com.fiapdelivery.model.Pacote;
import on.com.fiapdelivery.model.Rota;

public class Principal {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 500.0, 3);
        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
        
        Rota rota1 = new Rota(pacote1, caminhao);
        rota1.iniciarRota();

        Moto moto = new Moto("XYZ9876", 50.0, true);
        Pacote pacote2 = new Pacote("BR888", 2.0, "Pendente");
        
        Rota rota2 = new Rota(pacote2, moto);
        rota2.iniciarRota();
        
        pacote1.atualizarStatus("Em trânsito");
    }
}