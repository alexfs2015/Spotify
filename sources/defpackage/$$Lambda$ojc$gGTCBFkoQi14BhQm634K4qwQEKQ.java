package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ojc$gGTCBFkoQi14BhQm634K4qwQEKQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ojc$gGTCBFkoQi14BhQm634K4qwQEKQ implements Function {
    private final /* synthetic */ ojc f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$ojc$gGTCBFkoQi14BhQm634K4qwQEKQ(ojc ojc, String str) {
        this.f$0 = ojc;
        this.f$1 = str;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (SessionState) obj);
    }
}
