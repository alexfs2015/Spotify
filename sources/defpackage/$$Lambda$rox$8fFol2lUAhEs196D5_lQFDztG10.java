package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.BiPredicate;

/* renamed from: -$$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10 implements BiPredicate {
    public static final /* synthetic */ $$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10 INSTANCE = new $$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10();

    private /* synthetic */ $$Lambda$rox$8fFol2lUAhEs196D5_lQFDztG10() {
    }

    public final boolean test(Object obj, Object obj2) {
        return ((GaiaDevice) obj).getIdentifier().equals(((GaiaDevice) obj2).getIdentifier());
    }
}
