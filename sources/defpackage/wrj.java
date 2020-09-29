package defpackage;

import defpackage.wrj;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wrj reason: default package */
public interface wrj<K, V, T extends wrj<K, V, T>> extends Iterable<Entry<K, V>> {
    int a();

    V a(K k);

    List<V> b(K k);
}
