package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: hpl reason: default package */
public final class hpl implements hpx {
    private final vti<hqi> a;

    public hpl(vti<hqi> vti) {
        this.a = vti;
    }

    public static MediaBrowserItem a(Context context) {
        hpa hpa = new hpa("com.spotify.androidauto.home");
        hpa.b = jsd.a(context.getString(R.string.start_page_title), Locale.getDefault());
        hpa.d = gbf.a(context, R.drawable.mediaservice_home);
        hpa.a = ActionType.BROWSABLE;
        return hpa.b();
    }

    public final boolean a(String str) {
        return "com.spotify.androidauto.home".equals(str);
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }
}
