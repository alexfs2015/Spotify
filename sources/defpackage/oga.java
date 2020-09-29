package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: oga reason: default package */
public final class oga implements ofx {
    private final ogc a;
    private final Context b;
    private final ogg c;

    public oga(ogg ogg, ogc ogc, Context context) {
        this.c = ogg;
        this.a = ogc;
        this.b = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Boolean bool) {
        return bool.booleanValue() ? Single.b(Boolean.TRUE) : e();
    }

    private Single<Boolean> e() {
        Single a2 = this.c.a(b());
        ogc ogc = this.a;
        ogc.getClass();
        return a2.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$Az_hT_Xo93c7GCtxVbw1qBVCVI<Object,Object>(ogc));
    }

    public final boolean a() {
        return new Intent("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT").resolveActivity(this.b.getPackageManager()) != null;
    }

    public final boolean b() {
        return AccountManager.get(this.b).getAccountsByType("com.osp.app.signin").length > 0;
    }

    public final Single<Boolean> c() {
        return this.a.a();
    }

    public final Single<Boolean> d() {
        return e().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$oga$5O5AwMFTHJ9SXJpRIPU93wEhI<Object,Object>(this));
    }
}
