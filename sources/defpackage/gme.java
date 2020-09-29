package defpackage;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;

/* renamed from: gme reason: default package */
public final class gme<H extends Parcelable> implements defpackage.gmd.a {
    final glw<H> a;
    final gmf<H> b;
    final a c;
    public c d;
    defpackage.gmd.c e;
    private final defpackage.glw.c f = new b(this, 0);

    /* renamed from: gme$a */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: gme$b */
    class b extends gly {
        private b() {
        }

        /* synthetic */ b(gme gme, byte b) {
            this();
        }

        public final void a(defpackage.glw.a aVar) {
            gme.this.c.a();
            gme gme = gme.this;
            ((defpackage.gmd.c) fay.a(gme.e)).a(false);
            gme.b.c(false);
            ((c) fay.a(gme.this.d)).a();
        }

        public final void a(Throwable th) {
            Logger.e(th, "OTP request error", new Object[0]);
            gme.this.c.b();
            gme.this.a();
            ((c) fay.a(gme.this.d)).a(th);
        }

        public final void a() {
            gme.this.a();
        }
    }

    /* renamed from: gme$c */
    public interface c {
        void a();

        void a(Throwable th);
    }

    public gme(glw<H> glw, gmf<H> gmf, a aVar) {
        this.a = glw;
        this.b = gmf;
        this.c = (a) fay.a(aVar);
    }

    public final void a(defpackage.gmd.c cVar) {
        fay.b(this.d != null);
        this.e = (defpackage.gmd.c) fay.a(cVar);
        this.b.a(this);
        cVar.a((defpackage.gmd.b) this.b);
    }

    public final void b(boolean z) {
        this.a.b(this.f);
        ((defpackage.gmd.c) fay.a(this.e)).b(this.b, z);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        ((defpackage.gmd.c) fay.a(this.e)).a(false);
        this.b.c(true);
    }

    public final void a(boolean z) {
        ((defpackage.gmd.c) fay.a(this.e)).a(true);
        this.b.c(false);
        ((defpackage.gmd.c) fay.a(this.e)).a(this.b, z);
        this.a.a(this.f);
    }
}
