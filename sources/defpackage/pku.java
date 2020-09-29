package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.spotify.music.R;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.b;
import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import com.spotify.music.features.pushnotifications.inapppreference.model.NotificationV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: pku reason: default package */
public final class pku implements b {
    private final Context a;
    private final Resources b;
    private final jsz c;
    private View d;
    private ListView e;
    private a f;
    private com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a g;
    private final List<plg> h = new ArrayList();
    private boolean i;
    private boolean j;
    private fuj k;

    /* renamed from: pku$a */
    static class a extends BaseAdapter {
        plg[] a;
        private final Context b;
        private final com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a c;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        public final boolean isEnabled(int i) {
            return false;
        }

        public a(Context context, com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a aVar) {
            this.b = context;
            this.c = aVar;
        }

        public final int getCount() {
            plg[] plgArr = this.a;
            if (plgArr == null) {
                return 0;
            }
            return plgArr.length;
        }

        public final void a(Collection<plg> collection) {
            this.a = (plg[]) collection.toArray(new plg[0]);
            notifyDataSetChanged();
        }

        public final int getItemViewType(int i) {
            return this.a[i].aB_();
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return this.a[i].a(this.b, this.c, view, viewGroup, i);
        }

        public final /* bridge */ /* synthetic */ Object getItem(int i) {
            return this.a[i];
        }
    }

    public pku(Context context, Resources resources, jsz jsz) {
        this.a = context;
        this.b = resources;
        this.c = jsz;
    }

    public final void a(com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a aVar, Bundle bundle) {
        this.g = aVar;
        this.g.a(this);
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("view_models");
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    this.h.add((plg) parcelable);
                }
            }
            bundle.setClassLoader(getClass().getClassLoader());
            this.i = bundle.getBoolean("server_settings_loaded");
        }
        this.g.a();
    }

    public final void a() {
        this.g.b();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_push_notification_settings, viewGroup, false);
        this.d = inflate.findViewById(R.id.progress);
        this.e = (ListView) inflate.findViewById(R.id.list);
        this.f = new a(this.a, this.g);
        this.f.a(this.h);
        this.e.setAdapter(this.f);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.offlineView);
        fqb.f();
        this.k = fum.a(viewStub);
        kyu.a(this.a, this.k, this.b.getString(R.string.push_notification_settings_offline));
        c();
        return inflate;
    }

    public final void a(com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a aVar) {
        if (this.g != aVar) {
            this.g = aVar;
            this.g.a(this);
        }
    }

    public final void a(List<Category> list) {
        this.h.clear();
        if (!list.isEmpty()) {
            for (Category category : list) {
                this.h.add(pld.a(category.getName()));
                List<NotificationV2> preferences = category.getPreferences();
                if (preferences != null && !preferences.isEmpty()) {
                    for (NotificationV2 notificationV2 : preferences) {
                        this.h.add(plf.a(notificationV2.getName(), notificationV2.getDescription()));
                        this.h.add(ple.a(notificationV2.getKey(), Channel.PUSH, notificationV2.isPushEnabled()));
                        this.h.add(ple.a(notificationV2.getKey(), Channel.EMAIL, notificationV2.isEmailEnabled()));
                    }
                }
            }
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.h);
            }
        }
        this.i = true;
        c();
    }

    public final void b() {
        this.j = true;
        if (this.h.isEmpty()) {
            this.c.a((int) R.string.toast_push_notification_settings_failed_fetch, 1, new Object[0]);
        } else {
            this.c.a((int) R.string.toast_push_notification_settings_failed_save, 0, new Object[0]);
        }
        c();
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArray("view_models", this.f.a);
        bundle.putBoolean("server_settings_loaded", this.i);
    }

    private void c() {
        ListView listView = this.e;
        int i2 = 4;
        if (listView != null) {
            listView.setVisibility(this.i ? 0 : 4);
        }
        if (this.d != null) {
            this.d.setVisibility(!this.i && !this.j ? 0 : 4);
        }
        fuj fuj = this.k;
        if (fuj != null) {
            View view = fuj.getView();
            if (!this.i && this.j) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    public final void a(String str, Channel channel, boolean z) {
        plg[] plgArr = this.f.a;
        int i2 = 0;
        while (true) {
            if (i2 >= plgArr.length) {
                i2 = -1;
                break;
            }
            plg plg = plgArr[i2];
            if (2 == plg.aB_()) {
                ple ple = (ple) plg;
                if (str.equals(ple.a) && channel == ple.b) {
                    break;
                }
            }
            i2++;
        }
        if (i2 >= -1) {
            ((ple) this.h.get(i2)).c = z;
        }
    }
}
