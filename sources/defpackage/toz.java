package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: toz reason: default package */
public final class toz implements tlc {
    final tkv a;
    final tnh b;
    final tnb c;
    final tli d;
    final vti<a> e;
    ViewGroup f;
    RecyclerView g;
    View h;
    LoadingView i;
    boolean j;
    boolean k;
    private final tpg l;
    private final kom m;
    private final boolean n;

    public toz(tkv tkv, tnh tnh, tnb tnb, tli tli, vti<a> vti, tpg tpg, kom kom, boolean z) {
        this.a = tkv;
        this.b = tnh;
        this.c = tnb;
        this.d = tli;
        this.e = vti;
        this.l = tpg;
        this.m = kom;
        this.n = z;
    }

    public final void a(List<Show> list) {
        tkv tkv = this.a;
        tkv.a.a(list);
        tkv.e();
    }

    public final void a() {
        this.h.setVisibility(0);
        this.g.setVisibility(8);
    }

    public final void b() {
        this.h.setVisibility(8);
        this.g.setVisibility(0);
    }

    public final void c() {
        LoadingView loadingView = this.i;
        if (loadingView != null && loadingView.d()) {
            this.i.b();
        }
    }

    public final void d() {
        if (!this.j) {
            this.j = true;
            e();
        }
    }

    public final void a(String str) {
        tkv tkv = this.a;
        if (!faw.a(str, tkv.a.b())) {
            tkv.a.a(str);
            tkv.e();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (this.n && this.k && this.j) {
            if (this.h.getVisibility() == 0) {
                this.m.d();
                return;
            }
            this.m.c();
        }
    }
}
