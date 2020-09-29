package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: cmv reason: default package */
final class cmv implements duc {
    private final /* synthetic */ List a;
    private final /* synthetic */ dub b;
    private final /* synthetic */ Context c;

    cmv(List list, dub dub, Context context) {
        this.a = list;
        this.b = dub;
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
            cpn.a(4);
            Uri parse = Uri.parse(str);
            dub dub = this.b;
            if (dub.b != null) {
                if (dub.b == null) {
                    dub.a = null;
                } else if (dub.a == null) {
                    dub.a = dub.b.a((dc) null);
                }
                dg dgVar = dub.a;
                if (dgVar != null) {
                    dgVar.a(parse, null, null);
                }
            }
        }
        dub dub2 = this.b;
        Activity activity = (Activity) this.c;
        if (dub2.c != null) {
            activity.unbindService(dub2.c);
            dub2.b = null;
            dub2.a = null;
            dub2.c = null;
        }
    }
}
