package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: jsh reason: default package */
public final class jsh {
    private jva a;
    private final fqn b;
    private final String c;

    /* renamed from: jsh$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.CHARTS_ROOT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.CHARTS_SUBPAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jsh.AnonymousClass1.<clinit>():void");
        }
    }

    public jsh(jva jva, fqn fqn, String str) {
        this.a = jva;
        this.b = fqn;
        if (str == null) {
            str = "";
        }
        this.c = str;
    }

    public final jqx a() {
        int i = AnonymousClass1.a[this.a.b.ordinal()];
        return i != 1 ? i != 2 ? jqx.c : mfc.a((String) fbp.a(this.a.h()), this.c, this.b, false) : mfc.a((String) fbp.a(this.a.h()), this.c, this.b, true);
    }
}
