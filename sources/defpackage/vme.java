package defpackage;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vme reason: default package */
public final class vme {
    public final List<String> a = new ArrayList();

    public static <T> void a(String str, List<String> list, String str2, Optional<T> optional) {
        if (optional.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(' ');
            sb.append(str);
            sb.append(' ');
            sb.append(optional.c());
            list.add(sb.toString());
        }
    }

    public final <T> vme a(String str, Optional<T> optional) {
        a("eq", this.a, str, optional);
        return this;
    }
}
