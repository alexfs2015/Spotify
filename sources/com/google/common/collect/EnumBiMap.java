package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> c;
    private transient Class<V> d;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (Class) objectInputStream.readObject();
        this.d = (Class) objectInputStream.readObject();
        a((Map<K, V>) new EnumMap<K,V>(this.c), (Map<V, K>) new EnumMap<V,K>(this.d));
        fdn.a((Map<K, V>) this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.d);
        fdn.a((Map<K, V>) this, objectOutputStream);
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return (Enum) fbp.a((Enum) obj);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object b(Object obj) {
        return (Enum) fbp.a((Enum) obj);
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public final /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }
}
