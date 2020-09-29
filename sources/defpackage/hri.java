package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: hri reason: default package */
public final class hri implements hrw {
    private final who<hss> a;

    public hri(who<hss> who) {
        this.a = who;
    }

    public static MediaBrowserItem a(Context context) {
        hup hup = new hup("com.spotify.androidauto.home");
        hup.b = jun.a(context.getString(R.string.start_page_title), Locale.getDefault());
        hup.d = gcd.a(context, R.drawable.mediaservice_home);
        hup.a = ActionType.BROWSABLE;
        return hup.b();
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return "com.spotify.androidauto.home".equals(huo.b());
    }
}
