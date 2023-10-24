package _p115_Telefono;

public class Telefono implements Gps, Radio, Conecta {

    @Override
    public void obtenerCordenadas() {
        System.out.println("obteniendo coordenadas del satelite mas cercano");
        
    }

    @Override
    public void detenerRadio() {
        System.out.println("detener radio");
        
    }

    @Override
    public void iniciarRadio() {
        System.out.println("iniciando radio...");
        
    }

    @Override
    public void bluethoot() {
        System.out.println("conectando el bluethoot v3... cuidado con quien compartes");
        
    }

    @Override
    public void wifi() {
        System.out.println("conectando el wifi al canal 5 ghz si no ma paso al de 2.4 ghz");
        
    }
    
}
