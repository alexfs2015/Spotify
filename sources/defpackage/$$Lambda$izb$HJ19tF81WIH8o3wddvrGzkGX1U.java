package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$izb$HJ19tF81WIH8o3wddvrGzkGX-1U reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$izb$HJ19tF81WIH8o3wddvrGzkGX1U implements Consumer {
    public static final /* synthetic */ $$Lambda$izb$HJ19tF81WIH8o3wddvrGzkGX1U INSTANCE = new $$Lambda$izb$HJ19tF81WIH8o3wddvrGzkGX1U();

    private /* synthetic */ $$Lambda$izb$HJ19tF81WIH8o3wddvrGzkGX1U() {
    }

    public final void accept(Object obj) {
        Logger.b("Something bad happened error: %s", (Throwable) obj);
    }
}
