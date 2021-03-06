package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends fbt<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> a;
    private transient int b;

    static class EntryCollection<K, V> extends ImmutableCollection<Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public final fdh<Entry<K, V>> R_() {
            return this.multimap.j();
        }

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return this.multimap.a.l();
        }

        public int size() {
            return this.multimap.e();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.multimap.b(entry.getKey(), entry.getValue());
        }

        public /* synthetic */ Iterator iterator() {
            return this.multimap.j();
        }
    }

    static class a {
        static final defpackage.fcv.a<ImmutableMultimap> a = fcv.a(ImmutableMultimap.class, "map");
        static final defpackage.fcv.a<ImmutableMultimap> b = fcv.a(ImmutableMultimap.class, "size");
    }

    /* renamed from: a */
    public abstract ImmutableCollection<V> c(K k);

    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    /* renamed from: b */
    public ImmutableCollection<V> d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final boolean f(Object obj) {
        return this.a.containsKey(obj);
    }

    public final int e() {
        return this.b;
    }

    public final Set<K> g() {
        throw new AssertionError("unreachable");
    }

    public final Map<K, Collection<V>> k() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: a */
    public ImmutableCollection<Entry<K, V>> h() {
        return (ImmutableCollection) super.h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final fdh<Entry<K, V>> j() {
        return new fdh<Entry<K, V>>() {
            private Iterator<? extends Entry<K, ? extends ImmutableCollection<V>>> a = ImmutableMultimap.this.a.entrySet().iterator();
            private K b = null;
            private Iterator<V> c = a.a;

            public final boolean hasNext() {
                return this.c.hasNext() || this.a.hasNext();
            }

            public final /* synthetic */ Object next() {
                if (!this.c.hasNext()) {
                    Entry entry = (Entry) this.a.next();
                    this.b = entry.getKey();
                    this.c = ((ImmutableCollection) entry.getValue()).iterator();
                }
                return Maps.a(this.b, this.c.next());
            }
        };
    }

    public final /* bridge */ /* synthetic */ Map b() {
        return this.a;
    }

    public final /* synthetic */ Set m() {
        return this.a.keySet();
    }

    public final /* synthetic */ Collection i() {
        return new EntryCollection(this);
    }
}
