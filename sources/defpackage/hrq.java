package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: hrq reason: default package */
public final class hrq implements hrw {
    private final who<hsy> a;

    public hrq(who<hsy> who) {
        this.a = who;
    }

    public static MediaBrowserItem a(Context context) {
        Bundle bundle = new gqn().b(1).a(2).a;
        hup hup = new hup("com.spotify.browse");
        hup.b = jun.a(context.getString(R.string.browse_title), Locale.getDefault());
        hup.d = gcd.a(context, R.drawable.mediaservice_browse);
        hup.a = ActionType.BROWSABLE;
        return hup.a(bundle).b();
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return "com.spotify.browse".equals(huo.b());
    }
}
