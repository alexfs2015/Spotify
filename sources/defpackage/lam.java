package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: lam reason: default package */
public final class lam implements lal {
    private final Context a;
    private final sso b;
    private final fqn c;

    public lam(Context context, sso sso, fqn fqn) {
        this.a = (Context) fbp.a(context);
        this.b = (sso) fbp.a(sso);
        this.c = fqn;
    }

    public final void a(String str, String str2, boolean z) {
        CollectionService.b(this.a, str, this.b.toString(), str2, this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void b(String str, String str2, boolean z) {
        CollectionService.c(this.a, str, this.b.toString(), str2, this.c, z ? Messaging.ALL : Messaging.NONE);
    }
}
