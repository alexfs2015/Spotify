package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qrj reason: default package */
public final class qrj {
    public List<TasteOnboardingItem> a = new ArrayList();
    PickerViewType b = PickerViewType.DEFAULT;

    public qrj(a aVar) {
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelableArrayList("key_items", new ArrayList(qrj.this.a));
                bundle.putString("key_picker_view_type", qrj.this.b.toString());
            }

            public final void c(Bundle bundle) {
                if (bundle != null) {
                    qrj.this.a = (List) fbp.a(bundle.getParcelableArrayList("key_items"));
                    qrj.this.b = PickerViewType.valueOf(bundle.getString("key_picker_view_type", PickerViewType.DEFAULT.toString()));
                }
            }
        });
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
