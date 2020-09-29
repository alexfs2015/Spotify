package defpackage;

import android.content.Intent;

/* renamed from: fhr reason: default package */
final /* synthetic */ class fhr implements Runnable {
    private final fhq a;
    private final Intent b;

    fhr(fhq fhq, Intent intent) {
        this.a = fhq;
        this.b = intent;
    }

    public final void run() {
        fhq fhq = this.a;
        String action = this.b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        fhq.a();
    }
}
