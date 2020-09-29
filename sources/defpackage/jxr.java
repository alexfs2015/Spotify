package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jxr reason: default package */
public final class jxr {
    final b a;
    final AtomicInteger b = new AtomicInteger();
    final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: jxr$a */
    public class a {
        private final AtomicBoolean a = new AtomicBoolean(false);

        public a() {
            jxr.this.b.incrementAndGet();
        }

        public final void a() {
            if (this.a.compareAndSet(false, true) && jxr.this.b.decrementAndGet() == 0 && jxr.this.c.compareAndSet(false, true)) {
                jxr.this.a.onFireExecution();
            }
        }
    }

    /* renamed from: jxr$b */
    public interface b {
        void onFireExecution();
    }

    public static jxr a() {
        return new jxr(new b() {
            public final void onFireExecution() {
            }
        });
    }

    public jxr(b bVar) {
        this.a = bVar;
    }

    public final a b() {
        if (!this.c.get()) {
            return new a();
        }
        throw new IllegalStateException("Cannot acquire handle after delayed execution has fired");
    }
}
