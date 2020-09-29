package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uav reason: default package */
public final class uav {
    public final Context a;
    private final uau b;
    private final fpt c;

    public uav(Context context, uau uau, fpt fpt) {
        this.a = context;
        this.b = uau;
        this.c = fpt;
    }

    public final wud<uax> a() {
        if (!ubp.a(this.c)) {
            return ScalarSynchronousObservable.d(uax.a);
        }
        return vun.a((ObservableSource<T>) this.b.a().e((Function<? super Throwable, ? extends T>) $$Lambda$uav$7_MnHWVDcmw2yV0AqK3vxQFBk.INSTANCE), BackpressureStrategy.LATEST);
    }

    public static boolean a(GaiaDevice gaiaDevice, uax uax) {
        return gaiaDevice != null && uax.k().size() >= 2;
    }

    public static String a(Context context, GaiaDevice gaiaDevice, uax uax) {
        StringBuilder sb = new StringBuilder();
        if (gaiaDevice != null && (!gaiaDevice.isSelf() || !uax.c())) {
            sb.append(gaiaDevice.getName());
        }
        int size = uax.k().size();
        if (size >= 2) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(context.getResources().getQuantityString(R.plurals.social_listening_participants_listening, size, new Object[]{Integer.valueOf(size)}));
        }
        return sb.toString();
    }
}
