package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;
    private transient int b;

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

    public final /* bridge */ /* synthetic */ void f() {
        super.f();
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

    public final /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Set o() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> HashMultimap<K, V> p() {
        return new HashMultimap<>();
    }

    private HashMultimap() {
        this(12, 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<V> c() {
        return CompactHashSet.a(this.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        fcv.a((fcn<K, V>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = 2;
        int readInt = objectInputStream.readInt();
        a((Map<K, Collection<V>>) CompactHashMap.a(12));
        fcv.a((fcn<K, V>) this, objectInputStream, readInt);
    }

    private HashMultimap(int i, int i2) {
        super(CompactHashMap.a(12));
        this.b = 2;
        fay.a(true);
        this.b = 2;
    }
}
