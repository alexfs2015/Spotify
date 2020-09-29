package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jir$yV-DL8lKg5ZPuGy-aL6Btjgfnsg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jir$yVDL8lKg5ZPuGyaL6Btjgfnsg implements Consumer {
    public static final /* synthetic */ $$Lambda$jir$yVDL8lKg5ZPuGyaL6Btjgfnsg INSTANCE = new $$Lambda$jir$yVDL8lKg5ZPuGyaL6Btjgfnsg();

    private /* synthetic */ $$Lambda$jir$yVDL8lKg5ZPuGyaL6Btjgfnsg() {
    }

    public final void accept(Object obj) {
        Assertion.b("[VoiceAd] manager start/stop error %s", (Throwable) obj);
    }
}
