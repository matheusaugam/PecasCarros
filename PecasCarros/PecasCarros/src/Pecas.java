import java.util.Scanner;

public class Pecas {

    public void rodas(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();

        switch (modelo){
            case "Gol":
                System.out.println("Roda gol g7 aro 15 Krmai R74");
                System.out.println("roda girando");
                break;
            case "Palio":
                System.out.println("Jogo Roda KR R17 Fiat New Palio Aro 14");
                System.out.println("roda girando");
            break;
            case "Corolla":
                System.out.println("Jogo Roda KR R89 Toyota Corolla Aro 16");
                System.out.println("roda girando");
            break;
            case "Saveiro":
                System.out.println("Jogo Rodas Esportivas Aro 15 Krmai S48 VW ");
                System.out.println("roda girando");
            break;
            case "Uno":
                System.out.println("Jogo Roda KR R60 Fiat Novo Uno Sporting Aro 14");
                System.out.println("roda girando");
            break;
            case "Toro":
                System.out.println("Jogo Roda KR R73 Fiat Toro Aro 17");
                System.out.println("roda girando");
            break;
            case "X6":
                System.out.println("Jogo Roda BMW X6 M Aro 18");
                System.out.println("roda girando");
            break;
            case "Argo":
                System.out.println("KR R92 MODELO FIAT ARGO HGT / ARO 15X6");
                System.out.println("roda girando");
            break;
            default:
                System.out.println("Nenhum carro selecionado");
        }
    }
    public void motor(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();

        switch (modelo){
            case "Gol":
                System.out.println("Motor 1.0 3 cilindros");
                break;
            case "Palio":
                System.out.println("Motor novo Fiat 1.6 16V ETORQ ");
            case "Corolla":
                System.out.println("Motor Toyota Corolla 2.0 Flex 154 Cv 2019 ");
                break;
            case "Saveiro":
                System.out.println("motor VW Saveiro 1.6 16v 2023");
                break;
            case "Uno":
                System.out.println(" 1.3 de 4 cilindros e 101/109 cv");
                break;
            case "Toro":
                System.out.println("motor Tigershark 2.4 de 186 cv ");
                break;
            case "X6":
                System.out.println("Motor Bmw X6 3.0 24v Xdrive 35i ");
                break;
            case "Argo":
                System.out.println("Motor Fiat Argo Drive 1.0 77CV flex Fireflay 2020");
            default:
                System.out.println("Opção inválida");
        }
    }
    public void acessorios(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        System.out.println("Acessórios disponíveis: \n1. tapete 2. Capa para banco 3.Difusor de ar 4.Suporte para celular");
        System.out.println("Digite a opção de acessório desejada: ");
        String num = ler.nextLine();
        switch (modelo){
            case "Gol", "Saveiro", "Argo", "Corolla","Palio","Toro", "Uno","X6":
                switch (num){ //menu de seleção dos acessórios disponíveis em determinado modelo
                    case "1":
                        System.out.println("Tapete selecionado!!");
                    break;
                    case "2":
                        System.out.println("Capa para banco selecionado!!");
                    break;
                    case "3":
                        System.out.println("Difusor de ar selecionado!!");
                        break;
                    case "4":
                        System.out.println("Suporte para celular selecionado!!");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                break;
        }
    }
    public void cambio(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol", "Palio","Saveiro","Uno":
                System.out.println("Manual");
                break;
            case "Argo","Corolla","Toro","X6":
                System.out.println("Automático");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public void abrirPortaMalas(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta malas do Gol foi aberto");
                break;
            case "Palio":
                System.out.println("Porta malas do Palio foi aberto");
            case "Corolla":
                System.out.println("Porta malas do Corolla foi aberto");
                break;
            case "Saveiro":
                System.out.println("Porta malas do Saveiro foi aberto");
                break;
            case "Uno":
                System.out.println("Porta malas do Uno foi aberto");
                break;
            case "Toro":
                System.out.println("Porta malas do Toro foi aberto");
                break;
            case "X6":
                System.out.println("Porta malas do X6 foi aberto");
                break;
            case "Argo":
                System.out.println("Porta malas do Argo foi aberto");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public void fecharPortaMalas(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta malas do Gol foi fechado");
                break;
            case "Palio":
                System.out.println("Porta malas do Palio foi fechado");
            case "Corolla":
                System.out.println("Porta malas do Corolla foi fechado");
                break;
            case "Saveiro":
                System.out.println("Porta malas do Saveiro foi fechado");
                break;
            case "Uno":
                System.out.println("Porta malas do Uno foi fechado");
                break;
            case "Toro":
                System.out.println("Porta malas do Toro foi fechado");
                break;
            case "X6":
                System.out.println("Porta malas do X6 foi fechado");
                break;
            case "Argo":
                System.out.println("Porta malas do Argo foi fechado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void abrirCapo(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Capô do Gol foi aberto");
                break;
            case "Palio":
                System.out.println("Capô do Palio foi aberto");
            case "Corolla":
                System.out.println("Capô do Corolla foi aberto");
                break;
            case "Saveiro":
                System.out.println("Capô do Saveiro foi aberto");
                break;
            case "Uno":
                System.out.println("Capô do Uno foi aberto");
                break;
            case "Toro":
                System.out.println("Capô do Toro foi aberto");
                break;
            case "X6":
                System.out.println("Capô do X6 foi aberto");
                break;
            case "Argo":
                System.out.println("Capô do Argo foi aberto");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void fecharCapo(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Capô do Gol foi fechado");
                break;
            case "Palio":
                System.out.println("Capô do Palio foi fechado");
            case "Corolla":
                System.out.println("Capô do Corolla foi fechado");
                break;
            case "Saveiro":
                System.out.println("Capô do Saveiro foi fechado");
                break;
            case "Uno":
                System.out.println("Capô do Uno foi fechado");
                break;
            case "Toro":
                System.out.println("Capô do Toro foi fechado");
                break;
            case "X6":
                System.out.println("Capô do X6 foi fechado");
                break;
            case "Argo":
                System.out.println("Capô do Argo foi fechado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void abrirPorta(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta do Gol foi aberta");
                break;
            case "Palio":
                System.out.println("Porta do Palio foi aberta");
            case "Corolla":
                System.out.println("Porta do Corolla foi aberta");
                break;
            case "Saveiro":
                System.out.println("Porta do Saveiro foi aberta");
                break;
            case "Uno":
                System.out.println("Porta do Uno foi aberta");
                break;
            case "Toro":
                System.out.println("Porta do Toro foi aberta");
                break;
            case "X6":
                System.out.println("Porta do X6 foi aberta");
                break;
            case "Argo":
                System.out.println("Porta do Argo foi aberta");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void fecharPorta(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta do Gol foi fechada");
                break;
            case "Palio":
                System.out.println("Porta do Palio foi fechada");
            case "Corolla":
                System.out.println("Porta do Corolla foi fechada");
                break;
            case "Saveiro":
                System.out.println("Porta do Saveiro foi fechada");
                break;
            case "Uno":
                System.out.println("Porta do Uno foi fechada");
                break;
            case "Toro":
                System.out.println("Porta do Toro foi fechada");
                break;
            case "X6":
                System.out.println("Porta do X6 foi fechada");
                break;
            case "Argo":
                System.out.println("Porta do Argo foi fechada");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void abrirPortaLuvas(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta luvas do Gol foi aberto");
                break;
            case "Palio":
                System.out.println("Porta luvas do Palio foi aberta");
            case "Corolla":
                System.out.println("Porta luvas do Corolla foi aberta");
                break;
            case "Saveiro":
                System.out.println("Porta luvas do Saveiro foi aberta");
                break;
            case "Uno":
                System.out.println("Porta luvas do Uno foi aberta");
                break;
            case "Toro":
                System.out.println(" Porta luvas do Toro foi aberta");
                break;
            case "X6":
                System.out.println(" Porta luvas do X6 foi aberta");
                break;
            case "Argo":
                System.out.println(" Porta luvas do Argo foi aberta");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void fecharPortaLuvas(){
        Scanner ler = new Scanner(System.in);
        System.out.println ("Digite o modelo do carro: ");
        String modelo = ler.nextLine();
        switch (modelo){
            case "Gol":
                System.out.println("Porta luvas do Gol foi aberta");
                break;
            case "Palio":
                System.out.println(" Porta luvas do Palio foi aberta");
            case "Corolla":
                System.out.println(" Porta luvas do Corolla foi aberta");
                break;
            case "Saveiro":
                System.out.println(" Porta luvas do Saveiro foi aberta");
                break;
            case "Uno":
                System.out.println( "Porta luvas do Uno foi aberta");
                break;
            case "Toro":
                System.out.println( "Porta luvas do Toro foi aberta");
                break;
            case "X6":
                System.out.println(" Porta luvas do X6 foi aberta");
                break;
            case "Argo":
                System.out.println(" Porta luvas do Argo foi aberta");
                break;
            default:
                System.out.println("Opção inválida"); //argo
        }
    }
}
