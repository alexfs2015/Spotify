package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

/* renamed from: ije reason: default package */
public final class ije implements iin {
    final ObjectMapper a;

    /* renamed from: ije$a */
    class a implements ijb {
        private final JsonNode a;

        public a(JsonNode jsonNode) {
            this.a = jsonNode;
        }

        public final int c() {
            return this.a.get(0).asInt();
        }

        public final String a(int i) {
            return this.a.get(i).asText();
        }

        public final int b(int i) {
            return this.a.get(i).asInt();
        }

        public final <T> T a(int i, Class<T> cls) {
            return ije.this.a.convertValue(this.a.get(i), cls);
        }

        public final boolean c(int i) {
            return i < this.a.size() && this.a.get(i).isObject() && this.a.get(i).size() > 0;
        }

        public final int d() {
            return this.a.size();
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public ije(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    public final byte[] a(List<Object> list) {
        return this.a.writeValueAsBytes(list);
    }

    public final ijb a(byte[] bArr) {
        return new a(this.a.readTree(bArr));
    }
}
