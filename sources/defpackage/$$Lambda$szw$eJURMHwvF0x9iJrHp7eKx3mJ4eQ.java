package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$szw$eJURMHwvF0x9iJrHp7eKx3mJ4eQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$szw$eJURMHwvF0x9iJrHp7eKx3mJ4eQ implements Action {
    private final /* synthetic */ Object f$0;

    public /* synthetic */ $$Lambda$szw$eJURMHwvF0x9iJrHp7eKx3mJ4eQ(Object obj) {
        this.f$0 = obj;
    }

    public final void run() {
        Logger.b("AppReadyCommand(%x): backstack ready.", Integer.valueOf(this.f$0.hashCode()));
    }
}
