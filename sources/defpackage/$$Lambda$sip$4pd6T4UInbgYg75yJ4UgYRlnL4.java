package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: -$$Lambda$sip$4pd6T4UInbgYg75y-J4UgYRlnL4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sip$4pd6T4UInbgYg75yJ4UgYRlnL4 implements OnCancelListener {
    private final /* synthetic */ sip f$0;
    private final /* synthetic */ JsResult f$1;

    public /* synthetic */ $$Lambda$sip$4pd6T4UInbgYg75yJ4UgYRlnL4(sip sip, JsResult jsResult) {
        this.f$0 = sip;
        this.f$1 = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f$0.a(this.f$1, dialogInterface);
    }
}
