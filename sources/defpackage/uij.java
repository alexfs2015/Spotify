package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.podcastentityrow.PlaySourceProvider;
import com.spotify.music.podcastentityrow.PlaySourceProvider.Source;
import com.spotify.playlist.models.Show;

/* renamed from: uij reason: default package */
public final class uij implements uii {
    private final Context a;
    private final who<ugf> b;
    private final boolean c;
    private final uia d;
    private final uif e;
    private final ugi f;
    private final uil g;
    private final jor<ufx> h;
    private final uez i;
    private final ufg j;
    private final uey k;
    private final uex l;
    private final PlaySourceProvider m;
    private final sso n;
    private boolean o;
    private boolean p;

    public uij(Context context, who<ugf> who, boolean z, uia uia, uif uif, ugi ugi, uil uil, jor<ufx> jor, uez uez, ufg ufg, uey uey, uex uex, PlaySourceProvider playSourceProvider, sso sso) {
        this.a = context;
        this.b = who;
        this.c = z;
        this.d = uia;
        this.e = uif;
        this.f = ugi;
        this.g = uil;
        this.h = jor;
        this.i = uez;
        this.j = ufg;
        this.k = uey;
        this.l = uex;
        this.m = playSourceProvider;
        this.n = sso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i2, View view) {
        this.k.onDownloadClick(vkv, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.i.a(vkv, vkvArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vkv vkv, String str, int i2, View view) {
        this.l.a(vkv.getUri(), str, i2);
        this.l.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.m.a = Source.EPISODE_LIST;
        this.j.a(vkv, vkvArr, str, i2);
    }

    public final void a(ucv ucv, int i2) {
        vkv f2 = ((ugf) this.b.get()).f(i2);
        if (f2 != null) {
            vkv[] a2 = ((ugf) this.b.get()).a();
            String b2 = this.f.b(f2);
            boolean a3 = this.e.a(f2);
            Show t = f2.t();
            String a4 = t != null ? t.a() : "";
            ucv.a(a3);
            this.d.a(ucv, this.e.c(f2));
            vkv vkv = f2;
            vkv[] vkvArr = a2;
            String str = b2;
            int i3 = i2;
            $$Lambda$uij$Xq3m3jcNxUYS9C0plV7Rtb_YHQ r1 = new $$Lambda$uij$Xq3m3jcNxUYS9C0plV7Rtb_YHQ(this, vkv, vkvArr, str, i3);
            ucv.b((OnClickListener) r1);
            ucv.c(this.e.b(f2));
            $$Lambda$uij$xEURQySwymuKuSw7qPjo_Rcg4Wo r12 = new $$Lambda$uij$xEURQySwymuKuSw7qPjo_Rcg4Wo(this, vkv, vkvArr, str, i3);
            ucv.a((OnClickListener) r12);
            ucv.a(f2.a());
            ucv.b(a4);
            if (a4.isEmpty()) {
                ucv.f();
            } else {
                ucv.e();
            }
            uia.b((ucs) ucv, f2);
            uia.a(ucv, f2);
            ucv.c(this.g.a(a4, f2, a3, false));
            uia.a((ucs) ucv, f2, this.c);
            if (this.o) {
                ucv.b(ucx.c(this.a));
                ucv.e(this.a.getString(R.string.mark_as_played_button_content_description));
                ucv.c((OnClickListener) new $$Lambda$uij$wxW0hldh_UpT0Mt_y5ySmipEXrM(this, f2, b2, i2));
                ucv.g(true);
            } else {
                ucv.g(false);
            }
            $$Lambda$uij$wFa0GTawPcZWqfxcsr9T3xJhx0 r13 = new $$Lambda$uij$wFa0GTawPcZWqfxcsr9T3xJhx0(this, f2, b2, i2);
            if (this.p) {
                uia.b(ucv, f2.k());
                uia.a(ucv, (OnClickListener) r13);
                this.d.a(f2.getUri(), ucv, f2.u());
            } else {
                ucv.i(f2.k());
                ucv.d((OnClickListener) r13);
                this.d.a(ucv, f2.u());
            }
            View a5 = jqq.a(this.a, this.h, ufx.a(f2, b2, i2), this.n);
            a5.setId(R.id.context_menu_tag);
            ucv.a(a5);
            if (a3) {
                uia.a(ucv, this.e.a(), f2.m(), f2.o());
            } else {
                this.d.a((ucs) ucv, f2);
            }
        }
    }

    public final void a(boolean z) {
        this.o = z;
    }

    public final void b(boolean z) {
        this.p = z;
    }
}
