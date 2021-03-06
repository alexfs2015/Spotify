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

/* renamed from: hws reason: default package */
public final class hws implements kyh {
    private String a = "";
    private final AdRules b;
    private final SlotApi c;
    private final Observable<Boolean> d;
    private Disposable e;
    private boolean f;

    public hws(SlotApi slotApi, AdRules adRules, Observable<Boolean> observable) {
        this.c = slotApi;
        this.b = adRules;
        this.d = observable;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!str.equals(this.a)) {
            this.a = str;
            if (fragment instanceof jol) {
                udr ag = ((jol) fragment).ag();
                AdRules adRules = this.b;
                if (ag != null) {
                    if (adRules.a.contains(ag)) {
                        adRules.a(new idb(StateType.DISABLED_NAVIGATION_ITEM, true));
                    } else {
                        adRules.a(new idb(StateType.DISABLED_NAVIGATION_ITEM, false));
                    }
                }
            }
            if (((idg) this.b.b.get(ide.class)).c()) {
                jst a2 = jst.a(str);
                if (a2.c() != null) {
                    String[] strArr = new String[(a2.a() + 1)];
                    strArr[0] = "spotify";
                    for (int i = 1; i <= a2.a(); i++) {
                        String str2 = (String) fay.a(a2.a(i - 1));
                        if (str2.equals(a2.c())) {
                            str2 = "aduser";
                        }
                        strArr[i] = str2;
                    }
                    str = TextUtils.join(":", strArr);
                }
                AdSlot.PREROLL.registerAdRequest(new $$Lambda$hws$wJKcIH_Su3NbxltWhe5f9Z84_Ds(this, str));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Disposable disposable = this.e;
        if (disposable != null && !disposable.b()) {
            this.e.bf_();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(String str, Boolean bool) {
        boolean z = this.f != bool.booleanValue();
        this.f = bool.booleanValue();
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_context_resume", String.valueOf(z));
        hashMap.put("context", jst.a(str).q());
        return this.c.a(AdSlot.PREROLL.getSlotId(), Intent.NEXT_CONTEXT, hashMap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.e = this.d.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$hws$pFkZ6RmV2MPQyT8C1zCrylygCNg<Object,Object>(this, str), false).a((Action) new $$Lambda$hws$zaYRBPVmIkTRazfh7C2vLaISxvo(str), (Consumer<? super Throwable>) new $$Lambda$hws$XrDRCbWG1B47O0JCdvQZiN1JYEg<Object>(str));
    }
}
