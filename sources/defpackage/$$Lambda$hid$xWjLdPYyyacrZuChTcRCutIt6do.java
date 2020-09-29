package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse.Error;

/* renamed from: -$$Lambda$hid$xWjLdPYyyacrZuChTcRCutIt6do reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hid$xWjLdPYyyacrZuChTcRCutIt6do implements ged {
    public static final /* synthetic */ $$Lambda$hid$xWjLdPYyyacrZuChTcRCutIt6do INSTANCE = new $$Lambda$hid$xWjLdPYyyacrZuChTcRCutIt6do();

    private /* synthetic */ $$Lambda$hid$xWjLdPYyyacrZuChTcRCutIt6do() {
    }

    public final void accept(Object obj) {
        Logger.c("The user failed to autologin: %d (%s)", Integer.valueOf(((Error) obj).status()), ((Error) obj).error());
    }
}
