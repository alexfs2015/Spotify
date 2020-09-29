package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM implements Consumer {
    public static final /* synthetic */ $$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM INSTANCE = new $$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM();

    private /* synthetic */ $$Lambda$mig$kf0K7fnrelOUfdAD6attVhGYsQM() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to subscribe to ArtistDataLoader for list of tracks", new Object[0]);
    }
}
