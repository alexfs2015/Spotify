package defpackage;

import defpackage.wdd;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wdd reason: default package */
public interface wdd<K, V, T extends wdd<K, V, T>> extends Iterable<Entry<K, V>> {
    int a();

    V a(K k);

    List<V> b(K k);
}
