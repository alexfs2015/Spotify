package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uah reason: default package */
public final class uah implements sgr {
    private final sgp a;

    public uah(sgp sgp, boolean z) {
        this.a = sgp;
        this.a.c("timeLeft gt 0");
        this.a.c("isPlayed ne true");
        if (z) {
            this.a.d("syncProgress");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(vlb vlb) {
        vkv[] vkvArr;
        ArrayList arrayList = new ArrayList(vlb.getUnfilteredLength());
        for (vkv vkv : (vkv[]) vlb.getItems()) {
            boolean z = true;
            if (!vkv.isHeader()) {
                if (!(vkv.n() == null || vkv.m() - ((Integer) fbp.a(vkv.n())).intValue() < 30)) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(vkv);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlb a(List list) {
        final vkv[] vkvArr = (vkv[]) list.toArray(new vkv[0]);
        return new vlb<vkv>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return vkvArr.length;
            }

            public final int getUnrangedLength() {
                return vkvArr.length;
            }

            public final boolean isLoading() {
                return false;
            }
        };
    }

    public final xii<vlb<vkv>> a(int i, int i2) {
        this.a.a(Integer.valueOf(i), Integer.valueOf(i2));
        return e();
    }

    public final xii<vlb<vkv>> e() {
        return wit.a((ObservableSource<T>) this.a.b(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$uah$XohTDugYhRQJFA8YdmOug3o4dTU.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$uah$R4SOG_flvDOtEoErh8xCxea9xp4.INSTANCE);
    }
}
