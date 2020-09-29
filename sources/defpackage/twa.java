package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.playlist.models.Show;

/* renamed from: twa reason: default package */
public final class twa implements tvz {
    private final Context a;
    private final vti<tuc> b;
    private final boolean c;
    private final tuf d;
    private final twi e;
    private final tvx f;
    private final twc g;
    private final ttd h;
    private final tsu i;
    private boolean j;

    public twa(Context context, vti<tuc> vti, boolean z, tvx tvx, twc twc, tuf tuf, twi twi, ttd ttd, tsu tsu) {
        this.a = context;
        this.b = vti;
        this.c = z;
        this.f = tvx;
        this.g = twc;
        this.d = tuf;
        this.e = twi;
        this.h = ttd;
        this.i = tsu;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final void a(tqp tqp, int i2) {
        String str;
        uys f2 = ((tuc) this.b.get()).f(i2);
        if (f2 != null) {
            uys[] a2 = ((tuc) this.b.get()).a();
            String b2 = this.d.b(f2);
            boolean a3 = this.g.a(f2);
            Show t = f2.t();
            if (t != null) {
                str = t.a();
            } else {
                str = "";
            }
            String str2 = str;
            tqp.a(a3);
            tqp.c(this.g.b(f2));
            $$Lambda$twa$lLr_vemX_kpfylWANPu6wOGMVM r1 = new $$Lambda$twa$lLr_vemX_kpfylWANPu6wOGMVM(this, f2, a2, b2, i2);
            tqp.a((OnClickListener) r1);
            tqp.a(f2.a());
            tqp.b(this.e.a(str2, f2, a3, false));
            if (this.j) {
                tqp.a(tqu.c(this.a));
                tqp.b(this.a.getString(R.string.mark_as_played_button_content_description));
                tqp.b((OnClickListener) new $$Lambda$twa$K1KWRPEs0JKXpSjfX94UwQQq2o(this, f2, b2, i2));
                tqp.d(true);
            } else {
                tqp.d(false);
            }
            tvx.b(tqp, f2);
            tvx.a(tqp, f2, this.c);
            this.f.a(tqp, f2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.h.a(uys, uysArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i2, View view) {
        this.i.a(uys.getUri(), str, i2);
        this.i.a();
    }
}
