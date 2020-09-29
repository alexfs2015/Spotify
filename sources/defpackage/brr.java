package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: brr reason: default package */
final class brr extends eho {
    private final /* synthetic */ String a;

    brr(bsh bsh, String str) {
        this.a = str;
        super(bsh);
    }

    public final void a(ehb ehb) {
        if (TextUtils.isEmpty(this.a)) {
            a(a(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null)));
            return;
        }
        try {
            String str = this.a;
            ehb.b((b<Status>) this);
            ehn ehn = (ehn) ehb.q();
            if (ehb.t()) {
                ehn.a(str);
            } else {
                ehb.c(2016);
            }
        } catch (IllegalStateException unused) {
            h();
        }
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehb) bVar);
    }
}
