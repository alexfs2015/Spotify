package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.util.List;

/* renamed from: azn reason: default package */
public final class azn extends axv implements c {
    private final azj a;
    private final Uri b;
    private final azi c;
    private final axz d;
    private final bcp e;
    private final boolean f;
    private final HlsPlaylistTracker g;
    private final Object h;
    private bcu i;

    /* renamed from: azn$a */
    public static final class a {
        public final azi a;
        public azj b;
        public azy c;
        public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a d;
        public axz e;
        public bcp f;
        public boolean g;

        private a(azi azi) {
            this.a = (azi) bdl.a(azi);
            this.c = new azs();
            this.d = azt.a;
            this.b = azj.a;
            this.f = new bcn();
            this.e = new aya();
        }

        public a(defpackage.bce.a aVar) {
            this((azi) new azf(aVar));
        }
    }

    static {
        aqu.a("goog.exo.hls");
    }

    private azn(Uri uri, azi azi, azj azj, axz axz, bcp bcp, HlsPlaylistTracker hlsPlaylistTracker, boolean z, Object obj) {
        this.b = uri;
        this.c = azi;
        this.a = azj;
        this.d = axz;
        this.e = bcp;
        this.g = hlsPlaylistTracker;
        this.f = z;
        this.h = obj;
    }

    public /* synthetic */ azn(Uri uri, azi azi, azj azj, axz axz, bcp bcp, HlsPlaylistTracker hlsPlaylistTracker, boolean z, Object obj, byte b2) {
        this(uri, azi, azj, axz, bcp, hlsPlaylistTracker, z, obj);
    }

    public final ayf a(defpackage.ayg.a aVar, bbz bbz) {
        azm azm = new azm(this.a, this.g, this.c, this.i, this.e, a(aVar), bbz, this.d, this.f);
        return azm;
    }

    public final void a(aqq aqq, boolean z, bcu bcu) {
        this.i = bcu;
        this.g.a(this.b, a((defpackage.ayg.a) null), this);
    }

    public final void a(ayf ayf) {
        azp[] azpArr;
        azm azm = (azm) ayf;
        azm.a.b((b) azm);
        for (azp azp : azm.d) {
            if (azp.k) {
                for (ayj d2 : azp.h) {
                    d2.d();
                }
            }
            azp.c.a((e) azp);
            azp.f.removeCallbacksAndMessages(null);
            azp.o = true;
            azp.g.clear();
        }
        azm.c = null;
        azm.b.b();
    }

    public final void a(azv azv) {
        aym aym;
        long j;
        azv azv2 = azv;
        long a2 = azv2.j ? aqm.a(azv2.c) : -9223372036854775807L;
        long j2 = (azv2.a == 2 || azv2.a == 1) ? a2 : -9223372036854775807L;
        long j3 = azv2.b;
        if (this.g.e()) {
            long c2 = azv2.c - this.g.c();
            long j4 = azv2.i ? c2 + azv2.m : -9223372036854775807L;
            List<defpackage.azv.a> list = azv2.l;
            if (j3 == -9223372036854775807L) {
                j = list.isEmpty() ? 0 : ((defpackage.azv.a) list.get(Math.max(0, list.size() - 3))).e;
            } else {
                j = j3;
            }
            aym aym2 = new aym(j2, a2, j4, azv2.m, c2, j, true, !azv2.i, this.h);
            aym = aym2;
        } else {
            aym = new aym(j2, a2, azv2.m, azv2.m, 0, j3 == -9223372036854775807L ? 0 : j3, true, false, this.h);
        }
        a((arl) aym, (Object) new azk(this.g.b(), azv2));
    }

    public final void an_() {
        this.g.a();
    }

    public final void b() {
        this.g.d();
    }
}
