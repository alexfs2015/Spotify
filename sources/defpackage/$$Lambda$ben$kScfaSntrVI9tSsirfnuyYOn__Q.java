package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: -$$Lambda$ben$kScfaSntrVI9tSsirfnuyYOn__Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ben$kScfaSntrVI9tSsirfnuyYOn__Q implements ThreadFactory {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$ben$kScfaSntrVI9tSsirfnuyYOn__Q(String str) {
        this.f$0 = str;
    }

    public final Thread newThread(Runnable runnable) {
        return ben.a(this.f$0, runnable);
    }
}
