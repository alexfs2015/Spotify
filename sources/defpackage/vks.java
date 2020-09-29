package defpackage;

import android.app.Activity;
import com.spotify.libs.signup.validators.PasswordValidator;

/* renamed from: vks reason: default package */
public final class vks implements vua<PasswordValidator> {
    private final wlc<Activity> a;

    private vks(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static vks a(wlc<Activity> wlc) {
        return new vks(wlc);
    }

    public final /* synthetic */ Object get() {
        return (PasswordValidator) vuf.a(new PasswordValidator(new gmz((Activity) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
