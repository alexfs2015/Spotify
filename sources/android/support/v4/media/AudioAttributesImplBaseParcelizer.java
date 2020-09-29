package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(rx rxVar) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(rxVar);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, rx rxVar) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, rxVar);
    }
}
