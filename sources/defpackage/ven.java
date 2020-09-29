package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.nowplaying.core.repeat.RepeatState;

/* renamed from: ven reason: default package */
public final class ven {

    /* renamed from: ven$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[RepeatState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.nowplaying.core.repeat.RepeatState[] r0 = com.spotify.nowplaying.core.repeat.RepeatState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.TRACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.CONTEXT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.nowplaying.core.repeat.RepeatState r1 = com.spotify.nowplaying.core.repeat.RepeatState.DISABLED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ven.AnonymousClass1.<clinit>():void");
        }
    }

    public static Drawable a(RepeatState repeatState, Context context) {
        int i = AnonymousClass1.a[repeatState.ordinal()];
        if (i == 1) {
            return vdd.k(context);
        }
        if (i == 2) {
            return vdd.m(context);
        }
        if (i == 3) {
            return vdd.l(context);
        }
        if (i == 4) {
            return vdd.n(context);
        }
        StringBuilder sb = new StringBuilder("Unsupported RepeatState ");
        sb.append(repeatState);
        throw new IllegalArgumentException(sb.toString());
    }
}
