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

/* renamed from: rlp reason: default package */
public final class rlp {
    static final b<Object, String> a = b.a("crashlytics_user_id");
    private static final b<Object, String> b = b.a("crashlytics_partner_id");
    private final SpSharedPreferences<Object> c;
    private final PartnerUserIdEndpoint d;
    private final Scheduler e;
    private Disposable f = Disposables.b();

    public rlp(SpSharedPreferences<Object> spSharedPreferences, PartnerUserIdEndpoint partnerUserIdEndpoint, Scheduler scheduler) {
        this.c = (SpSharedPreferences) fay.a(spSharedPreferences);
        this.d = (PartnerUserIdEndpoint) fay.a(partnerUserIdEndpoint);
        this.e = (Scheduler) fay.a(scheduler);
    }

    public final void a(String str, gbr<String> gbr) {
        String a2 = this.c.a(a, (String) null);
        String a3 = this.c.a(b, (String) null);
        if (a3 == null || !faw.a(str, a2)) {
            if (!this.f.b()) {
                this.f.bf_();
            }
            this.f = this.d.a(Vendor.CRASHLYTICS).a(this.e).a((Consumer<? super T>) new $$Lambda$rlp$pYtocARnblSMTKev59VCBjh0cw4<Object>(this, str, gbr), (Consumer<? super Throwable>) $$Lambda$rlp$z0SXlw68iOkLzeRQL0eTSe_lc.INSTANCE);
            return;
        }
        Logger.b("Cached partner ID %s for Crashlytics fetched", a3);
        gbr.accept(a3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gbr gbr, String str2) {
        Logger.b("Partner-id %s for %s fetched", str2, str);
        this.c.a().a(a, str).a(b, str2).b();
        gbr.accept(str2);
    }
}
