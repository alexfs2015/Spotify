package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A implements Predicate {
    public static final /* synthetic */ $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A INSTANCE = new $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A();

    private /* synthetic */ $$Lambda$zRC_54SeSitqV8WygV6vUsYzy0A() {
    }

    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).isActive();
    }
}
