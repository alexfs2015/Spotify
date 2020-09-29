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

/* renamed from: uys reason: default package */
public class uys extends kw implements jqx {
    public jvf T;
    public uyx U;
    public gbg V;
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

    /* renamed from: uys$a */
    class a implements Runnable {
        private final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final void run() {
            try {
                gbc gbc = new gbc();
                gbc.a(this.a.a);
                this.a.d = Optional.b(Long.valueOf(gbc.b()));
                this.a.e = Optional.b(Long.valueOf(gbc.a()));
                uys.this.Z.post(new Runnable() {
                    public final void run() {
                        uys.this.aa.notifyDataSetChanged();
                    }
                });
            } catch (IOException unused) {
                Logger.e("Unable to calculate free space", new Object[0]);
            }
        }
    }

    /* renamed from: uys$b */
    class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(uys uys, byte b) {
            this();
        }

        public final void run() {
            int i = 0;
            while (!uys.this.X.b()) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                try {
                    uys.this.X = Optional.b(Long.valueOf(xdj.c(new File(uys.this.W))));
                } catch (IllegalArgumentException e) {
                    Logger.d("sizeOfDirectory failed with message %s", e.getMessage());
                }
                i = i2;
            }
            if (!uys.this.X.b()) {
                Assertion.b("Execution of sizeOfDirectory failed");
            }
            uys.this.Z.post(new Runnable() {
                public final void run() {
                    uys.this.aa.notifyDataSetChanged();
                }
            });
        }
    }

    /* renamed from: uys$c */
    class c implements Runnable {
        private final gbg a;

        public c(gbg gbg) {
            this.a = gbg;
        }

        public final void run() {
            Set<String> a2 = this.a.a("/proc/mounts");
            ArrayList arrayList = new ArrayList(a2.size());
            for (String dVar : a2) {
                d dVar2 = new d(dVar);
                uys.this.Y.execute(new a(dVar2));
                arrayList.add(dVar2);
            }
            uys.this.aa.a.clear();
            uys.this.aa.a.addAll(arrayList);
            uys.this.Z.post(new Runnable() {
                public final void run() {
                    uys.this.aa.notifyDataSetChanged();
                }
            });
        }
    }

    /* renamed from: uys$d */
    class d {
        final String a;
        final boolean b;
        final boolean c;
        Optional<Long> d = Optional.e();
        Optional<Long> e = Optional.e();

        protected d(String str) {
            this.a = str;
            this.b = uys.this.W.startsWith(str);
            this.c = str.startsWith("/storage/emulated/0");
        }

        public final boolean a() {
            return !this.b && !b() && uys.a(uys.this.X, this.d);
        }

        public final boolean b() {
            return uys.this.b.a() != State.IDLE;
        }
    }

    /* renamed from: uys$e */
    class e extends BaseAdapter {
        /* access modifiers changed from: private */
        public final List<d> a;

        private e() {
            this.a = new ArrayList(4);
        }

        /* synthetic */ e(uys uys, byte b2) {
            this();
        }

        public final int getCount() {
            return this.a.size();
        }

        public final Object getItem(int i) {
            return this.a.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            fsc fsc = (fsc) fqv.b(view, fsc.class);
            if (fsc == null) {
                fqv.b();
                fsc = fsk.b(uys.this.p(), viewGroup, false);
            }
            d dVar = (d) this.a.get(i);
            fsc.getView().setTag(dVar);
            fsc.a(dVar.c ? uys.this.n().getString(R.string.cache_migration_fragment_device_storage) : uys.this.n().getString(R.string.cache_migration_fragment_sd_card));
            StringBuilder sb = new StringBuilder();
            if (!dVar.c) {
                sb.append(dVar.a);
                sb.append(10);
            }
            if (dVar.b && uys.this.X.b()) {
                sb.append(String.format(Locale.getDefault(), "%s: %s", new Object[]{uys.this.n().getString(R.string.cache_migration_fragment_currently_using), uys.a(uys.this, ((Long) uys.this.X.c()).longValue())}));
                sb.append(10);
            }
            if (!uys.this.X.b() || !dVar.e.b()) {
                sb.append(uys.this.n().getString(R.string.cache_migration_fragment_checking));
            } else {
                sb.append(String.format(Locale.getDefault(), "%s: %s %s: %s", new Object[]{uys.this.n().getString(R.string.cache_migration_fragment_available), uys.a(uys.this, ((Long) dVar.d.c()).longValue()), uys.this.n().getString(R.string.cache_migration_fragment_total), uys.a(uys.this, ((Long) dVar.e.c()).longValue())}));
            }
            fsc.b(sb.toString());
            fsc.d().setSingleLine(false);
            fsc.d().setMaxLines(3);
            fsc.getView().setEnabled(dVar.a());
            if (dVar.b) {
                fsc.c().setImageDrawable(new SpotifyIconDrawable(uys.this.n(), SpotifyIcon.CHECK_32));
                fsc.c().setScaleType(ScaleType.CENTER);
            }
            return fsc.getView();
        }
    }

    static /* synthetic */ String a(uys uys, long j) {
        String str = "%.1f %s";
        if (j > 1073741824) {
            Locale locale = Locale.getDefault();
            double d2 = (double) j;
            Double.isNaN(d2);
            return String.format(locale, str, new Object[]{Double.valueOf(((d2 / 1024.0d) / 1024.0d) / 1024.0d), uys.a((int) R.string.cache_migration_fragment_gigabytes)});
        } else if (j > 1048576) {
            Locale locale2 = Locale.getDefault();
            double d3 = (double) j;
            Double.isNaN(d3);
            return String.format(locale2, str, new Object[]{Double.valueOf((d3 / 1024.0d) / 1024.0d), uys.a((int) R.string.cache_migration_fragment_megabytes)});
        } else {
            Locale locale3 = Locale.getDefault();
            double d4 = (double) j;
            Double.isNaN(d4);
            return String.format(locale3, str, new Object[]{Double.valueOf(d4 / 1024.0d), uys.a((int) R.string.cache_migration_fragment_kilobytes)});
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

    public static jqx ah() {
        return new uys();
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
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
                uys.this.a(MoveCacheConfirmationActivity.a(uys.this.n(), dVar.a, ((Long) uys.this.X.a(Long.valueOf(0))).longValue()));
            }
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS_STORAGE, null);
    }

    public final uqm ag() {
        return uqo.o;
    }

    public final String b(Context context) {
        return context.getString(R.string.cache_migration_title);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.W = this.U.b();
        this.aa = new e(this, 0);
        a(this.aa);
        this.b.a((com.spotify.android.storage.MovingOrchestrator.a) new com.spotify.android.storage.MovingOrchestrator.a() {
            public final void a() {
                uys.this.Z.post(new Runnable() {
                    public final void run() {
                        uys.this.aa.notifyDataSetChanged();
                    }
                });
            }

            public final void b() {
                uys.this.Z.post(new Runnable() {
                    public final void run() {
                        uys.this.aa.notifyDataSetChanged();
                    }
                });
            }
        });
        this.Y.execute(new c(this.V));
        this.Y.execute(new b(this, 0));
    }

    public final String e() {
        return "internal:preferences_cache_migration";
    }
}
