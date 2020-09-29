package defpackage;

import android.content.res.Resources;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;

/* renamed from: oew reason: default package */
public final class oew extends ite<oey> implements gkw {
    public final Resources a;
    public OnClickListener d;
    public ImmutableList<ofh> e = ImmutableList.d();

    public oew(Resources resources) {
        this.a = resources;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new oey(viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        oey oey = (oey) uVar;
        oey.a((ofh) this.e.get(i));
        oey.o.setOnClickListener(this.d);
    }

    public final int b() {
        return this.e.size();
    }
}
