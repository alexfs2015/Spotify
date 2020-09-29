package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: nvz reason: default package */
public final class nvz extends m {
    private final a a;
    private final int b;
    private int c;

    /* renamed from: nvz$a */
    public interface a {
        void onVerticalScrollThresholdExceeded();
    }

    nvz(a aVar, RecyclerView recyclerView, int i) {
        this.a = (a) fbp.a(aVar);
        this.b = i;
        ((RecyclerView) fbp.a(recyclerView)).a((m) this);
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
        if (this.c > this.b) {
            recyclerView.b((m) this);
            this.a.onVerticalScrollThresholdExceeded();
        }
    }
}
