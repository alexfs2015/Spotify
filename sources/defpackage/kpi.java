package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.MainActivity;

/* renamed from: kpi reason: default package */
public final class kpi implements szp {
    private final Activity a;
    private final szl b;

    public kpi(Activity activity, szl szl) {
        this.a = activity;
        this.b = szl;
    }

    private void b(szk szk, Optional<Bundle> optional) {
        Intent a2 = this.b.a(szk);
        if (optional.b()) {
            a2.putExtras((Bundle) optional.c());
        }
        this.a.startActivity(a2);
    }

    public final void a() {
        this.a.startActivity(new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI").setClass(this.a, MainActivity.class).setFlags(67108864));
    }

    public final void a(String str) {
        b(szk.a(str).a(), Optional.e());
    }

    public final void a(String str, Bundle bundle) {
        b(szk.a(str).a(), Optional.b(bundle));
    }

    public final void a(szk szk) {
        b(szk, Optional.e());
    }

    public final void a(szk szk, Optional<Bundle> optional) {
        b(szk, optional);
    }
}
