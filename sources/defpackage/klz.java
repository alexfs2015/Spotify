package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.MainActivity;

/* renamed from: klz reason: default package */
public final class klz implements spi {
    public final Activity a;
    private final spe b;

    public klz(Activity activity, spe spe) {
        this.a = activity;
        this.b = spe;
    }

    private void b(spd spd, Optional<Bundle> optional) {
        Intent a2 = this.b.a(spd);
        if (optional.b()) {
            a2.putExtras((Bundle) optional.c());
        }
        this.a.startActivity(a2);
    }

    public final void a(spd spd) {
        b(spd, Optional.e());
    }

    public final void a(spd spd, Optional<Bundle> optional) {
        b(spd, optional);
    }

    public final void a() {
        this.a.startActivity(new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI").setClass(this.a, MainActivity.class).setFlags(67108864));
    }

    public final void a(String str) {
        b(spd.a(str).a(), Optional.e());
    }

    public final void a(String str, Bundle bundle) {
        b(spd.a(str).a(), Optional.b(bundle));
    }
}
