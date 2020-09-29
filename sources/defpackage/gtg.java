package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: gtg reason: default package */
public interface gtg {

    /* renamed from: gtg$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static xii<ConnectState> a(ConnectManager connectManager) {
            return wit.a((ObservableSource<T>) connectManager.f(), BackpressureStrategy.BUFFER);
        }
    }
}
