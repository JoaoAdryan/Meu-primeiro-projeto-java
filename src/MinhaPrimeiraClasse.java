public class MinhaPrimeiraClasse {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String primeiroNome = "joao";
        String segundoNome = "adryan";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

       
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){

        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
