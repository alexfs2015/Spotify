package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iin$_Wa7BKoInSO239AlshveIGXYQKI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$iin$_Wa7BKoInSO239AlshveIGXYQKI implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$iin$_Wa7BKoInSO239AlshveIGXYQKI(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Error in reporting event: %s, error message: %s", this.f$0, ((Throwable) obj).getMessage());
    }
}
