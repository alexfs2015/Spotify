package defpackage;

import com.spotify.pushnotifications.model.PushRegistrationData;
import io.reactivex.Completable;

/* renamed from: vdi reason: default package */
public interface vdi {
    @wtr(a = "pushka-tokens/register")
    Completable a(@wtd PushRegistrationData pushRegistrationData);
}
