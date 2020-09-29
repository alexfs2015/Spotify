package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$mpf49A_os0ae8vfdCAH0J-cBwGw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$mpf49A_os0ae8vfdCAH0JcBwGw implements Consumer {
    private final /* synthetic */ Uri f$0;

    public /* synthetic */ $$Lambda$hyi$mpf49A_os0ae8vfdCAH0JcBwGw(Uri uri) {
        this.f$0 = uri;
    }

    public final void accept(Object obj) {
        Logger.b("Error in opening uri: %s", this.f$0);
    }
}
