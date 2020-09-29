package defpackage;

import android.content.res.Resources;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;

/* renamed from: nyk reason: default package */
public final class nyk extends iqr<nym> implements gjl {
    public final Resources a;
    public OnClickListener d;
    public ImmutableList<nyv> e = ImmutableList.d();

    public final /* synthetic */ void a(u uVar, int i) {
        nym nym = (nym) uVar;
        nym.a((nyv) this.e.get(i));
        nym.o.setOnClickListener(this.d);
    }

    public nyk(Resources resources) {
        this.a = resources;
    }

    public final int b() {
        return this.e.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nym(viewGroup);
    }
}
