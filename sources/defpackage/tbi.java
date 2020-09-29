package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: tbi reason: default package */
public final class tbi extends c {
    boolean a;
    private final Activity b;

    public tbi(Activity activity, a aVar) {
        this.b = activity;
        aVar.a(this);
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("is_changing_configurations", this.b.isChangingConfigurations());
    }

    public final void b(Bundle bundle) {
        this.a = bundle != null && bundle.getBoolean("is_changing_configurations");
    }
}
