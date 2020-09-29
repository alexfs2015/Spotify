package defpackage;

import com.google.common.base.Optional;

/* renamed from: gbm reason: default package */
public final class gbm {
    private final gbp a;
    private final jtz b;

    public gbm(gbp gbp, jtz jtz) {
        this.a = gbp;
        this.b = jtz;
    }

    public final void a(gbu gbu, String str) {
        this.a.a(new i(gbu, str, this.b.c()));
    }

    public final void a(gbu gbu, String str, int i) {
        this.a.a(gbr.a(gbu, str, this.b.c(), Optional.b(Integer.valueOf(i))));
    }

    public final void b(gbu gbu, String str) {
        this.a.a(gbr.a(gbu, str, this.b.c(), Optional.e()));
    }
}
