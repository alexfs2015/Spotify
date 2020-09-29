package defpackage;

import java.util.List;

/* renamed from: rvt reason: default package */
public final class rvt {
    private final jjf a;

    public rvt(jjf jjf) {
        this.a = jjf;
    }

    public final void a(String str, String str2, String str3, List<String> list, String str4) {
        ap apVar = new ap(str, "start", str2, 0, str3, list.isEmpty() ? null : list, "no_app_connected".equals(str4) ? null : str4);
        this.a.a(apVar);
    }

    public final void a(String str, String str2, long j, String str3, List<String> list, String str4) {
        String str5 = str4;
        ap apVar = new ap(str, "end", str2, j, str3, list.isEmpty() ? null : list, "no_app_connected".equals(str5) ? null : str5);
        this.a.a(apVar);
    }
}
