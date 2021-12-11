import javazoom.jl.decoder.JavaLayerException;
import lombok.extern.slf4j.Slf4j;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Slf4j
public class YesButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        try {
            MusicPlayer.playFailSong();
        } catch (JavaLayerException javaLayerException) {
            log.error("не удалось воспроизвести песню");
            javaLayerException.printStackTrace();
        }
    }
}
