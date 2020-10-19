package javasecondtime;
public class JavaSecondTime { 
    public static void main(String[] args){
        //Заведение экземпляров классов для проверки работы проигрывателей.
        CD player0 = new CD(Disc.frstSong, Disc.type);
        CD player1 = new CD(FlashDrive.frstSong, FlashDrive.type);
        Multiplayer player2 = new Multiplayer(Disc.thrdSong);
        //Запуск проигрывателей.
        player0.Play();
        player1.Play();
        player2.Play();
        //Смена песен.
        player0.setStr(Disc.scndSong);
        player2.setStr(FlashDrive.thrdSong);
        player0.Play();
        player2.Play();
    }
       }

