package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements mi {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    static class a implements defpackage.mi.a {
        private int a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        a() {
        }

        public final /* synthetic */ defpackage.mi.a a(int i) {
            if (i != 10) {
                this.d = i;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public final mi a() {
            return new AudioAttributesImplBase(0, 0, 0, this.d);
        }
    }

    AudioAttributesImplBase() {
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b == audioAttributesImplBase.b) {
            int i = this.c;
            int i2 = audioAttributesImplBase.c;
            int i3 = audioAttributesImplBase.d;
            if (i3 == -1) {
                i3 = AudioAttributesCompat.a(false, i2, audioAttributesImplBase.a);
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.a == audioAttributesImplBase.a && this.d == audioAttributesImplBase.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
