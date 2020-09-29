package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q implements Consumer {
    public static final /* synthetic */ $$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q INSTANCE = new $$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q();

    private /* synthetic */ $$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
