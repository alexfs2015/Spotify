package defpackage;

import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.OfflineState.State;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: tul reason: default package */
public interface tul {

    /* renamed from: tul$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<Boolean> a(ura ura) {
            return ura.a.c((Function<? super T, ? extends R>) $$Lambda$tul$66cDEZNbbC3vNzBv5YwQOcV3J0w.INSTANCE);
        }

        public static /* synthetic */ Boolean a(OfflineState offlineState) {
            return Boolean.valueOf(offlineState.offlineState() == State.FORCED_OFFLINE);
        }
    }
}
