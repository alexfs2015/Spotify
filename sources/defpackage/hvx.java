package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;

/* renamed from: hvx reason: default package */
public final class hvx implements hvw {
    private final Resources a;
    private final hvz b;
    private final hgz c;
    private final hqy d;
    private final PublishSubject<hwb> e = PublishSubject.a();

    public hvx(Resources resources, hvz hvz, hgz hgz, hqy hqy) {
        this.a = resources;
        this.b = hvz;
        this.c = hgz;
        this.d = hqy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, int i, int i2, Bundle bundle, String str2) {
        return this.b.a(str, str2, i, i2, bundle);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Disposable disposable) {
        this.d.a(str, "search", "search", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSearch query: %s", str2);
    }

    public final Single<Response> a(String str, int i, int i2, String str2, Bundle bundle) {
        Single h = this.c.b("country_code").c(1).h();
        $$Lambda$hvx$JRCWvRwLShv2XdtOv3W1qXAM7e0 r0 = new $$Lambda$hvx$JRCWvRwLShv2XdtOv3W1qXAM7e0(this, str, 0, 50, bundle);
        return h.a((Function<? super T, ? extends SingleSource<? extends R>>) r0).f($$Lambda$HZA9jS57Mnu3uMuaN_gRsx9qezg.INSTANCE).a((Consumer<? super Disposable>) new $$Lambda$hvx$2U9bdM0J_jaxfidjhA_Stv62KHs<Object>(this, str2, str));
    }

    public final void a() {
        this.e.onNext(hwb.a(true, null));
    }

    public final void a(int i) {
        this.e.onNext(hwb.a(false, this.a.getString(i)));
    }

    public final Observable<hwb> b() {
        return this.e;
    }
}
