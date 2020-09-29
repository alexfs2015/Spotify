package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pqk reason: default package */
public final class pqk implements pqj {
    private final pqb a;
    private final pqd b;
    private final pqh c;
    private final pqf d;

    /* renamed from: pqk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWERS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST_OVERVIEW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_ARTISTS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pqk.AnonymousClass1.<clinit>():void");
        }
    }

    public pqk(pqb pqb, pqd pqd, pqh pqh, pqf pqf) {
        this.a = pqb;
        this.b = pqd;
        this.c = pqh;
        this.d = pqf;
    }

    public final pqi a(String str) {
        jva a2 = jva.a(str);
        int i = AnonymousClass1.a[a2.b.ordinal()];
        if (i == 1) {
            pqb pqb = this.a;
            return new pqa((String) pqb.a(a2.c(), 1), (pqz) pqb.a(pqb.a.get(), 2), (Context) pqb.a(pqb.b.get(), 3));
        } else if (i == 2) {
            pqd pqd = this.b;
            return new pqc((String) pqd.a(a2.c(), 1), (pqz) pqd.a(pqd.a.get(), 2), (Context) pqd.a(pqd.b.get(), 3));
        } else if (i == 3) {
            return this.c.a(a2.c());
        } else {
            if (i == 4) {
                return this.d.a(a2.c());
            }
            StringBuilder sb = new StringBuilder("No profile list page found for uri: ");
            sb.append(str);
            throw new AssertionError(sb.toString());
        }
    }
}
