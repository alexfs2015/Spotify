package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import java.util.regex.Pattern;

/* renamed from: sfs reason: default package */
public final class sfs implements wig<gna> {
    private final wzi<gnb> a;

    private sfs(wzi<gnb> wzi) {
        this.a = wzi;
    }

    public static sfs a(wzi<gnb> wzi) {
        return new sfs(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gna) wil.a(new gna((gnb) this.a.get()) {
            public final boolean a(ViewLoadSequence viewLoadSequence) {
                for (String matches : sfj.a) {
                    if (Pattern.matches(matches, viewLoadSequence.c)) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean b(ViewLoadSequence viewLoadSequence) {
                return sgd.a.contains(viewLoadSequence.c);
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
