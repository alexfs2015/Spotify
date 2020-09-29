package defpackage;

import com.comscore.util.crashreport.CrashReportManager;

/* renamed from: qvf reason: default package */
public final class qvf implements wig<Integer> {
    private static final qvf a = new qvf();

    public static qvf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(CrashReportManager.TIME_WINDOW);
    }
}
