package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$szw$n4t22gbJnqSqZUdh2T4_fm_wQZQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$szw$n4t22gbJnqSqZUdh2T4_fm_wQZQ implements Consumer {
    private final /* synthetic */ Object f$0;

    public /* synthetic */ $$Lambda$szw$n4t22gbJnqSqZUdh2T4_fm_wQZQ(Object obj) {
        this.f$0 = obj;
    }

    public final void accept(Object obj) {
        Logger.b("AppReadyCommand(%x): flags ready.", Integer.valueOf(this.f$0.hashCode()));
    }
}
