package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bvi reason: default package */
public final class bvi extends bvg<Boolean> {
    private final a<?> b;

    public bvi(a<?> aVar, exj<Boolean> exj) {
        super(4, exj);
        this.b = aVar;
    }

    public final /* bridge */ /* synthetic */ void a(btc btc, boolean z) {
    }

    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }

    public final void d(a<?> aVar) {
        buw buw = (buw) aVar.c.remove(this.b);
        if (buw != null) {
            buw.a.a.a = null;
            return;
        }
        exj exj = this.a;
        exj.a.b(Boolean.FALSE);
    }

    public final brw[] b(a<?> aVar) {
        buw buw = (buw) aVar.c.get(this.b);
        if (buw == null) {
            return null;
        }
        return buw.a.b;
    }

    public final boolean c(a<?> aVar) {
        buw buw = (buw) aVar.c.get(this.b);
        return buw != null && buw.a.c;
    }
}
