public class Commodities {
    public static void main(String[] args) {
        
        String produto[] = new String[5];
        produto[0] = "Sacos de grãos de soja (60 kg)";
        produto[1] = "Arrobas de boi gordo (15 kg)";
        produto[2] = "Sacos de açúcar cristal (50 kg)";
        produto[3] = "Saca de café (60 kg)";
        produto[4] = "Algodão (15 kg)";

        double valor[] = new double[5];
        valor[0] = 163.85;
        valor[1] = 127.54;
        valor[2] = 143.00;
        valor[3] = 1220.00;
        valor[4] = 236.04;

        for (int index = 0; index < produto.length; index++) {
            System.out.println("O " +produto[index]+ " custa R$"+valor[index]);
            
        }
    }
}