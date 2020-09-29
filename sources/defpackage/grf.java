package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: grf reason: default package */
public interface grf {

    /* renamed from: grf$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static wud<ConnectState> a(ConnectManager connectManager) {
            return vun.a((ObservableSource<T>) connectManager.f(), BackpressureStrategy.BUFFER);
        }
    }
}
