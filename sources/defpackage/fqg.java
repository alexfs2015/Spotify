package defpackage;

import androidx.recyclerview.widget.RecyclerView.u;
import defpackage.fqe;

/* renamed from: fqg reason: default package */
public class fqg<V extends fqe> extends u {
    public final V a;

    public static <V extends fqe> fqg<V> a(V v) {
        return new fqg<>(v);
    }

    protected fqg(V v) {
        super(v.getView());
        this.a = v;
    }
}
