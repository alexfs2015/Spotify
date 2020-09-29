package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: gxe reason: default package */
public final class gxe extends AbstractList<hcm> {
    public static final gxe a = new gxe(a.a(), Collections.emptyList());
    private final List<hcm> b;
    private final List<hcm> c;
    private final gwo d;

    private gxe(gwo gwo, List<? extends hcm> list) {
        fbp.a(list);
        this.d = (gwo) fbp.a(gwo);
        if (list instanceof ImmutableList) {
            this.b = ImmutableList.a((Collection<? extends E>) list);
        } else {
            this.b = Collections.unmodifiableList(list);
        }
        this.c = a.a(a.a(this.d), this.b);
    }

    public static gxe a(gwo gwo, List<? extends hcm> list) {
        if (list == a || list == Collections.emptyList() || list == ImmutableList.d()) {
            return a;
        }
        if (list instanceof gxe) {
            gxe gxe = (gxe) list;
            if (gxe.d == gwo) {
                return gxe;
            }
        }
        return new gxe(gwo, list);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (hcm) this.c.get(i);
    }

    public final int size() {
        return this.b.size();
    }
}
