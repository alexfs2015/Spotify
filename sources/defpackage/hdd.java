package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: hdd reason: default package */
final class hdd<E> {
    List<E> a;

    public hdd(List<E> list) {
        this.a = (List) fbp.a(list);
    }

    private void a() {
        List<E> list = this.a;
        if (list instanceof ImmutableList) {
            this.a = new ArrayList(list);
        }
    }

    private static boolean c(Iterable<?> iterable) {
        return iterable == null || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty());
    }

    public final void a(Iterable<E> iterable) {
        if (iterable instanceof ImmutableList) {
            this.a = (List) iterable;
        } else if (!c(iterable)) {
            this.a = Lists.a(iterable);
        } else {
            List<E> list = this.a;
            if (list instanceof ImmutableList) {
                this.a = ImmutableList.d();
            } else {
                list.clear();
            }
        }
    }

    public final void b(Iterable<E> iterable) {
        fbp.a(iterable);
        a();
        for (E add : iterable) {
            this.a.add(add);
        }
    }
}
