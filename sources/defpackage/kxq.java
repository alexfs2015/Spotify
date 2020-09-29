package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: kxq reason: default package */
public final class kxq implements kxp {
    private final Context a;
    private final sih b;
    private final fpt c;

    public kxq(Context context, sih sih, fpt fpt) {
        this.a = (Context) fay.a(context);
        this.b = (sih) fay.a(sih);
        this.c = (fpt) fay.a(fpt);
    }

    public final void a(String str, String str2) {
        CollectionService.a(this.a, str, this.b.toString(), str2, this.c, Messaging.ALL);
    }

    public final void a(String str) {
        CollectionService.a(this.a, str, this.b.toString(), this.c, Messaging.ALL);
    }
}
