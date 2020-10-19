package javasecondtime;

public class Multiplayer{
    private String str;
    public Multiplayer(String str){
        this.str=str;
    }
    public Multiplayer(){
        str=" ";
    }
    public void setStr(String str){
        this.str=str;
    }
    public String getStr(){
        return str;
    }
    //Метод, который вывод в консоль название песни, автора и на каком устройстве проигрывается песня.
    public void Play(){
        if (str.equals("")){
            System.out.println("Песня не проигрывается.");
        }else
        {
            System.out.println("Песня: "+str+" проигрывается на универсально плеере.");
        }

    }
}