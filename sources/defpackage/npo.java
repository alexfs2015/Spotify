package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import java.util.Comparator;

/* renamed from: npo reason: default package */
public abstract class npo implements Parcelable {
    public static final Comparator<npo> e = new Comparator<npo>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((npo) obj).a().compareTo(((npo) obj2).a());
        }
    };

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public static npo a(AvailableLanguage availableLanguage, boolean z) {
        return new npl(availableLanguage.name(), availableLanguage.imageUri(), availableLanguage.bcp47(), z);
    }

    public final npo a(boolean z) {
        return new npl(a(), b(), c(), z);
    }
}
