package defpackage;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.Reader;

/* renamed from: wsw reason: default package */
final class wsw<T> implements wry<wmg, T> {
    private final ObjectReader a;

    wsw(ObjectReader objectReader) {
        this.a = objectReader;
    }

    /* access modifiers changed from: private */
    public T a(wmg wmg) {
        try {
            ObjectReader objectReader = this.a;
            Reader reader = wmg.b;
            if (reader == null) {
                reader = new a(wmg.c(), wmg.g());
                wmg.b = reader;
            }
            return objectReader.readValue(reader);
        } finally {
            wmg.close();
        }
    }
}
