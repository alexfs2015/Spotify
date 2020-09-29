package defpackage;

import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.pushnotifications.model.PushRegistrationData;
import io.reactivex.Completable;

/* renamed from: vpx reason: default package */
public final class vpx implements vpw {
    private final vqg a;
    private final jty b;

    public vpx(vqg vqg, jty jty) {
        this.a = vqg;
        this.b = jty;
    }

    public final Completable a(String str) {
        StringBuilder sb = new StringBuilder("app id: ");
        sb.append(this.b.d());
        sb.append(" os version : ");
        sb.append(VERSION.RELEASE);
        Logger.b("info %s", sb.toString());
        return this.a.a(PushRegistrationData.create("prod", "gcm", str, true, this.b.d(), VERSION.RELEASE));
    }
}
