package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qnj reason: default package */
public final class qnj {
    private final Context a;
    private ftj b;

    /* renamed from: qnj$a */
    public interface a {
        void a();

        void b();
    }

    public qnj(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        Context context = this.a;
        ftl b2 = fts.a(context, context.getString(R.string.settings_storage_dialog_delete_cache_title), this.a.getString(R.string.settings_storage_dialog_delete_cache_text)).a(this.a.getString(R.string.two_button_dialog_button_delete_cache), new $$Lambda$qnj$l4QBzpSLXrnx4MhifMHb9dituM(aVar)).b(this.a.getString(R.string.two_button_dialog_button_cancel), new $$Lambda$qnj$gpGAteDqhApMzOfv2oPV2LJ0mH4(aVar));
        b2.e = true;
        b2.f = new $$Lambda$qnj$3mDzKtyK6nFduuqifEnD1xZEiZs(aVar);
        this.b = b2.a();
        this.b.a();
    }
}
