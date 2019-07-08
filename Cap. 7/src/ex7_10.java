public class ex7_10 {
    public static void main(String[] args) {
        int base = 200;
        double rate = 1.09;
        int[] vendadinheiro = new int[801]; //para cada intervalo de vendas brutas (801 corresponde ao tamanho do intervalo fechado entre 200 e 1000)
        int[] salario = new int[801];  //salario em indice, calculado para cada venda bruta: salario[i] = base + rate*vendadinheiro[i]

        for (int i = 200; i <= 1000; i++) {
            vendadinheiro[i - 200] = i;
            salario[i - 200] = (int) Math.round(vendadinheiro[i - 200] * rate + base);
            System.out.printf("%nTotal em vendas:%d  ->   Salário:%d", i, salario[i - 200]);
        }


    }
}