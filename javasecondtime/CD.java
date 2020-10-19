package javasecondtime;

public class CD{
    private String str;
    //Конструктор, в котором идёт проверка типа носителя музыкальной композиции.
    public CD(String str, String type){
        if (type.equals("Disc"))
        {
            this.str = str;
        }else
        {
            System.out.println("CD проигрователь не может считать информацию с этого носителя.");
            this.str="";
        }
    }
    public CD(){
        str="";
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
            System.out.println("Песня: "+str+" проигрывается на CD плеере.");
        }

    }


}
