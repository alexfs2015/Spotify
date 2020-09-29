package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;

/* renamed from: htw reason: default package */
public final class htw {
    public final void a(String str, hne hne, String str2, ActionCallback actionCallback, PlayOptions playOptions) {
        String a = uhq.a(Uri.parse(str));
        if (a == null || a.isEmpty()) {
            hne.d().a(str, playOptions, null, str2, actionCallback);
        } else {
            hne.e().a(a, str2);
        }
    }
}
