package defpackage;

import android.content.Intent;

/* renamed from: fgx reason: default package */
final /* synthetic */ class fgx implements Runnable {
    private final fgw a;
    private final Intent b;

    fgx(fgw fgw, Intent intent) {
        this.a = fgw;
        this.b = intent;
    }

    public final void run() {
        fgw fgw = this.a;
        String action = this.b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        fgw.a();
    }
}
