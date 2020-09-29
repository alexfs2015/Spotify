package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: iuy reason: default package */
public final class iuy extends h {
    private final int a;

    public iuy(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int e = RecyclerView.e(view);
        if (!(e == -1 || ((vhx) recyclerView.c()) == null || e != 0)) {
            rect.top = this.a;
        }
    }
}
