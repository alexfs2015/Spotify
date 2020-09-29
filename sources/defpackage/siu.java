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

/* renamed from: siu reason: default package */
public final class siu implements sit {
    final ObjectMapper a;
    final sis<SearchHistoryItem> b = new sil(10);
    private final File c;
    private final String d;
    private ExecutorService e = Executors.newSingleThreadExecutor();
    private boolean f;

    public siu(Context context, String str, String str2, rwl rwl) {
        this.d = (String) fbp.a(str);
        this.a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.c = new File(((Context) fbp.a(context)).getFilesDir(), String.format(Locale.US, "%s/history-%d-%s", new Object[]{"search", Integer.valueOf(this.d.hashCode()), fbp.a(str2)}));
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

    public final synchronized void a() {
        if (!this.f) {
            this.e.execute(new Runnable() {
                public final void run() {
                    siu.this.f();
                }
            });
        }
    }

    public final void b() {
        this.e.execute(new Runnable() {
            public final void run() {
                siu siu = siu.this;
                jtr.a("Called on main looper");
                try {
                    siu.a.writeValue(siu.g(), (Object) SearchHistory.create(siu.b.a()));
                } catch (IOException e) {
                    Logger.e(e, "Failed saving search history file.", new Object[0]);
                }
            }
        });
    }

    public final boolean c() {
        return this.f;
    }

    public final sis<SearchHistoryItem> d() {
        return this.b;
    }

    public final Flowable<List<SearchHistoryItem>> e() {
        a();
        return this.b.c();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void f() {
        jtr.a("Called on main looper");
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

    /* access modifiers changed from: 0000 */
    public File g() {
        h();
        return new File(this.c, "new-history");
    }
}
