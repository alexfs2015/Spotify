package defpackage;

import android.content.Context;
import com.spotify.music.features.settings.adapter.Group;
import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.features.settings.adapter.SettingsAdapter;
import java.util.Collections;

/* renamed from: qdb reason: default package */
public interface qdb {

    /* renamed from: qdb$a */
    public interface a {

        /* renamed from: qdb$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static qdq a(Context context, SettingsAdapter settingsAdapter) {
                AnonymousClass1 r0 = new qdq(context, settingsAdapter, settingsAdapter) {
                    private /* synthetic */ SettingsAdapter b;

                    {
                        this.b = r3;
                    }

                    public final int a(int i) {
                        SettingsAdapter settingsAdapter = this.b;
                        if (i >= settingsAdapter.h.size()) {
                            return Group.OTHER.ordinal();
                        }
                        return ((Item) settingsAdapter.h.get(i)).a(settingsAdapter.a).ordinal();
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
