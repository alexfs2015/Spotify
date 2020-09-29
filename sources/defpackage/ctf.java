package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: ctf reason: default package */
final class ctf implements OnClickListener {
    private final /* synthetic */ JsPromptResult a;

    ctf(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
