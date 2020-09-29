package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aae reason: default package */
abstract class aae<V, O> implements aad<V, O> {
    final List<acl<V>> a;

    aae(V v) {
        this(Collections.singletonList(new acl(v)));
    }

    aae(List<acl<V>> list) {
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
