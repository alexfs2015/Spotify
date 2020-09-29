package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

/* renamed from: jta reason: default package */
public class jta extends jsy {
    private final kk b;
    private boolean c = false;

    public jta(SnackBar snackBar, int i, kk kkVar, String str) {
        super(snackBar, i, str);
        this.b = kkVar;
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

    public final boolean aF_() {
        return super.aF_() && this.c;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("spotify:snackbar:");
        sb.append(this.a);
        return sb.toString();
    }
}
