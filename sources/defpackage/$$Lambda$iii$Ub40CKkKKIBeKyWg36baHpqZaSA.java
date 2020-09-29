package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.RootListOptions;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$Ub40CKkKKIBeKyWg36baHpqZaSA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$Ub40CKkKKIBeKyWg36baHpqZaSA implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ RootListOptions f$1;

    public /* synthetic */ $$Lambda$iii$Ub40CKkKKIBeKyWg36baHpqZaSA(iii iii, RootListOptions rootListOptions) {
        this.f$0 = iii;
        this.f$1 = rootListOptions;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
