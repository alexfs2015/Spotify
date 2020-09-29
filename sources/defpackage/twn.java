package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: twn reason: default package */
public final class twn extends androidx.recyclerview.widget.RecyclerView.a<a> {
    public final twr a;
    private final OnLongClickListener d;
    private final twy e;

    /* renamed from: twn$a */
    static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public twn(twr twr, OnLongClickListener onLongClickListener, twy twy) {
        this.a = twr;
        this.d = onLongClickListener;
        this.e = twy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view) {
        this.a.a(i);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(this.e.a(viewGroup.getContext(), viewGroup));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        View view = ((a) uVar).o;
        view.setOnClickListener(new $$Lambda$twn$D_UjLGJXXJL344YS_e0UIs5hd0Y(this, i));
        view.setOnLongClickListener(this.d);
        this.a.a(i, view);
    }

    public final int b() {
        return this.a.a();
    }
}
