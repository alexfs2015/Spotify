package defpackage;

import com.google.common.base.Function;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.Collections;
import java.util.List;

/* renamed from: qsy reason: default package */
public final class qsy {
    static {
        new Function<TasteOnboardingItem, Iterable<TasteOnboardingItem>>() {
            public final /* synthetic */ Object apply(Object obj) {
                TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
                return tasteOnboardingItem.relatedItems().isEmpty() ? Collections.singleton(tasteOnboardingItem) : fcp.a(Collections.singleton(tasteOnboardingItem), tasteOnboardingItem.relatedItems());
            }
        };
    }

    public static int a(List<TasteOnboardingItem> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(((TasteOnboardingItem) list.get(i)).id())) {
                return i;
            }
        }
        throw new IllegalStateException(String.format("Position not found %s", new Object[]{str}));
    }
}
