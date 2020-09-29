package defpackage;

import android.os.Bundle;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$htn$ZNH3keqDbKf2ii7GQY3CHhXcwLQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$htn$ZNH3keqDbKf2ii7GQY3CHhXcwLQ implements SingleOnSubscribe {
    private final /* synthetic */ htn f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ int f$3;
    private final /* synthetic */ int f$4;
    private final /* synthetic */ Bundle f$5;

    public /* synthetic */ $$Lambda$htn$ZNH3keqDbKf2ii7GQY3CHhXcwLQ(htn htn, String str, String str2, int i, int i2, Bundle bundle) {
        this.f$0 = htn;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = bundle;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, singleEmitter);
    }
}
