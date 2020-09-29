package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistory;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import io.reactivex.Flowable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: rzg reason: default package */
public final class rzg implements rzf {
    final ObjectMapper a;
    final rze<SearchHistoryItem> b = new ryx(10);
    private final File c;
    private final String d;
    private ExecutorService e = Executors.newSingleThreadExecutor();
    private boolean f;

    public rzg(Context context, String str, String str2, rnf rnf) {
        this.d = (String) fay.a(str);
        this.a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.c = new File(((Context) fay.a(context)).getFilesDir(), String.format(Locale.US, "%s/history-%d-%s", new Object[]{"search", Integer.valueOf(this.d.hashCode()), fay.a(str2)}));
    }

    public final rze<SearchHistoryItem> d() {
        return this.b;
    }

    public final void b() {
        this.e.execute(new Runnable() {
            public final void run() {
                rzg rzg = rzg.this;
                jrh.a("Called on main looper");
                try {
                    rzg.a.writeValue(rzg.g(), (Object) SearchHistory.create(rzg.b.a()));
                } catch (IOException e) {
                    Logger.e(e, "Failed saving search history file.", new Object[0]);
                }
            }
        });
    }

    public final synchronized void a() {
        if (!this.f) {
            this.e.execute(new Runnable() {
                public final void run() {
                    rzg.this.f();
                }
            });
        }
    }

    public final Flowable<List<SearchHistoryItem>> e() {
        a();
        return this.b.c();
    }

    public final boolean c() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public File g() {
        h();
        return new File(this.c, "new-history");
    }

    private void h() {
        if (this.c.exists()) {
            if (!this.c.isDirectory() && !new File(this.c.getCanonicalPath()).isDirectory()) {
                Assertion.a("history storage is not a directory!");
            }
        } else if (!this.c.mkdirs()) {
            Assertion.a("could not create history storage folder");
        }
        if (!this.c.isDirectory()) {
            throw new IOException("Features storage is not a directory!");
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void f() {
        jrh.a("Called on main looper");
        if (!this.f) {
            try {
                this.b.b();
                File g = g();
                if (g.exists()) {
                    SearchHistory searchHistory = (SearchHistory) this.a.readValue(g, SearchHistory.class);
                    if (searchHistory != null) {
                        this.b.a(searchHistory.getItems());
                    }
                }
                this.f = true;
            } catch (IOException e2) {
                Logger.e(e2, "Failed saving search history file.", new Object[0]);
            }
        }
    }
}
