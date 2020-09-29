package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import io.reactivex.functions.Consumer;

/* renamed from: ivo reason: default package */
public final class ivo implements wig<Consumer<ConcertResult>> {
    private final wzi<Context> a;

    public static Consumer<ConcertResult> a(Context context) {
        return (Consumer) wil.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
