package defpackage;

import androidx.recyclerview.widget.RecyclerView.u;
import defpackage.fqy;

/* renamed from: fra reason: default package */
public class fra<V extends fqy> extends u {
    public final V a;

    protected fra(V v) {
        super(v.getView());
        this.a = v;
    }

    public static <V extends fqy> fra<V> a(V v) {
        return new fra<>(v);
    }
}
