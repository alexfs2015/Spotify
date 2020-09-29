package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: isu reason: default package */
public final class isu extends h {
    private final int a;

    public isu(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int e = RecyclerView.e(view);
        if (!(e == -1 || ((uwh) recyclerView.c()) == null || e != 0)) {
            rect.top = this.a;
        }
    }
}
