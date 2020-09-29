package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    static class a extends a {
        a() {
        }

        public final mi a() {
            return new AudioAttributesImplApi26(this.a.build());
        }
    }

    AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
