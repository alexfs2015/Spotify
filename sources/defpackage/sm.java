package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: sm reason: default package */
public abstract class sm {
    public UUID a;
    public uj b;
    public Set<String> c;

    /* renamed from: sm$a */
    public static abstract class a<B extends a, W extends sm> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        public uj c;
        Set<String> d = new HashSet();

        public abstract B a();

        /* access modifiers changed from: 0000 */
        public abstract W b();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new uj(this.b.toString(), cls.getName());
            this.d.add(cls.getName());
            a();
        }

        public final B a(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
            this.a = true;
            uj ujVar = this.c;
            ujVar.l = backoffPolicy;
            long millis = timeUnit.toMillis(5);
            if (millis > 18000000) {
                sg.a();
                millis = 18000000;
            }
            if (millis < 10000) {
                sg.a();
                millis = 10000;
            }
            ujVar.m = millis;
            return a();
        }

        public final B a(sc scVar) {
            this.c.j = scVar;
            return a();
        }

        public final B a(se seVar) {
            this.c.e = seVar;
            return a();
        }

        public final W c() {
            W b2 = b();
            this.b = UUID.randomUUID();
            this.c = new uj(this.c);
            this.c.a = this.b.toString();
            return b2;
        }
    }

    protected sm(UUID uuid, uj ujVar, Set<String> set) {
        this.a = uuid;
        this.b = ujVar;
        this.c = set;
    }
}
