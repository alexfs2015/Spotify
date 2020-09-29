package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;

/* renamed from: hup reason: default package */
public final class hup {
    public ActionType a;
    public String b;
    public String c;
    public Uri d;
    Uri e;
    public String f;
    public boolean g;
    private final String h;
    private Bundle i;

    public hup(Uri uri) {
        this(String.valueOf(fbp.a(uri)));
    }

    public hup(String str) {
        this.a = ActionType.NONE;
        this.d = Uri.EMPTY;
        this.h = (String) fbp.a(str);
    }

    public Bundle a() {
        if (this.i == null) {
            this.i = new Bundle();
        }
        return this.i;
    }

    public final hup a(Bundle bundle) {
        if (bundle != null) {
            a().putAll(bundle);
        }
        return this;
    }

    public final MediaBrowserItem b() {
        MediaBrowserItem mediaBrowserItem = new MediaBrowserItem(this.h, this.b, this.c, this.d, this.e, this.a, this.f, this.g, false, this.i);
        return mediaBrowserItem;
    }
}
