package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.State;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: ifx reason: default package */
public class ifx extends ift {
    private final Map<StateType, Boolean> a = new EnumMap(StateType.class);
    private final hzv b;
    private final hzu c;
    private final CompositeDisposable d = new CompositeDisposable();

    public ifx(hzv hzv, hzu hzu) {
        this.b = hzv;
        this.c = hzu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(State state) {
        if (state.isAdsEnabled()) {
            a(Boolean.TRUE);
        }
    }

    private void a(Boolean bool) {
        this.d.a(this.c.a(AdSlot.MIDROLL_WATCHNOW.getSlotId(), "slot_enabled", bool.toString()).a((Consumer<? super T>) new $$Lambda$ifx$2qpu68dK0kyzdhQyj3wXFgto1M<Object>(bool), (Consumer<? super Throwable>) new $$Lambda$ifx$8m_BoQn2k4j8tFqkZzx3IcrkbI0<Object>(bool)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool, Response response) {
        String str = "enabled";
        String str2 = "disabled";
        if (response.getStatus() == 202) {
            Object[] objArr = new Object[2];
            objArr[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
            if (!bool.booleanValue()) {
                str = str2;
            }
            objArr[1] = str;
            Logger.b("%s ad slot state updated %s", objArr);
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
        if (!bool.booleanValue()) {
            str = str2;
        }
        objArr2[1] = str;
        Logger.b("Failed to update ad slot state: %s to %s", objArr2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool, Throwable th) {
        Object[] objArr = new Object[2];
        objArr[0] = AdSlot.MIDROLL_WATCHNOW.getSlotId();
        objArr[1] = bool.booleanValue() ? "enabled" : "disabled";
        Logger.b("Request to update %s ad slot to %s failed", objArr);
    }

    private boolean i() {
        return this.a.containsKey(StateType.PLAYING_FROM_SPONSORED_CONTEXT) && ((Boolean) this.a.get(StateType.PLAYING_FROM_SPONSORED_CONTEXT)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d.a(this.b.a().a((Consumer<? super T>) new $$Lambda$ifx$cIU3YuYcY2CrzkHAwbxreVGAwZg<Object>(this), (Consumer<? super Throwable>) $$Lambda$ifx$ADb2ZR9apRLITCNd39VGB4TPj3E.INSTANCE));
    }

    public final void a(ifo ifo) {
        if (ifo.a == StateType.PLAYING_FROM_SPONSORED_CONTEXT) {
            boolean c2 = c();
            this.a.put(ifo.a, Boolean.valueOf(ifo.b));
            boolean c3 = c();
            if (c2 != c3) {
                if (c3) {
                    a();
                    return;
                }
                b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(Boolean.FALSE);
    }

    public final boolean c() {
        return !i();
    }

    public final boolean d() {
        return i();
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.d.c();
    }
}
