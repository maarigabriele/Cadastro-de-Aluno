package cadastrodealuno;
public class Aluno extends Pessoa
{
    
    private String matrícula;
    /*
    digite  o resto dos atributos e faça o encapsulamento
    */
    
    ////deixa  o construto padrão 
    public Aluno()
    {
        
    }
    public String getMatrícula(){
         return matrícula;
    }
    public void setMatricula(String newMatrícula){
         matrícula  = newMatrícula;
    }
}
    
 
