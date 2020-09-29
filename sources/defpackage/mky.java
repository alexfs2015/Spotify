package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: mky reason: default package */
public final class mky {
    final Context a;

    public mky(Context context) {
        this.a = (Context) fay.a(context);
    }

    static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a("daily-mix-hub-placeholder", str).a();
    }
}
