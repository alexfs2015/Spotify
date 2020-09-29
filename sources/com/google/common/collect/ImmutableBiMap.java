package com.google.common.collect;

import java.util.Map;
import java.util.Map.Entry;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    static class SerializedForm extends SerializedForm {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return a(new a());
        }
    }

    public static final class a<K, V> extends com.google.common.collect.ImmutableMap.a<K, V> {
        /* renamed from: a */
        public final a<K, V> b(K k, V v) {
            super.b(k, v);
            return this;
        }

        /* renamed from: a */
        public final ImmutableBiMap<K, V> b() {
            if (this.b == 0) {
                return ImmutableBiMap.a();
            }
            this.c = true;
            return new RegularImmutableBiMap(this.a, this.b);
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Entry entry) {
            super.a(entry);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Map map) {
            super.a(map);
            return this;
        }
    }

    ImmutableBiMap() {
    }

    public static <K, V> ImmutableBiMap<K, V> a() {
        return RegularImmutableBiMap.a;
    }

    public static <K, V> ImmutableBiMap<K, V> a(K k, V v) {
        fcl.a((Object) k, (Object) v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    /* renamed from: c */
    public abstract ImmutableBiMap<V, K> inverse();

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ ImmutableCollection d() {
        throw new AssertionError("should never be called");
    }

    public final /* synthetic */ ImmutableCollection e() {
        return inverse().keySet();
    }

    @Deprecated
    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
