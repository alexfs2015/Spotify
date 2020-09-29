package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk implements Consumer {
    public static final /* synthetic */ $$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk INSTANCE = new $$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk();

    private /* synthetic */ $$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk() {
    }

    public final void accept(Object obj) {
        Logger.e("Something went wrong: %s", ((Throwable) obj).getMessage());
    }
}
