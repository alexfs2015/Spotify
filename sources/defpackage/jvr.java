package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import java.util.Set;

/* renamed from: jvr reason: default package */
public interface jvr {
    a a(Intent intent);

    void a(int i, Fragment fragment, Set<String> set);

    void a(Activity activity, String... strArr);

    boolean a(Context context, String str);
}
