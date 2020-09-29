package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;

/* renamed from: hpy reason: default package */
public final class hpy implements hpx {
    private final vti<hra> a;

    public hpy(vti<hra> vti) {
        this.a = vti;
    }

    public static MediaBrowserItem a(Context context) {
        hpa hpa = new hpa("com.spotify.recently-played");
        hpa.b = context.getString(R.string.collection_start_recently_played_title_short);
        hpa.a = ActionType.BROWSABLE;
        hpa.d = gbf.a(context, R.drawable.mediaservice_recently);
        return hpa.b();
    }

    public final boolean a(String str) {
        return "com.spotify.recently-played".equals(str);
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }
}
