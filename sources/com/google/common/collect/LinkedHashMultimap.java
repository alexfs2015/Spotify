package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;
    private transient int b = 2;
    /* access modifiers changed from: private */
    public transient ValueEntry<K, V> c;

    static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements b<K, V> {
        ValueEntry<K, V> nextInValueBucket;
        ValueEntry<K, V> predecessorInMultimap;
        b<K, V> predecessorInValueSet;
        final int smearedValueHash;
        ValueEntry<K, V> successorInMultimap;
        b<K, V> successorInValueSet;

        ValueEntry(K k, V v, int i, ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Object obj, int i) {
            return this.smearedValueHash == i && faw.a(getValue(), obj);
        }

        public final b<K, V> a() {
            return this.predecessorInValueSet;
        }

        public final b<K, V> b() {
            return this.successorInValueSet;
        }

        public final void a(b<K, V> bVar) {
            this.predecessorInValueSet = bVar;
        }

        public final void b(b<K, V> bVar) {
            this.successorInValueSet = bVar;
        }
    }

    final class a extends c<V> implements b<K, V> {
        private final K a;
        private ValueEntry<K, V>[] b;
        private int c = 0;
        /* access modifiers changed from: private */
        public int d = 0;
        /* access modifiers changed from: private */
        public b<K, V> e;
        private b<K, V> f;

        a(K k, int i) {
            this.a = k;
            this.e = this;
            this.f = this;
            this.b = new ValueEntry[fck.a(i, 1.0d)];
        }

        public final b<K, V> a() {
            return this.f;
        }

        public final b<K, V> b() {
            return this.e;
        }

        public final void a(b<K, V> bVar) {
            this.f = bVar;
        }

        public final void b(b<K, V> bVar) {
            this.e = bVar;
        }

        public final Iterator<V> iterator() {
            return new Iterator<V>() {
                private b<K, V> a = a.this.e;
                private ValueEntry<K, V> b;
                private int c = a.this.d;

                private void a() {
                    if (a.this.d != this.c) {
                        throw new ConcurrentModificationException();
                    }
                }

                public final boolean hasNext() {
                    a();
                    return this.a != a.this;
                }

                public final V next() {
                    if (hasNext()) {
                        ValueEntry<K, V> valueEntry = (ValueEntry) this.a;
                        V value = valueEntry.getValue();
                        this.b = valueEntry;
                        this.a = valueEntry.successorInValueSet;
                        return value;
                    }
                    throw new NoSuchElementException();
                }

                public final void remove() {
                    a();
                    fay.b(this.b != null, "no calls to next() since the last call to remove()");
                    a.this.remove(this.b.getValue());
                    this.c = a.this.d;
                    this.b = null;
                }
            };
        }

        public final int size() {
            return this.c;
        }

        public final boolean contains(Object obj) {
            int a2 = fck.a(obj);
            ValueEntry<K, V>[] valueEntryArr = this.b;
            for (ValueEntry<K, V> valueEntry = valueEntryArr[(valueEntryArr.length - 1) & a2]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.a(obj, a2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean add(V v) {
            int a2 = fck.a((Object) v);
            ValueEntry<K, V>[] valueEntryArr = this.b;
            int length = (valueEntryArr.length - 1) & a2;
            ValueEntry<K, V> valueEntry = valueEntryArr[length];
            ValueEntry<K, V> valueEntry2 = valueEntry;
            while (true) {
                boolean z = false;
                if (valueEntry2 == null) {
                    ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.a, v, a2, valueEntry);
                    LinkedHashMultimap.b(this.f, (b<K, V>) valueEntry3);
                    LinkedHashMultimap.b((b<K, V>) valueEntry3, (b<K, V>) this);
                    LinkedHashMultimap.b(LinkedHashMultimap.this.c.predecessorInMultimap, valueEntry3);
                    LinkedHashMultimap.b(valueEntry3, LinkedHashMultimap.this.c);
                    ValueEntry<K, V>[] valueEntryArr2 = this.b;
                    valueEntryArr2[length] = valueEntry3;
                    this.c++;
                    this.d++;
                    int i = this.c;
                    int length2 = valueEntryArr2.length;
                    double d2 = (double) i;
                    double d3 = (double) length2;
                    Double.isNaN(d3);
                    if (d2 > d3 * 1.0d && length2 < 1073741824) {
                        z = true;
                    }
                    if (z) {
                        ValueEntry<K, V>[] valueEntryArr3 = new ValueEntry[(this.b.length << 1)];
                        this.b = valueEntryArr3;
                        int length3 = valueEntryArr3.length - 1;
                        for (b<K, V> bVar = this.e; bVar != this; bVar = bVar.b()) {
                            ValueEntry<K, V> valueEntry4 = (ValueEntry) bVar;
                            int i2 = valueEntry4.smearedValueHash & length3;
                            valueEntry4.nextInValueBucket = valueEntryArr3[i2];
                            valueEntryArr3[i2] = valueEntry4;
                        }
                    }
                    return true;
                } else if (valueEntry2.a(v, a2)) {
                    return false;
                } else {
                    valueEntry2 = valueEntry2.nextInValueBucket;
                }
            }
        }

        public final boolean remove(Object obj) {
            int a2 = fck.a(obj);
            ValueEntry<K, V>[] valueEntryArr = this.b;
            int length = (valueEntryArr.length - 1) & a2;
            ValueEntry<K, V> valueEntry = valueEntryArr[length];
            ValueEntry<K, V> valueEntry2 = null;
            while (true) {
                ValueEntry<K, V> valueEntry3 = valueEntry2;
                valueEntry2 = valueEntry;
                ValueEntry<K, V> valueEntry4 = valueEntry3;
                if (valueEntry2 == null) {
                    return false;
                }
                if (valueEntry2.a(obj, a2)) {
                    if (valueEntry4 == null) {
                        this.b[length] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry4.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.b(valueEntry2.a(), valueEntry2.b());
                    LinkedHashMultimap.b(valueEntry2.predecessorInMultimap, valueEntry2.successorInMultimap);
                    this.c--;
                    this.d++;
                    return true;
                }
                valueEntry = valueEntry2.nextInValueBucket;
            }
        }

        public final void clear() {
            Arrays.fill(this.b, null);
            this.c = 0;
            for (b<K, V> bVar = this.e; bVar != this; bVar = bVar.b()) {
                LinkedHashMultimap.b(((ValueEntry) bVar).predecessorInMultimap, ((ValueEntry) bVar).successorInMultimap);
            }
            LinkedHashMultimap.b((b<K, V>) this, (b<K, V>) this);
            this.d++;
        }
    }

    interface b<K, V> {
        b<K, V> a();

        void a(b<K, V> bVar);

        b<K, V> b();

        void b(b<K, V> bVar);
    }

    public final /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.c(obj);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return super.a(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Map b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.d(obj);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ int e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return super.f(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> LinkedHashMultimap<K, V> p() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* access modifiers changed from: private */
    public static <K, V> void b(b<K, V> bVar, b<K, V> bVar2) {
        bVar.b(bVar2);
        bVar2.a(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<V> c() {
        return CompactLinkedHashSet.e(this.b);
    }

    /* access modifiers changed from: 0000 */
    public final Collection<V> e(K k) {
        return new a(k, this.b);
    }

    public final Set<Entry<K, V>> o() {
        return super.h();
    }

    public final Set<K> m() {
        return super.m();
    }

    public final Iterator<Entry<K, V>> j() {
        return new Iterator<Entry<K, V>>() {
            private ValueEntry<K, V> a = LinkedHashMultimap.this.c.successorInMultimap;
            private ValueEntry<K, V> b;

            public final boolean hasNext() {
                return this.a != LinkedHashMultimap.this.c;
            }

            public final void remove() {
                fay.b(this.b != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.c(this.b.getKey(), this.b.getValue());
                this.b = null;
            }

            public final /* synthetic */ Object next() {
                if (hasNext()) {
                    ValueEntry<K, V> valueEntry = this.a;
                    this.b = valueEntry;
                    this.a = valueEntry.successorInMultimap;
                    return valueEntry;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public final void f() {
        super.f();
        ValueEntry<K, V> valueEntry = this.c;
        b(valueEntry, valueEntry);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.m().size());
        for (Object writeObject : super.m()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(super.e());
        for (Entry entry : super.h()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new ValueEntry<>(null, null, 0, null);
        ValueEntry<K, V> valueEntry = this.c;
        b(valueEntry, valueEntry);
        this.b = 2;
        int readInt = objectInputStream.readInt();
        CompactLinkedHashMap f = CompactLinkedHashMap.f(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            f.put(readObject, e(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) f.get(readObject2)).add(objectInputStream.readObject());
        }
        a((Map<K, Collection<V>>) f);
    }

    /* access modifiers changed from: private */
    public static <K, V> void b(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.successorInMultimap = valueEntry2;
        valueEntry2.predecessorInMultimap = valueEntry;
    }

    private LinkedHashMultimap(int i, int i2) {
        super(CompactLinkedHashMap.f(16));
        fbu.a(2, "expectedValuesPerKey");
        this.b = 2;
        this.c = new ValueEntry<>(null, null, 0, null);
        ValueEntry<K, V> valueEntry = this.c;
        b(valueEntry, valueEntry);
    }

    public final /* synthetic */ Collection h() {
        return super.h();
    }
}
