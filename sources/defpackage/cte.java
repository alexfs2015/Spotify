package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

/* renamed from: cte reason: default package */
final class cte implements OnCancelListener {
    private final /* synthetic */ JsPromptResult a;

    cte(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
