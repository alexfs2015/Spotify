package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: npw reason: default package */
public final class npw extends m {
    private final a a;
    private final int b;
    private int c;

    /* renamed from: npw$a */
    public interface a {
        void onVerticalScrollThresholdExceeded();
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
        if (this.c > this.b) {
            recyclerView.b((m) this);
            this.a.onVerticalScrollThresholdExceeded();
        }
    }

    npw(a aVar, RecyclerView recyclerView, int i) {
        this.a = (a) fay.a(aVar);
        this.b = i;
        ((RecyclerView) fay.a(recyclerView)).a((m) this);
    }
}
