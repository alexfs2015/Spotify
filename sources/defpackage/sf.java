package defpackage;

import java.util.List;

/* renamed from: sf reason: default package */
public abstract class sf {
    private static final String a = sg.a("InputMerger");

    public abstract se a(List<se> list);

    public static sf a(String str) {
        try {
            return (sf) Class.forName(str).newInstance();
        } catch (Exception e) {
            sg a2 = sg.a();
            String str2 = a;
            StringBuilder sb = new StringBuilder("Trouble instantiating + ");
            sb.append(str);
            a2.a(str2, sb.toString(), e);
            return null;
        }
    }
}
