package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: -$$Lambda$wam$4PK7jcoQQoEkozdXsRfKeM9uvUQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$wam$4PK7jcoQQoEkozdXsRfKeM9uvUQ implements OnCancelListener {
    private final /* synthetic */ wam f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$wam$4PK7jcoQQoEkozdXsRfKeM9uvUQ(wam wam, String str) {
        this.f$0 = wam;
        this.f$1 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f$0.a(this.f$1, dialogInterface);
    }
}
