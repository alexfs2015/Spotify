package defpackage;

import android.os.Build.VERSION;
import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: sx reason: default package */
public final class sx extends ta {

    /* renamed from: sx$a */
    public static final class a extends defpackage.ta.a<a, sx> {
        public a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            ux uxVar = this.c;
            long millis = timeUnit.toMillis(24);
            long millis2 = timeUnit2.toMillis(12);
            if (millis < 900000) {
                su.a();
                String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(900000)});
                millis = 900000;
            }
            if (millis2 < 300000) {
                su.a();
                String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(300000)});
                millis2 = 300000;
            }
            if (millis2 > millis) {
                su.a();
                String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(millis)});
                millis2 = millis;
            }
            uxVar.h = millis;
            uxVar.i = millis2;
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ defpackage.ta.a a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ ta b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.j.d) {
                return new sx(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    sx(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
