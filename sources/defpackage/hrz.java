package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;

/* renamed from: hrz reason: default package */
public final class hrz implements hrw {
    private final who<htm> a;

    public hrz(who<htm> who) {
        this.a = who;
    }

    public static MediaBrowserItem a(Context context) {
        hup hup = new hup("com.spotify.recently-played");
        hup.b = context.getString(R.string.collection_start_recently_played_title_short);
        hup.a = ActionType.BROWSABLE;
        hup.d = gcd.a(context, R.drawable.mediaservice_recently);
        return hup.b();
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return "com.spotify.recently-played".equals(huo.b());
    }
}
