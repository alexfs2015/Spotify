package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(sc scVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) scVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = scVar.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, sc scVar) {
        scVar.a((Parcelable) audioAttributesImplApi26.a, 1);
        scVar.a(audioAttributesImplApi26.b, 2);
    }
}
