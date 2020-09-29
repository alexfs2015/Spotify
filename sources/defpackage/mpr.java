package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: mpr reason: default package */
public final class mpr {
    final Context a;

    public mpr(Context context) {
        this.a = (Context) fbp.a(context);
    }

    static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a("daily-mix-hub-placeholder", str).a();
    }
}
