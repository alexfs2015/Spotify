package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Sets;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import java.util.Set;

/* renamed from: jxx reason: default package */
public final class jxx implements jxz {
    private static Intent a(Context context, Set<String> set) {
        return PermissionsRequestActivity.a(context, (String[]) set.toArray(new String[0]));
    }

    public final a a(Intent intent) {
        return PermissionsRequestActivity.a(intent);
    }

    public final void a(int i, Fragment fragment, Set<String> set) {
        fragment.startActivityForResult(a((Context) fbp.a(fragment.p()), set), 1);
    }

    public final void a(Activity activity, String... strArr) {
        activity.startActivityForResult(a((Context) activity, (Set<String>) Sets.a((E[]) strArr)), 4660);
    }

    public final boolean a(Context context, String str) {
        return fr.b(context, str) == 0;
    }
}
