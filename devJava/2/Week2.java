public class Week2 {
        public static void main(String[] args) {
//---------------------------------------------- exercicio 1 ----------------------------    

// criar objetos
        Pessoa joao = new Pessoa();
        Pessoa jose = new Pessoa();
        Pessoa jobias = new Pessoa();

// definir idade com setters
        joao.setIdade(21);
        jose.setIdade(22);
        jobias.setIdade(33);

//print exibindo os valores anteriores para confirmar que deu certo
        System.out.printf("joão tem %d anos, josé tem %d anos, e jobias tem %d anos.%n", joao.getIdade(),jose.getIdade(),jobias.getIdade());

// if else if else para escolher qual é o maior
        if ( joao.getIdade() > jose.getIdade() && joao.getIdade() > jobias.getIdade()){
            System.out.println("joão é o mais velho.");
        }else if ( jose.getIdade() > joao.getIdade() && jose.getIdade() > jobias.getIdade()){
            System.out.println("josé é o mais velho.");
        }else if( jobias.getIdade() > jose.getIdade() && jobias.getIdade() > joao.getIdade()){
            System.out.println("jobias é o mais velho.");
        }

//------------------------------------ exercicio 2 ---------------------------------------------

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

//setcor porque eu queria ter um carro azul + setmarca e setano inicial
        meuCarro.setCor("azul");
        seuCarro.setCor("preto");
        meuCarro.setMarca("fiat");
        seuCarro.setMarca("ford");
        meuCarro.setAno(2020);
        seuCarro.setAno(2022);

// printformat com valores. é longo, entao separei com newlines
        System.out.printf("meu carro é um %s %s de %d, o seu é um %s %s de %d. %n", 
            meuCarro.getMarca(),
            meuCarro.getCor(),
            meuCarro.getAno(),
            seuCarro.getMarca(),
            seuCarro.getCor(),
            seuCarro.getAno());

// mudando valor

        meuCarro.setAno(2015);

        System.out.printf("meu carro é um %s %s de %d, o seu é um %s %s de %d. %n", 
            meuCarro.getMarca(),
            meuCarro.getCor(),
            meuCarro.getAno(),
            seuCarro.getMarca(),
            seuCarro.getCor(),
            seuCarro.getAno());

/*mudar um objeto não muda outro porque são instancias diferentes de objetos. o objeto joao e jose apontam pra enderecos de memoria diferentes
entao mudar a cor do cabelo de joao ou o ano do meu carro nao mexe nos outros objetos */

        }

}
