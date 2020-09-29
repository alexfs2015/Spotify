package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: lpv reason: default package */
public final class lpv extends a<lqc> implements gjl {
    public List<lqy> a = Collections.emptyList();
    public boolean d;
    public boolean e;
    private final AssistedCurationCardAdapter.a f;
    private final twz g;
    private final Picasso h;

    public final /* synthetic */ void a(u uVar, int i) {
        lqb lqb = (lqb) ((lqc) uVar);
        lqy f2 = f(i);
        boolean z = this.d;
        AssistedCurationCardAdapter assistedCurationCardAdapter = lqb.a;
        assistedCurationCardAdapter.a = f2;
        assistedCurationCardAdapter.d = z;
        assistedCurationCardAdapter.e();
    }

    public lpv(AssistedCurationCardAdapter.a aVar, twz twz, Picasso picasso) {
        this.f = aVar;
        this.g = twz;
        this.h = picasso;
        a(true);
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) f(i).b().hashCode();
    }

    public final lqy f(int i) {
        if (!this.e) {
            return (lqy) this.a.get(i);
        }
        List<lqy> list = this.a;
        return (lqy) list.get((list.size() - i) - 1);
    }

    public final int g(int i) {
        return this.e ? (b() - i) - 1 : i;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new lqb(viewGroup, this.f, this.g, this.h);
    }
}
