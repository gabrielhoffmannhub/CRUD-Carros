class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String tipo;
    private double valor;

    public Carro(int id, String marca, String modelo, int ano, String placa, String tipo, double valor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
    }
    public int getId() {return id;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getAno() {return ano;}
    public String getPlaca() {return placa;}
    public String getTipo() {return tipo;}
    public double getValor() {return valor;}

    public void setId(int id) {this.id = id;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setAno(int ano) {this.ano = ano;}
    public void setPlaca(String placa) {this.placa = placa;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setValor(double valor) {this.valor = valor;}

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
}