package defpackage;

import android.graphics.Bitmap;

/* renamed from: vrs reason: default package */
public interface vrs {
    int a();

    Bitmap a(String str);

    void a(String str, Bitmap bitmap);

    int b();

    static {
        new vrs() {
            public final int a() {
                return 0;
            }

            public final Bitmap a(String str) {
                return null;
            }

            public final void a(String str, Bitmap bitmap) {
            }

            public final int b() {
                return 0;
            }
        };
    }
}
