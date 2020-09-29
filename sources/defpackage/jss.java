package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: jss reason: default package */
public final class jss {
    private final Context a;
    private final ftm b;

    /* renamed from: jss$a */
    public interface a {
        void onCancelDialog();
    }

    /* renamed from: jss$b */
    public interface b {
        void onRemoveDownload();
    }

    public jss(Context context) {
        this(context, new ftm(context));
    }

    private jss(Context context, ftm ftm) {
        this.a = context;
        this.b = ftm;
    }

    public final void a(a aVar, b bVar) {
        ftl a2 = this.b.a(this.a.getString(R.string.remove_download_dialog_title), this.a.getString(R.string.remove_download_dialog_description)).b(this.a.getString(R.string.remove_download_dialog_negative_button), new $$Lambda$jss$KvTfybYipK7BBexOLmcGIHo3c0(aVar)).a(this.a.getString(R.string.remove_download_dialog_positive_button), new $$Lambda$jss$gLshIA3e5OBAm5zcefXNk1ErGaU(bVar));
        a2.f = new $$Lambda$jss$dQvijSziXyLAwFcu8YwakPJTU2I(aVar);
        a2.a().a();
    }
}
