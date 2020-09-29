package defpackage;

import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kfj$HRTZ1ZNj_Sv7ant0nsdIGU_IOmo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kfj$HRTZ1ZNj_Sv7ant0nsdIGU_IOmo implements Consumer {
    private final /* synthetic */ apz f$0;
    private final /* synthetic */ c f$1;

    public /* synthetic */ $$Lambda$kfj$HRTZ1ZNj_Sv7ant0nsdIGU_IOmo(apz apz, c cVar) {
        this.f$0 = apz;
        this.f$1 = cVar;
    }

    public final void accept(Object obj) {
        this.f$0.a((axp) this.f$1.a(Uri.parse(((b) obj).a)));
    }
}
