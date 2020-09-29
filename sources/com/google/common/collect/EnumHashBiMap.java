package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> c;

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return (Enum) fay.a((Enum) obj);
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

    public final /* bridge */ /* synthetic */ Object forcePut(Object obj, Object obj2) {
        return super.forcePut((Enum) obj, obj2);
    }

    public final /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }

    public final /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        fcv.a((Map<K, V>) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (Class) objectInputStream.readObject();
        a((Map<K, V>) new EnumMap<K,V>(this.c), (Map<V, K>) new HashMap<V,K>((((Enum[]) this.c.getEnumConstants()).length * 3) / 2));
        fcv.a((Map<K, V>) this, objectInputStream);
    }
}
