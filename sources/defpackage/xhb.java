package defpackage;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.Reader;

/* renamed from: xhb reason: default package */
final class xhb<T> implements xgd<xam, T> {
    private final ObjectReader a;

    xhb(ObjectReader objectReader) {
        this.a = objectReader;
    }

    /* access modifiers changed from: private */
    public T a(xam xam) {
        try {
            ObjectReader objectReader = this.a;
            Reader reader = xam.b;
            if (reader == null) {
                reader = new a(xam.c(), xam.g());
                xam.b = reader;
            }
            return objectReader.readValue(reader);
        } finally {
            xam.close();
        }
    }
}
