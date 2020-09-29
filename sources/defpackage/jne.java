package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import io.reactivex.SingleSource;
import java.util.Iterator;

/* renamed from: jne reason: default package */
public final class jne extends jnw {
    private static jmv[] p = {jmv.a(R.drawable.ic_offline, R.string.premium_feature_download_music, R.string.premium_feature_download_music_details), jmv.a(R.drawable.ic_no_ads, R.string.premium_feature_ad_free, R.string.premium_feature_ad_free_details), jmv.a(R.drawable.ic_play_any_song, R.string.premium_feature_play_any_song, R.string.premium_feature_play_any_song_details), jmv.a(R.drawable.ic_unlimited_skips, R.string.premium_feature_unlimited_skips, R.string.premium_feature_unlimited_skips_details), jmv.a(R.drawable.ic_hd_audio, R.string.premium_feature_hd_audio, R.string.premium_feature_hd_audio_details)};
    private static jmv[] q = {jmv.a(R.drawable.ic_offline, R.string.premium_feature_download_music, R.string.premium_feature_download_music_details), jmv.a(R.drawable.ic_no_ads, R.string.premium_feature_ad_free, R.string.premium_feature_ad_free_details), jmv.a(R.drawable.ic_hd_audio, R.string.premium_feature_hd_audio, R.string.premium_feature_hd_audio_details)};
    private static jmv[] r = {jmv.a(R.drawable.ic_play_any_song, R.string.premium_feature_play_any_song, R.string.premium_feature_on_trial_on_demand_instructions), jmv.a(R.drawable.ic_offline, R.string.premium_feature_listen_offline, R.string.premium_feature_on_trial_offline_instructions), jmv.a(R.drawable.ic_hd_audio, R.string.premium_feature_hi_def_sound, R.string.premium_feature_on_trial_hd_audio_instructions), jmv.a(R.drawable.ic_no_ads, R.string.premium_feature_no_ads, R.string.premium_feature_on_trial_ad_free_description)};
    private static jmv[] s = {jmv.a(R.drawable.ic_offline, R.string.premium_feature_listen_offline, R.string.premium_feature_on_trial_offline_instructions), jmv.a(R.drawable.ic_hd_audio, R.string.premium_feature_hi_def_sound, R.string.premium_feature_on_trial_hd_audio_instructions), jmv.a(R.drawable.ic_no_ads, R.string.premium_feature_no_ads, R.string.premium_feature_on_trial_ad_free_description)};
    /* access modifiers changed from: 0000 */
    public jnd a;
    /* access modifiers changed from: 0000 */
    public jmz b;
    /* access modifiers changed from: 0000 */
    public joc c;
    pns d;
    xip e = xon.a();
    private final fqn t;
    private final xil u;
    private final voy v;
    private String w;

    /* renamed from: jne$a */
    public class a extends defpackage.jnw.a {
        protected a() {
            super();
        }

        public final void a(Offer offer) {
            super.a(offer);
            jne jne = jne.this;
            jne.a(jne.b.h);
        }

        public final void a(String str) {
            super.a(str);
            jne jne = jne.this;
            jne.a(jne.b.h);
        }
    }

    /* renamed from: jne$b */
    public class b implements defpackage.jmz.a {
        protected b() {
        }

        private void a() {
            jne.this.a.d(8);
            jne.this.a.a("");
            jne.this.a.e(0);
            jne.this.a.c(jne.this.c.b());
            jne jne = jne.this;
            jne.a(jne.b.h);
        }

        public final void a(Offer offer) {
            a();
        }

        public final void a(String str) {
            a();
        }
    }

    public jne(jnd jnd, jmz jmz, jnf jnf, sso sso, joc joc, pns pns, fqn fqn, xil xil, voy voy) {
        jnd jnd2 = jnd;
        jmz jmz2 = jmz;
        joc joc2 = joc;
        sso sso2 = sso;
        super(Reason.USER_REQUEST, LogMessage.SEVERITY_INFO, jnf.aj(), jnd2, jmz2, joc2, sso2, SubView.NONE, "full-page", pns, fqn);
        this.a = jnd;
        this.b = jmz;
        this.c = joc;
        this.d = pns;
        this.t = fqn;
        this.u = xil;
        this.v = voy;
        this.w = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.w = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
        this.a.b(this.c.a());
        this.a.d(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jnv jnv) {
        String str;
        if (!jnv.a().isEmpty()) {
            Iterator it = ((jnu) jnv.a().get(0)).a().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jnt jnt = (jnt) it.next();
                if ("cta_url".equals(jnt.b())) {
                    str = jnt.c();
                    break;
                }
            }
            this.w = str;
            this.a.b(this.c.a());
            this.a.d(0);
        }
        str = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
        this.w = str;
        this.a.b(this.c.a());
        this.a.d(0);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        String a2 = this.c.a(z);
        if ("IN".equals(this.b.i)) {
            if (z) {
                this.a.a(a2, s);
            } else {
                this.a.a(a2, q);
            }
        } else if (z) {
            this.a.a(a2, r);
        } else {
            this.a.a(a2, p);
        }
    }

    public final void a() {
        if (pns.a(this.b.i, this.v)) {
            this.b.a(this.w);
        } else {
            super.a();
        }
    }

    public final void a(SessionState sessionState) {
        String str;
        this.b.a(sessionState);
        boolean z = this.b.h;
        jnd jnd = this.a;
        Context context = (Context) this.c.a.get();
        String str2 = "";
        if (context == null) {
            str = str2;
        } else {
            str = context.getString(z ? R.string.premium_in_app_destination_heading_ontrial : R.string.premium_in_app_destination_heading_free);
        }
        jnd.d(str);
        if (pns.a(this.b.i, this.v)) {
            Context context2 = (Context) this.c.a.get();
            this.a.d(context2 == null ? str2 : context2.getString(R.string.premium_in_app_destination_heading_6_month_trial));
            Context context3 = (Context) this.c.a.get();
            this.a.c(context3 == null ? str2 : context3.getString(R.string.premium_destination_6_month_secondary_cta));
            jnd jnd2 = this.a;
            Context context4 = (Context) this.c.a.get();
            if (context4 != null) {
                str2 = context4.getString(R.string.premium_destination_terms_apply_6_month_trial);
            }
            jnd2.a(str2);
            this.a.e(0);
            a(this.b.h);
            this.e.unsubscribe();
            jmz jmz = this.b;
            this.e = xim.a(wit.a((SingleSource<T>) jmz.b.a(jmz.i, jmz.c, jmz.d, jmz.e, jmz.f, jmz.g))).a(this.u).a((xis<? super T>) new $$Lambda$jne$GWahdoDNlllFHcw7aawtf18Bvtw<Object>(this), (xis<Throwable>) new $$Lambda$jne$6jqsFeddUdAEe3JIpBJebxKyvo<Throwable>(this));
            return;
        }
        b();
    }

    public final void b() {
        if (pns.a(this.t)) {
            this.b.a((defpackage.jmz.a) new b());
        } else {
            this.b.a((defpackage.jmz.a) new a());
        }
    }
}
