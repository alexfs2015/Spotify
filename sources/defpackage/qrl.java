package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: qrl reason: default package */
public abstract class qrl implements qsc {

    /* renamed from: qrl$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract qrl a();
    }

    public abstract int a();

    public final void a(RecyclerView recyclerView) {
        recyclerView.d(a());
    }

    public final int b() {
        return a();
    }

    public final void b(RecyclerView recyclerView) {
        ((GridLayoutManager) fbp.a((GridLayoutManager) recyclerView.d())).a(a(), 0);
    }
}
