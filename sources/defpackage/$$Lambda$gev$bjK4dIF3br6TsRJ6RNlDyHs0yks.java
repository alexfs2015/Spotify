package defpackage;

import com.spotify.effortlesslogin.backend.EffortlessLoginNameResponse;
import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks implements Function {
    public static final /* synthetic */ $$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks INSTANCE = new $$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks();

    private /* synthetic */ $$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks() {
    }

    public final Object apply(Object obj) {
        return EffortlessLoginPrerequisitesResult.createSuccess(((EffortlessLoginNameResponse) obj).fullName());
    }
}
