package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: pka reason: default package */
public final class pka implements pjz {
    private final who<a> a;
    private final utg b;
    private final Context c;
    private final fzt d;
    private gcp<fzn> e;

    public pka(Context context, fzt fzt, utg utg, who<a> who) {
        this.c = context;
        this.d = fzt;
        this.b = utg;
        this.a = who;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        ((a) this.a.get()).d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4) {
        ((a) this.a.get()).a(str, str2, str3, this.c.getString(R.string.share_episode_of_name, new Object[]{str4}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pjr pjr, fzn fzn) {
        Runnable runnable;
        Drawable drawable;
        int i;
        Runnable runnable2;
        int i2;
        Drawable drawable2;
        fzn.a(utg.a("", (String) fbp.a(pjr.j()), true), SpotifyIconV2.PODCASTS, false, true);
        fzn.b(pjr.g());
        fzn.c(pjr.f());
        if (pjr.n() == 3) {
            i = R.string.options_menu_download;
            drawable = fzz.a(this.c, SpotifyIconV2.DOWNLOAD);
            runnable = new $$Lambda$pka$g3jTKhZ4ErHiPkAu48WlzWomsOM(this, pjr);
        } else {
            Drawable a2 = fzz.a(this.c, SpotifyIconV2.DOWNLOADED, fr.c(this.c, R.color.cat_accessory_green));
            runnable = new $$Lambda$pka$tmhfWw7Fii2BpPkkqFx3AlONlx4(this, pjr);
            drawable = a2;
            i = R.string.options_menu_undownload;
        }
        fzn.a((int) R.id.options_menu_download, i, drawable).a(runnable);
        if (pjr.a() == 2) {
            int c2 = fr.c(this.c, R.color.cat_accessory_green);
            i2 = R.string.episode_context_menu_mark_as_unplayed;
            drawable2 = fzz.a(this.c, SpotifyIconV2.CHECK_ALT_FILL, c2);
            runnable2 = new $$Lambda$pka$DYjvVCqgqmsIPokk9KMVzhT3IVU(this, pjr);
        } else {
            i2 = R.string.episode_context_menu_mark_as_played;
            drawable2 = fzz.a(this.c, SpotifyIconV2.CHECK);
            runnable2 = new $$Lambda$pka$ncRoLvPAuHs1K9cG1mhesABejHo(this, pjr);
        }
        fzn.a((int) R.id.options_menu_mark_as_played, i2, drawable2).a(runnable2);
        this.d.c(fzn, new $$Lambda$pka$gsezo7JKF6YQQMRXeyfqj8G78d4(this, pjr));
        String j = pjr.j();
        String g = pjr.g();
        String l = pjr.l();
        String f = pjr.f();
        fzt fzt = this.d;
        $$Lambda$pka$7C7B4T0N9Juhoty7RyrdRnHUR0 r2 = new $$Lambda$pka$7C7B4T0N9Juhoty7RyrdRnHUR0(this, j, g, l, f);
        fzt.a(fzn, r2);
        fzn.a((int) R.id.options_menu_browse_show, (int) R.string.context_menu_browse_show, fzz.a(this.c, SpotifyIconV2.PODCASTS)).a(new $$Lambda$pka$LurTbV_9ZKXym3ged_U0GLv0eQ(this, pjr));
        if (pjr.k()) {
            this.d.d(fzn, new $$Lambda$pka$SNLOdu_f4w748Xa1up1SKFspuP0(this, pjr));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(pjr pjr) {
        ((a) this.a.get()).f(pjr.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(pjr pjr) {
        ((a) this.a.get()).g(pjr.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(pjr pjr) {
        ((a) this.a.get()).c(pjr.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(pjr pjr) {
        ((a) this.a.get()).b(pjr.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(pjr pjr) {
        ((a) this.a.get()).a(pjr.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(pjr pjr) {
        ((a) this.a.get()).e(pjr.i());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(pjr pjr) {
        ((a) this.a.get()).a(pjr.j(), pjr.m());
    }

    public final void a(fzn fzn) {
        gcp<fzn> gcp = this.e;
        if (gcp != null) {
            gcp.accept(fzn);
        }
    }

    public final void a(String str) {
        pja.a(this.c, (OnClickListener) new $$Lambda$pka$DjHdrJq_J2w9PKqtrHhkQMImu0A(this, str));
    }

    public final void a(pjr pjr) {
        this.e = new $$Lambda$pka$g167ogv6h2iqpegiCasfwSABPFo(this, pjr);
        ((a) this.a.get()).a();
    }
}
