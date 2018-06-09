package cadastrodealuno;

public class Pessoa 
{
    private String Nome;
    private String Sobrenome;
    private String Email;
    private int Dia, Mes, Ano;
    
    @Override
    public String toString()
    {
        return Nome + " " + Sobrenome;
    }
    public void Pessoa(String Nome,String Sobrenome)
    {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getSobrenome() {
        return Sobrenome;
    }
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public int getDia() {
        return Dia;
    }
    public void setDia(int Dia) {
        this.Dia = Dia;
    }
    public int getMes() {
        return Mes;
    }
    public void setMes(int Mes) {
        this.Mes = Mes;
    }
    public int getAno() {
        return Ano;
    }
    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    public int Idade()
    {
        return 1;
    }
    public int DataNascimento()
    {
        return 0;
    }    
}

