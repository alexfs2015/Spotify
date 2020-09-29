package defpackage;

import android.os.Build.VERSION;
import androidx.work.ListenableWorker;

/* renamed from: sv reason: default package */
public final class sv extends ta {

    /* renamed from: sv$a */
    public static final class a extends defpackage.ta.a<a, sv> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ defpackage.ta.a a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ ta b() {
            if (!this.a || VERSION.SDK_INT < 23 || !this.c.j.d) {
                return new sv(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    sv(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
