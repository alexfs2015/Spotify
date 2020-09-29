package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

@cey
/* renamed from: bkj reason: default package */
public final class bkj {
    boolean a;
    private final Context b;
    private ckk c;
    private cga d;

    public bkj(Context context, ckk ckk, cga cga) {
        this.b = context;
        this.c = ckk;
        this.d = cga;
        if (this.d == null) {
            this.d = new cga();
        }
    }

    private final boolean b() {
        ckk ckk = this.c;
        return (ckk != null && ckk.a().f) || this.d.a;
    }

    public final void a(String str) {
        if (b()) {
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            ckk ckk = this.c;
            if (ckk != null) {
                ckk.a(str, null, 3);
                return;
            }
            if (this.d.a && this.d.b != null) {
                for (String str3 : this.d.b) {
                    if (!TextUtils.isEmpty(str3)) {
                        String replace = str3.replace("{NAVIGATION_URL}", Uri.encode(str));
                        bjl.e();
                        cmd.a(this.b, str2, replace);
                    }
                }
            }
        }
    }

    public final boolean a() {
        return !b() || this.a;
    }
}
