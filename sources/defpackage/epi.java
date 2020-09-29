package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: epi reason: default package */
final class epi extends eph<FieldDescriptorType, Object> {
    epi(int i) {
        super(i, 0);
    }

    public final void a() {
        if (!this.a) {
            for (int i = 0; i < b(); i++) {
                Entry b = b(i);
                if (((eni) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : c()) {
                if (((eni) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
