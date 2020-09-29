package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE implements Consumer {
    public static final /* synthetic */ $$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE INSTANCE = new $$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE();

    private /* synthetic */ $$Lambda$mhx$qDhlWnwZtJ1SpkYZ981mM0AhZWE() {
    }

    public final void accept(Object obj) {
        Assertion.a("Connection state error", (Throwable) obj);
    }
}
