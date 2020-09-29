package defpackage;

import android.os.Bundle;
import com.facebook.HttpMethod;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$llr$KAFABi__EeVSul5T1mb19NTTQ40 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$llr$KAFABi__EeVSul5T1mb19NTTQ40 implements Callable {
    private final /* synthetic */ Bundle f$0;

    public /* synthetic */ $$Lambda$llr$KAFABi__EeVSul5T1mb19NTTQ40(Bundle bundle) {
        this.f$0 = bundle;
    }

    public final Object call() {
        return akd.a(new akd(aju.a(), "me", this.f$0, HttpMethod.GET));
    }
}
