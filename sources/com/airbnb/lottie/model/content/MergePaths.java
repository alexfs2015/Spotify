package com.airbnb.lottie.model.content;

public final class MergePaths implements aag {
    public final String a;
    public final MergePathsMode b;

    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static MergePathsMode a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Merge : ExcludeIntersections : Intersect : Subtract : Add : Merge;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode) {
        this.a = str;
        this.b = mergePathsMode;
    }

    public final ya a(xq xqVar, aaq aaq) {
        if (xqVar.g) {
            return new yj(this);
        }
        xn.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
