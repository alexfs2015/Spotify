package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: gbp reason: default package */
public final class gbp {
    public static <E> ImmutableList<E> a(Collection<? extends E> collection) {
        if (collection == null) {
            return ImmutableList.d();
        }
        return ImmutableList.a(collection);
    }
}
