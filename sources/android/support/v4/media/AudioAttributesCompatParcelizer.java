package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(rx rxVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(rxVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, rx rxVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, rxVar);
    }
}
