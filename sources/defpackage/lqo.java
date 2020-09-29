package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: lqo reason: default package */
public class lqo extends jry implements a, a {
    public lqn a;
    public jvf b;

    public static lqo e() {
        return new lqo();
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(String str) {
        gpj.a(t(), str, (a) this);
    }

    public final void aP_() {
        super.aP_();
        lqn lqn = this.a;
        if (lqn.a.c.a(gpk.a, false)) {
            String a2 = lqn.a.c.a(gpk.b, (String) null);
            lqn.a.c.a().a(gpk.a).a(gpk.b).a();
            a(a2);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            gpj.a(t(), (a) this);
        }
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
