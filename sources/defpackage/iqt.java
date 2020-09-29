package defpackage;

import com.google.common.collect.Lists;
import defpackage.iqu;
import java.util.List;

/* renamed from: iqt reason: default package */
public abstract class iqt<VH extends iqu<D>, D> extends iqr<VH> {
    public List<D> a = Lists.a();
    protected boolean d = false;

    public void a(VH vh, int i) {
        vh.a(f(i), i);
    }

    public final D f(int i) {
        return this.a.get(i);
    }

    public final int b() {
        return this.a.size();
    }

    public void a(List<D> list) {
        if (list == null) {
            list = Lists.a();
        }
        this.a = list;
        if (this.d) {
            e();
        }
    }

    public final void a(int i, D d2) {
        this.a.set(i, d2);
        if (this.d) {
            d_(i);
        }
    }
}
