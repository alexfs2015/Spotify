package defpackage;

import com.spotify.player.model.command.Command;
import io.reactivex.Single;
import java.util.Locale;

/* renamed from: uwn reason: default package */
public final class uwn {
    private final uws a;
    private final uwq b;

    public uwn(uws uws, uwq uwq) {
        this.a = uws;
        this.b = uwq;
    }

    public final Single<uwi> a(String str, Command command) {
        Single a2 = this.a.a(String.format(Locale.US, "sp://player/v2/main/%s", new Object[]{str}), command);
        uwq uwq = this.b;
        uwq.getClass();
        return a2.f(new $$Lambda$pBFk_NI8WDWA5D094zJuKvUzfc(uwq));
    }
}
