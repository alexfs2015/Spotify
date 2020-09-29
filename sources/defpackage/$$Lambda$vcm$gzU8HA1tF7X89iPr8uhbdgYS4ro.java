package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro implements Consumer {
    public static final /* synthetic */ $$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro INSTANCE = new $$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro();

    private /* synthetic */ $$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro() {
    }

    public final void accept(Object obj) {
        Logger.d("getting fcm token failed with error %s", ((Throwable) obj).getMessage());
    }
}
