package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(rx rxVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) rxVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = rxVar.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, rx rxVar) {
        rxVar.a((Parcelable) audioAttributesImplApi21.a, 1);
        rxVar.a(audioAttributesImplApi21.b, 2);
    }
}
