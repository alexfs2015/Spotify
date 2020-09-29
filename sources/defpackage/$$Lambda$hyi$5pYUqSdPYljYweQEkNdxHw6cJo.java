package defpackage;

import android.app.Activity;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$5pYUqSd-PYljYweQEkNdxHw6cJo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$5pYUqSdPYljYweQEkNdxHw6cJo implements Consumer {
    private final /* synthetic */ hyi f$0;
    private final /* synthetic */ Activity f$1;
    private final /* synthetic */ fqa f$2;
    private final /* synthetic */ String f$3;

    public /* synthetic */ $$Lambda$hyi$5pYUqSdPYljYweQEkNdxHw6cJo(hyi hyi, Activity activity, fqa fqa, String str) {
        this.f$0 = hyi;
        this.f$1 = activity;
        this.f$2 = fqa;
        this.f$3 = str;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, this.f$2, this.f$3, (Uri) obj);
    }
}
