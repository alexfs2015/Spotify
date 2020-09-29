package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: kyv reason: default package */
public final class kyv implements kyw {
    private final View a;
    private final Context b;

    public kyv(Context context, View view) {
        Assertion.a((Object) context, "Don't pass null context to constructor");
        Assertion.a((Object) view, "Don't pass null views to constructor");
        this.b = context;
        this.a = view;
    }

    public final void a() {
        this.a.setVisibility(0);
    }

    public final long b() {
        return (long) this.b.getResources().getInteger(R.integer.loading_view_delay_before_showing_throbber);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kyv) || ((kyv) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
