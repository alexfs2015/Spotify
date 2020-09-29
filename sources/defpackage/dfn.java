package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: dfn reason: default package */
final class dfn extends dfm<FieldDescriptorType, Object> {
    dfn(int i) {
        super(i, 0);
    }

    public final void a() {
        if (!this.a) {
            for (int i = 0; i < b(); i++) {
                Entry b = b(i);
                if (((ddl) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : c()) {
                if (((ddl) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
