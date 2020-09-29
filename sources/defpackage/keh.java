package defpackage;

import android.content.Context;
import com.google.common.base.Optional;

/* renamed from: keh reason: default package */
public final class keh implements kci {
    private final gfk<fli> a;
    private final jtz b = jtp.a;
    private final Context c;

    public keh(Context context, gfk<fli> gfk, gcb gcb) {
        this.c = context;
        this.a = gfk;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        keg keg = new keg(kaa, this.b, jvn.a(this.c), str, this.a);
        return Optional.b(keg);
    }
}
