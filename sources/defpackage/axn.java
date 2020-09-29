package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.io.IOException;

/* renamed from: axn reason: default package */
public final class axn extends axe implements c {
    private final Uri a;
    private final defpackage.bbn.a b;
    private final asw c;
    private final bby d;
    private final String e;
    private final int f;
    private final Object g;
    private long h;
    private boolean i;
    private bcd j;

    @Deprecated
    /* renamed from: axn$a */
    public interface a {
    }

    @Deprecated
    /* renamed from: axn$b */
    static final class b extends axk {
        private final a a;

        public final void a(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, defpackage.axq.c cVar, IOException iOException, boolean z) {
        }

        public b(a aVar) {
            this.a = (a) bcu.a(aVar);
        }
    }

    /* renamed from: axn$c */
    public static final class c {
        private final defpackage.bbn.a a;
        private asw b;
        private bby c = new bbw();
        private int d = 1048576;
        private boolean e;

        public c(defpackage.bbn.a aVar) {
            this.a = aVar;
        }

        public final axn a(Uri uri) {
            this.e = true;
            if (this.b == null) {
                this.b = new asr();
            }
            axn axn = new axn(uri, this.a, this.b, this.c, null, this.d, null, 0);
            return axn;
        }
    }

    public final void ao_() {
    }

    public final void b() {
    }

    /* synthetic */ axn(Uri uri, defpackage.bbn.a aVar, asw asw, bby bby, String str, int i2, Object obj, byte b2) {
        this(uri, aVar, asw, bby, str, i2, obj);
    }

    @Deprecated
    public axn(Uri uri, defpackage.bbn.a aVar, asw asw, Handler handler, a aVar2) {
        this(uri, aVar, asw, null, null, null);
    }

    @Deprecated
    private axn(Uri uri, defpackage.bbn.a aVar, asw asw, Handler handler, a aVar2, String str) {
        this(uri, aVar, asw, handler, aVar2, (String) null, 1048576);
    }

    @Deprecated
    private axn(Uri uri, defpackage.bbn.a aVar, asw asw, Handler handler, a aVar2, String str, int i2) {
        this(uri, aVar, asw, (bby) new bbw(), str, 1048576, (Object) null);
        if (aVar2 != null && handler != null) {
            a(handler, (axq) new b(aVar2));
        }
    }

    private axn(Uri uri, defpackage.bbn.a aVar, asw asw, bby bby, String str, int i2, Object obj) {
        this.a = uri;
        this.b = aVar;
        this.c = asw;
        this.d = bby;
        this.e = str;
        this.f = i2;
        this.h = -9223372036854775807L;
        this.g = obj;
    }

    public final void a(apz apz, boolean z, bcd bcd) {
        this.j = bcd;
        b(this.h, false);
    }

    public final axo a(defpackage.axp.a aVar, bbi bbi) {
        bbn a2 = this.b.a();
        bcd bcd = this.j;
        if (bcd != null) {
            a2.a(bcd);
        }
        axm axm = new axm(this.a, a2, this.c.createExtractors(), this.d, a(aVar), this, bbi, this.e, this.f);
        return axm;
    }

    public final void a(axo axo) {
        axm axm = (axm) axo;
        if (axm.i) {
            for (axs d2 : axm.h) {
                d2.d();
            }
        }
        axm.d.a((e) axm);
        axm.f.removeCallbacksAndMessages(null);
        axm.g = null;
        axm.l = true;
        axm.a.b();
    }

    public final void a(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.h;
        }
        if (this.h != j2 || this.i != z) {
            b(j2, z);
        }
    }

    private void b(long j2, boolean z) {
        this.h = j2;
        this.i = z;
        axv axv = new axv(this.h, this.i, false, this.g);
        a((aqu) axv, (Object) null);
    }
}
