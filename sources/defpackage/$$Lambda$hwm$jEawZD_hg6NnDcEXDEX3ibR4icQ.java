package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ implements Consumer {
    public static final /* synthetic */ $$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ INSTANCE = new $$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ();

    private /* synthetic */ $$Lambda$hwm$jEawZD_hg6NnDcEXDEX3ibR4icQ() {
    }

    public final void accept(Object obj) {
        Assertion.a("Inconsistent ConnectManager state", (String) obj);
    }
}
