package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: ta reason: default package */
public abstract class ta {
    public UUID a;
    public ux b;
    public Set<String> c;

    /* renamed from: ta$a */
    public static abstract class a<B extends a, W extends ta> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        public ux c;
        Set<String> d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new ux(this.b.toString(), cls.getName());
            this.d.add(cls.getName());
            a();
        }

        public abstract B a();

        public final B a(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
            this.a = true;
            ux uxVar = this.c;
            uxVar.l = backoffPolicy;
            long millis = timeUnit.toMillis(5);
            if (millis > 18000000) {
                su.a();
                millis = 18000000;
            }
            if (millis < 10000) {
                su.a();
                millis = 10000;
            }
            uxVar.m = millis;
            return a();
        }

        public final B a(sq sqVar) {
            this.c.j = sqVar;
            return a();
        }

        public final B a(ss ssVar) {
            this.c.e = ssVar;
            return a();
        }

        /* access modifiers changed from: 0000 */
        public abstract W b();

        public final W c() {
            W b2 = b();
            this.b = UUID.randomUUID();
            this.c = new ux(this.c);
            this.c.a = this.b.toString();
            return b2;
        }
    }

    protected ta(UUID uuid, ux uxVar, Set<String> set) {
        this.a = uuid;
        this.b = uxVar;
        this.c = set;
    }
}
