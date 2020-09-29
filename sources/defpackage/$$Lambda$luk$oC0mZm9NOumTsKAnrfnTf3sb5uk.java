package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk implements Function {
    public static final /* synthetic */ $$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk INSTANCE = new $$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk();

    private /* synthetic */ $$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk() {
    }

    public final Object apply(Object obj) {
        return Logger.e((Throwable) obj, "Assisted Curation Album Loader: failed: %s", ((Throwable) obj).getMessage());
    }
}
