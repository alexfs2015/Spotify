package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;

/* renamed from: hqg reason: default package */
public final class hqg implements hpx {
    private final vti<hrv> a;

    public hqg(vti<hrv> vti) {
        this.a = vti;
    }

    public static MediaBrowserItem a(Context context) {
        Bundle bundle = new gox().b(1).a;
        hpa hpa = new hpa("com.spotify.your-library");
        hpa.a = ActionType.BROWSABLE;
        hpa.b = context.getString(R.string.collection_title_your_library);
        hpa.d = gbf.a(context, R.drawable.mediaservice_yourmusic);
        hpa.f = true;
        return hpa.a(bundle).b();
    }

    public final boolean a(String str) {
        return "com.spotify.your-library".equals(str);
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }
}
