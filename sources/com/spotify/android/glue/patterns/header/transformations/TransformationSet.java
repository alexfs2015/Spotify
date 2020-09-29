package com.spotify.android.glue.patterns.header.transformations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TransformationSet implements fwp {
    public static final TransformationSet c = new TransformationSet(ExecutionOrder.INDEPENDENT, Collections.emptyList());
    public ExecutionOrder a;
    public List<fwp> b;

    public enum ExecutionOrder {
        SEQUENTIAL {
            /* access modifiers changed from: 0000 */
            public final float a(List<fwp> list, float f) {
                for (fwp a : list) {
                    f = a.a(f);
                }
                return f;
            }
        },
        INDEPENDENT {
            /* access modifiers changed from: 0000 */
            public final float a(List<fwp> list, float f) {
                for (fwp a : list) {
                    a.a(f);
                }
                return f;
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract float a(List<fwp> list, float f);
    }

    public TransformationSet() {
        this.b = new ArrayList();
    }

    private TransformationSet(ExecutionOrder executionOrder, List<fwp> list) {
        this.a = executionOrder;
        this.b = list;
    }

    public final float a(float f) {
        return this.a.a(this.b, f);
    }
}
