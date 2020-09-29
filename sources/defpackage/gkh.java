package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import defpackage.gkm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: gkh reason: default package */
public abstract class gkh<T extends gkm> extends iqt<T, gkq> implements gjk {
    private final b<gkq> e = new oo<gkq>(this) {
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            return ((gkq) obj).equals((gkq) obj2);
        }

        public final /* synthetic */ boolean b(Object obj, Object obj2) {
            return ((gkq) obj).equals((gkq) obj2);
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return gkq.d.compare((gkq) obj, (gkq) obj2);
        }
    };
    private final a f;
    private final on<gkq> g = new on<>(gkq.class, this.e);
    private List<gkq> h = Collections.emptyList();
    private String i = "";

    /* renamed from: gkh$a */
    public interface a {
        void onItemClick(gkq gkq);
    }

    /* access modifiers changed from: protected */
    public abstract T a(ViewGroup viewGroup, int i2, a aVar);

    public gkh(a aVar) {
        this.f = (a) fay.a(aVar);
    }

    public final void a(List<gkq> list) {
        this.h = list;
        a();
    }

    public final String c(int i2) {
        return ((gkq) f(i2)).b();
    }

    public final void a(String str) {
        this.i = str.toLowerCase(Locale.getDefault());
        a();
    }

    private void a() {
        ArrayList arrayList = new ArrayList(this.h.size());
        if (this.i.isEmpty()) {
            arrayList.addAll(this.h);
        } else {
            for (gkq gkq : this.h) {
                if (gkq.c().toLowerCase(Locale.getDefault()).contains(this.i)) {
                    arrayList.add(gkq);
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
}
