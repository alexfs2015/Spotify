package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rcn reason: default package */
public final class rcn {
    private final Context a;
    private final ToastieManager b;
    private final jsz c;

    public rcn(Context context, ToastieManager toastieManager, jsz jsz) {
        this.a = context;
        this.b = toastieManager;
        this.c = (jsz) fay.a(jsz);
    }

    public final void a() {
        a(SpotifyIconV2.CHECK, R.string.toast_following);
    }

    public final void b() {
        a(SpotifyIconV2.X, R.string.toast_unfollowing);
    }

    private void a(SpotifyIconV2 spotifyIconV2, int i) {
        this.c.a(spotifyIconV2, i, 0);
    }

    public void a(int i) {
        uos a2 = uos.a(this.a.getString(i), 3000).c(R.color.cat_white).b(R.color.cat_black).a();
        if (this.b.b()) {
            this.b.a(a2);
        } else {
            this.b.a = a2;
        }
    }
}
