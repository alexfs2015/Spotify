package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: -$$Lambda$vng$ZVX12ZmqWwjGWMOIuyY1tVt7bFY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vng$ZVX12ZmqWwjGWMOIuyY1tVt7bFY implements OnCancelListener {
    private final /* synthetic */ vng f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$vng$ZVX12ZmqWwjGWMOIuyY1tVt7bFY(vng vng, String str) {
        this.f$0 = vng;
        this.f$1 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f$0.a(this.f$1, dialogInterface);
    }
}
