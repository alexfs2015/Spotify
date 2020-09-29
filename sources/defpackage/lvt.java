package defpackage;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: lvt reason: default package */
final class lvt implements lvy {
    private final Button a = a.b(this.b);
    private final Context b;

    public lvt(Context context, ViewGroup viewGroup) {
        this.b = (Context) fay.a(context);
        fzz.a();
        LayoutParams a2 = fzy.a(context, viewGroup);
        if (a2 != null) {
            this.a.setLayoutParams(a2);
        }
        int a3 = uts.a(48.0f, context.getResources());
        this.a.setPadding(a3, 0, a3, 0);
        this.a.setCompoundDrawablePadding(uts.a(8.0f, context.getResources()));
        this.a.setLayoutParams(new LayoutParams(-2, -2));
        this.a.setEllipsize(TruncateAt.END);
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        jqd.a(this.b, this.a, (SpotifyIconV2) null, str);
    }

    public final Button a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return this.a;
    }
}
