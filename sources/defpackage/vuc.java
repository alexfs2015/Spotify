package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: vuc reason: default package */
public final class vuc<K, V> extends vtw<K, V, V> {

    /* renamed from: vuc$a */
    public static final class a<K, V> extends defpackage.vtw.a<K, V, V> {
        /* synthetic */ a(int i, byte b) {
            this(i);
        }

        private a(int i) {
            super(i);
        }

        /* renamed from: b */
        public final a<K, V> a(K k, wlc<V> wlc) {
            super.a(k, wlc);
            return this;
        }

        public final vuc<K, V> a() {
            return new vuc<>(this.a, 0);
        }
    }

    /* synthetic */ vuc(Map map, byte b) {
        this(map);
    }

    static {
        vub.a(Collections.emptyMap());
    }

    public static <K, V> a<K, V> a(int i) {
        return new a<>(i, 0);
    }

    private vuc(Map<K, wlc<V>> map) {
        super(map);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap b = vtx.b(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((wlc) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(b);
    }
}
