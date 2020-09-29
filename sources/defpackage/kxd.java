package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: kxd reason: default package */
public final class kxd implements kxc {
    private final Context a;
    private final sih b;
    private final fpt c;

    public kxd(Context context, sih sih, fpt fpt) {
        this.a = (Context) fay.a(context);
        this.b = (sih) fay.a(sih);
        this.c = fpt;
    }

    public final void a(String str, String str2, boolean z) {
        CollectionService.b(this.a, str, this.b.toString(), str2, this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void b(String str, String str2, boolean z) {
        CollectionService.c(this.a, str, this.b.toString(), str2, this.c, z ? Messaging.ALL : Messaging.NONE);
    }
}
