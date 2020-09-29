package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bvz reason: default package */
public final class bvz extends bvx<Boolean> {
    private final a<?> b;

    public bvz(a<?> aVar, eya<Boolean> eya) {
        super(4, eya);
        this.b = aVar;
    }

    public final /* bridge */ /* synthetic */ void a(btt btt, boolean z) {
    }

    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }

    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    public final bsn[] b(a<?> aVar) {
        bvn bvn = (bvn) aVar.c.get(this.b);
        if (bvn == null) {
            return null;
        }
        return bvn.a.b;
    }

    public final boolean c(a<?> aVar) {
        bvn bvn = (bvn) aVar.c.get(this.b);
        return bvn != null && bvn.a.c;
    }

    public final void d(a<?> aVar) {
        bvn bvn = (bvn) aVar.c.remove(this.b);
        if (bvn != null) {
            bvn.a.a.a = null;
            return;
        }
        eya eya = this.a;
        eya.a.b(Boolean.FALSE);
    }
}
