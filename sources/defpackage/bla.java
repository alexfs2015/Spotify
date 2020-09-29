package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

@cfp
/* renamed from: bla reason: default package */
public final class bla {
    boolean a;
    private final Context b;
    private clb c;
    private cgr d;

    public bla(Context context, clb clb, cgr cgr) {
        this.b = context;
        this.c = clb;
        this.d = cgr;
        if (this.d == null) {
            this.d = new cgr();
        }
    }

    private final boolean b() {
        clb clb = this.c;
        return (clb != null && clb.a().f) || this.d.a;
    }

    public final void a(String str) {
        if (b()) {
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            clb clb = this.c;
            if (clb != null) {
                clb.a(str, null, 3);
                return;
            }
            if (this.d.a && this.d.b != null) {
                for (String str3 : this.d.b) {
                    if (!TextUtils.isEmpty(str3)) {
                        String replace = str3.replace("{NAVIGATION_URL}", Uri.encode(str));
                        bkc.e();
                        cmu.a(this.b, str2, replace);
                    }
                }
            }
        }
    }

    public final boolean a() {
        return !b() || this.a;
    }
}
