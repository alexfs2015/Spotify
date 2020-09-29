package defpackage;

import android.app.Activity;
import com.spotify.libs.signup.validators.PasswordValidator;

/* renamed from: vxy reason: default package */
public final class vxy implements wig<PasswordValidator> {
    private final wzi<Activity> a;

    private vxy(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static vxy a(wzi<Activity> wzi) {
        return new vxy(wzi);
    }

    public final /* synthetic */ Object get() {
        return (PasswordValidator) wil.a(new PasswordValidator(new goo((Activity) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
