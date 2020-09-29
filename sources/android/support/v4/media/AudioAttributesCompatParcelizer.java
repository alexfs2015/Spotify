package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(sc scVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(scVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, sc scVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, scVar);
    }
}
