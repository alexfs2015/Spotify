package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.tasteonboarding.TasteOnboardingActivity;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: hld reason: default package */
public class hld extends hla {
    public gnj T;
    private final CompositeDisposable U = new CompositeDisposable();
    public rre a;

    public static hld a(fpt fpt) {
        hld hld = new hld();
        fpu.a((Fragment) hld, fpt);
        return hld;
    }

    public final void c() {
        this.U.a(this.a.a(this.T));
    }

    /* access modifiers changed from: protected */
    public final Intent e() {
        return TasteOnboardingActivity.a(q(), this.b, false);
    }

    public final void B() {
        super.B();
        this.U.c();
    }
}
