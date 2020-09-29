package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;

public final class ItemDiffResult<T> {
    public final ImmutableList<T> a;
    public final ImmutableList<T> b;
    public final b c;

    /* renamed from: com.spotify.music.newplaying.scroll.container.ItemDiffResult$3 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a = new int[Action.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.newplaying.scroll.container.ItemDiffResult$Operation$Action[] r0 = com.spotify.music.newplaying.scroll.container.ItemDiffResult.Operation.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.newplaying.scroll.container.ItemDiffResult$Operation$Action r1 = com.spotify.music.newplaying.scroll.container.ItemDiffResult.Operation.Action.ADDITION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.newplaying.scroll.container.ItemDiffResult$Operation$Action r1 = com.spotify.music.newplaying.scroll.container.ItemDiffResult.Operation.Action.REMOVAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.newplaying.scroll.container.ItemDiffResult.AnonymousClass3.<clinit>():void");
        }
    }

    public static final class Operation {
        public final int a;
        public final int b;
        public final Action c;
        public int d;

        public enum Action {
            ADDITION,
            REMOVAL
        }

        public Operation(int i, int i2, Action action) {
            this.a = i;
            this.b = i2;
            this.c = action;
        }
    }

    public interface a<T> {
        void a(T t, int i);

        void b(T t, int i);
    }

    public ItemDiffResult(final ImmutableList<T> immutableList, final ImmutableList<T> immutableList2) {
        this.a = immutableList;
        this.b = immutableList2;
        this.c = oa.a(new defpackage.oa.a() {
            public final int a() {
                return immutableList2.size();
            }

            public final boolean a(int i, int i2) {
                return immutableList2.get(i) == immutableList.get(i2);
            }

            public final int b() {
                return immutableList.size();
            }

            public final boolean b(int i, int i2) {
                return immutableList2.get(i).equals(immutableList.get(i2));
            }
        }, false);
    }
}
