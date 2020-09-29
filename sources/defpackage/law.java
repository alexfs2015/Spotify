package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.OffliningService;

/* renamed from: law reason: default package */
public final class law implements lav {
    private final Context a;

    public law(Context context) {
        this.a = (Context) fbp.a(context);
    }

    public final void a(String str) {
        OffliningService.a(this.a, str, true);
    }

    public final void b(String str) {
        OffliningService.a(this.a, str, false);
    }
}
