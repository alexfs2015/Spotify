package defpackage;

import com.google.common.cache.LongAddables;

/* renamed from: fbx reason: default package */
public abstract class fbx<K, V> {

    /* renamed from: fbx$a */
    public static final class a implements b {
        private final fcb a = LongAddables.a();
        private final fcb b = LongAddables.a();
        private final fcb c = LongAddables.a();
        private final fcb d = LongAddables.a();
        private final fcb e = LongAddables.a();
        private final fcb f = LongAddables.a();

        public final void a() {
            this.f.a();
        }

        public final void a(long j) {
            this.c.a();
            this.e.a(j);
        }

        public final void b(long j) {
            this.d.a();
            this.e.a(j);
        }
    }

    /* renamed from: fbx$b */
    public interface b {
        void a();

        void a(long j);

        void b(long j);
    }
}
