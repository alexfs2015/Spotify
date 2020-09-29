package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;

/* renamed from: vpw reason: default package */
final class vpw extends wcw {
    private final ObjectMapper e;

    vpw(ObjectMapper objectMapper) {
        this.e = objectMapper;
    }

    public final void a(wav wav, vyv vyv, List<Object> list) {
        if (vyv.f()) {
            vyy vyy = new vyy(vyv);
            try {
                list.add(this.e.readTree((InputStream) vyy));
            } finally {
                vyy.close();
            }
        }
    }
}
