package defpackage;

import android.graphics.Color;
import com.spotify.music.R;

/* renamed from: ubt reason: default package */
public final class ubt {
    private static final int[] a = {R.color.face_background_salmon, R.color.face_background_electric_seafoam, R.color.face_background_azure, R.color.face_background_lavenader, R.color.face_background_orange, R.color.face_background_brown};
    private static final int b = R.color.face_background_gray_20;

    public static int a() {
        return b;
    }

    public static int a(String str) {
        return a[str.length() % 6];
    }

    public static boolean a(int i) {
        return (((Color.red(i) * 299) + (Color.green(i) * 587)) + (Color.blue(i) * a.aB)) / 1000 >= 128;
    }
}
