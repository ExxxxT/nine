package lab;

public class verific extends Exception
{
    public verific(first client)
    {
        super(client.getName()+" имеет недействительный ИНН");
    }

    public verific(String message)
    {
        super(message);
    }

    public String toString(first client)
    {
        return (client.getName()+" имеет недействительный ИНН");
    }
}