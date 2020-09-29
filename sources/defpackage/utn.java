package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.nowplaying.core.shuffle.ShuffleState;

/* renamed from: utn reason: default package */
public final class utn {

    /* renamed from: utn$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ShuffleState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.nowplaying.core.shuffle.ShuffleState[] r0 = com.spotify.nowplaying.core.shuffle.ShuffleState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.nowplaying.core.shuffle.ShuffleState r1 = com.spotify.nowplaying.core.shuffle.ShuffleState.NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.nowplaying.core.shuffle.ShuffleState r1 = com.spotify.nowplaying.core.shuffle.ShuffleState.SELECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.nowplaying.core.shuffle.ShuffleState r1 = com.spotify.nowplaying.core.shuffle.ShuffleState.DISABLED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.utn.AnonymousClass1.<clinit>():void");
        }
    }

    public static Drawable a(ShuffleState shuffleState, Context context) {
        int i = AnonymousClass1.a[shuffleState.ordinal()];
        if (i == 1) {
            return ury.h(context);
        }
        if (i == 2) {
            return ury.i(context);
        }
        if (i == 3) {
            return ury.j(context);
        }
        StringBuilder sb = new StringBuilder("Unsupported ShuffleState ");
        sb.append(shuffleState);
        throw new IllegalArgumentException(sb.toString());
    }
}
