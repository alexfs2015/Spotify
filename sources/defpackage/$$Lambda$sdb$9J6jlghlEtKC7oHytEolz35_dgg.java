package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$sdb$9J6jlghlEtKC7oHytEolz35_dgg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$sdb$9J6jlghlEtKC7oHytEolz35_dgg implements SingleOnSubscribe {
    private final /* synthetic */ sdb f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$sdb$9J6jlghlEtKC7oHytEolz35_dgg(sdb sdb, String str, String str2) {
        this.f$0 = sdb;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
