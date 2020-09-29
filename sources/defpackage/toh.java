package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: toh reason: default package */
public final class toh implements rxh {
    private final rxf a;

    public toh(rxf rxf, boolean z) {
        this.a = rxf;
        this.a.c("timeLeft gt 0");
        this.a.c("isPlayed ne true");
        if (z) {
            this.a.d("syncProgress");
        }
    }

    public final wud<uyy<uys>> e() {
        return vun.a((ObservableSource<T>) this.a.b(), BackpressureStrategy.BUFFER).f($$Lambda$toh$yV4NzjiG5VHwey16iqewiT1jHmc.INSTANCE).f($$Lambda$toh$ry7TmkhJlR2G34P90lk4tnFiA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(uyy uyy) {
        uys[] uysArr;
        ArrayList arrayList = new ArrayList(uyy.getUnfilteredLength());
        for (uys uys : (uys[]) uyy.getItems()) {
            boolean z = true;
            if (!uys.isHeader()) {
                if (!(uys.n() == null || uys.m() - ((Integer) fay.a(uys.n())).intValue() < 30)) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(uys);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ uyy a(List list) {
        final uys[] uysArr = (uys[]) list.toArray(new uys[0]);
        return new uyy<uys>() {
            public final boolean isLoading() {
                return false;
            }

            public final int getUnfilteredLength() {
                return uysArr.length;
            }

            public final int getUnrangedLength() {
                return uysArr.length;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uysArr;
            }
        };
    }
}
