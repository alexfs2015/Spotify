package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: gve reason: default package */
public final class gve extends AbstractList<gzt> {
    public static final gve a = new gve(a.a(), Collections.emptyList());
    private final List<gzt> b;
    private final List<gzt> c;
    private final guo d;

    private gve(guo guo, List<? extends gzt> list) {
        fay.a(list);
        this.d = (guo) fay.a(guo);
        if (list instanceof ImmutableList) {
            this.b = ImmutableList.a((Collection<? extends E>) list);
        } else {
            this.b = Collections.unmodifiableList(list);
        }
        this.c = a.a(a.a(this.d), this.b);
    }

    public final int size() {
        return this.b.size();
    }

    public static gve a(guo guo, List<? extends gzt> list) {
        if (list == a || list == Collections.emptyList() || list == ImmutableList.d()) {
            return a;
        }
        if (list instanceof gve) {
            gve gve = (gve) list;
            if (gve.d == guo) {
                return gve;
            }
        }
        return new gve(guo, list);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (gzt) this.c.get(i);
    }
}
