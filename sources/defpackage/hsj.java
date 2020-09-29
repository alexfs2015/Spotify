package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;

/* renamed from: hsj reason: default package */
public final class hsj implements hrw {
    private final who<huh> a;

    public hsj(who<huh> who) {
        this.a = who;
    }

    public static MediaBrowserItem a(Context context) {
        Bundle bundle = new gqn().b(1).a;
        hup hup = new hup("com.spotify.your-library");
        hup.a = ActionType.BROWSABLE;
        hup.b = context.getString(R.string.collection_title_your_library);
        hup.d = gcd.a(context, R.drawable.mediaservice_yourmusic);
        hup.g = true;
        return hup.a(bundle).b();
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        return "com.spotify.your-library".equals(huo.b());
    }
}
