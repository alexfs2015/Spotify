package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(sc scVar) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(scVar);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, sc scVar) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, scVar);
    }
}
