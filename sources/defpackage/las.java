package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: las reason: default package */
public final class las implements lar {
    private final Context a;
    private final sso b;
    private final fqn c;

    public las(Context context, sso sso, fqn fqn) {
        this.a = (Context) fbp.a(context);
        this.b = (sso) fbp.a(sso);
        this.c = fqn;
    }

    public final void a(String str, String str2, boolean z) {
        a(new String[]{str}, str2, z);
    }

    public final void a(String str, boolean z) {
        CollectionService.a(this.a, str, this.b.toString(), this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void a(String[] strArr, String str, boolean z) {
        CollectionService.a(this.a, strArr, this.b.toString(), str, this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void a(String[] strArr, boolean z) {
        CollectionService.a(this.a, strArr, this.b.toString(), this.c, Messaging.ALL);
    }
}
