package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: bsi reason: default package */
final class bsi extends eif {
    private final /* synthetic */ String a;

    bsi(bsy bsy, String str) {
        this.a = str;
        super(bsy);
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehs) bVar);
    }

    public final void a(ehs ehs) {
        if (TextUtils.isEmpty(this.a)) {
            a(a(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null)));
            return;
        }
        try {
            String str = this.a;
            ehs.b((b<Status>) this);
            eie eie = (eie) ehs.q();
            if (ehs.t()) {
                eie.a(str);
            } else {
                ehs.c(2016);
            }
        } catch (IllegalStateException unused) {
            h();
        }
    }
}
