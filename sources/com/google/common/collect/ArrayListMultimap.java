package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;
    private transient int b;

    private ArrayListMultimap() {
        this(12, 3);
    }

    private ArrayListMultimap(int i, int i2) {
        super(CompactHashMap.a(12));
        fcl.a(3, "expectedValuesPerKey");
        this.b = 3;
    }

    public static <K, V> ArrayListMultimap<K, V> n() {
        return new ArrayListMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = 3;
        int readInt = objectInputStream.readInt();
        a((Map<K, Collection<V>>) CompactHashMap.a());
        fdn.a((fdf<K, V>) this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        fdn.a((fdf<K, V>) this, objectOutputStream);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<V> c() {
        return new ArrayList(this.b);
    }

    public final /* bridge */ /* synthetic */ List a(Object obj) {
        return super.c(obj);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return super.a(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ List b(Object obj) {
        return super.d(obj);
    }

    public final /* bridge */ /* synthetic */ Map b() {
        return super.b();
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

    public final /* bridge */ /* synthetic */ Collection h() {
        return super.h();
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

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
