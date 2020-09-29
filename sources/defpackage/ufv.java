package defpackage;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.hash.Hashing;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;
import com.squareup.picasso.Picasso;

@Deprecated
/* renamed from: ufv reason: default package */
public final class ufv extends androidx.recyclerview.widget.RecyclerView.a<a> implements gkv, ugf {
    final Picasso a;
    public final ugb d;
    public final ufa e;
    public vkv[] f;
    private final uii g;
    private final uic h;
    private final ufn i;
    private final ugl j;
    private final fqn k;
    private final uif l;

    /* renamed from: ufv$a */
    static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public ufv(Picasso picasso, ugb ugb, uii uii, uic uic, ufn ufn, ugl ugl, fqn fqn, ufa ufa, boolean z, uif uif) {
        this.a = picasso;
        this.d = ugb;
        this.g = uii;
        this.h = uic;
        this.i = ufn;
        this.j = ugl;
        this.k = fqn;
        this.e = ufa;
        this.l = uif;
        this.g.b(z);
        a(true);
    }

    public final int a(int i2) {
        return this.d.a(i2);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        View view;
        View view2;
        if (i2 == 0) {
            ugl ugl = this.j;
            fqv.b();
            fsf e2 = fsk.e(ugl.a, viewGroup);
            fqz.a(e2);
            return new a(e2.getView());
        } else if (i2 == 1) {
            if (this.k.a(sgn.b) == RolloutFlag.CONTROL) {
                View inflate = LayoutInflater.from(this.j.a).inflate(R.layout.podcast_episode_improved_quickactions_row, viewGroup, false);
                if (VERSION.SDK_INT >= 21) {
                    inflate.setClipToOutline(true);
                }
                uio uio = new uio(inflate);
                fqz.a(uio);
                view = uio.getView();
            } else {
                view = this.j.a(viewGroup).getView();
            }
            return new a(view);
        } else if (i2 == 2) {
            return new a(this.j.b(viewGroup).getView());
        } else {
            if (i2 == 3) {
                if (this.k.a(sgn.b) == RolloutFlag.CONTROL) {
                    View inflate2 = LayoutInflater.from(this.j.a).inflate(R.layout.podcast_episode_deletable_row, viewGroup, false);
                    if (VERSION.SDK_INT >= 21) {
                        inflate2.setClipToOutline(true);
                    }
                    uhg uhg = new uhg(inflate2);
                    fqz.a(uhg);
                    view2 = uhg.getView();
                } else {
                    view2 = this.j.c(viewGroup).getView();
                }
                return new a(view2);
            } else if (i2 != 4) {
                Assertion.a("Unknown view type");
                return null;
            } else {
                c b = Rows.b(this.j.a, viewGroup, 80, 12);
                fqz.a(b);
                return new a(b.getView());
            }
        }
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        View view = ((a) uVar).o;
        int a2 = a(i2);
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 == 2) {
                    this.d.a(ufn.a(view), i2);
                    return;
                } else if (a2 != 3) {
                    if (a2 == 4) {
                        ugb ugb = this.d;
                        ufn ufn = this.i;
                        ugb.a(new uhw((c) fqv.a(view, c.class), ufn.h, ufn.a), i2);
                    }
                } else if (this.k.a(sgn.b) == RolloutFlag.CONTROL) {
                    ugb ugb2 = this.d;
                    ufn ufn2 = this.i;
                    uhh uhh = new uhh((uhg) fqv.a(view, uhg.class), ufn2.a, ufn2.i, ufn2.d, ufn2.g, ufn2.l);
                    ugb2.a((uhe) uhh, i2);
                } else {
                    this.h.a((ucs) fqz.a(view, ucs.class), i2);
                    return;
                }
            } else if (this.k.a(sgn.b) == RolloutFlag.CONTROL) {
                ugb ugb3 = this.d;
                ufn ufn3 = this.i;
                uip uip = new uip((uin) fqv.a(view, uin.class), ufn3.a, ufn3.k, ufn3.c, ufn3.i, ufn3.j, ufn3.e, ufn3.d, ufn3.f, ufn3.l);
                ugb3.a((uhe) uip, i2);
            } else {
                this.g.a((ucv) fqz.a(view, ucv.class), i2);
                return;
            }
            return;
        }
        ugb ugb4 = this.d;
        ufn ufn4 = this.i;
        fsf fsf = (fsf) fqv.a(view, fsf.class);
        uhd uhd = new uhd(fsf, ufn4.c, ufn4.d, ufn4.e, ufn4.f, ufn4.b, ufn4.a, ufn4.k);
        uit uit = new uit(fsf, uhd, ufn4.d, ufn4.a, ufn4.b);
        ugb4.a((uis) uit, i2);
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                super.a(recyclerView, i);
                if (i == 0) {
                    ufv.this.a.c(ugg.c);
                } else {
                    ufv.this.a.b((Object) ugg.c);
                }
            }
        });
    }

    public final void a(String str, boolean z) {
        this.d.a(str, z);
        this.l.a(str, z);
        e();
    }

    public final vkv[] a() {
        return this.f;
    }

    public final int b() {
        return this.d.a();
    }

    public final long b(int i2) {
        return Hashing.b().a().a(f(i2).getUri(), fbi.c).a().c();
    }

    public final void b(boolean z) {
        this.d.a(false);
        e();
    }

    public final String c(int i2) {
        return this.d.b(i2);
    }

    public final vkv f(int i2) {
        return this.d.c(i2);
    }
}
