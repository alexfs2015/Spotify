package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$iBlraNS07O0t6dv-CiDvXFSqAkk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iBlraNS07O0t6dvCiDvXFSqAkk implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$iBlraNS07O0t6dvCiDvXFSqAkk(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((qun) obj);
    }
}
