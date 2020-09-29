package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: sb reason: default package */
public class sb {
    private sb() {
    }

    public static <T extends se> T a(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(sb.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void a(Bundle bundle, String str, se seVar) {
        if (seVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", new ParcelImpl(seVar));
            bundle.putParcelable(str, bundle2);
        }
    }
}
