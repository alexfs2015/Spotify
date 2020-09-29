package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: lje reason: default package */
public final class lje implements vua<EnumSet<LogLevel>> {
    private static final lje a = new lje();

    public static lje a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (EnumSet) vuf.a(EnumSet.of(LogLevel.INFO, LogLevel.WARNING, LogLevel.ERROR), "Cannot return null from a non-@Nullable @Provides method");
    }
}
