package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: jqx reason: default package */
public interface jqx extends b, defpackage.uqm.a {
    @Deprecated
    public static final jqx c = new a();
    @Deprecated
    public static final jqx d = new a();

    /* renamed from: jqx$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Fragment $default$ae(jqx jqx) {
            if (jqx instanceof Fragment) {
                return (Fragment) jqx;
            }
            throw new AssertionError("FragmentIdentifier is not implemented by a Fragment.");
        }
    }

    /* renamed from: jqx$a */
    public static class a implements jqx {
        public final Fragment ae() {
            throw new UnsupportedOperationException();
        }

        public final rmf af() {
            throw new UnsupportedOperationException();
        }

        public final uqm ag() {
            throw new UnsupportedOperationException();
        }

        public final String b(Context context) {
            throw new UnsupportedOperationException();
        }

        public final String e() {
            throw new UnsupportedOperationException();
        }
    }

    Fragment ae();

    String b(Context context);

    String e();
}
