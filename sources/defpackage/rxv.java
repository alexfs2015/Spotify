package defpackage;

import java.util.Calendar;

/* renamed from: rxv reason: default package */
public final class rxv implements vua<Calendar> {
    private static final rxv a = new rxv();

    public static rxv a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Calendar) vuf.a(jrf.a.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
