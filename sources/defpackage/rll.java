package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rll reason: default package */
public final class rll {
    private final Context a;
    private final ToastieManager b;
    private final jvf c;

    public rll(Context context, ToastieManager toastieManager, jvf jvf) {
        this.a = context;
        this.b = toastieManager;
        this.c = (jvf) fbp.a(jvf);
    }

    private void a(SpotifyIconV2 spotifyIconV2, int i) {
        this.c.a(spotifyIconV2, i, 0);
    }

    public final void a() {
        a(SpotifyIconV2.CHECK, R.string.toast_following);
    }

    public void a(int i) {
        uzy a2 = uzy.a(this.a.getString(i), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }

    public final void b() {
        a(SpotifyIconV2.X, R.string.toast_unfollowing);
    }
}
