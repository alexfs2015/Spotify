package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.podcastentityrow.PlaySourceProvider;
import com.spotify.music.podcastentityrow.PlaySourceProvider.Source;
import com.spotify.playlist.models.Show;

/* renamed from: twg reason: default package */
public final class twg implements twf {
    private final Context a;
    private final vti<tuc> b;
    private final boolean c;
    private final tvx d;
    private final twc e;
    private final tuf f;
    private final twi g;
    private final jmf<ttu> h;
    private final tsw i;
    private final ttd j;
    private final tsv k;
    private final tsu l;
    private final PlaySourceProvider m;
    private final sih n;
    private boolean o;
    private boolean p;

    public twg(Context context, vti<tuc> vti, boolean z, tvx tvx, twc twc, tuf tuf, twi twi, jmf<ttu> jmf, tsw tsw, ttd ttd, tsv tsv, tsu tsu, PlaySourceProvider playSourceProvider, sih sih) {
        this.a = context;
        this.b = vti;
        this.c = z;
        this.d = tvx;
        this.e = twc;
        this.f = tuf;
        this.g = twi;
        this.h = jmf;
        this.i = tsw;
        this.j = ttd;
        this.k = tsv;
        this.l = tsu;
        this.m = playSourceProvider;
        this.n = sih;
    }

    public final void a(boolean z) {
        this.o = z;
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final void a(tqs tqs, int i2) {
        String str;
        uys f2 = ((tuc) this.b.get()).f(i2);
        if (f2 != null) {
            uys[] a2 = ((tuc) this.b.get()).a();
            String b2 = this.f.b(f2);
            boolean a3 = this.e.a(f2);
            Show t = f2.t();
            if (t != null) {
                str = t.a();
            } else {
                str = "";
            }
            String str2 = str;
            tqs.a(a3);
            this.d.a(tqs, this.e.c(f2));
            uys uys = f2;
            uys[] uysArr = a2;
            String str3 = b2;
            int i3 = i2;
            $$Lambda$twg$krn6nicrNCct3PaD2VEWvn2KZFQ r1 = new $$Lambda$twg$krn6nicrNCct3PaD2VEWvn2KZFQ(this, uys, uysArr, str3, i3);
            tqs.b((OnClickListener) r1);
            tqs.c(this.e.b(f2));
            $$Lambda$twg$kk2LOHtvAeaWkwKOHN5beD3ukCk r12 = new $$Lambda$twg$kk2LOHtvAeaWkwKOHN5beD3ukCk(this, uys, uysArr, str3, i3);
            tqs.a((OnClickListener) r12);
            tqs.a(f2.a());
            tqs.b(str2);
            if (str2.isEmpty()) {
                tqs.f();
            } else {
                tqs.e();
            }
            tvx.b((tqp) tqs, f2);
            tvx.a(tqs, f2);
            $$Lambda$twg$3pxQW1eG2Y0JaMBgezC5LHa1gA r13 = new $$Lambda$twg$3pxQW1eG2Y0JaMBgezC5LHa1gA(this, f2, a2, b2, i2);
            tqs.c((OnClickListener) r13);
            tqs.c(this.g.a(str2, f2, a3, false));
            tvx.a((tqp) tqs, f2, this.c);
            if (this.o) {
                tqs.b(tqu.c(this.a));
                tqs.e(this.a.getString(R.string.mark_as_played_button_content_description));
                tqs.d((OnClickListener) new $$Lambda$twg$w39DHWns2uBnRiaGPgp2zmpCpc(this, f2, b2, i2));
                tqs.g(true);
            } else {
                tqs.g(false);
            }
            $$Lambda$twg$IEQGziDuno18u7Qtn3r0LlTyK4 r14 = new $$Lambda$twg$IEQGziDuno18u7Qtn3r0LlTyK4(this, f2, b2, i2);
            if (this.p) {
                tvx.b(tqs, f2.k());
                tvx.a(tqs, (OnClickListener) r14);
                this.d.a(f2.getUri(), tqs, f2.u());
            } else {
                tqs.i(f2.k());
                tqs.e((OnClickListener) r14);
                this.d.a(tqs, f2.u());
            }
            View a4 = joe.a(this.a, this.h, ttu.a(f2, b2, i2), this.n);
            a4.setId(R.id.context_menu_tag);
            tqs.a(a4);
            if (a3) {
                tvx.a((tqp) tqs, this.e.a(), f2.m(), f2.o());
            } else {
                this.d.a((tqp) tqs, f2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.m.a = Source.EPISODE_LIST;
        this.j.a(uys, uysArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.i.a(uys, uysArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.i.a(uys, uysArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uys uys, String str, int i2, View view) {
        this.l.a(uys.getUri(), str, i2);
        this.l.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i2, View view) {
        this.k.onDownloadClick(uys, str, i2);
    }
}
