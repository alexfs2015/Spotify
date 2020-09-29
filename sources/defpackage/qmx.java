package defpackage;

import com.comscore.util.crashreport.CrashReportManager;

/* renamed from: qmx reason: default package */
public final class qmx implements vua<Integer> {
    private static final qmx a = new qmx();

    public static qmx a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(CrashReportManager.TIME_WINDOW);
    }
}
