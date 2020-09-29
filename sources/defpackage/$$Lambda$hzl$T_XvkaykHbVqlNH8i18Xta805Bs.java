package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$hzl$T_XvkaykHbVqlNH8i18Xta805Bs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hzl$T_XvkaykHbVqlNH8i18Xta805Bs implements Action {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$hzl$T_XvkaykHbVqlNH8i18Xta805Bs(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void run() {
        Logger.b("Ad Event Reported Successfully: %s, %s", this.f$0, this.f$1);
    }
}
