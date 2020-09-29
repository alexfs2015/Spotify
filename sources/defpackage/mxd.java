package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: mxd reason: default package */
public final class mxd implements tua {
    public mvz a;
    private final mvh b;
    private final mvj c;
    private final gwm d;
    private final mvf e;
    private b<mvz, mvx> f;

    public mxd(mvh mvh, mvj mvj, gwm gwm, mvf mvf) {
        this.b = mvh;
        this.c = mvj;
        this.d = gwm;
        this.e = mvf;
    }

    public final View a(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        mup mup = new mup(context, viewGroup);
        mvl mvl = new mvl(new gwp(this.d, mup), mup);
        this.f = this.b.a(this.a, this.e.a);
        this.f.a(knp.a(this.c, mvl));
        return mvl.a.a;
    }

    public final void a() {
        this.f.d();
    }

    public final void a(View view) {
        this.f.c();
    }
}
