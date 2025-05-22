public class Palio extends Pecas{
    private String fabricante;
    private String placa;
    private String anoFabricacao;
    private String cor;
    private String preco;
    private String chassi;
    private String modelo;

    public Palio(String fabricante, String placa, String anoFabricacao, String cor, String preco, String chassi, String modelo) {
        this.fabricante = fabricante;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.preco = preco;
        this.chassi = chassi;
        this.modelo = modelo;
    }

    @Override
    public void rodas() {
        super.rodas();
    }

    @Override
    public void motor() {
        super.motor();
    }

    @Override
    public void acessorios() {
        super.acessorios();
    }

    @Override
    public void cambio() {
        super.cambio();
    }

    @Override
    public void abrirPortaMalas() {
        super.abrirPortaMalas();
    }

    @Override
    public void fecharPortaMalas() {
        super.fecharPortaMalas();
    }

    @Override
    public void abrirCapo() {
        super.abrirCapo();
    }

    @Override
    public void fecharCapo() {
        super.fecharCapo();
    }

    @Override
    public void abrirPorta() {
        super.abrirPorta();
    }

    @Override
    public void fecharPorta() {
        super.fecharPorta();
    }

    @Override
    public void abrirPortaLuvas() {
        super.abrirPortaLuvas();
    }

    @Override
    public void fecharPortaLuvas() {
        super.fecharPortaLuvas();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
