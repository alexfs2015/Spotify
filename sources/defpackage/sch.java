package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: sch reason: default package */
public final class sch implements Consumer<d> {
    private final scj a;
    private final scr b;
    private final sca c;

    public final /* synthetic */ void accept(Object obj) {
        for (sbq sbq : ((d) obj).a) {
            if (sbq instanceof e) {
                this.a.accept((e) sbq);
            } else if (sbq instanceof i) {
                this.b.accept((i) sbq);
            } else if (sbq instanceof a) {
                this.c.accept((a) sbq);
            } else {
                StringBuilder sb = new StringBuilder("Effect not handled in the MergedSearchEffectHandler: ");
                sb.append(sbq);
                Assertion.b(sb.toString());
            }
        }
    }

    public sch(scj scj, scr scr, sca sca) {
        this.a = scj;
        this.b = scr;
        this.c = sca;
    }
}
