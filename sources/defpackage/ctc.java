package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: ctc reason: default package */
final class ctc implements OnClickListener {
    private final /* synthetic */ JsResult a;

    ctc(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
