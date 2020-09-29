package defpackage;

import java.util.Map;

/* renamed from: vud reason: default package */
public final class vud<K, V> extends vtw<K, V, wlc<V>> implements vti<Map<K, wlc<V>>> {

    /* renamed from: vud$a */
    public static final class a<K, V> extends defpackage.vtw.a<K, V, wlc<V>> {
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

        public final vud<K, V> a() {
            return new vud<>(this.a, 0);
        }
    }

    /* synthetic */ vud(Map map, byte b) {
        this(map);
    }

    public static <K, V> a<K, V> a(int i) {
        return new a<>(2, 0);
    }

    private vud(Map<K, wlc<V>> map) {
        super(map);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
