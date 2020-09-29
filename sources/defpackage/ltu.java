package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: ltu reason: default package */
public final class ltu extends a<lub> implements gkw {
    public List<lux> a = Collections.emptyList();
    public boolean d;
    public boolean e;
    private final AssistedCurationCardAdapter.a f;
    private final ujc g;
    private final Picasso h;

    public ltu(AssistedCurationCardAdapter.a aVar, ujc ujc, Picasso picasso) {
        this.f = aVar;
        this.g = ujc;
        this.h = picasso;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new lua(viewGroup, this.f, this.g, this.h);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        lua lua = (lua) ((lub) uVar);
        lux f2 = f(i);
        boolean z = this.d;
        AssistedCurationCardAdapter assistedCurationCardAdapter = lua.a;
        assistedCurationCardAdapter.a = f2;
        assistedCurationCardAdapter.d = z;
        assistedCurationCardAdapter.e();
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        return (long) f(i).b().hashCode();
    }

    public final lux f(int i) {
        if (!this.e) {
            return (lux) this.a.get(i);
        }
        List<lux> list = this.a;
        return (lux) list.get((list.size() - i) - 1);
    }

    public final int g(int i) {
        return this.e ? (b() - i) - 1 : i;
    }
}
