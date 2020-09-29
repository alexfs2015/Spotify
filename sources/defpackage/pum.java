package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: pum reason: default package */
public final class pum {
    final Context a;

    public pum(Context context) {
        this.a = (Context) fay.a(context);
    }

    static gzq a(String str) {
        return HubsImmutableComponentBundle.builder().a("radio-hub-placeholder", str).a();
    }
}
