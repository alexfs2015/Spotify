package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: ubc reason: default package */
public final class ubc implements twu {
    final twn a;
    final tzg b;
    final tza c;
    final txa d;
    final who<a> e;
    ViewGroup f;
    RecyclerView g;
    View h;
    LoadingView i;
    boolean j;
    boolean k;
    private final ubj l;
    private final krv m;
    private final boolean n;

    public ubc(twn twn, tzg tzg, tza tza, txa txa, who<a> who, ubj ubj, krv krv, boolean z) {
        this.a = twn;
        this.b = tzg;
        this.c = tza;
        this.d = txa;
        this.e = who;
        this.l = ubj;
        this.m = krv;
        this.n = z;
    }

    public final void a() {
        this.h.setVisibility(0);
        this.g.setVisibility(8);
    }

    public final void a(String str) {
        twn twn = this.a;
        if (!fbn.a(str, twn.a.b())) {
            twn.a.a(str);
            twn.e();
        }
    }

    public final void a(List<Show> list) {
        twn twn = this.a;
        twn.a.a(list);
        twn.e();
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
