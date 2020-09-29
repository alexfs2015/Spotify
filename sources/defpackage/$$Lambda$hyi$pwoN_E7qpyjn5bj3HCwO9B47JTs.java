package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$pwoN_E7qpyjn5bj3HCwO9B47JTs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$pwoN_E7qpyjn5bj3HCwO9B47JTs implements Consumer {
    private final /* synthetic */ Activity f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$hyi$pwoN_E7qpyjn5bj3HCwO9B47JTs(Activity activity, Uri uri) {
        this.f$0 = activity;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", this.f$1));
    }
}
