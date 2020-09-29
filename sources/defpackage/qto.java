package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import java.util.Map;

/* renamed from: qto reason: default package */
public final class qto implements wig<qtn> {
    private final wzi<Map<PickerViewType, wzi<qrb>>> a;
    private final wzi<Map<PickerViewType, wzi<qql>>> b;

    private qto(wzi<Map<PickerViewType, wzi<qrb>>> wzi, wzi<Map<PickerViewType, wzi<qql>>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qto a(wzi<Map<PickerViewType, wzi<qrb>>> wzi, wzi<Map<PickerViewType, wzi<qql>>> wzi2) {
        return new qto(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qtn((Map) this.a.get(), (Map) this.b.get());
    }
}
