package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: mrk reason: default package */
public final class mrk extends a {
    private final mrl a;

    public mrk(mrl mrl) {
        this.a = mrl;
    }

    public final int a(u uVar) {
        return b(this.a.e(uVar) ? 3 : 0, 0);
    }

    public final void a(u uVar, int i) {
        if (i != 0) {
            ((mrm) uVar).w();
        }
        super.a(uVar, i);
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(u uVar, u uVar2) {
        return this.a.e(uVar.e(), uVar2.e());
    }

    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        return this.a.d(uVar2);
    }

    public final boolean b() {
        return false;
    }

    public final void c(RecyclerView recyclerView, u uVar) {
        super.c(recyclerView, uVar);
        ((mrm) uVar).x();
    }
}
