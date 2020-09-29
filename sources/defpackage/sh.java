package defpackage;

import android.os.Build.VERSION;
import androidx.work.ListenableWorker;

/* renamed from: sh reason: default package */
public final class sh extends sm {

    /* renamed from: sh$a */
    public static final class a extends defpackage.sm.a<a, sh> {
        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ defpackage.sm.a a() {
            return this;
        }

        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ sm b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.j.d) {
                return new sh(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    sh(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
