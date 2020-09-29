package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;

/* renamed from: cne reason: default package */
final class cne implements Runnable {
    final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ boolean d;

    cne(Context context, String str, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.a);
        builder.setMessage(this.b);
        builder.setTitle(this.c ? "Error" : "Info");
        String str = "Dismiss";
        if (this.d) {
            builder.setNeutralButton(str, null);
        } else {
            builder.setPositiveButton("Learn More", new cnf(this));
            builder.setNegativeButton(str, null);
        }
        builder.create().show();
    }
}
