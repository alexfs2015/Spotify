package defpackage;

import android.app.Service;
import android.os.Looper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: qzl reason: default package */
public final class qzl implements wig<qzk> {
    private final wzi<Service> a;
    private final wzi<Looper> b;
    private final wzi<qzg> c;
    private final wzi<PlayerFactory> d;

    private qzl(wzi<Service> wzi, wzi<Looper> wzi2, wzi<qzg> wzi3, wzi<PlayerFactory> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qzl a(wzi<Service> wzi, wzi<Looper> wzi2, wzi<qzg> wzi3, wzi<PlayerFactory> wzi4) {
        return new qzl(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qzk((Service) this.a.get(), (Looper) this.b.get(), (qzg) this.c.get(), (PlayerFactory) this.d.get());
    }
}
