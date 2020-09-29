package defpackage;

import java.util.Map;

/* renamed from: wij reason: default package */
public final class wij<K, V> extends wic<K, V, wzi<V>> implements who<Map<K, wzi<V>>> {

    /* renamed from: wij$a */
    public static final class a<K, V> extends defpackage.wic.a<K, V, wzi<V>> {
        private a(int i) {
            super(i);
        }

        /* synthetic */ a(int i, byte b) {
            this(i);
        }

        public final wij<K, V> a() {
            return new wij<>(this.a, 0);
        }

        /* renamed from: b */
        public final a<K, V> a(K k, wzi<V> wzi) {
            super.a(k, wzi);
            return this;
        }
    }

    private wij(Map<K, wzi<V>> map) {
        super(map);
    }

    /* synthetic */ wij(Map map, byte b) {
        this(map);
    }

    public static <K, V> a<K, V> a(int i) {
        return new a<>(2, 0);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
