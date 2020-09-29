package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: lmo reason: default package */
public class lmo extends jpm implements a, a {
    public lmn a;
    public jsz b;

    public static lmo e() {
        return new lmo();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            gnu.a(t(), (a) this);
        }
    }

    public final void g() {
        super.g();
        lmn lmn = this.a;
        if (lmn.a.c.a(gnv.a, false)) {
            String a2 = lmn.a.c.a(gnv.b, (String) null);
            lmn.a.c.a().a(gnv.a).a(gnv.b).a();
            a(a2);
        }
    }

    public final void a(String str) {
        gnu.a(t(), str, (a) this);
    }

    public final void f_(int i) {
        if (i != 1) {
            if (i == 2) {
                this.b.a(SpotifyIconV2.WARNING, (int) R.string.set_password_error_toast, 0);
            }
            return;
        }
        this.b.a(SpotifyIconV2.CHECK, (int) R.string.set_password_success_toast, 0);
    }
}
