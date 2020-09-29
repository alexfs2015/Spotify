package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.tasteonboarding.TasteOnboardingActivity;

/* renamed from: hnv reason: default package */
public class hnv extends hns {
    public goy a;

    public static hnv a(fqn fqn) {
        hnv hnv = new hnv();
        fqo.a((Fragment) hnv, fqn);
        return hnv;
    }

    public final void c() {
        this.a.d();
    }

    /* access modifiers changed from: protected */
    public final Intent e() {
        return TasteOnboardingActivity.a(q(), this.b, false);
    }
}
