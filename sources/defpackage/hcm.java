package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: hcm reason: default package */
public interface hcm {

    /* renamed from: hcm$a */
    public static abstract class a {
        public abstract a a(hcj hcj);

        public abstract a a(hck hck);

        public final a a(defpackage.hcl.a aVar) {
            return a(aVar.a());
        }

        public abstract a a(hcl hcl);

        public final a a(defpackage.hco.a aVar) {
            return a(aVar.a());
        }

        public abstract a a(hco hco);

        @Deprecated
        public abstract a a(hcr hcr);

        public abstract a a(String str);

        public final a a(String str, defpackage.hci.a aVar) {
            return a(str, aVar.a());
        }

        public abstract a a(String str, hci hci);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(String str, String str2);

        public abstract a a(List<? extends hcm> list);

        public abstract a a(Map<String, ? extends hci> map);

        public abstract a a(hcm... hcmArr);

        public abstract hcm a();

        public abstract a b(hcj hcj);

        public abstract a b(String str);

        public abstract a b(String str, Serializable serializable);

        public abstract a b(List<? extends hcm> list);

        public abstract a b(Map<String, ? extends hci> map);

        public abstract a b(hcm... hcmArr);

        public abstract a c(hcj hcj);

        public abstract a c(String str, Serializable serializable);

        public abstract a d(hcj hcj);

        public abstract a e(hcj hcj);

        public abstract a f(hcj hcj);
    }

    List<? extends hcm> childGroup(String str);

    List<? extends hcm> children();

    hck componentId();

    hcj custom();

    Map<String, ? extends hci> events();

    String group();

    String id();

    hcl images();

    hcj logging();

    hcj metadata();

    @Deprecated
    hcr target();

    hco text();

    a toBuilder();
}
