package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.io.IOException;

/* renamed from: aye reason: default package */
public final class aye extends axv implements c {
    private final Uri a;
    private final defpackage.bce.a b;
    private final atn c;
    private final bcp d;
    private final String e;
    private final int f;
    private final Object g;
    private long h;
    private boolean i;
    private bcu j;

    @Deprecated
    /* renamed from: aye$a */
    public interface a {
    }

    @Deprecated
    /* renamed from: aye$b */
    static final class b extends ayb {
        private final a a;

        public b(a aVar) {
            this.a = (a) bdl.a(aVar);
        }

        public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, defpackage.ayh.c cVar, IOException iOException, boolean z) {
        }
    }

    /* renamed from: aye$c */
    public static final class c {
        private final defpackage.bce.a a;
        private atn b;
        private bcp c = new bcn();
        private int d = 1048576;
        private boolean e;

        public c(defpackage.bce.a aVar) {
            this.a = aVar;
        }

        public final aye a(Uri uri) {
            this.e = true;
            if (this.b == null) {
                this.b = new ati();
            }
            aye aye = new aye(uri, this.a, this.b, this.c, null, this.d, null, 0);
            return aye;
        }
    }

    @Deprecated
    public aye(Uri uri, defpackage.bce.a aVar, atn atn, Handler handler, a aVar2) {
        this(uri, aVar, atn, null, null, null);
    }

    @Deprecated
    private aye(Uri uri, defpackage.bce.a aVar, atn atn, Handler handler, a aVar2, String str) {
        this(uri, aVar, atn, handler, aVar2, (String) null, 1048576);
    }

    @Deprecated
    private aye(Uri uri, defpackage.bce.a aVar, atn atn, Handler handler, a aVar2, String str, int i2) {
        this(uri, aVar, atn, (bcp) new bcn(), str, 1048576, (Object) null);
        if (aVar2 != null && handler != null) {
            a(handler, (ayh) new b(aVar2));
        }
    }

    private aye(Uri uri, defpackage.bce.a aVar, atn atn, bcp bcp, String str, int i2, Object obj) {
        this.a = uri;
        this.b = aVar;
        this.c = atn;
        this.d = bcp;
        this.e = str;
        this.f = i2;
        this.h = -9223372036854775807L;
        this.g = obj;
    }

    /* synthetic */ aye(Uri uri, defpackage.bce.a aVar, atn atn, bcp bcp, String str, int i2, Object obj, byte b2) {
        this(uri, aVar, atn, bcp, str, i2, obj);
    }

    private void b(long j2, boolean z) {
        this.h = j2;
        this.i = z;
        aym aym = new aym(this.h, this.i, false, this.g);
        a((arl) aym, (Object) null);
    }

    public final ayf a(defpackage.ayg.a aVar, bbz bbz) {
        bce a2 = this.b.a();
        bcu bcu = this.j;
        if (bcu != null) {
            a2.a(bcu);
        }
        ayd ayd = new ayd(this.a, a2, this.c.createExtractors(), this.d, a(aVar), this, bbz, this.e, this.f);
        return ayd;
    }

    public final void a(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.h;
        }
        if (this.h != j2 || this.i != z) {
            b(j2, z);
        }
    }

    public final void a(aqq aqq, boolean z, bcu bcu) {
        this.j = bcu;
        b(this.h, false);
    }

    public final void a(ayf ayf) {
        ayd ayd = (ayd) ayf;
        if (ayd.i) {
            for (ayj d2 : ayd.h) {
                d2.d();
            }
        }
        ayd.d.a((e) ayd);
        ayd.f.removeCallbacksAndMessages(null);
        ayd.g = null;
        ayd.l = true;
        ayd.a.b();
    }

    public final void an_() {
    }

    public final void b() {
    }
}
