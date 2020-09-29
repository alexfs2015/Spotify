package defpackage;

import android.content.Context;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: unq reason: default package */
public final class unq {
    public final Context a;
    private final unp b;
    private final fqn c;

    public unq(Context context, unp unp, fqn fqn) {
        this.a = context;
        this.b = unp;
        this.c = fqn;
    }

    public static String a(Context context, GaiaDevice gaiaDevice, uns uns) {
        StringBuilder sb = new StringBuilder();
        if (gaiaDevice != null && (!gaiaDevice.isSelf() || !uns.c())) {
            sb.append(gaiaDevice.getName());
        }
        int size = uns.k().size();
        if (size >= 2) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(context.getResources().getQuantityString(R.plurals.social_listening_participants_listening, size, new Object[]{Integer.valueOf(size)}));
        }
        return sb.toString();
    }

    public static boolean a(GaiaDevice gaiaDevice, uns uns) {
        return gaiaDevice != null && uns.k().size() >= 2;
    }

    public final xii<uns> a() {
        return !uok.a(this.c) ? ScalarSynchronousObservable.d(uns.a) : wit.a((ObservableSource<T>) this.b.a().e((Function<? super Throwable, ? extends T>) $$Lambda$unq$HHBZDKCO_D381lPXcGR4Q2wpgZg.INSTANCE), BackpressureStrategy.LATEST);
    }
}
