package com.spotify.mobile.android.spotlets.miniplayer;

import java.util.ArrayList;
import java.util.List;

public final class MiniPlayerDisplayRule {
    public List<ho<Item, b>> a = new ArrayList();

    public enum Item {
        CONNECT,
        SUGGESTED_TRACK
    }

    public static class a {
        public final MiniPlayerDisplayRule a = new MiniPlayerDisplayRule();

        public final a a(Item item, b bVar) {
            this.a.a.add(ho.a(item, bVar));
            return this;
        }
    }

    public static final class b {
        public int a;

        private b(int i) {
            this.a = i;
        }

        /* synthetic */ b(int i, byte b) {
            this(-1);
        }

        public b(b bVar) {
            this.a = bVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    public static b a() {
        boolean z = true & false;
        return new b(-1, 0);
    }

    public final iwt b() {
        return new iwt(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniPlayerDisplayRule)) {
            return false;
        }
        MiniPlayerDisplayRule miniPlayerDisplayRule = (MiniPlayerDisplayRule) obj;
        if (this.a.size() != miniPlayerDisplayRule.a.size()) {
            return false;
        }
        boolean z = false & false;
        for (int i = 0; i < this.a.size(); i++) {
            if (!((ho) this.a.get(i)).equals(miniPlayerDisplayRule.a.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
