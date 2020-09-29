package defpackage;

import android.os.Bundle;
import com.facebook.HttpMethod;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$lpr$6zWhPJt2_Z5LQKH5l7P4zz5qFLE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lpr$6zWhPJt2_Z5LQKH5l7P4zz5qFLE implements Callable {
    private final /* synthetic */ Bundle f$0;

    public /* synthetic */ $$Lambda$lpr$6zWhPJt2_Z5LQKH5l7P4zz5qFLE(Bundle bundle) {
        this.f$0 = bundle;
    }

    public final Object call() {
        return akr.a(new akr(aki.a(), "me", this.f$0, HttpMethod.GET));
    }
}
