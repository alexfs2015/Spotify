package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;

/* renamed from: hxa reason: default package */
public final class hxa implements kyh {
    public boolean a;
    private final AdRules b;
    private final ife c;

    public hxa(AdRules adRules, ife ife) {
        this.b = adRules;
        this.c = ife;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (this.a) {
            boolean b2 = this.c.b(str);
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = b2 ? "is" : "is not";
            Logger.b("Context %s %s sponsored", objArr);
            this.b.a(StateType.PLAYING_FROM_SPONSORED_CONTEXT, b2);
        }
    }
}
