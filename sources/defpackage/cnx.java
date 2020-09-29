package defpackage;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@cfp
/* renamed from: cnx reason: default package */
public final class cnx extends cli {
    private final Context a;

    private cnx(Context context, ctm ctm) {
        super(ctm);
        this.a = context;
    }

    public static eas a(Context context) {
        eas eas = new eas((dch) new coj(new File(context.getCacheDir(), "admob_volley"), 0), (dsc) new cnx(context, new cum()), 0);
        eas.a();
        return eas;
    }

    public final duu a(dwv<?> dwv) {
        if (dwv.h && dwv.a == 0) {
            if (Pattern.matches((String) dqe.f().a(dtg.cH), dwv.b)) {
                dqe.a();
                if (cpc.c(this.a)) {
                    duu a2 = new dye(this.a).a(dwv);
                    if (a2 != null) {
                        String str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(dwv.b);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                        cml.a();
                        return a2;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    String valueOf2 = String.valueOf(dwv.b);
                    if (valueOf2.length() != 0) {
                        str2.concat(valueOf2);
                    } else {
                        new String(str2);
                    }
                    cml.a();
                }
            }
        }
        return super.a(dwv);
    }
}
