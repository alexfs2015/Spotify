package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: nss reason: default package */
public abstract class nss {

    /* renamed from: nss$a */
    public interface a {
        a a(List<nsr> list);

        a a(vle vle);

        nss a();
    }

    public static nss a(vle vle, List<nsr> list) {
        return new a().a(vle).a(list).a();
    }

    public abstract vle a();

    public abstract List<nsr> b();
}
