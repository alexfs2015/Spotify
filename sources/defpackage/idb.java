package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: idb reason: default package */
public final class idb implements icz {
    public Random a;
    private final icd b;
    private final ica c;

    public idb(icd icd, ica ica) {
        this.b = icd;
        this.c = ica;
    }

    private ida a(String str, int i) {
        return ida.a(str, this.b.a(i));
    }

    public final List<ida> a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(a("not_interested_releases", R.string.marquee_feedback_menu_option_new_releases));
        arrayList.add(a("not_interested_artist", R.string.marquee_feedback_menu_option_artist));
        arrayList.add(a("notifications", R.string.marquee_feedback_menu_option_notifications));
        arrayList.add(a("not_intersted_sponsored_content", R.string.marquee_feedback_menu_option_sponsored_content));
        if (!this.c.k().isEmpty()) {
            return this.c.k();
        }
        Collections.shuffle(arrayList, this.a);
        arrayList.add(a(IdHelperAndroid.NO_ID_AVAILABLE, R.string.marquee_feedback_menu_option_none_of_above));
        arrayList.add(a("opt_out_confirm", R.string.marquee_feedback_menu_option_opt_out));
        this.c.a(arrayList);
        return arrayList;
    }
}
