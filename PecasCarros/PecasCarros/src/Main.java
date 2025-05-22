//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Argo a1 = new Argo("Fiat","s4w6da","2013","Vermelho","98.000",
                "2541d5as1d2","Argo");
        System.out.println("Info: " + a1.getChassi());
        a1.acessorios();
        Carros.ligar();
        Carros.trancarPortas();
        a1.motor();
        Carros.ligarFarol();
        Carros.acelerar();
        a1.rodas();

        Corolla c1 = new Corolla("Toyota","sad54s","2008","prata","59.000",
                "65asd655sa22","Xei");
        System.out.println("Info: " +c1.getPlaca());
        c1.acessorios();
        c1.cambio();
        Carros.acelerar();
        c1.rodas();
        c1.fecharPortaLuvas();

        Gol g1 = new Gol("Volkswagen","foai7","2015","Azul","46.000",
                "4w65da6s55sad2","Gol");
        System.out.println("Info: " +g1.getCor());
        g1.abrirCapo();
        g1.fecharCapo();
        g1.abrirPorta();
        Carros.ligarFarol();

        Palio p1 = new Palio("Fiat", "5ss54","2011","Branco", "83.000",
                "5w4d5ad4ss2","Palio");
        System.out.println("Info: " +p1.getFabricante());
        Carros.frear();
        Carros.puxarFreiodeMao();
        Carros.trancarPortas();
        p1.abrirPortaMalas();

        Toro t1 = new Toro("Fiat", "dda9s0","2018","Preto","160.000",
                "9as8dua98w8sad9","Toro");
        System.out.println("Info: " +t1.getAnoFabricacao());
        t1.acessorios();
        t1.fecharPortaLuvas();
        Carros.ligar();
        Carros.acelerar();

        Uno u1 = new Uno("Fiat", "sad8u","2014","Amarelo","76.600",
                "f8f7ga9sd8h","Uno");
        System.out.println("Info: " +u1.getPreco());
        u1.cambio();
        Carros.qntdeCombustivel();

        X6 x6P = new X6("BMW","d5wa3","2022","Preto","880.950",
                "8h9d9fd0df9g","X6");
        System.out.println("Info: " +x6P.getPreco());
        x6P.abrirPorta();
        Carros.ligar();
        Carros.acelerar();
        x6P.rodas();
        Carros.ligarFarol();
    }
}