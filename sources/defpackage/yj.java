package defpackage;

import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.MergePaths.MergePathsMode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: yj reason: default package */
public final class yj implements yh, yk {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final String d;
    private final List<yk> e = new ArrayList();
    private final MergePaths f;

    /* renamed from: yj$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[MergePathsMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.Merge     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.Add     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.Subtract     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.Intersect     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.AnonymousClass1.<clinit>():void");
        }
    }

    public yj(MergePaths mergePaths) {
        if (VERSION.SDK_INT >= 19) {
            this.d = mergePaths.a;
            this.f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a(Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size > 0; size--) {
            yk ykVar = (yk) this.e.get(size);
            if (ykVar instanceof yb) {
                yb ybVar = (yb) ykVar;
                List c2 = ybVar.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path e2 = ((yk) c2.get(size2)).e();
                    e2.transform(ybVar.d());
                    this.b.addPath(e2);
                }
            } else {
                this.b.addPath(ykVar.e());
            }
        }
        yk ykVar2 = (yk) this.e.get(0);
        if (ykVar2 instanceof yb) {
            yb ybVar2 = (yb) ykVar2;
            List c3 = ybVar2.c();
            for (int i = 0; i < c3.size(); i++) {
                Path e3 = ((yk) c3.get(i)).e();
                e3.transform(ybVar2.d());
                this.a.addPath(e3);
            }
        } else {
            this.a.set(ykVar2.e());
        }
        this.c.op(this.a, this.b, op);
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            ((yk) this.e.get(i)).a(list, list2);
        }
    }

    public final void a(ListIterator<ya> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            ya yaVar = (ya) listIterator.previous();
            if (yaVar instanceof yk) {
                this.e.add((yk) yaVar);
                listIterator.remove();
            }
        }
    }

    public final String b() {
        return this.d;
    }

    public final Path e() {
        this.c.reset();
        int i = AnonymousClass1.a[this.f.b.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                this.c.addPath(((yk) this.e.get(i2)).e());
            }
        } else if (i == 2) {
            a(Op.UNION);
        } else if (i == 3) {
            a(Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            a(Op.INTERSECT);
        } else if (i == 5) {
            a(Op.XOR);
        }
        return this.c;
    }
}