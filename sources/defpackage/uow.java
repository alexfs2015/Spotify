package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: uow reason: default package */
public final class uow extends jon implements jol {
    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "Top Track By Country";
    }

    public final String e() {
        return "golden-path-toptracks";
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DEBUG, null);
    }

    public final udr ag() {
        return udt.ag;
    }

    public static uow c() {
        return new uow();
    }
}
