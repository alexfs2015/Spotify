package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.util.List;

/* renamed from: wcx reason: default package */
final class wcx extends wrc {
    private final ObjectMapper e;

    wcx(ObjectMapper objectMapper) {
        this.e = objectMapper;
    }

    public final void a(wpb wpb, wnb wnb, List<Object> list) {
        if (wnb.f()) {
            wne wne = new wne(wnb);
            try {
                list.add(this.e.readTree((InputStream) wne));
            } finally {
                wne.close();
            }
        }
    }
}
