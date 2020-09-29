package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qjz reason: default package */
public abstract class qjz implements qjt {

    /* renamed from: qjz$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract qjz a();

        public abstract a b(int i);
    }

    public abstract int a();

    public abstract int c();

    public final int b() {
        return a();
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.d(c());
    }

    public final void b(RecyclerView recyclerView) {
        qim qim = (qim) fay.a((qim) recyclerView.a(c(), false));
        ((GridLayoutManager) fay.a(qim.a.c.o())).a(a(), 40);
    }
}
