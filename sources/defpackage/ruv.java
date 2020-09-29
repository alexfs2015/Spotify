package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint.Vendor;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: ruv reason: default package */
public final class ruv {
    static final b<Object, String> a = b.a("crashlytics_user_id");
    private static final b<Object, String> b = b.a("crashlytics_partner_id");
    private final SpSharedPreferences<Object> c;
    private final PartnerUserIdEndpoint d;
    private final Scheduler e;
    private Disposable f = Disposables.b();

    public ruv(SpSharedPreferences<Object> spSharedPreferences, PartnerUserIdEndpoint partnerUserIdEndpoint, Scheduler scheduler) {
        this.c = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.d = (PartnerUserIdEndpoint) fbp.a(partnerUserIdEndpoint);
        this.e = (Scheduler) fbp.a(scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gcp gcp, String str2) {
        Logger.b("Partner-id %s for %s fetched", str2, str);
        this.c.a().a(a, str).a(b, str2).b();
        gcp.accept(str2);
    }

    public final void a(String str, gcp<String> gcp) {
        String a2 = this.c.a(a, (String) null);
        String a3 = this.c.a(b, (String) null);
        if (a3 == null || !fbn.a(str, a2)) {
            if (!this.f.b()) {
                this.f.bd_();
            }
            this.f = this.d.a(Vendor.CRASHLYTICS).a(this.e).a((Consumer<? super T>) new $$Lambda$ruv$XqUmw9wMFovgspi36CLiuFXyt74<Object>(this, str, gcp), (Consumer<? super Throwable>) $$Lambda$ruv$_dpd9M2bWXTAH1JP0ZcOTVoCd4.INSTANCE);
            return;
        }
        Logger.b("Cached partner ID %s for Crashlytics fetched", a3);
        gcp.accept(a3);
    }
}
