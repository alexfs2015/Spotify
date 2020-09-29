package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: cme reason: default package */
final class cme implements dtl {
    private final /* synthetic */ List a;
    private final /* synthetic */ dtk b;
    private final /* synthetic */ Context c;

    cme(List list, dtk dtk, Context context) {
        this.a = list;
        this.b = dtk;
        this.c = context;
    }

    public final void a() {
        for (String str : this.a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            cow.a(4);
            Uri parse = Uri.parse(str);
            dtk dtk = this.b;
            if (dtk.b != null) {
                if (dtk.b == null) {
                    dtk.a = null;
                } else if (dtk.a == null) {
                    dtk.a = dtk.b.a((dc) null);
                }
                dg dgVar = dtk.a;
                if (dgVar != null) {
                    dgVar.a(parse, null, null);
                }
            }
        }
        dtk dtk2 = this.b;
        Activity activity = (Activity) this.c;
        if (dtk2.c != null) {
            activity.unbindService(dtk2.c);
            dtk2.b = null;
            dtk2.a = null;
            dtk2.c = null;
        }
    }
}
