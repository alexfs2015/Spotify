package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: ctb reason: default package */
final class ctb implements OnCancelListener {
    private final /* synthetic */ JsResult a;

    ctb(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
