package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vBAchyDs5cF-2YASEAOsxlt4ggc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc implements Function {
    public static final /* synthetic */ $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc INSTANCE = new $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc();

    private /* synthetic */ $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).connected());
    }
}
