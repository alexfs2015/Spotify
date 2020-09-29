package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$wmekGnS7J1DW5s6LIlsNIXqPwO8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$wmekGnS7J1DW5s6LIlsNIXqPwO8 implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ String[] f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$iii$wmekGnS7J1DW5s6LIlsNIXqPwO8(iii iii, String[] strArr, String str) {
        this.f$0 = iii;
        this.f$1 = strArr;
        this.f$2 = str;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
