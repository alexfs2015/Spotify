package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: cso reason: default package */
final class cso implements OnClickListener {
    private final /* synthetic */ JsPromptResult a;

    cso(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
