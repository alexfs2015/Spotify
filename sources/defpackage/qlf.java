package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import java.util.Map;

/* renamed from: qlf reason: default package */
public final class qlf implements vua<qle> {
    private final wlc<Map<PickerViewType, wlc<qir>>> a;
    private final wlc<Map<PickerViewType, wlc<qib>>> b;

    private qlf(wlc<Map<PickerViewType, wlc<qir>>> wlc, wlc<Map<PickerViewType, wlc<qib>>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qlf a(wlc<Map<PickerViewType, wlc<qir>>> wlc, wlc<Map<PickerViewType, wlc<qib>>> wlc2) {
        return new qlf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qle((Map) this.a.get(), (Map) this.b.get());
    }
}
