package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;

/* renamed from: hze reason: default package */
public final class hze implements lbq {
    private String a = "";
    private final AdRules b;
    private final SlotApi c;
    private final Observable<Boolean> d;
    private Disposable e;
    private boolean f;

    public hze(SlotApi slotApi, AdRules adRules, Observable<Boolean> observable) {
        this.c = slotApi;
        this.b = adRules;
        this.d = observable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(String str, Boolean bool) {
        boolean z = this.f != bool.booleanValue();
        this.f = bool.booleanValue();
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_context_resume", String.valueOf(z));
        hashMap.put("context", jva.a(str).q());
        return this.c.a(AdSlot.PREROLL.getSlotId(), Intent.NEXT_CONTEXT, hashMap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.e = this.d.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$hze$1wQB9nwu4hPtngTa5Wt0RVtSH3M<Object,Object>(this, str), false).a((Action) new $$Lambda$hze$bC1_hxpiPEUHpfsYGPeID1TH44s(str), (Consumer<? super Throwable>) new $$Lambda$hze$tcBYLt82RLnzqvKg_zXwObmDW4<Object>(str));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Disposable disposable = this.e;
        if (disposable != null && !disposable.b()) {
            this.e.bd_();
        }
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!str.equals(this.a)) {
            this.a = str;
            if (fragment instanceof jqx) {
                uqm ag = ((jqx) fragment).ag();
                AdRules adRules = this.b;
                if (ag != null) {
                    if (adRules.a.contains(ag)) {
                        adRules.a(new ifo(StateType.DISABLED_NAVIGATION_ITEM, true));
                    } else {
                        adRules.a(new ifo(StateType.DISABLED_NAVIGATION_ITEM, false));
                    }
                }
            }
            if (((ift) this.b.b.get(ifr.class)).c()) {
                jva a2 = jva.a(str);
                if (a2.c() != null) {
                    String[] strArr = new String[(a2.a() + 1)];
                    strArr[0] = "spotify";
                    for (int i = 1; i <= a2.a(); i++) {
                        String str2 = (String) fbp.a(a2.a(i - 1));
                        if (str2.equals(a2.c())) {
                            str2 = "aduser";
                        }
                        strArr[i] = str2;
                    }
                    str = TextUtils.join(":", strArr);
                }
                AdSlot.PREROLL.registerAdRequest(new $$Lambda$hze$nH8HxXXvpkiKrvlAKm9u6BpfUmE(this, str));
            }
        }
    }
}
