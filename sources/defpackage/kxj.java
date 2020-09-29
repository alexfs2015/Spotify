package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging;

/* renamed from: kxj reason: default package */
public final class kxj implements kxi {
    private final Context a;
    private final sih b;
    private final fpt c;

    public kxj(Context context, sih sih, fpt fpt) {
        this.a = (Context) fay.a(context);
        this.b = (sih) fay.a(sih);
        this.c = fpt;
    }

    public final void a(String str, String str2, boolean z) {
        a(new String[]{str}, str2, z);
    }

    public final void a(String[] strArr, String str, boolean z) {
        CollectionService.a(this.a, strArr, this.b.toString(), str, this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void a(String str, boolean z) {
        CollectionService.a(this.a, str, this.b.toString(), this.c, z ? Messaging.ALL : Messaging.NONE);
    }

    public final void a(String[] strArr, boolean z) {
        CollectionService.a(this.a, strArr, this.b.toString(), this.c, Messaging.ALL);
    }
}
