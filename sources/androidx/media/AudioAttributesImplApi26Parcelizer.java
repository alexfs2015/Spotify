package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(rx rxVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) rxVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = rxVar.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, rx rxVar) {
        rxVar.a((Parcelable) audioAttributesImplApi26.a, 1);
        rxVar.a(audioAttributesImplApi26.b, 2);
    }
}
