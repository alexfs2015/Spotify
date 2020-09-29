package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import java.util.Comparator;

/* renamed from: nvr reason: default package */
public abstract class nvr implements Parcelable {
    public static final Comparator<nvr> e = new Comparator<nvr>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((nvr) obj).a().compareTo(((nvr) obj2).a());
        }
    };

    public static nvr a(AvailableLanguage availableLanguage, boolean z) {
        return new nvo(availableLanguage.name(), availableLanguage.imageUri(), availableLanguage.bcp47(), z);
    }

    public abstract String a();

    public final nvr a(boolean z) {
        return new nvo(a(), b(), c(), z);
    }

    public abstract String b();

    public abstract String c();

    public abstract boolean d();
}
