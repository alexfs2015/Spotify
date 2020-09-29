package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: pco reason: default package */
public final class pco implements pcn {
    private final vti<a> a;
    private final uhs b;
    private final Context c;
    private final fyz d;
    private gbr<fyt> e;

    public pco(Context context, fyz fyz, uhs uhs, vti<a> vti) {
        this.c = context;
        this.d = fyz;
        this.b = uhs;
        this.a = vti;
    }

    public final void a(fyt fyt) {
        gbr<fyt> gbr = this.e;
        if (gbr != null) {
            gbr.accept(fyt);
        }
    }

    public final void a(pci pci) {
        this.e = new $$Lambda$pco$1FbjyGtoiNWkHzMq87rcdqpCvLM(this, pci);
        ((a) this.a.get()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pci pci, fyt fyt) {
        Runnable runnable;
        Drawable drawable;
        int i;
        Runnable runnable2;
        int i2;
        Drawable drawable2;
        fyt.a(uhs.a("", (String) fay.a(pci.j()), true), SpotifyIconV2.PODCASTS, false, true);
        fyt.b(pci.g());
        fyt.c(pci.f());
        if (pci.n() == 3) {
            i = R.string.options_menu_download;
            drawable = fzf.a(this.c, SpotifyIconV2.DOWNLOAD);
            runnable = new $$Lambda$pco$LN1i75kDEybAD5fJLxJfz7a8CPE(this, pci);
        } else {
            Drawable a2 = fzf.a(this.c, SpotifyIconV2.DOWNLOADED, fr.c(this.c, R.color.cat_accessory_green));
            runnable = new $$Lambda$pco$NYkfr9EXFQiq611xhfZjqqhaq6o(this, pci);
            drawable = a2;
            i = R.string.options_menu_undownload;
        }
        fyt.a((int) R.id.options_menu_download, i, drawable).a(runnable);
        if (pci.a() == 2) {
            int c2 = fr.c(this.c, R.color.cat_accessory_green);
            i2 = R.string.episode_context_menu_mark_as_unplayed;
            drawable2 = fzf.a(this.c, SpotifyIconV2.CHECK_ALT_FILL, c2);
            runnable2 = new $$Lambda$pco$KOm4u9O7wfT39wMDlPrprJlAgw(this, pci);
        } else {
            i2 = R.string.episode_context_menu_mark_as_played;
            drawable2 = fzf.a(this.c, SpotifyIconV2.CHECK);
            runnable2 = new $$Lambda$pco$TcBSKOc1New9CrLsj5doyMSNh8(this, pci);
        }
        fyt.a((int) R.id.options_menu_mark_as_played, i2, drawable2).a(runnable2);
        this.d.c(fyt, new $$Lambda$pco$1MDqvvkx1mWZ8Z4EpKtzUUDNu0(this, pci));
        String j = pci.j();
        String g = pci.g();
        String l = pci.l();
        String f = pci.f();
        fyz fyz = this.d;
        $$Lambda$pco$sLuusnLVxtrXgWSfIKYjMWXVlwU r2 = new $$Lambda$pco$sLuusnLVxtrXgWSfIKYjMWXVlwU(this, j, g, l, f);
        fyz.a(fyt, r2);
        fyt.a((int) R.id.options_menu_browse_show, (int) R.string.context_menu_browse_show, fzf.a(this.c, SpotifyIconV2.PODCASTS)).a(new $$Lambda$pco$R2G4VktQW3_fLmmA3PStFd5HddU(this, pci));
        if (pci.k()) {
            this.d.d(fyt, new $$Lambda$pco$aXjgrXVn4T7wnmRsNWcv3tkd1TY(this, pci));
        }
    }

    public final void a(String str) {
        pbr.a(this.c, (OnClickListener) new $$Lambda$pco$nRjGRk0ox7KjlKFalGbrw7oGFM(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        ((a) this.a.get()).d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(pci pci) {
        ((a) this.a.get()).a(pci.j(), pci.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(pci pci) {
        ((a) this.a.get()).e(pci.i());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4) {
        ((a) this.a.get()).a(str, str2, str3, this.c.getString(R.string.share_episode_of_name, new Object[]{str4}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(pci pci) {
        ((a) this.a.get()).a(pci.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(pci pci) {
        ((a) this.a.get()).b(pci.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(pci pci) {
        ((a) this.a.get()).c(pci.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(pci pci) {
        ((a) this.a.get()).g(pci.j());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(pci pci) {
        ((a) this.a.get()).f(pci.j());
    }
}
