package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.EnumSet;

/* renamed from: ifr reason: default package */
public class ifr extends ift {
    private static String a = ifr.class.getSimpleName();
    private final EnumSet<StateType> b = EnumSet.of(StateType.CAR_CONNECTED, StateType.DISABLED_NAVIGATION_ITEM, StateType.WIFI_DISCONNECTED, StateType.ON_SPONSORED_PAGE);
    private final EnumSet<StateType> c = EnumSet.of(StateType.DISABLED_NAVIGATION_ITEM, StateType.CAR_CONNECTED, StateType.WIFI_DISCONNECTED);
    private final EnumSet<StateType> d;
    private final SlotApi e;
    private Disposable f;

    public ifr(SlotApi slotApi) {
        this.e = slotApi;
        this.d = EnumSet.noneOf(StateType.class);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final void a(ifo ifo) {
        if (this.b.contains(ifo.a)) {
            if (ifo.b) {
                StateType stateType = ifo.a;
                if (!this.c.contains(stateType) || !this.d.contains(stateType)) {
                    boolean isEmpty = this.d.isEmpty();
                    this.d.add(stateType);
                    if (isEmpty) {
                        h();
                    }
                }
                return;
            }
            StateType stateType2 = ifo.a;
            boolean d2 = d();
            this.d.remove(stateType2);
            if (d2) {
                g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Logger.b("%s clearing preroll", a);
        String slotId = AdSlot.PREROLL.getSlotId();
        this.f = this.e.a(slotId, Intent.CLEAR).a((Action) new $$Lambda$ifr$ZK9r6GfN9v24dSKO3MEfZln7JuI(slotId), (Consumer<? super Throwable>) new $$Lambda$ifr$6lq3TPsvhAuql4fZ939b6wM0mY<Object>(slotId));
        Logger.b("%s disabling preroll", a);
    }

    public final boolean c() {
        return this.d.isEmpty();
    }

    public final boolean d() {
        return !this.d.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        Disposable disposable = this.f;
        if (disposable != null && !disposable.b()) {
            this.f.bd_();
        }
    }
}
