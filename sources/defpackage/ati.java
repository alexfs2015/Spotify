package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: ati reason: default package */
public final class ati implements atn {
    private static final Constructor<? extends atk> a;
    private int b = 1;

    static {
        Constructor<? extends atk> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(atk.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        a = constructor;
    }

    public final synchronized atk[] createExtractors() {
        atk[] atkArr;
        atkArr = new atk[(a == null ? 12 : 13)];
        atkArr[0] = new aud(0);
        atkArr[1] = new auo(0);
        atkArr[2] = new auq(0);
        atkArr[3] = new auh(0);
        atkArr[4] = new avk(0, 0);
        atkArr[5] = new avi();
        atkArr[6] = new awh(this.b, 0);
        atkArr[7] = new atx();
        atkArr[8] = new auz();
        atkArr[9] = new awa();
        atkArr[10] = new awl();
        atkArr[11] = new atv(0);
        if (a != null) {
            try {
                atkArr[12] = (atk) a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return atkArr;
    }
}
