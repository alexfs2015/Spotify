package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.google.common.base.Optional;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messages.BetamaxPlaybackSession.a;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;

/* renamed from: keg reason: default package */
public final class keg extends kej {
    private final gfk<fli> a;
    private final kaa b;
    private final jvn o;
    private final String p;
    private String q = "unknown";
    private float r;
    private Optional<Long> s = Optional.e();

    /* renamed from: keg$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ReasonEnd.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        static {
            /*
                com.spotify.mobile.android.util.connectivity.ConnectionType[] r0 = com.spotify.mobile.android.util.connectivity.ConnectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r2 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_3G     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_4G     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.connectivity.ConnectionType r4 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_EDGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r5 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_ETHERNET     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r5 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_GPRS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.mobile.android.util.connectivity.ConnectionType r5 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_NONE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r5 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_WLAN     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.spotify.mobile.android.video.events.ReasonEnd[] r4 = com.spotify.mobile.android.video.events.ReasonEnd.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.spotify.mobile.android.video.events.ReasonEnd r5 = com.spotify.mobile.android.video.events.ReasonEnd.PLAYED_TO_END     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.spotify.mobile.android.video.events.ReasonEnd r4 = com.spotify.mobile.android.video.events.ReasonEnd.FATAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.END_REQUESTED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.spotify.mobile.android.video.events.ReasonEnd r1 = com.spotify.mobile.android.video.events.ReasonEnd.PLAYER_RELEASED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.keg.AnonymousClass1.<clinit>():void");
        }
    }

    public keg(kaa kaa, jtz jtz, jvn jvn, String str, gfk<fli> gfk) {
        super(kaa, jtz);
        this.b = kaa;
        this.o = jvn;
        this.p = (String) kdv.a(kaa).a(str);
        this.a = gfk;
    }

    private static String a(ConnectionType connectionType) {
        switch (connectionType) {
            case CONNECTION_TYPE_3G:
                return "3g";
            case CONNECTION_TYPE_4G:
                return "4g";
            case CONNECTION_TYPE_EDGE:
                return "edge";
            case CONNECTION_TYPE_ETHERNET:
                return "ethernet";
            case CONNECTION_TYPE_GPRS:
                return "gprs";
            case CONNECTION_TYPE_NONE:
                return IdHelperAndroid.NO_ID_AVAILABLE;
            case CONNECTION_TYPE_WLAN:
                return "wlan";
            default:
                return "unknown";
        }
    }

    public final void a(long j, long j2) {
        super.a(j, j2);
        if (!this.s.b()) {
            this.s = Optional.b(Long.valueOf(j));
        }
    }

    public final void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
        super.a(jzr, reasonEnd, j, j2);
        kef a2 = a(Optional.b(Long.valueOf(j)));
        String a3 = a(this.o.a());
        a a4 = BetamaxPlaybackSession.k().a(this.b.a()).b(this.p).c(this.b.d()).a(a2.r());
        Optional<Long> optional = this.h;
        Long valueOf = Long.valueOf(-1);
        a q2 = a4.b(((Long) optional.a(valueOf)).longValue()).a(((Long) this.s.a(Long.valueOf(0))).longValue()).c(((Long) this.i.a(valueOf)).longValue()).d(((Long) this.f.a(valueOf)).longValue()).e(((Long) this.g.a(valueOf)).longValue()).f(a2.h()).g(a2.i()).h(a2.j()).i(a2.k()).j(a2.l()).b(a2.m()).c(a2.o()).d(a2.n()).k(a2.a()).l(a2.c()).m(a2.d()).n(a2.e()).d(this.q).e(a3).e(this.m).f(((EncryptionType) this.j.a(EncryptionType.NONE)).toString()).o(0).p(this.l / 1000).q((long) this.n);
        int i = AnonymousClass1.a[reasonEnd.ordinal()];
        String str = i != 1 ? i != 2 ? (i == 3 || i == 4) ? "requested-end" : "unknown" : LogMessage.SEVERITY_ERROR : "played-to-end";
        this.a.a((BetamaxPlaybackSession) q2.g(str).a(this.r).h(this.k.a()).g());
        this.o.b();
    }

    public final void a(kcm kcm, long j, long j2) {
        super.a(kcm, j, j2);
        if (kcm.c() > 0) {
            this.r = ((float) kcm.b()) / ((float) kcm.c());
        }
    }

    public final void a(boolean z, long j) {
        super.a(z, j);
        this.q = a(this.o.a());
    }
}
