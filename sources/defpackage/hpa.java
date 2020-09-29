package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;

/* renamed from: hpa reason: default package */
public final class hpa {
    public ActionType a;
    public String b;
    public String c;
    public Uri d;
    public String e;
    public boolean f;
    private final String g;
    private Bundle h;

    public hpa(Uri uri) {
        this(String.valueOf(fay.a(uri)));
    }

    public hpa(String str) {
        this.a = ActionType.NONE;
        this.d = Uri.EMPTY;
        this.g = (String) fay.a(str);
    }

    public final hpa a(Bundle bundle) {
        if (bundle != null) {
            a().putAll(bundle);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public Bundle a() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final MediaBrowserItem b() {
        MediaBrowserItem mediaBrowserItem = new MediaBrowserItem(this.g, this.b, this.c, this.d, this.a, this.e, this.f, false, this.h);
        return mediaBrowserItem;
    }
}
