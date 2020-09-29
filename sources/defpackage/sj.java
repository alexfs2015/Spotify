package defpackage;

import android.os.Build.VERSION;
import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: sj reason: default package */
public final class sj extends sm {

    /* renamed from: sj$a */
    public static final class a extends defpackage.sm.a<a, sj> {
        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ defpackage.sm.a a() {
            return this;
        }

        public a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            uj ujVar = this.c;
            long millis = timeUnit.toMillis(24);
            long millis2 = timeUnit2.toMillis(12);
            if (millis < 900000) {
                sg.a();
                String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(900000)});
                millis = 900000;
            }
            if (millis2 < 300000) {
                sg.a();
                String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(300000)});
                millis2 = 300000;
            }
            if (millis2 > millis) {
                sg.a();
                String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(millis)});
                millis2 = millis;
            }
            ujVar.h = millis;
            ujVar.i = millis2;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ sm b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.j.d) {
                return new sj(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    sj(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
