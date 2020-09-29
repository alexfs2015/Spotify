package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.j;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: itf reason: default package */
public abstract class itf extends h implements j {
    protected final int a;
    protected boolean b;

    protected itf(int i) {
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i, u uVar);

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        this.b = true;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int e = RecyclerView.e(view);
        if (e >= 0) {
            Boolean bool = (Boolean) view.getTag(this.a);
            if (bool == null || bool.booleanValue()) {
                a(e, recyclerView.b(view));
                view.setTag(this.a, Boolean.valueOf(this.b));
            }
        }
    }

    public void a(View view) {
        view.setTag(this.a, null);
    }

    public final void a(RecyclerView recyclerView) {
        this.b = false;
        recyclerView.a((h) this, -1);
        recyclerView.a((j) this);
    }

    public void b(View view) {
        view.setTag(this.a, null);
    }

    public final void b(RecyclerView recyclerView) {
        this.b = false;
        recyclerView.b((h) this);
        recyclerView.b((j) this);
    }
}
