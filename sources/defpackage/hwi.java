package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;

/* renamed from: hwi reason: default package */
public final class hwi {
    public final void a(String str, hpt hpt, String str2, ActionCallback actionCallback, PlayOptions playOptions, jty jty) {
        String a = ute.a(Uri.parse(str), jty);
        if (a == null || a.isEmpty()) {
            hpt.d().a(str, playOptions, null, str2, actionCallback);
        } else {
            hpt.e().a(a, str2);
        }
    }
}
