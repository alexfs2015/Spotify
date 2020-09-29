package defpackage;

import android.content.Context;
import com.google.common.base.Optional;

/* renamed from: hlg reason: default package */
public final class hlg implements vua<Optional<blq>> {
    private final wlc<Context> a;

    private hlg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static hlg a(wlc<Context> wlc) {
        return new hlg(wlc);
    }

    public final /* synthetic */ Object get() {
        Optional optional;
        Context context = (Context) this.a.get();
        if (brx.a().a(context) == 0) {
            optional = Optional.b(new blq(context, (a) new a().b().a()));
        } else {
            optional = Optional.e();
        }
        return (Optional) vuf.a(optional, "Cannot return null from a non-@Nullable @Provides method");
    }
}
