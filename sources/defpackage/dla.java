package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: dla reason: default package */
final class dla extends ContentObserver {
    private final /* synthetic */ dkx a;

    public dla(dkx dkx, Handler handler) {
        this.a = dkx;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.a.a();
    }
}
