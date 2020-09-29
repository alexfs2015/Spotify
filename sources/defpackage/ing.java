package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request;

/* renamed from: ing reason: default package */
public final class ing {
    private final Context a;
    private final vwu b;
    private final ini c;

    public ing(Context context, vwu vwu, ini ini) {
        this.a = context;
        this.b = vwu;
        this.c = ini;
    }

    private Intent a(Request request) {
        Intent intent = new Intent(this.a, BixbyHomeCardService.class);
        intent.putExtra("request", request.ordinal());
        return intent;
    }

    public final void a(Request request, int i, String str) {
        if (!this.c.a()) {
            Logger.e("Trying to start BixbyHomeCardService on an unsupported device", new Object[0]);
            return;
        }
        Intent a2 = a(request);
        a2.putExtra("card_id", i);
        a2.putExtra("event", str);
        this.b.a(this.a, a2, "BixbyHomeCardServiceStarter", new Object[0]);
    }

    public final void a(Request request, int[] iArr) {
        if (!this.c.a()) {
            Logger.e("Trying to start BixbyHomeCardService on an unsupported device", new Object[0]);
            return;
        }
        Intent a2 = a(request);
        a2.putExtra("card_ids", iArr);
        this.b.a(this.a, a2, "BixbyHomeCardServiceStarter", new Object[0]);
    }
}
