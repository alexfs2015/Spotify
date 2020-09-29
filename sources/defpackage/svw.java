package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: svw reason: default package */
public final class svw {
    private final szf a;
    private final szn b;

    public svw(szf szf, szn szn) {
        this.a = szf;
        this.b = szn;
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("fragment_key");
        Fragment a2 = this.a.a();
        if (a2 instanceof jqx) {
            jqx jqx = (jqx) a2;
            if (stringExtra == null || stringExtra.equals(jqx.e())) {
                this.b.a(BackNavigationInteractionType.NO_BUTTON_PRESSED);
            }
        }
    }
}
