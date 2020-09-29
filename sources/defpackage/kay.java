package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.d;
import com.google.android.exoplayer2.upstream.Loader.e;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import com.spotify.mobile.android.video.exo.ManifestResponseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: kay reason: default package */
public final class kay implements axq, kbg {
    final defpackage.axq.a a;
    final jya b;
    final b c;
    final boolean d;
    kbe e;
    private final Uri f;
    private final kbf g;
    private final a h;
    private final int i;
    private final defpackage.kbc.a j;
    private final defpackage.bbn.a k;
    private final ArrayList<defpackage.axp.b> l = new ArrayList<>(1);
    private Loader m;
    private bbn n;
    private Handler o;
    private bbz p;
    private aqu q;
    private kbo r;
    private apz s;
    private bcd t;

    /* renamed from: kay$a */
    final class a implements com.google.android.exoplayer2.upstream.Loader.a<bca<kbe>> {
        private a() {
        }

        /* synthetic */ a(kay kay, byte b) {
            this();
        }

        public final /* synthetic */ com.google.android.exoplayer2.upstream.Loader.b a(d dVar, long j, long j2, IOException iOException, int i) {
            IOException iOException2 = iOException;
            bca bca = (bca) dVar;
            kay kay = kay.this;
            boolean z = iOException2 instanceof ParserException;
            kay.a.a(bca.a, bca.d(), bca.e(), bca.b, j, j2, bca.c(), iOException, z);
            if (iOException2 != null && (iOException.getCause() instanceof InvalidResponseCodeException)) {
                InvalidResponseCodeException invalidResponseCodeException = (InvalidResponseCodeException) iOException.getCause();
                iOException2 = new ManifestResponseException(invalidResponseCodeException.mResponseCode, invalidResponseCodeException.mResponseBody);
            }
            kay.c.a(kay.b, iOException2);
            return Loader.b;
        }

        public final /* synthetic */ void a(d dVar, long j, long j2) {
            bca bca = (bca) dVar;
            kay kay = kay.this;
            kbe kbe = (kbe) bca.d;
            if (kbe != null) {
                if (!kbe.c || kay.d) {
                    kay.e = kbe;
                    kay.d();
                    kay.a.a(bca.a, bca.d(), bca.e(), bca.b, j, j2, bca.c());
                } else {
                    kay.c.a(kay.b, DrmException.a());
                }
            }
        }

        public final /* synthetic */ void a(d dVar, long j, long j2, boolean z) {
            bca bca = (bca) dVar;
            kay.this.a.b(bca.a, bca.d(), bca.e(), bca.b, j, j2, bca.c());
        }
    }

    /* renamed from: kay$b */
    static final class b {
        final kbo a;
        private final Handler b;

        public b(Handler handler, kbo kbo) {
            this.b = kbo != null ? (Handler) bcu.a(handler) : null;
            this.a = kbo;
        }

        public final void a(final jya jya, final Exception exc) {
            if (this.a != null) {
                this.b.post(new Runnable() {
                    public final void run() {
                        b.this.a.a(jya, exc);
                    }
                });
            }
        }
    }

    public final void a(int i2, defpackage.axp.a aVar) {
    }

    public final void a(int i2, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar, IOException iOException, boolean z) {
    }

    public final void a(int i2, defpackage.axp.a aVar, c cVar) {
    }

    public final void b() {
    }

    public final void b(int i2, defpackage.axp.a aVar) {
    }

    public final void c(int i2, defpackage.axp.a aVar) {
    }

    public final void c(int i2, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
    }

    public kay(rnf rnf, jya jya, kbe kbe, Uri uri, defpackage.bbn.a aVar, Handler handler, kbo kbo, int i2, defpackage.kbc.a aVar2, kbn kbn, boolean z) {
        this.b = jya;
        this.e = null;
        this.f = uri;
        this.r = kbo;
        this.a = new defpackage.axq.a().a(0, (defpackage.axp.a) null, 0);
        this.a.a(handler, (axq) this);
        this.c = new b(handler, kbo);
        this.g = new kbf(rnf, kbn);
        this.i = 2;
        this.j = aVar2;
        this.k = aVar;
        this.d = z;
        if (this.e != null) {
            this.h = null;
        } else {
            this.h = new a(this, 0);
        }
    }

    public final void a(Handler handler, axq axq) {
        this.a.a(handler, axq);
    }

    public final void a(axq axq) {
        this.a.a(axq);
    }

    public final void a(apz apz, boolean z, defpackage.axp.b bVar, bcd bcd) {
        this.t = bcd;
        this.l.add(bVar);
        if (this.s == null) {
            this.s = apz;
            if (this.e != null) {
                d();
                return;
            }
            this.n = this.k.a();
            this.m = new Loader("Loader:SpotifyAdaptiveMediaSource");
            this.p = this.m;
            this.o = new Handler();
            bca bca = new bca(this.n, this.f, 4, (defpackage.bca.a<? extends T>) this.g);
            this.a.a(bca.a, bca.b, this.m.a(bca, this.h, this.i));
            return;
        }
        aqu aqu = this.q;
        if (aqu != null) {
            bVar.onSourceInfoRefreshed(this, aqu, this.e);
        }
    }

    public final axo a(defpackage.axp.a aVar, bbi bbi) {
        kax kax = new kax(this.e, 0, this.t, this.j, this.i, this.a, 0, this.p, bbi);
        return kax;
    }

    public final void a(axo axo) {
        for (ayf<kbc> c2 : ((kax) axo).a) {
            c2.c();
        }
    }

    public final void a(defpackage.axp.b bVar) {
        this.l.remove(bVar);
        if (this.l.isEmpty()) {
            this.s = null;
            this.q = null;
            this.e = null;
            this.r = null;
            this.n = null;
            this.p = null;
            Loader loader = this.m;
            if (loader != null) {
                loader.a((e) null);
                this.m = null;
            }
            Handler handler = this.o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.o = null;
            }
        }
    }

    public final kca a() {
        kbe kbe = this.e;
        if (kbe != null) {
            return kbe.a;
        }
        throw new IllegalStateException("Manifest is not loaded");
    }

    public final kbk c() {
        kbe kbe = this.e;
        if (kbe == null) {
            return null;
        }
        return kbe.b;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.q = new axv(this.e.a(0).a(), true, false);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((defpackage.axp.b) it.next()).onSourceInfoRefreshed(this, this.q, this.e);
        }
    }

    public final void a(int i2, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
        if (this.r != null && cVar.a == 4) {
            this.r.a(this.b);
        }
    }

    public final void b(int i2, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
        ImmutableList immutableList;
        if (this.r != null && cVar.a == 4) {
            kbk kbk = this.e.b;
            if (kbk != null) {
                immutableList = ImmutableList.a((Collection<? extends E>) kbk.a);
            } else {
                immutableList = ImmutableList.d();
            }
            this.r.a(this.b, (List<jyi>) immutableList);
        }
    }

    public final void b(int i2, defpackage.axp.a aVar, c cVar) {
        kbo kbo = this.r;
        if (kbo != null) {
            kbo.a(this.b, cVar.b, cVar.c, cVar.f);
        }
    }
}
