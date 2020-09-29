package defpackage;

import java.util.List;

/* renamed from: st reason: default package */
public abstract class st {
    private static final String a = su.a("InputMerger");

    public static st a(String str) {
        try {
            return (st) Class.forName(str).newInstance();
        } catch (Exception e) {
            su a2 = su.a();
            String str2 = a;
            StringBuilder sb = new StringBuilder("Trouble instantiating + ");
            sb.append(str);
            a2.a(str2, sb.toString(), e);
            return null;
        }
    }

    public abstract ss a(List<ss> list);
}
