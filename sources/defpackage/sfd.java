package defpackage;

import java.util.List;

/* renamed from: sfd reason: default package */
public final class sfd {
    private final jlr a;

    public sfd(jlr jlr) {
        this.a = jlr;
    }

    public final void a(String str, String str2, long j, String str3, List<String> list, String str4) {
        String str5 = str4;
        ao aoVar = new ao(str, "end", str2, j, str3, list.isEmpty() ? null : list, "no_app_connected".equals(str5) ? null : str5);
        this.a.a(aoVar);
    }

    public final void a(String str, String str2, String str3, List<String> list, String str4) {
        ao aoVar = new ao(str, "start", str2, 0, str3, list.isEmpty() ? null : list, "no_app_connected".equals(str4) ? null : str4);
        this.a.a(aoVar);
    }
}
