package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bav reason: default package */
public final class bav extends azj {
    private final bau c = new bau();
    private final bdj d = new bdj();
    private final a e = new a();
    private final bap f = new bap();
    private final List<bas> g = new ArrayList();

    public final /* bridge */ /* synthetic */ azl a(byte[] bArr, int i, boolean z) {
        return a(bArr, i);
    }

    public bav() {
        super("WebvttDecoder");
    }

    private bax a(byte[] bArr, int i) {
        this.d.a(bArr, i);
        this.e.a();
        this.g.clear();
        try {
            baw.a(this.d);
            do {
            } while (!TextUtils.isEmpty(this.d.r()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int a = a(this.d);
                if (a == 0) {
                    return new bax(arrayList);
                }
                if (a == 1) {
                    b(this.d);
                } else if (a == 2) {
                    if (arrayList.isEmpty()) {
                        this.d.r();
                        bas a2 = this.f.a(this.d);
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

    private static void b(bdj bdj) {
        do {
        } while (!TextUtils.isEmpty(bdj.r()));
    }

    private static int a(bdj bdj) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = bdj.b;
            String r = bdj.r();
            i = r == null ? 0 : "STYLE".equals(r) ? 2 : "NOTE".startsWith(r) ? 1 : 3;
        }
        bdj.c(i2);
        return i;
    }
}
