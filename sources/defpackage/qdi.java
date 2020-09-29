package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: qdi reason: default package */
public final class qdi {
    final Context a;

    public qdi(Context context) {
        this.a = (Context) fbp.a(context);
    }

    static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a("radio-hub-placeholder", str).a();
    }
}
