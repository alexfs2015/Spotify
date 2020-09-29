package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jzr reason: default package */
public final class jzr {
    final b a;
    final AtomicInteger b = new AtomicInteger();
    final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: jzr$a */
    public class a {
        private final AtomicBoolean a = new AtomicBoolean(false);

        public a() {
            jzr.this.b.incrementAndGet();
        }

        public final void a() {
            if (this.a.compareAndSet(false, true) && jzr.this.b.decrementAndGet() == 0 && jzr.this.c.compareAndSet(false, true)) {
                jzr.this.a.onFireExecution();
            }
        }
    }

    /* renamed from: jzr$b */
    public interface b {
        void onFireExecution();
    }

    public jzr(b bVar) {
        this.a = bVar;
    }

    public static jzr a() {
        return new jzr(new b() {
            public final void onFireExecution() {
            }
        });
    }

    public final a b() {
        if (!this.c.get()) {
            return new a();
        }
        throw new IllegalStateException("Cannot acquire handle after delayed execution has fired");
    }
}
