package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U implements Predicate {
    public static final /* synthetic */ $$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U INSTANCE = new $$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U();

    private /* synthetic */ $$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U() {
    }

    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).isSelf();
    }
}
