package defpackage;

import android.app.NotificationManager;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;

/* renamed from: lex reason: default package */
public final class lex implements wig<vwy> {
    private final wzi<BixbyHomeCardService> a;
    private final wzi<NotificationManager> b;
    private final wzi<vwz> c;

    public static vwy a(BixbyHomeCardService bixbyHomeCardService, NotificationManager notificationManager, vwz vwz) {
        return (vwy) wil.a(CC.a(bixbyHomeCardService, notificationManager, vwz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((BixbyHomeCardService) this.a.get(), (NotificationManager) this.b.get(), (vwz) this.c.get());
    }
}
