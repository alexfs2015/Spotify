package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$sPkocOkFbbOJDboSNWM0rrKFrP0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$sPkocOkFbbOJDboSNWM0rrKFrP0 implements Consumer {
    private final /* synthetic */ Activity f$0;

    public /* synthetic */ $$Lambda$hyi$sPkocOkFbbOJDboSNWM0rrKFrP0(Activity activity) {
        this.f$0 = activity;
    }

    public final void accept(Object obj) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
    }
}
