package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: hpt reason: default package */
public final class hpt implements hpx {
    private final vti<hqq> a;

    public hpt(vti<hqq> vti) {
        this.a = vti;
    }

    public static MediaBrowserItem a(Context context) {
        Bundle bundle = new gox().b(1).a(2).a;
        hpa hpa = new hpa("com.spotify.browse");
        hpa.b = jsd.a(context.getString(R.string.browse_title), Locale.getDefault());
        hpa.d = gbf.a(context, R.drawable.mediaservice_browse);
        hpa.a = ActionType.BROWSABLE;
        return hpa.a(bundle).b();
    }

    public final boolean a(String str) {
        return "com.spotify.browse".equals(str);
    }

    public final hqx a() {
        return (hqx) this.a.get();
    }
}
