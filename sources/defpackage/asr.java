package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: asr reason: default package */
public final class asr implements asw {
    private static final Constructor<? extends ast> a;
    private int b = 1;

    static {
        Constructor<? extends ast> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(ast.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        a = constructor;
    }

    public final synchronized ast[] createExtractors() {
        ast[] astArr;
        astArr = new ast[(a == null ? 12 : 13)];
        astArr[0] = new atm(0);
        astArr[1] = new atx(0);
        astArr[2] = new atz(0);
        astArr[3] = new atq(0);
        astArr[4] = new aut(0, 0);
        astArr[5] = new aur();
        astArr[6] = new avq(this.b, 0);
        astArr[7] = new atg();
        astArr[8] = new aui();
        astArr[9] = new avj();
        astArr[10] = new avu();
        astArr[11] = new ate(0);
        if (a != null) {
            try {
                astArr[12] = (ast) a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return astArr;
    }
}
