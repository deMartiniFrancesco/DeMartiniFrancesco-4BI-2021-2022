import java.text.*;
import java.util.*;


public class Persona {
    protected String cognome, nome;
    protected Date data_nasc;

    public Persona(String cognome, String nome, Date d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        this.data_nasc = d_nasc;
    }

    public Persona(String cognome, String nome, String d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        try {
            this.data_nasc = new SimpleDateFormat("dd/MM/yyyy").parse(d_nasc);
        } catch (ParseException ex) {
            this.data_nasc = new Date(0);// 1 1 1970
        }
    }

    public void set(String cognome, Date data_nasc, String nome) {
        this.cognome = cognome;
        this.cognome = cognome;
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return cognome + "," + nome + "," + df.format(data_nasc);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        
        Persona p1 = new Persona("dema", "Fra", "21/10/2003");
        System.out.println(p1.toString());

        System.out.println("End");
        
    }
    
}