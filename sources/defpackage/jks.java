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

/* renamed from: jks reason: default package */
public final class jks extends jlk {
    private static jkj[] p = {jkj.a(R.drawable.ic_offline, R.string.premium_feature_download_music, R.string.premium_feature_download_music_details), jkj.a(R.drawable.ic_no_ads, R.string.premium_feature_ad_free, R.string.premium_feature_ad_free_details), jkj.a(R.drawable.ic_play_any_song, R.string.premium_feature_play_any_song, R.string.premium_feature_play_any_song_details), jkj.a(R.drawable.ic_unlimited_skips, R.string.premium_feature_unlimited_skips, R.string.premium_feature_unlimited_skips_details), jkj.a(R.drawable.ic_hd_audio, R.string.premium_feature_hd_audio, R.string.premium_feature_hd_audio_details)};
    private static jkj[] q = {jkj.a(R.drawable.ic_offline, R.string.premium_feature_download_music, R.string.premium_feature_download_music_details), jkj.a(R.drawable.ic_no_ads, R.string.premium_feature_ad_free, R.string.premium_feature_ad_free_details), jkj.a(R.drawable.ic_hd_audio, R.string.premium_feature_hd_audio, R.string.premium_feature_hd_audio_details)};
    private static jkj[] r = {jkj.a(R.drawable.ic_play_any_song, R.string.premium_feature_play_any_song, R.string.premium_feature_on_trial_on_demand_instructions), jkj.a(R.drawable.ic_offline, R.string.premium_feature_listen_offline, R.string.premium_feature_on_trial_offline_instructions), jkj.a(R.drawable.ic_hd_audio, R.string.premium_feature_hi_def_sound, R.string.premium_feature_on_trial_hd_audio_instructions), jkj.a(R.drawable.ic_no_ads, R.string.premium_feature_no_ads, R.string.premium_feature_on_trial_ad_free_description)};
    private static jkj[] s = {jkj.a(R.drawable.ic_offline, R.string.premium_feature_listen_offline, R.string.premium_feature_on_trial_offline_instructions), jkj.a(R.drawable.ic_hd_audio, R.string.premium_feature_hi_def_sound, R.string.premium_feature_on_trial_hd_audio_instructions), jkj.a(R.drawable.ic_no_ads, R.string.premium_feature_no_ads, R.string.premium_feature_on_trial_ad_free_description)};
    /* access modifiers changed from: 0000 */
    public jkr a;
    /* access modifiers changed from: 0000 */
    public jkn b;
    /* access modifiers changed from: 0000 */
    public jlq c;
    pgr d;
    wuk e = xaj.a();
    private final fpt t;
    private final wug u;
    private final jwl v;
    private String w;

    /* renamed from: jks$a */
    public class a extends defpackage.jlk.a {
        protected a() {
            super();
        }

        public final void a(Offer offer) {
            super.a(offer);
            jks jks = jks.this;
            jks.a(jks.b.h);
        }

        public final void a(String str) {
            super.a(str);
            jks jks = jks.this;
            jks.a(jks.b.h);
        }
    }

    /* renamed from: jks$b */
    public class b implements defpackage.jkn.a {
        protected b() {
        }

        public final void a(Offer offer) {
            a();
        }

        public final void a(String str) {
            a();
        }

        private void a() {
            jks.this.a.d(8);
            jks.this.a.a("");
            jks.this.a.e(0);
            jks.this.a.c(jks.this.c.b());
            jks jks = jks.this;
            jks.a(jks.b.h);
        }
    }

    public jks(jkr jkr, jkn jkn, jkt jkt, sih sih, jlq jlq, pgr pgr, fpt fpt, wug wug, jwl jwl) {
        jkr jkr2 = jkr;
        jkn jkn2 = jkn;
        jlq jlq2 = jlq;
        sih sih2 = sih;
        super(Reason.USER_REQUEST, LogMessage.SEVERITY_INFO, jkt.aj(), jkr2, jkn2, jlq2, sih2, SubView.NONE, "full-page", pgr, fpt);
        this.a = jkr;
        this.b = jkn;
        this.c = jlq;
        this.d = pgr;
        this.t = fpt;
        this.u = wug;
        this.v = jwl;
        this.w = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
    }

    public final void a() {
        if (pgr.a(this.b.i, this.v)) {
            this.b.a(this.w);
        } else {
            super.a();
        }
    }

    public final void b() {
        if (pgr.e(this.t)) {
            this.b.a((defpackage.jkn.a) new b());
        } else {
            this.b.a((defpackage.jkn.a) new a());
        }
    }

    public final void a(SessionState sessionState) {
        String str;
        String str2;
        String str3;
        this.b.a(sessionState);
        boolean z = this.b.h;
        jkr jkr = this.a;
        Context context = (Context) this.c.a.get();
        String str4 = "";
        if (context == null) {
            str = str4;
        } else {
            str = context.getString(z ? R.string.premium_in_app_destination_heading_ontrial : R.string.premium_in_app_destination_heading_free);
        }
        jkr.d(str);
        if (pgr.a(this.b.i, this.v)) {
            jkr jkr2 = this.a;
            Context context2 = (Context) this.c.a.get();
            if (context2 == null) {
                str2 = str4;
            } else {
                str2 = context2.getString(R.string.premium_in_app_destination_heading_6_month_trial);
            }
            jkr2.d(str2);
            jkr jkr3 = this.a;
            Context context3 = (Context) this.c.a.get();
            if (context3 == null) {
                str3 = str4;
            } else {
                str3 = context3.getString(R.string.premium_destination_6_month_secondary_cta);
            }
            jkr3.c(str3);
            jkr jkr4 = this.a;
            Context context4 = (Context) this.c.a.get();
            if (context4 != null) {
                str4 = context4.getString(R.string.premium_destination_terms_apply_6_month_trial);
            }
            jkr4.a(str4);
            this.a.e(0);
            a(this.b.h);
            this.e.unsubscribe();
            jkn jkn = this.b;
            this.e = wuh.a(vun.a((SingleSource<T>) jkn.b.a(jkn.i, jkn.c, jkn.d, jkn.e, jkn.f, jkn.g))).a(this.u).a((wun<? super T>) new $$Lambda$jks$6xikwcj5IYCHwPv4ZwV6CKZGp0<Object>(this), (wun<Throwable>) new $$Lambda$jks$Dh2nE_FMpO5CIg2OUqrxpsM8LI<Throwable>(this));
            return;
        }
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.w = "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=premium_destination";
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jlj jlj) {
        String str;
        if (!jlj.a().isEmpty()) {
            Iterator it = ((jli) jlj.a().get(0)).a().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jlh jlh = (jlh) it.next();
                if ("cta_url".equals(jlh.b())) {
                    str = jlh.c();
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
}
