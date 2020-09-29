package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$upm$QWHk016DJNY87Hl696xRPHf0Kdk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$QWHk016DJNY87Hl696xRPHf0Kdk implements Consumer {
    private final /* synthetic */ lbs f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ NotificationManager f$2;

    public /* synthetic */ $$Lambda$upm$QWHk016DJNY87Hl696xRPHf0Kdk(lbs lbs, Context context, NotificationManager notificationManager) {
        this.f$0 = lbs;
        this.f$1 = context;
        this.f$2 = notificationManager;
    }

    public final void accept(Object obj) {
        upm.a(this.f$0, this.f$1, this.f$2, (b) obj);
    }
}
