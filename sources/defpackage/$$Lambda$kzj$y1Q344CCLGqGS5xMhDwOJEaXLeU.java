package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU implements Consumer {
    public static final /* synthetic */ $$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU INSTANCE = new $$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU();

    private /* synthetic */ $$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
