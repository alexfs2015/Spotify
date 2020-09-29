package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(sc scVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) scVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = scVar.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, sc scVar) {
        scVar.a((Parcelable) audioAttributesImplApi21.a, 1);
        scVar.a(audioAttributesImplApi21.b, 2);
    }
}
