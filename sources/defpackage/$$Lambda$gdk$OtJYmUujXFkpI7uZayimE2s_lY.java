package defpackage;

import com.spotify.effortlesslogin.backend.EffortlessLoginNameResponse;
import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gdk$OtJYmUujXFkpI-7uZayimE2s_lY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gdk$OtJYmUujXFkpI7uZayimE2s_lY implements Function {
    public static final /* synthetic */ $$Lambda$gdk$OtJYmUujXFkpI7uZayimE2s_lY INSTANCE = new $$Lambda$gdk$OtJYmUujXFkpI7uZayimE2s_lY();

    private /* synthetic */ $$Lambda$gdk$OtJYmUujXFkpI7uZayimE2s_lY() {
    }

    public final Object apply(Object obj) {
        return EffortlessLoginPrerequisitesResult.createSuccess(((EffortlessLoginNameResponse) obj).fullName());
    }
}
