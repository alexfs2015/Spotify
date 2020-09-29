package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$1T66BTYIGVUsLi5v4LeeUNOj86A reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$1T66BTYIGVUsLi5v4LeeUNOj86A implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ String[] f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$ikv$1T66BTYIGVUsLi5v4LeeUNOj86A(ikv ikv, String[] strArr, String str) {
        this.f$0 = ikv;
        this.f$1 = strArr;
        this.f$2 = str;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
