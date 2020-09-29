package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qjc reason: default package */
public abstract class qjc implements qjt {

    /* renamed from: qjc$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract qjc a();
    }

    public abstract int a();

    public final int b() {
        return a();
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.d(a());
    }

    public final void b(RecyclerView recyclerView) {
        ((GridLayoutManager) fay.a((GridLayoutManager) recyclerView.d())).a(a(), 0);
    }
}
