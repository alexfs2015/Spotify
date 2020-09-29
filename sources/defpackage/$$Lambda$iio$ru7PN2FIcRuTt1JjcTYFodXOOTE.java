package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$iio$ru7PN2FIcRuTt1JjcTYFodXOOTE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iio$ru7PN2FIcRuTt1JjcTYFodXOOTE implements CompletableOnSubscribe {
    private final /* synthetic */ iio f$0;
    private final /* synthetic */ kue f$1;

    public /* synthetic */ $$Lambda$iio$ru7PN2FIcRuTt1JjcTYFodXOOTE(iio iio, kue kue) {
        this.f$0 = iio;
        this.f$1 = kue;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, completableEmitter);
    }
}
