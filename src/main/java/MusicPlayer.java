import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

@Slf4j
public class MusicPlayer {

    private static AdvancedPlayer PLAYER;

    public static void playFailSong() throws JavaLayerException {
        InputStream song = Thread.currentThread().getContextClassLoader().getResourceAsStream("fail.mp3");
        if (song == null) {
            throw new NullPointerException("Отсутствует песня");
        }
        PLAYER = new AdvancedPlayer(song);
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    PLAYER.play();
                } catch (JavaLayerException e) {
                    log.error("Не удалось воспроизвести песню");
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
