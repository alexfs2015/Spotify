package defpackage;

import android.content.Context;
import com.google.common.base.Optional;

/* renamed from: hny reason: default package */
public final class hny implements wig<Optional<bmh>> {
    private final wzi<Context> a;

    private hny(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static hny a(wzi<Context> wzi) {
        return new hny(wzi);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (Optional) wil.a(bso.a().a(context) == 0 ? Optional.b(new bmh(context, (a) new a().b().a())) : Optional.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
