package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvw$xyrr9zK5GzBtpq7VUWOBLo8RK90 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hvw$xyrr9zK5GzBtpq7VUWOBLo8RK90 implements Consumer {
    private final /* synthetic */ Activity f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$hvw$xyrr9zK5GzBtpq7VUWOBLo8RK90(Activity activity, Uri uri) {
        this.f$0 = activity;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", this.f$1));
    }
}
