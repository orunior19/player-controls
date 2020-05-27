package Youtube;

public class Main {

    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 10 HTML5");
        System.out.println("------- VODEOS -------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Junior",30, "Masculino", "juniorsouza");
        g[1] = new Gafanhoto("Carla Kayone",26, "Feminino", "Kayone");
        System.out.println("------- GAFANHOTOS -------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        System.out.println("------- VISUALIZACOES -------");
        Visualizacao visualizacoes[] = new Visualizacao[5];

        for (int vis = 0; vis < g.length; vis++){
            for (int i = 0; i < v.length; i++){
                visualizacoes[vis] = new Visualizacao(g[vis], v[i]);
                visualizacoes[vis].avaliar();
                System.out.println(visualizacoes[vis].toString());
            }
        }
    }
}
