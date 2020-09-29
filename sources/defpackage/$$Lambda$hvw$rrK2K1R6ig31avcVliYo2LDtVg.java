package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvw$rrK2K1R6ig31avc-VliYo2LDtVg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hvw$rrK2K1R6ig31avcVliYo2LDtVg implements Consumer {
    private final /* synthetic */ Activity f$0;

    public /* synthetic */ $$Lambda$hvw$rrK2K1R6ig31avcVliYo2LDtVg(Activity activity) {
        this.f$0 = activity;
    }

    public final void accept(Object obj) {
        this.f$0.startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
    }
}
