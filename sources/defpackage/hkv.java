package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.languagepicker.LanguageOnboardingActivity;

/* renamed from: hkv reason: default package */
public class hkv extends hla {
    public gnj a;

    public static hkv a(fpt fpt) {
        hkv hkv = new hkv();
        fpu.a((Fragment) hkv, fpt);
        return hkv;
    }

    public final void c() {
        this.a.g();
    }

    /* access modifiers changed from: protected */
    public final Intent e() {
        return LanguageOnboardingActivity.a(q());
    }
}
