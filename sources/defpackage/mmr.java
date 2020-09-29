package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: mmr reason: default package */
public final class mmr extends a {
    private final mms a;

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public mmr(mms mms) {
        this.a = mms;
    }

    public final int a(u uVar) {
        return b(this.a.e(uVar) ? 3 : 0, 0);
    }

    public final boolean a(u uVar, u uVar2) {
        return this.a.e(uVar.e(), uVar2.e());
    }

    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        return this.a.d(uVar2);
    }

    public final void a(u uVar, int i) {
        if (i != 0) {
            ((mmt) uVar).v();
        }
        super.a(uVar, i);
    }

    public final void c(RecyclerView recyclerView, u uVar) {
        super.c(recyclerView, uVar);
        ((mmt) uVar).w();
    }
}
