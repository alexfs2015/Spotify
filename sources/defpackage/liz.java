package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Random;

/* renamed from: liz reason: default package */
public interface liz {

    /* renamed from: liz$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Optional<OrbitServiceInterface> a(OrbitFactory orbitFactory, Context context, jro jro, Random random, jsz jsz) {
            OrbitServiceInterface orbitServiceInterface;
            try {
                orbitServiceInterface = orbitFactory.createService(context.getApplicationContext(), 852700957, jro.a(), jro.b(), jro.c());
            } catch (RuntimeException e) {
                Assertion.a("Failed to start orbit due to RuntimeException", (Throwable) e);
                orbitServiceInterface = null;
                return Optional.c(orbitServiceInterface);
            } catch (UnsatisfiedLinkError e2) {
                if (random.nextDouble() >= 0.9d) {
                    StringBuilder sb = new StringBuilder("Failed to start orbit due to UnsatisfiedLinkError (throttled 90%) CPU Architecture: ");
                    sb.append(gbb.a());
                    Assertion.a(sb.toString(), (Throwable) e2);
                }
                jsz.a((int) R.string.toast_internal_error_suggest_reinstallation, 1, new Object[0]);
                orbitServiceInterface = null;
                return Optional.c(orbitServiceInterface);
            }
            return Optional.c(orbitServiceInterface);
        }

        public static vjt a(swe swe) {
            swe.getClass();
            return new $$Lambda$ZReJmSktC16htmgZcbgF4nAI08(swe);
        }
    }
}
