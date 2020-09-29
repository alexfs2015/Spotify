package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.android.storage.MovingOrchestrator.State;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.storage.MoveCacheConfirmationActivity;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: uno reason: default package */
public class uno extends kr implements jol {
    public jsz T;
    public unt U;
    public gam V;
    /* access modifiers changed from: private */
    public String W;
    /* access modifiers changed from: private */
    public Optional<Long> X = Optional.e();
    /* access modifiers changed from: private */
    public final Executor Y = Executors.newSingleThreadExecutor();
    private final Handler Z = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public e aa;
    public MovingOrchestrator b;

    /* renamed from: uno$a */
    class a implements Runnable {
        private final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final void run() {
            try {
                gai gai = new gai();
                gai.a(this.a.a);
                this.a.d = Optional.b(Long.valueOf(gai.b()));
                this.a.e = Optional.b(Long.valueOf(gai.a()));
                uno.this.Z.post(new Runnable() {
                    public final void run() {
                        uno.this.aa.notifyDataSetChanged();
                    }
                });
            } catch (IOException unused) {
                Logger.e("Unable to calculate free space", new Object[0]);
            }
        }
    }

    /* renamed from: uno$b */
    class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(uno uno, byte b) {
            this();
        }

        public final void run() {
            int i = 0;
            while (!uno.this.X.b()) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                try {
                    uno.this.X = Optional.b(Long.valueOf(wpd.c(new File(uno.this.W))));
                } catch (IllegalArgumentException e) {
                    Logger.d("sizeOfDirectory failed with message %s", e.getMessage());
                }
                i = i2;
            }
            if (!uno.this.X.b()) {
                Assertion.b("Execution of sizeOfDirectory failed");
            }
            uno.this.Z.post(new Runnable() {
                public final void run() {
                    uno.this.aa.notifyDataSetChanged();
                }
            });
        }
    }

    /* renamed from: uno$c */
    class c implements Runnable {
        private final gam a;

        public c(gam gam) {
            this.a = gam;
        }

        public final void run() {
            Set<String> a2 = this.a.a("/proc/mounts");
            ArrayList arrayList = new ArrayList(a2.size());
            for (String dVar : a2) {
                d dVar2 = new d(dVar);
                uno.this.Y.execute(new a(dVar2));
                arrayList.add(dVar2);
            }
            uno.this.aa.a.clear();
            uno.this.aa.a.addAll(arrayList);
            uno.this.Z.post(new Runnable() {
                public final void run() {
                    uno.this.aa.notifyDataSetChanged();
                }
            });
        }
    }

    /* renamed from: uno$d */
    class d {
        final String a;
        final boolean b;
        final boolean c;
        Optional<Long> d = Optional.e();
        Optional<Long> e = Optional.e();

        protected d(String str) {
            this.a = str;
            this.b = uno.this.W.startsWith(str);
            this.c = str.startsWith("/storage/emulated/0");
        }

        public final boolean a() {
            return !this.b && !b() && uno.a(uno.this.X, this.d);
        }

        public final boolean b() {
            return uno.this.b.a() != State.IDLE;
        }
    }

    /* renamed from: uno$e */
    class e extends BaseAdapter {
        /* access modifiers changed from: private */
        public final List<d> a;

        public final long getItemId(int i) {
            return (long) i;
        }

        /* synthetic */ e(uno uno, byte b2) {
            this();
        }

        private e() {
            this.a = new ArrayList(4);
        }

        public final int getCount() {
            return this.a.size();
        }

        public final Object getItem(int i) {
            return this.a.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            fri fri = (fri) fqb.b(view, fri.class);
            if (fri == null) {
                fqb.b();
                fri = frq.b(uno.this.p(), viewGroup, false);
            }
            d dVar = (d) this.a.get(i);
            fri.getView().setTag(dVar);
            if (dVar.c) {
                str = uno.this.n().getString(R.string.cache_migration_fragment_device_storage);
            } else {
                str = uno.this.n().getString(R.string.cache_migration_fragment_sd_card);
            }
            fri.a(str);
            StringBuilder sb = new StringBuilder();
            if (!dVar.c) {
                sb.append(dVar.a);
                sb.append(10);
            }
            if (dVar.b && uno.this.X.b()) {
                sb.append(String.format(Locale.getDefault(), "%s: %s", new Object[]{uno.this.n().getString(R.string.cache_migration_fragment_currently_using), uno.a(uno.this, ((Long) uno.this.X.c()).longValue())}));
                sb.append(10);
            }
            if (!uno.this.X.b() || !dVar.e.b()) {
                sb.append(uno.this.n().getString(R.string.cache_migration_fragment_checking));
            } else {
                sb.append(String.format(Locale.getDefault(), "%s: %s %s: %s", new Object[]{uno.this.n().getString(R.string.cache_migration_fragment_available), uno.a(uno.this, ((Long) dVar.d.c()).longValue()), uno.this.n().getString(R.string.cache_migration_fragment_total), uno.a(uno.this, ((Long) dVar.e.c()).longValue())}));
            }
            fri.b(sb.toString());
            fri.d().setSingleLine(false);
            fri.d().setMaxLines(3);
            fri.getView().setEnabled(dVar.a());
            if (dVar.b) {
                fri.c().setImageDrawable(new SpotifyIconDrawable(uno.this.n(), SpotifyIcon.CHECK_32));
                fri.c().setScaleType(ScaleType.CENTER);
            }
            return fri.getView();
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "internal:preferences_cache_migration";
    }

    public static jol ah() {
        return new uno();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final String b(Context context) {
        return context.getString(R.string.cache_migration_title);
    }

    public final udr ag() {
        return udt.o;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS_STORAGE, null);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.W = this.U.b();
        this.aa = new e(this, 0);
        a(this.aa);
        this.b.a((com.spotify.android.storage.MovingOrchestrator.a) new com.spotify.android.storage.MovingOrchestrator.a() {
            public final void a() {
                uno.this.Z.post(new Runnable() {
                    public final void run() {
                        uno.this.aa.notifyDataSetChanged();
                    }
                });
            }

            public final void b() {
                uno.this.Z.post(new Runnable() {
                    public final void run() {
                        uno.this.aa.notifyDataSetChanged();
                    }
                });
            }
        });
        this.Y.execute(new c(this.V));
        this.Y.execute(new b(this, 0));
    }

    public final void a(ListView listView, View view, int i, long j) {
        Object itemAtPosition = listView.getItemAtPosition(i);
        if (itemAtPosition instanceof d) {
            d dVar = (d) itemAtPosition;
            if (dVar.b()) {
                this.T.a((int) R.string.cache_migration_notification_title, 0, new Object[0]);
                return;
            }
            if (dVar.a()) {
                uno.this.a(MoveCacheConfirmationActivity.a(uno.this.n(), dVar.a, ((Long) uno.this.X.a(Long.valueOf(0))).longValue()));
            }
        }
    }

    static boolean a(Optional<Long> optional, Optional<Long> optional2) {
        if (optional.b() && optional2.b()) {
            Long l = (Long) optional.c();
            Long l2 = (Long) optional2.c();
            if (l.longValue() > 0 && l2.longValue() > 0 && l.longValue() + 50000000 < l2.longValue()) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ String a(uno uno, long j) {
        String str = "%.1f %s";
        if (j > 1073741824) {
            Locale locale = Locale.getDefault();
            double d2 = (double) j;
            Double.isNaN(d2);
            return String.format(locale, str, new Object[]{Double.valueOf(((d2 / 1024.0d) / 1024.0d) / 1024.0d), uno.a((int) R.string.cache_migration_fragment_gigabytes)});
        } else if (j > 1048576) {
            Locale locale2 = Locale.getDefault();
            double d3 = (double) j;
            Double.isNaN(d3);
            return String.format(locale2, str, new Object[]{Double.valueOf((d3 / 1024.0d) / 1024.0d), uno.a((int) R.string.cache_migration_fragment_megabytes)});
        } else {
            Locale locale3 = Locale.getDefault();
            double d4 = (double) j;
            Double.isNaN(d4);
            return String.format(locale3, str, new Object[]{Double.valueOf(d4 / 1024.0d), uno.a((int) R.string.cache_migration_fragment_kilobytes)});
        }
    }
}
