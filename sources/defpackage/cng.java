package defpackage;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@cey
/* renamed from: cng reason: default package */
public final class cng extends ckr {
    private final Context a;

    private cng(Context context, csv csv) {
        super(csv);
        this.a = context;
    }

    public static eab a(Context context) {
        eab eab = new eab((dbq) new cns(new File(context.getCacheDir(), "admob_volley"), 0), (drl) new cng(context, new ctv()), 0);
        eab.a();
        return eab;
    }

    public final dud a(dwe<?> dwe) {
        if (dwe.h && dwe.a == 0) {
            if (Pattern.matches((String) dpn.f().a(dsp.cH), dwe.b)) {
                dpn.a();
                if (col.c(this.a)) {
                    dud a2 = new dxn(this.a).a(dwe);
                    if (a2 != null) {
                        String str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(dwe.b);
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                        clu.a();
                        return a2;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    String valueOf2 = String.valueOf(dwe.b);
                    if (valueOf2.length() != 0) {
                        str2.concat(valueOf2);
                    } else {
                        new String(str2);
                    }
                    clu.a();
                }
            }
        }
        return super.a(dwe);
    }
}
