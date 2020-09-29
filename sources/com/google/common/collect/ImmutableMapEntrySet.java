package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Entry<K, V>> {

    static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, V> map;

        EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    ImmutableMapEntrySet() {
    }

    /* access modifiers changed from: 0000 */
    public abstract ImmutableMap<K, V> b();

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return b().l();
    }

    public boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object obj2 = b().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public int size() {
        return b().size();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new EntrySetSerializedForm(b());
    }
}
