package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import io.reactivex.functions.Consumer;

/* renamed from: itf reason: default package */
public final class itf implements vua<Consumer<ConcertResult>> {
    private final wlc<Context> a;

    public static Consumer<ConcertResult> a(Context context) {
        return (Consumer) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
