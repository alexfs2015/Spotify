package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: lwa reason: default package */
public final class lwa extends szt {
    private final fqn a;
    private final rqb c;

    /* renamed from: lwa$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ARTIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.SEARCH_ROOT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lwa.AnonymousClass1.<clinit>():void");
        }
    }

    lwa(fqn fqn, rqb rqb) {
        this.a = (fqn) fbp.a(fqn);
        this.c = rqb;
    }

    public final jqx a(String str, String str2, SessionState sessionState) {
        jqx jqx = szt.b;
        jva a2 = jva.a(str);
        int i = AnonymousClass1.a[a2.b.ordinal()];
        if (i == 1 || i == 2) {
            jqx = lvz.a(str, str2, this.a);
        } else if (i == 3) {
            boolean connected = sessionState.connected();
            String productType = sessionState.productType();
            String currentUser = ((SessionState) fbp.a(sessionState)).currentUser();
            fqn fqn = this.a;
            jqx = qeg.a(a2, false, true, connected, productType, currentUser, fqn, (srq) null, this.c.a(fqn), false);
        }
        return lvy.a(str) ? lvz.a(str, str2, this.a) : jqx;
    }
}
