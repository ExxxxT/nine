package lab;

public class first {
    private String INN;
    private String name;

    public first(String INN, String name)
    {
        this.INN = INN;
        this.name = name;
    }
    public String get_INN()
    {
        return INN;
    }

    public String getName()
    {
        return name;
    }
    public void test_INN(String inn) throws verific
    {
        if(inn.length()!=10)
            throw new verific(this);
    }

    public static void main(String[] args)
    {
        first client=new first("148378745834547348","Evseenko F.I");
        try {
            client.test_INN(client.get_INN());
            System.out.println("ИНН клиента "+client.getName()+" действителен.");
        } catch (verific e) {
            System.out.println(e.getMessage());
        }

        first client1=new first("2238525122","Pivchenko Y.A");
        try {
            client1.test_INN(client1.get_INN());
            System.out.println("ИНН клиента "+client1.getName()+" действителен.");
        } catch (verific e) {
            System.out.println(e.getMessage());
        }

        first client2=new first("4342346","Petrova A.K");
        try {
            client2.test_INN(client2.get_INN());
            System.out.println("ИНН клиента "+client2.getName()+" действителен.");
        } catch (verific e) {
            System.out.println(e.getMessage());
        }
    }
}
