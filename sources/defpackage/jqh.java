package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: jqh reason: default package */
public final class jqh {
    private final Context a;
    private final fss b;

    /* renamed from: jqh$a */
    public interface a {
        void onCancelDialog();
    }

    /* renamed from: jqh$b */
    public interface b {
        void onRemoveDownload();
    }

    public jqh(Context context) {
        this(context, new fss(context));
    }

    private jqh(Context context, fss fss) {
        this.a = context;
        this.b = fss;
    }

    public final void a(a aVar, b bVar) {
        fsr a2 = this.b.a(this.a.getString(R.string.remove_download_dialog_title), this.a.getString(R.string.remove_download_dialog_description)).b(this.a.getString(R.string.remove_download_dialog_negative_button), new $$Lambda$jqh$sfsdWYsr7CcGOJERCMgKyoNY5eg(aVar)).a(this.a.getString(R.string.remove_download_dialog_positive_button), new $$Lambda$jqh$7fq0nbYZLg0nGeCumliDRNKkPw(bVar));
        a2.f = new $$Lambda$jqh$RxxyhvMhEt5Lu1PlpdxD2FVcPsQ(aVar);
        a2.a().a();
    }
}
