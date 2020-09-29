package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: rw reason: default package */
public class rw {
    private rw() {
    }

    public static void a(Bundle bundle, String str, rz rzVar) {
        if (rzVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", new ParcelImpl(rzVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    public static <T extends rz> T a(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(rw.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
