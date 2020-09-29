package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbm reason: default package */
public final class bbm extends baa {
    private final bbl c = new bbl();
    private final bea d = new bea();
    private final a e = new a();
    private final bbg f = new bbg();
    private final List<bbj> g = new ArrayList();

    public bbm() {
        super("WebvttDecoder");
    }

    private static int a(bea bea) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = bea.b;
            String r = bea.r();
            i = r == null ? 0 : "STYLE".equals(r) ? 2 : "NOTE".startsWith(r) ? 1 : 3;
        }
        bea.c(i2);
        return i;
    }

    private bbo a(byte[] bArr, int i) {
        this.d.a(bArr, i);
        this.e.a();
        this.g.clear();
        try {
            bbn.a(this.d);
            do {
            } while (!TextUtils.isEmpty(this.d.r()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int a = a(this.d);
                if (a == 0) {
                    return new bbo(arrayList);
                }
                if (a == 1) {
                    b(this.d);
                } else if (a == 2) {
                    if (arrayList.isEmpty()) {
                        this.d.r();
                        bbj a2 = this.f.a(this.d);
                        if (a2 != null) {
                            this.g.add(a2);
                        }
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (a == 3 && this.c.a(this.d, this.e, this.g)) {
                    arrayList.add(this.e.b());
                    this.e.a();
                }
            }
        } catch (ParserException e2) {
            throw new SubtitleDecoderException((Exception) e2);
        }
    }

    private static void b(bea bea) {
        do {
        } while (!TextUtils.isEmpty(bea.r()));
    }

    public final /* bridge */ /* synthetic */ bac a(byte[] bArr, int i, boolean z) {
        return a(bArr, i);
    }
}
