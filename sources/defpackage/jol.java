package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: jol reason: default package */
public interface jol extends b, defpackage.udr.a {
    @Deprecated
    public static final jol c = new a();
    @Deprecated
    public static final jol d = new a();

    /* renamed from: jol$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Fragment $default$ae(jol _this) {
            if (_this instanceof Fragment) {
                return (Fragment) _this;
            }
            throw new AssertionError("FragmentIdentifier is not implemented by a Fragment.");
        }
    }

    /* renamed from: jol$a */
    public static class a implements jol {
        public final String b(Context context) {
            throw new UnsupportedOperationException();
        }

        public final String e() {
            throw new UnsupportedOperationException();
        }

        public final Fragment ae() {
            throw new UnsupportedOperationException();
        }

        public final udr ag() {
            throw new UnsupportedOperationException();
        }

        public final rdh af() {
            throw new UnsupportedOperationException();
        }
    }

    Fragment ae();

    String b(Context context);

    String e();
}
