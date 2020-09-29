package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: ctd reason: default package */
final class ctd implements OnClickListener {
    private final /* synthetic */ JsResult a;

    ctd(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm();
    }
}
