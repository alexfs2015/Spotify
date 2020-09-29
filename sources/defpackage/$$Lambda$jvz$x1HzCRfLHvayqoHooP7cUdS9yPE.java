package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;

/* renamed from: -$$Lambda$jvz$x1HzCRfLHvayqoHooP7cUdS9yPE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jvz$x1HzCRfLHvayqoHooP7cUdS9yPE implements Runnable {
    private final /* synthetic */ ContentResolver f$0;
    private final /* synthetic */ ContentObserver f$1;

    public /* synthetic */ $$Lambda$jvz$x1HzCRfLHvayqoHooP7cUdS9yPE(ContentResolver contentResolver, ContentObserver contentObserver) {
        this.f$0 = contentResolver;
        this.f$1 = contentObserver;
    }

    public final void run() {
        this.f$0.unregisterContentObserver(this.f$1);
    }
}
