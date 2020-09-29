package com.airbnb.lottie.model.content;

public final class MergePaths implements zs {
    public final String a;
    public final MergePathsMode b;

    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static MergePathsMode a(int i) {
            if (i == 1) {
                return Merge;
            }
            if (i == 2) {
                return Add;
            }
            if (i == 3) {
                return Subtract;
            }
            if (i == 4) {
                return Intersect;
            }
            if (i != 5) {
                return Merge;
            }
            return ExcludeIntersections;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode) {
        this.a = str;
        this.b = mergePathsMode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public final xm a(xc xcVar, aac aac) {
        if (xcVar.g) {
            return new xv(this);
        }
        wz.b("Animation contains merge paths but they are disabled.");
        return null;
    }
}
