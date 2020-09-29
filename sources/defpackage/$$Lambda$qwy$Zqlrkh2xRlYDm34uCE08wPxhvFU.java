package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU implements Consumer {
    public static final /* synthetic */ $$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU INSTANCE = new $$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU();

    private /* synthetic */ $$Lambda$qwy$Zqlrkh2xRlYDm34uCE08wPxhvFU() {
    }

    public final void accept(Object obj) {
        Assertion.a("Connection state error", (Throwable) obj);
    }
}
