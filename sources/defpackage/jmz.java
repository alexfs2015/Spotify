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

/* renamed from: jmz reason: default package */
public final class jmz {
    public final jmu a;
    final jna b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    boolean h;
    public String i;
    private final jty j;
    private final xii<Offer> k;
    private xip l;

    /* renamed from: jmz$a */
    public interface a {
        void a(Offer offer);

        void a(String str);
    }

    public jmz(jmu jmu, xii<Offer> xii, jty jty, jna jna, String str, String str2, String str3, String str4, String str5) {
        this.k = xii;
        this.a = jmu;
        this.j = jty;
        this.b = jna;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
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
        xip xip = this.l;
        if (xip != null && !xip.isUnsubscribed()) {
            this.l.unsubscribe();
            this.l = null;
        }
    }

    public final void a() {
        b();
        this.a.a.clear();
    }

    public final void a(SessionState sessionState) {
        if (sessionState.paymentState().c()) {
            this.h = true;
        }
        this.i = sessionState.countryCode();
    }

    public final void a(Reason reason, String str, String str2, sso sso, SubView subView, Offer offer, String str3) {
        Uri uri;
        a(offer, reason, str, str2, "get", str3, sso);
        jmu jmu = this.a;
        String str4 = "https://www.spotify.com/redirect/generic?redirect_key=android_%s&utm_source=spotify&utm_medium=premium_destination";
        String str5 = "premium";
        if (offer == null) {
            uri = Uri.parse(String.format(str4, new Object[]{str5}));
        } else {
            uri = Uri.parse(String.format(str4, new Object[]{str5}));
            if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equals(offer.adTargetingKey())) {
                Context context = (Context) jmu.a.get();
                if (context != null) {
                    jmr.a(context).a();
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
        jmu.a(subView, uri);
    }

    /* access modifiers changed from: 0000 */
    public void a(Offer offer, Reason reason, String str, String str2, String str3, String str4, sso sso) {
        Optional a2 = jod.a(offer, str, reason, str2, str3, str4, sso);
        if (a2.b()) {
            this.a.a((hdp) a2.c());
        }
    }

    public final void a(String str) {
        jmu jmu = this.a;
        jty jty = this.j;
        Activity activity = (Activity) jmu.a.get();
        if (activity != null) {
            mfo.a(activity, mfw.g().a(jty).a(Uri.parse(str)).a(false).a());
        }
    }

    public final void a(a aVar) {
        b();
        this.l = this.k.a(wit.a(AndroidSchedulers.a())).a((xis<? super T>) new $$Lambda$jmz$97JqeX7_tIILNomOge6yCBDrU9I<Object>(this, aVar), (xis<Throwable>) new $$Lambda$jmz$q4bKosWjzM3aVy5gDetzhb_QuWk<Throwable>(aVar));
    }
}
