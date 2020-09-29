package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: lre reason: default package */
public final class lre {
    private final Context a;
    private final sih b;

    public lre(Context context, sih sih) {
        this.a = (Context) fay.a(context);
        this.b = (sih) fay.a(sih);
    }

    public final void a(fpt fpt, String[] strArr, String str) {
        CollectionService.b(this.a, strArr, this.b.toString(), str, fpt, Messaging.NONE);
    }
}
