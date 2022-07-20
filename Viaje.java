import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Viaje
{
    private String origen;
    private String destino;
    private GregorianCalendar horaSalida;
    private GregorianCalendar horaLlegada;
    private ArrayList<Pasajero>listaPasajeros;
    private int capacidad;
    private int cont;
    private Bus bus;
    private Buseta buseta;
    
    public Viaje()
    {
        
    }
    
    public Viaje(String origen, String destino, GregorianCalendar horaSalida, GregorianCalendar horaLlegada, int capacidad)
    {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.capacidad = capacidad;
        this.listaPasajeros = new ArrayList<Pasajero>();
        this.cont = 0;
        buseta =  new Buseta();
    }

    
    public String getOrigen()
    {
        return this.origen;
    }

    
    public void setOrigen(String origen)
    {
        this.origen = origen;
    }
    
  
    public String getDestino()
    {
        return this.destino;
    }
    
    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    
    public GregorianCalendar getHoraSalida()
    {
        return this.horaSalida;
    }
    
    
    public void setHoraSalida(GregorianCalendar horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    public GregorianCalendar getHoraLlegada()
    {
        return this.horaLlegada;
    }

    public void setHoraLlegada(GregorianCalendar horaLlegada)
    {
        this.horaLlegada = horaLlegada;
    }
  
    public Bus getBus()
    {
        return this.bus;
    }

    public void setBus(Bus bus)
    {
        this.bus = bus;
    }
    
    public ArrayList<Pasajero> getListaPasajeros()
    {
        return this.listaPasajeros;
    }
    
    public void anadirPasajero(Pasajero p)
    {
        this.listaPasajeros.add(p);
    }
    
    public String buscarPasajeros(String busqueda)
    {
        String resultado = "";
        
        for (Pasajero p : this.listaPasajeros)
        {
            if(p.getNombre().equals(busqueda) || p.getApellido().equals(busqueda) || (p.getNumDocumento()+"").equals(busqueda))
            {
                resultado = resultado + p.toString()+"\n";
            }
        } 
        return resultado;
    }
    
    public int getCont()
    {
        return this.cont;
    }
    
    public String toString()
    {
        SimpleDateFormat formato = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        String mensaje = "Origen: "+ this.origen+"\n"+
                        "Destino: "+ this.destino+"\n"+
                        "Salida: "+ formato.format(this.horaSalida.getTime())+"\n"+
                        "Llegada: "+formato.format(this.horaLlegada.getTime())+"\n";
        return mensaje;
    }



}//End class