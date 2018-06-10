package CadastroDeAluno;

import java.util.Calendar;

public class Pessoa 
{
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected Converter data_digitada;

    public String NomeCompleto() 
    {
        return nome + " " + sobrenome;
    }
    public int CalculoIdade()
    {
        int idade;
        Calendar c = Calendar.getInstance();
        if (c.get(Calendar.MONTH) + 1 < data_digitada.mes) 
        {
            idade = c.get(Calendar.YEAR) - 1 - data_digitada.ano;
        } 
        else if (c.get(Calendar.MONTH) + 1 == data_digitada.mes) 
        {
            if (Calendar.DAY_OF_MONTH < data_digitada.dia)
            {
                idade = c.get(Calendar.YEAR) - 1 - data_digitada.ano;
            }
            else 
            {
                idade = c.get(Calendar.YEAR) - data_digitada.ano;
            }
        }
        else 
        {
            idade = c.get(Calendar.YEAR) - data_digitada.ano;
        }
        return idade;
    }
    public String getDataDeNascimento() 
    {
        return data_digitada.toString();
    }
    public class Converter
    {
        public int dia;
        public int mes;
        public int ano;

        @Override
        public String toString() 
        {
            return dia + "/" + mes + "/" + ano;
        }
    }
    public String Email()
    {
        return email;
    }
}