package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ifq$KW0DTpIbg5EFpYLkGr8yo5WXpJg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ifq$KW0DTpIbg5EFpYLkGr8yo5WXpJg implements Consumer {
    public static final /* synthetic */ $$Lambda$ifq$KW0DTpIbg5EFpYLkGr8yo5WXpJg INSTANCE = new $$Lambda$ifq$KW0DTpIbg5EFpYLkGr8yo5WXpJg();

    private /* synthetic */ $$Lambda$ifq$KW0DTpIbg5EFpYLkGr8yo5WXpJg() {
    }

    public final void accept(Object obj) {
        Logger.b("Ad Targeting - Error in making request to targeting endpoint: %s", ((Throwable) obj).getMessage());
    }
}
