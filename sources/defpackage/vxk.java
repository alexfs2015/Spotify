package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.signup.splitflow.SignupActivity;

/* renamed from: vxk reason: default package */
public final class vxk {
    public static vxi a(int i, int i2, Intent intent) {
        if (i == 45500) {
            if (i2 == -1) {
                return new b();
            }
            if (i2 == 0) {
                return new a();
            }
            if (i2 == 48000) {
                return vxi.a(intent.getStringExtra("email"));
            }
        }
        return new d();
    }

    public static void a(Fragment fragment) {
        fragment.startActivityForResult(new Intent(fragment.o(), SignupActivity.class), 45500);
    }
}
