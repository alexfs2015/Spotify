package defpackage;

import android.content.Context;
import com.spotify.music.features.settings.adapter.Group;
import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.features.settings.adapter.SettingsAdapter;
import java.util.Collections;

/* renamed from: qme reason: default package */
public interface qme {

    /* renamed from: qme$a */
    public interface a {

        /* renamed from: qme$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static qmt a(Context context, SettingsAdapter settingsAdapter) {
                AnonymousClass1 r0 = new qmt(context, settingsAdapter, settingsAdapter) {
                    private /* synthetic */ SettingsAdapter b;

                    {
                        this.b = r3;
                    }

                    public final int a(int i) {
                        SettingsAdapter settingsAdapter = this.b;
                        return i >= settingsAdapter.h.size() ? Group.OTHER.ordinal() : ((Item) settingsAdapter.h.get(i)).a(settingsAdapter.a).ordinal();
                    }
                };
                Collections.addAll(r0.a, settingsAdapter.c());
                r0.a();
                r0.notifyDataSetChanged();
                return r0;
            }
        }
    }
}
