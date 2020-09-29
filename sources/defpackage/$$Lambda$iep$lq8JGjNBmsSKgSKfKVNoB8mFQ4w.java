package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w implements Consumer {
    public static final /* synthetic */ $$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w INSTANCE = new $$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w();

    private /* synthetic */ $$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w() {
    }

    public final void accept(Object obj) {
        Logger.b("Failed to start fetch: %s", ((Throwable) obj).getMessage());
    }
}
