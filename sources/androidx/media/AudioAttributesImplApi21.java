package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

public class AudioAttributesImplApi21 implements mi {
    public AudioAttributes a;
    public int b;

    static class a implements defpackage.mi.a {
        final Builder a = new Builder();

        a() {
        }

        public final /* synthetic */ defpackage.mi.a a(int i) {
            this.a.setLegacyStreamType(i);
            return this;
        }

        public mi a() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }

    AudioAttributesImplApi21() {
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.b = -1;
        this.a = audioAttributes;
        this.b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.a);
        return sb.toString();
    }
}
