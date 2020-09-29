package defpackage;

import io.reactivex.functions.Function;
import java.util.Locale;

/* renamed from: -$$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE implements Function {
    public static final /* synthetic */ $$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE INSTANCE = new $$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE();

    private /* synthetic */ $$Lambda$hwm$Hrs7qW4VcIS6g_PqhVhq3RMVvcE() {
    }

    public final Object apply(Object obj) {
        return String.format(Locale.getDefault(), "\"%s\"", new Object[]{((Throwable) obj).getMessage()});
    }
}
