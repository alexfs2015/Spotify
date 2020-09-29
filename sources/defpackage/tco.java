package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;

/* renamed from: tco reason: default package */
public final class tco implements a<OrientationMode> {
    private final tcp a;
    private final ka b;

    /* renamed from: tco$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[OrientationMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.nowplaying.core.orientation.OrientationMode[] r0 = com.spotify.music.nowplaying.core.orientation.OrientationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.core.orientation.OrientationMode r1 = com.spotify.music.nowplaying.core.orientation.OrientationMode.PORTRAIT_ONLY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.core.orientation.OrientationMode r1 = com.spotify.music.nowplaying.core.orientation.OrientationMode.LANDSCAPE_ONLY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.nowplaying.core.orientation.OrientationMode r1 = com.spotify.music.nowplaying.core.orientation.OrientationMode.UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tco.AnonymousClass1.<clinit>():void");
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        int i = AnonymousClass1.a[((OrientationMode) obj).ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = i != 2 ? -1 : 0;
        }
        this.b.setRequestedOrientation(i2);
    }

    public tco(tcp tcp, ka kaVar) {
        this.a = tcp;
        this.b = kaVar;
    }

    public final void a() {
        this.a.a((a<T>) this);
    }
}
