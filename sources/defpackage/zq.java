package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: zq reason: default package */
abstract class zq<V, O> implements zp<V, O> {
    final List<abx<V>> a;

    zq(V v) {
        this(Collections.singletonList(new abx(v)));
    }

    zq(List<abx<V>> list) {
        this.a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
