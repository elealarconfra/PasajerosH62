
public class Bus
{
    private int numPuestos;
    private String placa;
    private String tipo;
    private int numInterno;
    
    public Bus()
    {
           
    }
    
    public Bus(int numPuestos, String placa, String tipo, int numInterno)
    {
        this.numPuestos = numPuestos;
        this.placa = placa;
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
    
    public String getPlaca()
    {
        return this.placa;
    }

    
    public void setPlaca(String placa)
    {
        this.placa = placa;
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




}