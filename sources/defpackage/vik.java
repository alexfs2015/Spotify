package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.player.model.command.Command;
import io.reactivex.Single;
import java.util.Locale;

/* renamed from: vik reason: default package */
public final class vik {
    private final vip a;
    private final vin b;

    public vik(vip vip, vin vin) {
        this.a = vip;
        this.b = vin;
    }

    public final Single<vhy> a(String str, Command command) {
        Single a2 = this.a.a(Request.POST, String.format(Locale.US, "sp://player/v2/main/%s", new Object[]{str}), command);
        vin vin = this.b;
        vin.getClass();
        return a2.f(new $$Lambda$MbZLTR_a4WUbZvA9NQFxkfkUjg(vin));
    }
}
