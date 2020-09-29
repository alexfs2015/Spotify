package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: dkj reason: default package */
final class dkj extends ContentObserver {
    private final /* synthetic */ dkg a;

    public dkj(dkg dkg, Handler handler) {
        this.a = dkg;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.a.a();
    }
}
