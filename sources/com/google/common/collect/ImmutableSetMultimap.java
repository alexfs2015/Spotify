package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements fcw<K, V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> b;
    private transient ImmutableSet<Entry<K, V>> c;

    static final class EntrySet<K, V> extends ImmutableSet<Entry<K, V>> {
        private final transient ImmutableSetMultimap<K, V> a;

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return false;
        }

        EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.a = immutableSetMultimap;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.a.b(entry.getKey(), entry.getValue());
        }

        public final int size() {
            return this.a.e();
        }

        public final fdh<Entry<K, V>> R_() {
            return this.a.j();
        }

        public final /* synthetic */ Iterator iterator() {
            return this.a.j();
        }
    }

    static final class a {
        static final defpackage.fcv.a<ImmutableSetMultimap> a = fcv.a(ImmutableSetMultimap.class, "emptySet");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public ImmutableSet<V> c(K k) {
        return (ImmutableSet) fav.a((ImmutableSet) this.a.get(k), this.b);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public ImmutableSet<Entry<K, V>> h() {
        ImmutableSet<Entry<K, V>> immutableSet = this.c;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.c = entrySet;
        return entrySet;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        ImmutableSet<V> immutableSet = this.b;
        if (immutableSet instanceof ImmutableSortedSet) {
            comparator = ((ImmutableSortedSet) immutableSet).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        fcv.a((fcn<K, V>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object obj;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            com.google.common.collect.ImmutableMap.a g = ImmutableMap.g();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    com.google.common.collect.ImmutableSet.a aVar = comparator == null ? new com.google.common.collect.ImmutableSet.a() : new com.google.common.collect.ImmutableSortedSet.a(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        aVar.b(objectInputStream.readObject());
                    }
                    ImmutableSet b2 = aVar.a();
                    if (b2.size() == readInt2) {
                        g.b(readObject, b2);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                a.a.a(this, (Object) g.b());
                a.b.a(this, i2);
                defpackage.fcv.a<ImmutableSetMultimap> aVar2 = a.a;
                if (comparator == null) {
                    obj = ImmutableSet.h();
                } else {
                    obj = ImmutableSortedSet.a(comparator);
                }
                aVar2.a(this, obj);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    @Deprecated
    public final /* synthetic */ ImmutableCollection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final /* synthetic */ Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }
}
