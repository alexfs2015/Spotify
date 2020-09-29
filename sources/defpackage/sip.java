package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: sip reason: default package */
public final class sip {
    private AlertDialog a;

    sip() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, String str, JsResult jsResult) {
        a();
        this.a = new Builder(context).setMessage(str).setPositiveButton(17039370, new $$Lambda$sip$hxxu18W7wHQzhgpvHpsveX4v0kM(this, jsResult)).setNegativeButton(17039360, new $$Lambda$sip$IGGCLQtc627Vpr8wRqInz3R6SwA(this, jsResult)).setOnCancelListener(new $$Lambda$sip$4pd6T4UInbgYg75yJ4UgYRlnL4(this, jsResult)).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
        this.a = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
        this.a = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.a = null;
    }

    public final void a() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.a = null;
        }
    }
}
