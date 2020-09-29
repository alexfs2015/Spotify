package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: ctg reason: default package */
final class ctg implements OnClickListener {
    private final /* synthetic */ JsPromptResult a;
    private final /* synthetic */ EditText b;

    ctg(JsPromptResult jsPromptResult, EditText editText) {
        this.a = jsPromptResult;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm(this.b.getText().toString());
    }
}
