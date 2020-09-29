package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: lzk reason: default package */
public final class lzk {
    private final Context a;

    public lzk(Context context) {
        this.a = (Context) fay.a(context);
    }

    public final gzz a() {
        return gyi.b().a(a((int) R.string.find_error_title, (int) R.string.find_error_body)).a(a("browse-error-empty-view")).a();
    }

    public final gzz b() {
        return gyi.b().a(a((int) R.string.find_error_no_connection_title, (int) R.string.find_error_no_connection_body)).a(a("browse-no-network-empty-view")).a();
    }

    public static boolean a(gzz gzz) {
        String str = "browse-no-network-empty-view";
        return a(gzz, str) || str.equals(gzz.custom().string("browse-placeholder"));
    }

    public static boolean a(gzz gzz, String str) {
        return gyi.a(gzz) && str.equals(gzz.custom().string("browse-placeholder"));
    }

    private gzt a(int i, int i2) {
        return hae.builder().a("find:inlineEmptyState", HubsComponentCategory.CARD.mId).a(haf.builder().a(this.a.getString(i)).b(this.a.getString(i2))).a();
    }

    public static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a("browse-placeholder", str).a();
    }
}
