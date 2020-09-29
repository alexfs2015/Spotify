package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: jkn reason: default package */
public final class jkn {
    public final jki a;
    final jko b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    boolean h;
    public String i;
    private final jro j;
    private final wud<Offer> k;
    private wuk l;

    /* renamed from: jkn$a */
    public interface a {
        void a(Offer offer);

        void a(String str);
    }

    public jkn(jki jki, wud<Offer> wud, jro jro, jko jko, String str, String str2, String str3, String str4, String str5) {
        this.k = wud;
        this.a = jki;
        this.j = jro;
        this.b = jko;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final void a(SessionState sessionState) {
        if (sessionState.paymentState().c()) {
            this.h = true;
        }
        this.i = sessionState.countryCode();
    }

    public final void a(a aVar) {
        b();
        this.l = this.k.a(vun.a(AndroidSchedulers.a())).a((wun<? super T>) new $$Lambda$jkn$oFUIQAghclBV3s9CzbazCM9JTOg<Object>(this, aVar), (wun<Throwable>) new $$Lambda$jkn$pN8nbHlZredkXwBcicpnw_rHmKc<Throwable>(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, Offer offer) {
        if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equalsIgnoreCase(offer.adTargetingKey())) {
            aVar.a(offer);
        } else if (!this.j.g()) {
            aVar.a("Cannot show get premium");
        } else {
            aVar.a(offer);
        }
    }

    private void b() {
        wuk wuk = this.l;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.l.unsubscribe();
            this.l = null;
        }
    }

    public final void a(Reason reason, String str, String str2, sih sih, SubView subView, Offer offer, String str3) {
        Uri uri;
        a(offer, reason, str, str2, "get", str3, sih);
        jki jki = this.a;
        String str4 = "https://www.spotify.com/redirect/generic?redirect_key=android_%s&utm_source=spotify&utm_medium=premium_destination";
        String str5 = "premium";
        if (offer == null) {
            uri = Uri.parse(String.format(str4, new Object[]{str5}));
        } else {
            uri = Uri.parse(String.format(str4, new Object[]{str5}));
            if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equals(offer.adTargetingKey())) {
                Context context = (Context) jki.a.get();
                if (context != null) {
                    jkf.a(context).a();
                }
                return;
            }
            String str6 = "utm_campaign";
            if (Offer.AD_TARGETING_KEY_INTRO.equals(offer.adTargetingKey())) {
                uri = uri.buildUpon().appendQueryParameter(str6, "intro").appendQueryParameter("intro-offer", "1").build();
            } else {
                String adTargetingKey = offer.adTargetingKey();
                String str7 = Offer.AD_TARGETING_KEY_WINBACK;
                if (str7.equals(adTargetingKey)) {
                    uri = uri.buildUpon().appendQueryParameter(str6, str7).build();
                } else if (str5.equals(offer.adTargetingKey())) {
                    uri = uri.buildUpon().appendQueryParameter(str6, str5).build();
                } else {
                    if (Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(offer.adTargetingKey())) {
                        uri = uri.buildUpon().appendQueryParameter(str6, "30dt").build();
                    }
                }
            }
        }
        jki.a(subView, uri);
    }

    public final void a() {
        b();
        this.a.a.clear();
    }

    /* access modifiers changed from: 0000 */
    public void a(Offer offer, Reason reason, String str, String str2, String str3, String str4, sih sih) {
        Optional a2 = jlr.a(offer, str, reason, str2, str3, str4, sih);
        if (a2.b()) {
            this.a.a((haw) a2.c());
        }
    }

    public final void a(String str) {
        jki jki = this.a;
        jro jro = this.j;
        Activity activity = (Activity) jki.a.get();
        if (activity != null) {
            mbl.a(activity, mbt.g().a(jro).a(Uri.parse(str)).a(false).a());
        }
    }
}
