package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import defpackage.gly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: glt reason: default package */
public abstract class glt<T extends gly> extends itg<T, gmc> implements gkv {
    private final b<gmc> e = new ot<gmc>(this) {
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            return ((gmc) obj).equals((gmc) obj2);
        }

        public final /* synthetic */ boolean b(Object obj, Object obj2) {
            return ((gmc) obj).equals((gmc) obj2);
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return gmc.d.compare((gmc) obj, (gmc) obj2);
        }
    };
    private final a f;
    private final os<gmc> g = new os<>(gmc.class, this.e);
    private List<gmc> h = Collections.emptyList();
    private String i = "";

    /* renamed from: glt$a */
    public interface a {
        void onItemClick(gmc gmc);
    }

    public glt(a aVar) {
        this.f = (a) fbp.a(aVar);
    }

    private void a() {
        ArrayList arrayList = new ArrayList(this.h.size());
        if (this.i.isEmpty()) {
            arrayList.addAll(this.h);
        } else {
            for (gmc gmc : this.h) {
                if (gmc.c().toLowerCase(Locale.getDefault()).contains(this.i)) {
                    arrayList.add(gmc);
                }
            }
        }
        super.a(arrayList);
        this.g.a();
        this.g.c();
        this.g.a(arrayList);
        this.g.b();
    }

    public final /* bridge */ /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2, this.f);
    }

    /* access modifiers changed from: protected */
    public abstract T a(ViewGroup viewGroup, int i2, a aVar);

    public final void a(String str) {
        this.i = str.toLowerCase(Locale.getDefault());
        a();
    }

    public final void a(List<gmc> list) {
        this.h = list;
        a();
    }

    public final String c(int i2) {
        return ((gmc) f(i2)).b();
    }
}
