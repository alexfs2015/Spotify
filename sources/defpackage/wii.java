package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wii reason: default package */
public final class wii<K, V> extends wic<K, V, V> {

    /* renamed from: wii$a */
    public static final class a<K, V> extends defpackage.wic.a<K, V, V> {
        private a(int i) {
            super(i);
        }

        /* synthetic */ a(int i, byte b) {
            this(i);
        }

        public final wii<K, V> a() {
            return new wii<>(this.a, 0);
        }

        /* renamed from: b */
        public final a<K, V> a(K k, wzi<V> wzi) {
            super.a(k, wzi);
            return this;
        }
    }

    static {
        wih.a(Collections.emptyMap());
    }

    private wii(Map<K, wzi<V>> map) {
        super(map);
    }

    /* synthetic */ wii(Map map, byte b) {
        this(map);
    }

    public static <K, V> a<K, V> a(int i) {
        return new a<>(i, 0);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap b = wid.b(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((wzi) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(b);
    }
}
