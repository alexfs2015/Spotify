package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.music.R;
import com.spotify.playlist.models.Show;

/* renamed from: uid reason: default package */
public final class uid implements uic {
    private final Context a;
    private final who<ugf> b;
    private final boolean c;
    private final ugi d;
    private final uil e;
    private final uia f;
    private final uif g;
    private final ufg h;
    private final uex i;
    private boolean j;

    public uid(Context context, who<ugf> who, boolean z, uia uia, uif uif, ugi ugi, uil uil, ufg ufg, uex uex) {
        this.a = context;
        this.b = who;
        this.c = z;
        this.f = uia;
        this.g = uif;
        this.d = ugi;
        this.e = uil;
        this.h = ufg;
        this.i = uex;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i2, View view) {
        this.i.a(vkv.getUri(), str, i2);
        this.i.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.h.a(vkv, vkvArr, str, i2);
    }

    public final void a(ucs ucs, int i2) {
        vkv f2 = ((ugf) this.b.get()).f(i2);
        if (f2 != null) {
            vkv[] a2 = ((ugf) this.b.get()).a();
            String b2 = this.d.b(f2);
            boolean a3 = this.g.a(f2);
            Show t = f2.t();
            String a4 = t != null ? t.a() : "";
            ucs.a(a3);
            ucs.c(this.g.b(f2));
            $$Lambda$uid$aL3PiHcSCsKZzfdZWKJUH4va6U r1 = new $$Lambda$uid$aL3PiHcSCsKZzfdZWKJUH4va6U(this, f2, a2, b2, i2);
            ucs.a((OnClickListener) r1);
            ucs.a(f2.a());
            ucs.b(this.e.a(a4, f2, a3, false));
            if (this.j) {
                ucs.a(ucx.c(this.a));
                ucs.b(this.a.getString(R.string.mark_as_played_button_content_description));
                ucs.b((OnClickListener) new $$Lambda$uid$973p0r7l1nLXmPveGEtAVab_NP0(this, f2, b2, i2));
                ucs.d(true);
            } else {
                ucs.d(false);
            }
            uia.b(ucs, f2);
            uia.a(ucs, f2, this.c);
            this.f.a(ucs, f2);
        }
    }

    public final void a(boolean z) {
        this.j = z;
    }
}
