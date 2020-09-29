package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kzd$uyWA9l-Q0RecB7Xk6skVrLNBlKc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kzd$uyWA9lQ0RecB7Xk6skVrLNBlKc implements Consumer {
    public static final /* synthetic */ $$Lambda$kzd$uyWA9lQ0RecB7Xk6skVrLNBlKc INSTANCE = new $$Lambda$kzd$uyWA9lQ0RecB7Xk6skVrLNBlKc();

    private /* synthetic */ $$Lambda$kzd$uyWA9lQ0RecB7Xk6skVrLNBlKc() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
