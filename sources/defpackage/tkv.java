package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: tkv reason: default package */
public final class tkv extends androidx.recyclerview.widget.RecyclerView.a<a> {
    public final tkz a;
    private final OnLongClickListener d;
    private final tlg e;

    /* renamed from: tkv$a */
    static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        View view = ((a) uVar).o;
        view.setOnClickListener(new $$Lambda$tkv$QA3jmwGYsiYBMAxgu5aqHhkMEWI(this, i));
        view.setOnLongClickListener(this.d);
        this.a.a(i, view);
    }

    public tkv(tkz tkz, OnLongClickListener onLongClickListener, tlg tlg) {
        this.a = tkz;
        this.d = onLongClickListener;
        this.e = tlg;
    }

    public final int b() {
        return this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view) {
        this.a.a(i);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(this.e.a(viewGroup.getContext(), viewGroup));
    }
}
