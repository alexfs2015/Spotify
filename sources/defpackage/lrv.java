package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lrv reason: default package */
abstract class lrv<T, VH extends u> extends a<VH> {
    Context a;
    private final List<T> d = new ArrayList();

    lrv(Context context) {
        this.a = (Context) fbp.a(context);
    }

    public void a() {
        this.d.clear();
        e();
    }

    public final void a(VH vh, int i) {
        Object obj = this.d.get(i);
        vh.o.setTag(obj);
        a(vh, i, obj);
    }

    /* access modifiers changed from: protected */
    public abstract void a(VH vh, int i, T t);

    public void a(Collection<? extends T> collection) {
        this.d.addAll((Collection) fbp.a(collection));
        e();
    }

    public int b() {
        return this.d.size();
    }

    public long b(int i) {
        return (long) i;
    }
}
