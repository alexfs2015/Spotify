package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$khw$ZEbCfAsC4oReiFh9EmxLuQ8PBAU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$khw$ZEbCfAsC4oReiFh9EmxLuQ8PBAU implements SingleOnSubscribe {
    private final /* synthetic */ khw f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$khw$ZEbCfAsC4oReiFh9EmxLuQ8PBAU(khw khw, String str) {
        this.f$0 = khw;
        this.f$1 = str;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
