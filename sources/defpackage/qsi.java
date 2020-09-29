package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qsi reason: default package */
public abstract class qsi implements qsc {

    /* renamed from: qsi$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract qsi a();

        public abstract a b(int i);
    }

    public abstract int a();

    public final void a(RecyclerView recyclerView) {
        recyclerView.d(c());
    }

    public final int b() {
        return a();
    }

    public final void b(RecyclerView recyclerView) {
        qqw qqw = (qqw) fbp.a((qqw) recyclerView.a(c(), false));
        ((GridLayoutManager) fbp.a(qqw.a.c.n())).a(a(), 40);
    }

    public abstract int c();
}
