package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qeg reason: default package */
public final class qeg {
    private final Context a;
    private fsp b;

    /* renamed from: qeg$a */
    public interface a {
        void a();

        void b();
    }

    public qeg(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        Context context = this.a;
        fsr b2 = fsy.a(context, context.getString(R.string.settings_storage_dialog_delete_cache_title), this.a.getString(R.string.settings_storage_dialog_delete_cache_text)).a(this.a.getString(R.string.two_button_dialog_button_delete_cache), new $$Lambda$qeg$zAEc28j5YW7MVo3OgbvrHYKL1wg(aVar)).b(this.a.getString(R.string.two_button_dialog_button_cancel), new $$Lambda$qeg$5oIfqeKOTiA8zz2PeRrhaiEXvw(aVar));
        b2.e = true;
        b2.f = new $$Lambda$qeg$4vJrTxPX2gD53ymq4UkFIbZcvaQ(aVar);
        this.b = b2.a();
        this.b.a();
    }
}
