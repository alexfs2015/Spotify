package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.NavigationManager.BackNavigationInteractionType;

/* renamed from: slp reason: default package */
public final class slp {
    private final soy a;
    private final spg b;

    public slp(soy soy, spg spg) {
        this.a = soy;
        this.b = spg;
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("fragment_key");
        Fragment a2 = this.a.a();
        if (a2 instanceof jol) {
            jol jol = (jol) a2;
            if (stringExtra == null || stringExtra.equals(jol.e())) {
                this.b.a(BackNavigationInteractionType.NO_BUTTON_PRESSED);
            }
        }
    }
}
