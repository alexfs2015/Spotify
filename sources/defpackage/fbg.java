package defpackage;

import com.google.common.cache.LongAddables;

/* renamed from: fbg reason: default package */
public abstract class fbg<K, V> {

    /* renamed from: fbg$a */
    public static final class a implements b {
        private final fbk a = LongAddables.a();
        private final fbk b = LongAddables.a();
        private final fbk c = LongAddables.a();
        private final fbk d = LongAddables.a();
        private final fbk e = LongAddables.a();
        private final fbk f = LongAddables.a();

        public final void a(long j) {
            this.c.a();
            this.e.a(j);
        }

        public final void b(long j) {
            this.d.a();
            this.e.a(j);
        }

        public final void a() {
            this.f.a();
        }
    }

    /* renamed from: fbg$b */
    public interface b {
        void a();

        void a(long j);

        void b(long j);
    }
}
