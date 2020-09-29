package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: lnd reason: default package */
public final class lnd implements wig<EnumSet<LogLevel>> {
    private static final lnd a = new lnd();

    public static lnd a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (EnumSet) wil.a(EnumSet.of(LogLevel.INFO, LogLevel.WARNING, LogLevel.ERROR), "Cannot return null from a non-@Nullable @Provides method");
    }
}
