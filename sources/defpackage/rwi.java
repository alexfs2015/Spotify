package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import java.util.regex.Pattern;

/* renamed from: rwi reason: default package */
public final class rwi implements vua<gll> {
    private final wlc<glm> a;

    private rwi(wlc<glm> wlc) {
        this.a = wlc;
    }

    public static rwi a(wlc<glm> wlc) {
        return new rwi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gll) vuf.a(new gll((glm) this.a.get()) {
            public final boolean a(ViewLoadSequence viewLoadSequence) {
                for (String matches : rvz.a) {
                    if (Pattern.matches(matches, viewLoadSequence.c)) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean b(ViewLoadSequence viewLoadSequence) {
                return rwt.a.contains(viewLoadSequence.c);
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
