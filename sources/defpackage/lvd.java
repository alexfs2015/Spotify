package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: lvd reason: default package */
public final class lvd {
    private final Context a;
    private final sso b;

    public lvd(Context context, sso sso) {
        this.a = (Context) fbp.a(context);
        this.b = (sso) fbp.a(sso);
    }

    public final void a(fqn fqn, String[] strArr, String str) {
        CollectionService.b(this.a, strArr, this.b.toString(), str, fqn, Messaging.NONE);
    }
}
