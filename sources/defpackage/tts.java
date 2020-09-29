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
/* renamed from: tts reason: default package */
public final class tts extends androidx.recyclerview.widget.RecyclerView.a<a> implements gjk, tuc {
    final Picasso a;
    public final tty d;
    public final tsx e;
    public uys[] f;
    private final twf g;
    private final tvz h;
    private final ttk i;
    private final tui j;
    private final fpt k;
    private final twc l;

    /* renamed from: tts$a */
    static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        View view = ((a) uVar).o;
        int a2 = a(i2);
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 == 2) {
                    this.d.a(ttk.a(view), i2);
                    return;
                } else if (a2 != 3) {
                    if (a2 == 4) {
                        tty tty = this.d;
                        ttk ttk = this.i;
                        tty.a(new tvt((c) fqb.a(view, c.class), ttk.h, ttk.a), i2);
                    }
                } else if (this.k.a(rxd.c) == RolloutFlag.CONTROL) {
                    tty tty2 = this.d;
                    ttk ttk2 = this.i;
                    tve tve = new tve((tvd) fqb.a(view, tvd.class), ttk2.a, ttk2.i, ttk2.d, ttk2.g, ttk2.l);
                    tty2.a((tvb) tve, i2);
                } else {
                    this.h.a((tqp) fqf.a(view, tqp.class), i2);
                    return;
                }
            } else if (this.k.a(rxd.c) == RolloutFlag.CONTROL) {
                tty tty3 = this.d;
                ttk ttk3 = this.i;
                twm twm = new twm((twk) fqb.a(view, twk.class), ttk3.a, ttk3.k, ttk3.c, ttk3.i, ttk3.j, ttk3.e, ttk3.d, ttk3.f, ttk3.l);
                tty3.a((tvb) twm, i2);
            } else {
                this.g.a((tqs) fqf.a(view, tqs.class), i2);
                return;
            }
            return;
        }
        tty tty4 = this.d;
        ttk ttk4 = this.i;
        frl frl = (frl) fqb.a(view, frl.class);
        tva tva = new tva(frl, ttk4.c, ttk4.d, ttk4.e, ttk4.f, ttk4.b, ttk4.a, ttk4.k);
        twq twq = new twq(frl, tva, ttk4.d, ttk4.a, ttk4.b);
        tty4.a((twp) twq, i2);
    }

    public final uys[] a() {
        return this.f;
    }

    public tts(Picasso picasso, tty tty, twf twf, tvz tvz, ttk ttk, tui tui, fpt fpt, tsx tsx, boolean z, twc twc) {
        this.a = picasso;
        this.d = tty;
        this.g = twf;
        this.h = tvz;
        this.i = ttk;
        this.j = tui;
        this.k = fpt;
        this.e = tsx;
        this.l = twc;
        this.g.b(z);
        a(true);
    }

    public final long b(int i2) {
        return Hashing.b().a().a(f(i2).getUri(), far.c).a().c();
    }

    public final int b() {
        return this.d.a();
    }

    public final int a(int i2) {
        return this.d.a(i2);
    }

    public final String c(int i2) {
        return this.d.b(i2);
    }

    public final uys f(int i2) {
        return this.d.c(i2);
    }

    public final void b(boolean z) {
        this.d.a(false);
        e();
    }

    public final void a(String str, boolean z) {
        this.d.a(str, z);
        this.l.a(str, z);
        e();
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                super.a(recyclerView, i);
                if (i == 0) {
                    tts.this.a.c(tud.c);
                } else {
                    tts.this.a.b((Object) tud.c);
                }
            }
        });
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        View view;
        View view2;
        if (i2 == 0) {
            tui tui = this.j;
            fqb.b();
            frl e2 = frq.e(tui.a, viewGroup);
            fqf.a(e2);
            return new a(e2.getView());
        } else if (i2 == 1) {
            if (this.k.a(rxd.c) == RolloutFlag.CONTROL) {
                View inflate = LayoutInflater.from(this.j.a).inflate(R.layout.podcast_episode_improved_quickactions_row, viewGroup, false);
                if (VERSION.SDK_INT >= 21) {
                    inflate.setClipToOutline(true);
                }
                twl twl = new twl(inflate);
                fqf.a(twl);
                view = twl.getView();
            } else {
                view = this.j.a(viewGroup).getView();
            }
            return new a(view);
        } else if (i2 == 2) {
            return new a(this.j.b(viewGroup).getView());
        } else {
            if (i2 == 3) {
                if (this.k.a(rxd.c) == RolloutFlag.CONTROL) {
                    View inflate2 = LayoutInflater.from(this.j.a).inflate(R.layout.podcast_episode_deletable_row, viewGroup, false);
                    if (VERSION.SDK_INT >= 21) {
                        inflate2.setClipToOutline(true);
                    }
                    tvd tvd = new tvd(inflate2);
                    fqf.a(tvd);
                    view2 = tvd.getView();
                } else {
                    view2 = this.j.c(viewGroup).getView();
                }
                return new a(view2);
            } else if (i2 != 4) {
                Assertion.a("Unknown view type");
                return null;
            } else {
                c b = Rows.b(this.j.a, viewGroup, 80, 12);
                fqf.a(b);
                return new a(b.getView());
            }
        }
    }
}
