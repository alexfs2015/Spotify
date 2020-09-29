package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Random;

/* renamed from: lmy reason: default package */
public interface lmy {

    /* renamed from: lmy$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Optional<OrbitServiceInterface> a(OrbitFactory orbitFactory, Context context, jty jty, Random random, jvf jvf) {
            OrbitServiceInterface orbitServiceInterface;
            try {
                orbitServiceInterface = orbitFactory.createService(context.getApplicationContext(), 852900828, jty.a(), jty.b(), jty.c());
            } catch (RuntimeException e) {
                Assertion.a("Failed to start orbit due to RuntimeException", (Throwable) e);
                orbitServiceInterface = null;
                return Optional.c(orbitServiceInterface);
            } catch (UnsatisfiedLinkError e2) {
                if (random.nextDouble() >= 0.9d) {
                    StringBuilder sb = new StringBuilder("Failed to start orbit due to UnsatisfiedLinkError (throttled 90%) CPU Architecture: ");
                    sb.append(gby.a());
                    Assertion.a(sb.toString(), (Throwable) e2);
                }
                jvf.a((int) R.string.toast_internal_error_suggest_reinstallation, 1, new Object[0]);
                orbitServiceInterface = null;
                return Optional.c(orbitServiceInterface);
            }
            return Optional.c(orbitServiceInterface);
        }

        public static vwz a(tgl tgl) {
            tgl.getClass();
            return new $$Lambda$7lJKMMBHKQFTOFQ0nFvNOj6qsQ(tgl);
        }
    }
}
