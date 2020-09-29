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

/* renamed from: kcy reason: default package */
public final class kcy implements ayh, kdg {
    final defpackage.ayh.a a;
    final kaa b;
    final b c;
    final boolean d;
    kde e;
    private final Uri f;
    private final kdf g;
    private final a h;
    private final int i;
    private final defpackage.kdc.a j;
    private final defpackage.bce.a k;
    private final ArrayList<defpackage.ayg.b> l = new ArrayList<>(1);
    private Loader m;
    private bce n;
    private Handler o;
    private bcq p;
    private arl q;
    private kdo r;
    private aqq s;
    private bcu t;

    /* renamed from: kcy$a */
    final class a implements com.google.android.exoplayer2.upstream.Loader.a<bcr<kde>> {
        private a() {
        }

        /* synthetic */ a(kcy kcy, byte b) {
            this();
        }

        public final /* synthetic */ com.google.android.exoplayer2.upstream.Loader.b a(d dVar, long j, long j2, IOException iOException, int i) {
            IOException iOException2 = iOException;
            bcr bcr = (bcr) dVar;
            kcy kcy = kcy.this;
            boolean z = iOException2 instanceof ParserException;
            kcy.a.a(bcr.a, bcr.d(), bcr.e(), bcr.b, j, j2, bcr.c(), iOException, z);
            if (iOException2 != null && (iOException.getCause() instanceof InvalidResponseCodeException)) {
                InvalidResponseCodeException invalidResponseCodeException = (InvalidResponseCodeException) iOException.getCause();
                iOException2 = new ManifestResponseException(invalidResponseCodeException.mResponseCode, invalidResponseCodeException.mResponseBody);
            }
            kcy.c.a(kcy.b, iOException2);
            return Loader.b;
        }

        public final /* synthetic */ void a(d dVar, long j, long j2) {
            bcr bcr = (bcr) dVar;
            kcy kcy = kcy.this;
            kde kde = (kde) bcr.d;
            if (kde != null) {
                if (!kde.c || kcy.d) {
                    kcy.e = kde;
                    kcy.d();
                    kcy.a.a(bcr.a, bcr.d(), bcr.e(), bcr.b, j, j2, bcr.c());
                } else {
                    kcy.c.a(kcy.b, DrmException.a());
                }
            }
        }

        public final /* synthetic */ void a(d dVar, long j, long j2, boolean z) {
            bcr bcr = (bcr) dVar;
            kcy.this.a.b(bcr.a, bcr.d(), bcr.e(), bcr.b, j, j2, bcr.c());
        }
    }

    /* renamed from: kcy$b */
    static final class b {
        final kdo a;
        private final Handler b;

        public b(Handler handler, kdo kdo) {
            this.b = kdo != null ? (Handler) bdl.a(handler) : null;
            this.a = kdo;
        }

        public final void a(final kaa kaa, final Exception exc) {
            if (this.a != null) {
                this.b.post(new Runnable() {
                    public final void run() {
                        b.this.a.a(kaa, exc);
                    }
                });
            }
        }
    }

    public kcy(rwl rwl, kaa kaa, kde kde, Uri uri, defpackage.bce.a aVar, Handler handler, kdo kdo, int i2, defpackage.kdc.a aVar2, kdn kdn, boolean z) {
        this.b = kaa;
        this.e = null;
        this.f = uri;
        this.r = kdo;
        this.a = new defpackage.ayh.a().a(0, (defpackage.ayg.a) null, 0);
        this.a.a(handler, (ayh) this);
        this.c = new b(handler, kdo);
        this.g = new kdf(rwl, kdn);
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

    public final ayf a(defpackage.ayg.a aVar, bbz bbz) {
        kcx kcx = new kcx(this.e, 0, this.t, this.j, this.i, this.a, 0, this.p, bbz);
        return kcx;
    }

    public final keb a() {
        kde kde = this.e;
        if (kde != null) {
            return kde.a;
        }
        throw new IllegalStateException("Manifest is not loaded");
    }

    public final void a(int i2, defpackage.ayg.a aVar) {
    }

    public final void a(int i2, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
        if (this.r != null && cVar.a == 4) {
            this.r.a(this.b);
        }
    }

    public final void a(int i2, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar, IOException iOException, boolean z) {
    }

    public final void a(int i2, defpackage.ayg.a aVar, c cVar) {
    }

    public final void a(Handler handler, ayh ayh) {
        this.a.a(handler, ayh);
    }

    public final void a(aqq aqq, boolean z, defpackage.ayg.b bVar, bcu bcu) {
        this.t = bcu;
        this.l.add(bVar);
        if (this.s == null) {
            this.s = aqq;
            if (this.e != null) {
                d();
                return;
            }
            this.n = this.k.a();
            this.m = new Loader("Loader:SpotifyAdaptiveMediaSource");
            this.p = this.m;
            this.o = new Handler();
            bcr bcr = new bcr(this.n, this.f, 4, (defpackage.bcr.a<? extends T>) this.g);
            this.a.a(bcr.a, bcr.b, this.m.a(bcr, this.h, this.i));
            return;
        }
        arl arl = this.q;
        if (arl != null) {
            bVar.onSourceInfoRefreshed(this, arl, this.e);
        }
    }

    public final void a(ayf ayf) {
        for (ayw<kdc> c2 : ((kcx) ayf).a) {
            c2.c();
        }
    }

    public final void a(defpackage.ayg.b bVar) {
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

    public final void a(ayh ayh) {
        this.a.a(ayh);
    }

    public final void b() {
    }

    public final void b(int i2, defpackage.ayg.a aVar) {
    }

    public final void b(int i2, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
        if (this.r != null && cVar.a == 4) {
            kdk kdk = this.e.b;
            this.r.a(this.b, (List<kai>) kdk != null ? ImmutableList.a((Collection<? extends E>) kdk.a) : ImmutableList.d());
        }
    }

    public final void b(int i2, defpackage.ayg.a aVar, c cVar) {
        kdo kdo = this.r;
        if (kdo != null) {
            kdo.a(this.b, cVar.b, cVar.c, cVar.f);
        }
    }

    public final kdk c() {
        kde kde = this.e;
        if (kde == null) {
            return null;
        }
        return kde.b;
    }

    public final void c(int i2, defpackage.ayg.a aVar) {
    }

    public final void c(int i2, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.q = new aym(this.e.a(0).a(), true, false);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((defpackage.ayg.b) it.next()).onSourceInfoRefreshed(this, this.q, this.e);
        }
    }
}
