package defpackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: nnd reason: default package */
public abstract class nnd {

    /* renamed from: nnd$a */
    public interface a {
        a a(List<nnc> list);

        a a(uzb uzb);

        nnd a();
    }

    public abstract uzb a();

    public abstract List<nnc> b();

    public static nnd a(uzb uzb, List<nnc> list) {
        return new a().a(uzb).a(list).a();
    }
}
