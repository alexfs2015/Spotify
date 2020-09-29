package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: laz reason: default package */
public final class laz implements lay {
    private final Context a;
    private final sso b;
    private final fqn c;

    public laz(Context context, sso sso, fqn fqn) {
        this.a = (Context) fbp.a(context);
        this.b = (sso) fbp.a(sso);
        this.c = (fqn) fbp.a(fqn);
    }

    public final void a(String str) {
        CollectionService.a(this.a, str, this.b.toString(), this.c, Messaging.ALL);
    }

    public final void a(String str, String str2) {
        CollectionService.a(this.a, str, this.b.toString(), str2, this.c, Messaging.ALL);
    }
}
