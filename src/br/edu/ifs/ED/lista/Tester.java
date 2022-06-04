package br.edu.ifs.ED.lista;

    public class Tester {
        public static void main(String[] args) throws Exception {
            ListaEnc lista = new ListaEnc();

            lista.incluir(9);
            lista.incluir(27);
            lista.incluir(100);
            lista.incluir(5);
            lista.incluir(4);
            lista.incluir(10);
            lista.incluir(7);
            lista.incluir(1);
            lista.incluir(2);
            lista.incluir(3, 2); // olhar a situação do erro que esta dando quando inclui um elemento numa posição que quebre a ordenação
//        lista.incluir(2);
            lista.incluirInicio(0);

            for (int i = 0; i <11 ; i++) {
                System.out.println( lista.get(i));
            }









            //System.out.println(lista.getTamanho());
//        lista.incluir(5, 0);
//        System.out.println(lista.get(0));
//        lista.incluir(1);
//        System.out.println("\n\n");
//        System.out.println(lista.get(0));
//        System.out.println(lista.get(1));
//        System.out.println("\n\n");
//        lista.incluir(3);
//        lista.incluir(6);
//        lista.incluir(10);
//        lista.incluir(215);
//        System.out.println(lista.get(0));
//        lista.incluir(4, 1);
//        System.out.println("\n\n");
//        System.out.println(lista.get(0));
//        System.out.println("\n\n");
//        System.out.println(lista.get(1));
//        System.out.println(lista.get(2));
//        System.out.println(lista.get(3));
//
//        lista.incluir(23);
//        lista.incluir(24);
//        lista.incluir(7);
//        lista.incluir(5);

//        System.out.println(lista.getTamanho());
//
//        System.out.println(lista.contem(5));
//        System.out.println(lista.get(3));
//        System.out.println(lista.get(4));
//        System.out.println(lista.get(5));
//        System.out.println(lista.get(7));
//        lista.remover(4);
//        System.out.println("\n\n");
//        System.out.println(lista.get(3));
//        System.out.println(lista.get(4));
//        System.out.println(lista.get(5));
//        System.out.println(lista.get(6));

//        System.out.println(lista.getPosElemento(1));
//        System.out.println(lista.getPosElemento(3));
//        System.out.println(lista.getPosElemento(6));

//        System.out.println(lista.get(0));
//        lista.incluir(41, 0);
//        System.out.println(lista.get(0));
////        System.out.println(lista.get(1));
////        System.out.println(lista.get(2));
////        System.out.println(lista.get(4));
////        System.out.println(lista.get(8));
//        lista.limpar();
//        System.out.println(lista.getTamanho());
//        lista.incluir(5);
//        System.out.println(lista.get(0));

        }
    }

