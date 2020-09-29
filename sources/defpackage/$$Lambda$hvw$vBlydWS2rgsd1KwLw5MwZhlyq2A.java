package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvw$vBlydWS2rgsd1KwLw5MwZhlyq2A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hvw$vBlydWS2rgsd1KwLw5MwZhlyq2A implements Consumer {
    private final /* synthetic */ Uri f$0;

    public /* synthetic */ $$Lambda$hvw$vBlydWS2rgsd1KwLw5MwZhlyq2A(Uri uri) {
        this.f$0 = uri;
    }

    public final void accept(Object obj) {
        Logger.b("Error in opening uri: %s", this.f$0);
    }
}
