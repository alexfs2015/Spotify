package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: mdc reason: default package */
public class mdc extends jpm {
    public heg T;
    private xag U;
    public mdb a;
    public mcz b;

    public static mdc e() {
        mdc mdc = new mdc();
        mdc.g(new Bundle());
        return mdc;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.U = new xag();
    }

    public final void g() {
        super.g();
        this.U.a(this.a.a().a(vun.a(this.T.c())).a((wun<? super T>) new $$Lambda$mdc$L2nhKMKmzYaVbNWB0CHEIzCDnIM<Object>(this), (wun<Throwable>) $$Lambda$mdc$PNSJ8NUg6KjWZk1PpyPd3x65JD4.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.Y.a((jpm) this);
        }
    }

    public final void h() {
        this.U.unsubscribe();
        this.b.a.bf_();
        super.h();
    }

    public final void c() {
        super.c();
        this.b.a((Activity) fay.a(p()));
    }
}
