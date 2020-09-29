package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* renamed from: aqz reason: default package */
public final class aqz {
    private static aqz b = new aqz(new int[]{2}, 2);
    final int[] a;
    private final int c;

    public static aqz a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return b;
        }
        return new aqz(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    private aqz(int[] iArr, int i) {
        if (iArr != null) {
            this.a = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.a);
        } else {
            this.a = new int[0];
        }
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqz)) {
            return false;
        }
        aqz aqz = (aqz) obj;
        return Arrays.equals(this.a, aqz.a) && this.c == aqz.c;
    }

    public final int hashCode() {
        return this.c + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioCapabilities[maxChannelCount=");
        sb.append(this.c);
        sb.append(", supportedEncodings=");
        sb.append(Arrays.toString(this.a));
        sb.append("]");
        return sb.toString();
    }
}
