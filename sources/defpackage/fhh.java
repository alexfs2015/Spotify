package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: fhh reason: default package */
final class fhh extends ejs {
    private final /* synthetic */ fhg a;

    fhh(fhg fhg, Looper looper) {
        this.a = fhg;
        super(looper);
    }

    public final void handleMessage(Message message) {
        fhg.a(this.a, message);
    }
}
