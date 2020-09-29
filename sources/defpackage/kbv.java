package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import io.reactivex.Scheduler;

/* renamed from: kbv reason: default package */
public final class kbv implements kci {
    private final Context a;
    private final jtz b = jtp.a;
    private final gfk<fli> c;
    private final kbs d;
    private final Scheduler e;
    private final kbx f;
    private final kby g;

    public kbv(Context context, gfk<fli> gfk, kbs kbs, gcb gcb, Scheduler scheduler, kbx kbx, kby kby) {
        this.a = context;
        this.c = gfk;
        this.d = kbs;
        this.e = scheduler;
        this.f = kbx;
        this.g = kby;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        if (kad == null || !kaa.c()) {
            return Optional.e();
        }
        kbu kbu = new kbu(kaa, jzx, kac, str, this.b, jvn.a(this.a), this.d, this.c, wit.a(this.e), this.g, this.f);
        return Optional.b(kbu);
    }
}
