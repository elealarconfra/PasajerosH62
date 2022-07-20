
public class Bus extends Vehiculo
{
    private int numPuestos;
    private String tipo;
    private int numInterno;
    
    public Bus()
    {
           
    }
    
    public Bus(int numPuestos, String placa, String tipo, int numInterno)
    {
        this.numPuestos = numPuestos;
        this.tipo = tipo;
        this.numInterno = numInterno;
    }

    public int getNumPuestos()
    {
        return this.numPuestos;
    }
    
    public void setNumPuestos(int numPuestos)
    {
        this.numPuestos = numPuestos;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public int getNumInterno()
    {
        return this.numInterno;
    }
    
    public void setNumInterno(int numInterno)
    {
        this.numInterno = numInterno;
    }

    public String getNombreEmpresa()
    {
        return "Brasilia";
    }
    
}