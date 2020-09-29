package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.util.List;

/* renamed from: ayw reason: default package */
public final class ayw extends axe implements c {
    private final ays a;
    private final Uri b;
    private final ayr c;
    private final axi d;
    private final bby e;
    private final boolean f;
    private final HlsPlaylistTracker g;
    private final Object h;
    private bcd i;

    /* renamed from: ayw$a */
    public static final class a {
        public final ayr a;
        public ays b;
        public azh c;
        public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a d;
        public axi e;
        public bby f;
        public boolean g;

        public a(defpackage.bbn.a aVar) {
            this((ayr) new ayo(aVar));
        }

        private a(ayr ayr) {
            this.a = (ayr) bcu.a(ayr);
            this.c = new azb();
            this.d = azc.a;
            this.b = ays.a;
            this.f = new bbw();
            this.e = new axj();
        }
    }

    public /* synthetic */ ayw(Uri uri, ayr ayr, ays ays, axi axi, bby bby, HlsPlaylistTracker hlsPlaylistTracker, boolean z, Object obj, byte b2) {
        this(uri, ayr, ays, axi, bby, hlsPlaylistTracker, z, obj);
    }

    static {
        aqd.a("goog.exo.hls");
    }

    private ayw(Uri uri, ayr ayr, ays ays, axi axi, bby bby, HlsPlaylistTracker hlsPlaylistTracker, boolean z, Object obj) {
        this.b = uri;
        this.c = ayr;
        this.a = ays;
        this.d = axi;
        this.e = bby;
        this.g = hlsPlaylistTracker;
        this.f = z;
        this.h = obj;
    }

    public final void a(apz apz, boolean z, bcd bcd) {
        this.i = bcd;
        this.g.a(this.b, a((defpackage.axp.a) null), this);
    }

    public final void b() {
        this.g.d();
    }

    public final axo a(defpackage.axp.a aVar, bbi bbi) {
        ayv ayv = new ayv(this.a, this.g, this.c, this.i, this.e, a(aVar), bbi, this.d, this.f);
        return ayv;
    }

    public final void a(axo axo) {
        ayy[] ayyArr;
        ayv ayv = (ayv) axo;
        ayv.a.b((b) ayv);
        for (ayy ayy : ayv.d) {
            if (ayy.k) {
                for (axs d2 : ayy.h) {
                    d2.d();
                }
            }
            ayy.c.a((e) ayy);
            ayy.f.removeCallbacksAndMessages(null);
            ayy.o = true;
            ayy.g.clear();
        }
        ayv.c = null;
        ayv.b.b();
    }

    public final void ao_() {
        this.g.a();
    }

    public final void a(aze aze) {
        axv axv;
        long j;
        long j2;
        aze aze2 = aze;
        long a2 = aze2.j ? apv.a(aze2.c) : -9223372036854775807L;
        long j3 = (aze2.a == 2 || aze2.a == 1) ? a2 : -9223372036854775807L;
        long j4 = aze2.b;
        if (this.g.e()) {
            long c2 = aze2.c - this.g.c();
            long j5 = aze2.i ? c2 + aze2.m : -9223372036854775807L;
            List<defpackage.aze.a> list = aze2.l;
            if (j4 == -9223372036854775807L) {
                if (list.isEmpty()) {
                    j2 = 0;
                } else {
                    j2 = ((defpackage.aze.a) list.get(Math.max(0, list.size() - 3))).e;
                }
                j = j2;
            } else {
                j = j4;
            }
            axv axv2 = new axv(j3, a2, j5, aze2.m, c2, j, true, !aze2.i, this.h);
            axv = axv2;
        } else {
            axv = new axv(j3, a2, aze2.m, aze2.m, 0, j4 == -9223372036854775807L ? 0 : j4, true, false, this.h);
        }
        a((aqu) axv, (Object) new ayt(this.g.b(), aze2));
    }
}
