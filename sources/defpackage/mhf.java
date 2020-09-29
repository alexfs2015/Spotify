package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: mhf reason: default package */
public class mhf extends jry {
    public hhc T;
    private xok U;
    public mhe a;
    public mhc b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.Y.a((jry) this);
        }
    }

    public static mhf e() {
        mhf mhf = new mhf();
        mhf.g(new Bundle());
        return mhf;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        this.U.a(this.a.a().a(wit.a(this.T.c())).a((xis<? super T>) new $$Lambda$mhf$AwSYOqudjRvGUWr2SKHU6Ju_8Xg<Object>(this), (xis<Throwable>) $$Lambda$mhf$RFItngD57a0finHlWK2XxXVJc9Y.INSTANCE));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.U = new xok();
    }

    public final void c() {
        super.c();
        this.b.a((Activity) fbp.a(p()));
    }

    public final void h() {
        this.U.unsubscribe();
        this.b.a.bd_();
        super.h();
    }
}
