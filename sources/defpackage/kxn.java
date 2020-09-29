package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.OffliningService;

/* renamed from: kxn reason: default package */
public final class kxn implements kxm {
    private final Context a;

    public kxn(Context context) {
        this.a = (Context) fay.a(context);
    }

    public final void a(String str) {
        OffliningService.a(this.a, str, true);
    }

    public final void b(String str) {
        OffliningService.a(this.a, str, false);
    }
}
