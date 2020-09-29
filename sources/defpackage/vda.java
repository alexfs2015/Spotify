package defpackage;

import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.pushnotifications.model.PushRegistrationData;
import io.reactivex.Completable;

/* renamed from: vda reason: default package */
public final class vda implements vcz {
    private final vdi a;
    private final jro b;

    public vda(vdi vdi, jro jro) {
        this.a = vdi;
        this.b = jro;
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
