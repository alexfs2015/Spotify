package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Comparator<? super K> b;
    private transient Comparator<? super V> c;

    /* access modifiers changed from: private */
    /* renamed from: i */
    public NavigableSet<V> g(K k) {
        return (NavigableSet) super.c(k);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = (Comparator) fbp.a((Comparator) objectInputStream.readObject());
        this.c = (Comparator) fbp.a((Comparator) objectInputStream.readObject());
        a((Map<K, Collection<V>>) new TreeMap<K,Collection<V>>(this.b));
        fdn.a((fdf<K, V>) this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeObject(this.c);
        fdn.a((fdf<K, V>) this, objectOutputStream);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return super.a(obj, obj2);
    }

    public final /* synthetic */ Map b() {
        return (NavigableMap) super.b();
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

    /* access modifiers changed from: 0000 */
    public final Collection<V> e(K k) {
        if (k == null) {
            this.b.compare(k, k);
        }
        return super.e(k);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return super.f(obj);
    }

    public final /* bridge */ /* synthetic */ SortedSet h(Object obj) {
        return super.d(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Map<K, Collection<V>> k() {
        return this.a instanceof NavigableMap ? new d((NavigableMap) this.a) : this.a instanceof SortedMap ? new g((SortedMap) this.a) : new a(this.a);
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public final /* synthetic */ Set m() {
        return (NavigableSet) super.m();
    }

    public final /* bridge */ /* synthetic */ Set o() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ SortedMap p() {
        return (NavigableMap) super.b();
    }

    public final /* bridge */ /* synthetic */ SortedSet q() {
        return (NavigableSet) super.m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final SortedSet<V> c() {
        return new TreeSet(this.c);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
