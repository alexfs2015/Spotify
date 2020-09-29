package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: iux reason: default package */
public final class iux extends h {
    private final int a;

    public iux(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        int e = RecyclerView.e(view);
        if (e != -1) {
            a c = recyclerView.c();
            if (c != null && e == c.b() - 1) {
                rect.bottom = this.a;
            }
        }
    }
}
