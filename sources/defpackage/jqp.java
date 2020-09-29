package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

/* renamed from: jqp reason: default package */
public class jqp extends jqn {
    private final kf b;
    private boolean c = false;

    public jqp(SnackBar snackBar, int i, kf kfVar, String str) {
        super(snackBar, i, str);
        this.b = kfVar;
    }

    public void a(ViewGroup viewGroup) {
        Fragment a = this.b.a(e());
        if (a != null) {
            this.b.a().c(a).b();
            this.b.b();
            this.c = true;
        }
    }

    public final void a(Fragment fragment) {
        this.b.a().a(this.a, fragment, e()).b();
        this.b.b();
        this.c = true;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("spotify:snackbar:");
        sb.append(this.a);
        return sb.toString();
    }

    public final boolean aH_() {
        return super.aH_() && this.c;
    }
}
