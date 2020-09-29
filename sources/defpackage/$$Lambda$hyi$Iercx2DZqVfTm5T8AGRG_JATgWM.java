package defpackage;

import android.app.Activity;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$Iercx2DZqVfTm5T8AGRG_JATgWM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$Iercx2DZqVfTm5T8AGRG_JATgWM implements Consumer {
    private final /* synthetic */ fqa f$0;
    private final /* synthetic */ Activity f$1;

    public /* synthetic */ $$Lambda$hyi$Iercx2DZqVfTm5T8AGRG_JATgWM(fqa fqa, Activity activity) {
        this.f$0 = fqa;
        this.f$1 = activity;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Uri) obj);
    }
}
