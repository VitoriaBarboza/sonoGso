//exibir mensagens
import static 
        javax.swing.JOptionPane.showMessageDialog;
//converter string-> int
import static java.lang.Integer.parseInt;

//converter String -> float
import static java.lang.Float.parseFloat;

//receber dados do usuário
import static
        javax.swing.JOptionPane.showInputDialog;

public class AprendendoFuncoes
{
     //escreva= showMessageDialog(null, args);
    public static void main(String[] args) 
    {
       int n1= parseInt(showInputDialog("Digite n1"));
       int n2= parseInt(showInputDialog("Digite n2"));
       int resultado= calculaSoma(n1,n2);
       showMessageDialog(null, resultado);
        
    }//main - nome da função
    
    //somar dois números [int]: [int]
    public static int calculaSoma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    } 
}//class