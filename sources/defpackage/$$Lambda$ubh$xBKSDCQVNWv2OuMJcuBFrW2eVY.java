package defpackage;

import com.squareup.picasso.Picasso;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ubh$xBKSDCQVNWv2OuMJcuBF-rW2eVY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ubh$xBKSDCQVNWv2OuMJcuBFrW2eVY implements SingleOnSubscribe {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ Picasso f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ String f$3;

    public /* synthetic */ $$Lambda$ubh$xBKSDCQVNWv2OuMJcuBFrW2eVY(a aVar, Picasso picasso, int i, String str) {
        this.f$0 = aVar;
        this.f$1 = picasso;
        this.f$2 = i;
        this.f$3 = str;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        ubh.a(this.f$0, this.f$1, this.f$2, this.f$3, singleEmitter);
    }
}
