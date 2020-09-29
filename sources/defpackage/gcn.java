package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: gcn reason: default package */
public final class gcn {
    public static <E> ImmutableList<E> a(Collection<? extends E> collection) {
        return collection == null ? ImmutableList.d() : ImmutableList.a(collection);
    }
}
