package androidx.media;

import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.SparseIntArray;

public class AudioAttributesCompat implements se {
    static boolean a;
    private static final SparseIntArray c;
    public mi b;

    public static class a {
        public final defpackage.mi.a a;

        public a() {
            boolean z = AudioAttributesCompat.a;
            if (VERSION.SDK_INT >= 26) {
                this.a = new a();
            } else if (VERSION.SDK_INT >= 21) {
                this.a = new a();
            } else {
                this.a = new a();
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(5, 1);
        c.put(6, 2);
        c.put(7, 2);
        c.put(8, 1);
        c.put(9, 1);
        c.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    public AudioAttributesCompat(mi miVar) {
        this.b = miVar;
    }

    static int a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        int i3 = 4;
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                i3 = 5;
                break;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                return 3;
        }
        return i3;
    }

    public static AudioAttributesCompat a(Object obj) {
        if (VERSION.SDK_INT >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (VERSION.SDK_INT >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    static String a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        mi miVar = this.b;
        return miVar == null ? audioAttributesCompat.b == null : miVar.equals(audioAttributesCompat.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }
}
