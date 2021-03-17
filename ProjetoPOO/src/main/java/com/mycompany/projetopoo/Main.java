
package com.mycompany.avalicaopoo;

import com.mycompany.avalicaopoo.Filme;
import com.mycompany.avalicaopoo.Avalicao;
import com.mycompany.avalicaopoo.Opnioes;


public class Main 
{
    public static void main(String[] args) 
    {
        Filme sweeneytodd = new Filme(1, "Sweeney Todd: O Barbeiro Demoníaco da Rua Fleet",
        "Musical,Suspense,Terror, Drama", 
                "Benjamin Barker passou 15 anos afastado de Londres após ser obrigado a deixar sua esposa e sua filha"
                + "ir à sua antiga barbearia, que agora é uma loja de fachada para vender as tortas feitas pela sra. Lovett"
                + "Com seu apoio, Todd volta a trabalhar como barbeiro na sala acima da loja. Porém o grande objetivo de Todd é se vingar do juiz Turpin"
                + "que o enviou para a Austrália sob falsas acusações para"
                + "que pudesse roubar sua mulher Lucy e sua filha.");
        
        Avalicao sweeneytodd1 = new Avalicao(1, "Sidney M.", 5, 
                "Não sou fã de filmes musicais, mas este aqui é uma exceção.");
        
        Avalicao sweeneytodd2 = new Avalicao(1, "Júnior S", 4, 
                "Visual deslumbrante, direção de arte impecável(como outros vários de Burton).");
        
        Avalicao sweeneytodd3 = new Avalicao(1, "Camila Reis", 4, 
                "A história é tão idiota quanto sinistra.");
        
        Avalicao[] arrAvalicaosweeneytodd= 
        {
            sweeneytodd1, 
            sweeneytodd2, 
            sweeneytodd3
        };
        Opnioes opnioessweeneytodd = new Opnioes(arrAvalicaosweeneytodd);
        
        
        Filme harrypotter = new Filme(2, "Harry Potter e a Pedra Filosofal",
        "Ação/Aventura",
        "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys "
                + "Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos"
                + "Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a visita de Hagrid "
                + "o guarda-caça de Hogwarts, que chega para levá-lo até a escola"
                + "Harry adentra um mundo mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos"
                + "Rony Weasley e Hermione Granger.");
        
        Avalicao harrypotter1 = new Avalicao(2, "Alan David", 4, 
                "O inicio, esta bem parecido com os livros, divertido e interessante.");
        
        Avalicao harrypotter2 = new Avalicao(2, "Camilla M.", 5, 
                "Gostei do longa, é um filme diferente, com uma história diferente sobre bruxos.");
        
        Avalicao harrypotter3 = new Avalicao(2, "Estevan Magno", 4, 
                "O primeiro Harry será eterno, sempre estará guardado com carinho na minha mente e coração.");
        
        Avalicao[] arrAvalicaoharrypotter = 
        {
            harrypotter1, 
            harrypotter2, 
            harrypotter3
        };
        Opnioes opnioesharrypotter = new Opnioes(arrAvalicaoharrypotter);

        
        Filme dentecanino = new Filme(3, "DENTE CANINO", 
        "Drama",
        "Pai, mãe e três filhos vivem nos arredores de uma cidade. A casa é isolada por uma alta cerca que os filhos nunca puderam ultrapassar."
                + "Eles são educados, entediados e exercitados da maneira que seus pais acham correto, sem nenhuma interferência do mundo externo."
                + "Acreditam que o avião que veem passando ao longe no céu é um simples brinquedo, e zumbis são flores pequenas e amarelas."
                +"A única pessoa autorizada a entrar na casa é Christina, que trabalha no escritório do pai e visita o filho a fim de satisfazer suas necessidades sexuais."
                + "Toda a família gosta dela, em especial a filha mais velha. Um dia, Christina dá a ela uma bandana que brilha no escuro e pede uma outra coisa em troca.");
        
         Avalicao dentecanino1 = new Avalicao(2, "Alexsandro L.", 4, 
                "Incomodo, perturbador e complexo como todo ser humano.");
        
        Avalicao dentecanino2 = new Avalicao(2, "Anderson G.", 4, 
                "Um filme frio que ao mesmo tempo é quente, tenso, chocante e perturbador.");
        
        Avalicao dentecanino3 = new Avalicao(2, "Deia Rodrigues", 5, 
                "A história é muito louca e insana do jeito que gosto");
        
        Avalicao[] arrAvaliacoesdentecanino= 
        {
            dentecanino1, 
            dentecanino2, 
            dentecanino3};
        Opnioes opnioesdentecanino = new Opnioes(arrAvaliacoesdentecanino);
    }
}
