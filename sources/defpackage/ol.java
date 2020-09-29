package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.f.b;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: ol reason: default package */
public abstract class ol extends f {
    public boolean k = true;

    public abstract boolean a(u uVar);

    public abstract boolean a(u uVar, int i, int i2, int i3, int i4);

    public abstract boolean a(u uVar, u uVar2, int i, int i2, int i3, int i4);

    public abstract boolean b(u uVar);

    public final boolean g(u uVar) {
        return !this.k || uVar.k();
    }

    public final boolean a(u uVar, b bVar, b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = uVar.o;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (uVar.n() || (i == left && i2 == top)) {
            return a(uVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(uVar, i, i2, left, top);
    }

    public final boolean b(u uVar, b bVar, b bVar2) {
        if (bVar == null || (bVar.a == bVar2.a && bVar.b == bVar2.b)) {
            return b(uVar);
        }
        return a(uVar, bVar.a, bVar.b, bVar2.a, bVar2.b);
    }

    public final boolean c(u uVar, b bVar, b bVar2) {
        if (bVar.a == bVar2.a && bVar.b == bVar2.b) {
            f(uVar);
            return false;
        }
        return a(uVar, bVar.a, bVar.b, bVar2.a, bVar2.b);
    }

    public boolean a(u uVar, u uVar2, b bVar, b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (uVar2.c()) {
            int i5 = bVar.a;
            i = bVar.b;
            i2 = i5;
        } else {
            i2 = bVar2.a;
            i = bVar2.b;
        }
        return a(uVar, uVar2, i3, i4, i2, i);
    }
}
