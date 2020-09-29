package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$pkc$wA5dBoQcHsF0KgqeUYo4OCXuK7g reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pkc$wA5dBoQcHsF0KgqeUYo4OCXuK7g implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$pkc$wA5dBoQcHsF0KgqeUYo4OCXuK7g(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Error getting Artist/Profile Information %s, %s", this.f$0, (Throwable) obj);
    }
}
