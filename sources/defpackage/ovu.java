package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import java.util.Collections;
import java.util.List;

/* renamed from: ovu reason: default package */
public final class ovu extends androidx.recyclerview.widget.RecyclerView.a<u> implements ovm<ovu> {
    private static int a;
    private static int d;
    private static int e;
    private final omp f;
    /* access modifiers changed from: private */
    public final ovj g;
    private final twc<ovg> h;
    private final ovh i;
    private final ugl j;
    private List<vle> k = Collections.emptyList();
    private ItemConfiguration l = ItemConfiguration.r().a();
    private boolean m;

    /* renamed from: ovu$a */
    public interface a {
        ovu a(tvw tvw, who<jor<ovg>> who);
    }

    static {
        Class<ovu> cls = ovu.class;
        a = cls.hashCode();
        d = cls.hashCode() + 1;
        e = cls.hashCode() + 2;
    }

    public ovu(omp omp, ovj ovj, defpackage.twc.a<ovg> aVar, ovh ovh, ugl ugl, tvw tvw, who<jor<ovg>> who) {
        this.f = omp;
        this.h = aVar.a(tvw, who);
        this.i = ovh;
        this.j = ugl;
        this.g = ovj;
        a(true);
    }

    public final int a(int i2) {
        vle vle = (vle) this.k.get(i2);
        return vle.a() != null ? e : (vle.b() == null || !this.l.m()) ? a : d;
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == a) {
            return fra.a(Rows.a(viewGroup.getContext(), viewGroup));
        }
        if (i2 == d) {
            return fra.a(Rows.b(viewGroup.getContext(), viewGroup));
        }
        if (i2 == e) {
            return fra.a(this.j.a(viewGroup));
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final void a(u uVar, int i2) {
        this.f.a(i2);
        final vle vle = (vle) this.k.get(i2);
        uVar.o.getContext();
        u uVar2 = uVar;
        this.h.a(uVar2, this.l, vle, ovh.a(vle, i2), (b) new b() {
            public final boolean a() {
                return ovu.this.g.a(vle);
            }

            public final boolean b() {
                return ovu.this.g.b(vle);
            }
        }, this.m, i2);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.l != itemConfiguration) {
            this.l = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.g.a(str) || this.m != z) {
            e();
        }
        this.m = z;
    }

    public final void a(List<vle> list) {
        this.k = (List) fbp.a(list);
        e();
    }

    public final int b() {
        return this.k.size();
    }

    public final long b(int i2) {
        vle vle = (vle) this.k.get(i2);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
