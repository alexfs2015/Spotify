package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: ssw reason: default package */
public final class ssw {
    private AlertDialog a;

    ssw() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.a = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
        this.a = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
        this.a = null;
    }

    public final void a() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, String str, JsResult jsResult) {
        a();
        this.a = new Builder(context).setMessage(str).setPositiveButton(17039370, new $$Lambda$ssw$aZeaXIABrDrNiArEq2YSuNihpE4(this, jsResult)).setNegativeButton(17039360, new $$Lambda$ssw$sqD2eFG18NAUNoO_hXMp_T7tT0(this, jsResult)).setOnCancelListener(new $$Lambda$ssw$0OkJ4VH0azEZYbmBJy5p42yVv6w(this, jsResult)).show();
    }
}
