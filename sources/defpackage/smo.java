package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: smo reason: default package */
public final class smo implements Consumer<d> {
    private final smq a;
    private final smy b;
    private final smh c;

    public smo(smq smq, smy smy, smh smh) {
        this.a = smq;
        this.b = smy;
        this.c = smh;
    }

    public final /* synthetic */ void accept(Object obj) {
        for (slx slx : ((d) obj).a) {
            if (slx instanceof e) {
                this.a.accept((e) slx);
            } else if (slx instanceof i) {
                this.b.accept((i) slx);
            } else if (slx instanceof a) {
                this.c.accept((a) slx);
            } else {
                StringBuilder sb = new StringBuilder("Effect not handled in the MergedSearchEffectHandler: ");
                sb.append(slx);
                Assertion.b(sb.toString());
            }
        }
    }
}
