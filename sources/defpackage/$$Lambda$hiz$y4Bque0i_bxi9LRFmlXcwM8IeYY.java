package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY implements Consumer {
    public static final /* synthetic */ $$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY INSTANCE = new $$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY();

    private /* synthetic */ $$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY() {
    }

    public final void accept(Object obj) {
        Logger.c("Successfully updated ABBA values in Core, status = %d", Integer.valueOf(((Response) obj).getStatus()));
    }
}
