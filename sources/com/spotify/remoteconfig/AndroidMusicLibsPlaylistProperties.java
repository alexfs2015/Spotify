package com.spotify.remoteconfig;

public abstract class AndroidMusicLibsPlaylistProperties implements vum {

    public enum StupidFlag2 implements vuc {
        DOG("dog"),
        CAT("cat");
        
        final String value;

        private StupidFlag2(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public enum StupidFlag3 implements vuc {
        DOG("dog"),
        CAT("cat");
        
        final String value;

        private StupidFlag3(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public enum StupidFlag4 implements vuc {
        DOG("dog"),
        CAT("cat");
        
        final String value;

        private StupidFlag4(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(StupidFlag2 stupidFlag2);

        public abstract a a(StupidFlag3 stupidFlag3);

        public abstract a a(StupidFlag4 stupidFlag4);

        public abstract a a(boolean z);

        public abstract AndroidMusicLibsPlaylistProperties a();

        public abstract a b(boolean z);
    }

    public static AndroidMusicLibsPlaylistProperties a(vuo vuo) {
        String str = "android-music-libs-playlist";
        boolean a2 = vuo.a(str, "always_show_windowed_tracks_in_playlists", false);
        boolean a3 = vuo.a(str, "stupid_flag", false);
        StupidFlag2 stupidFlag2 = (StupidFlag2) vuo.a(str, "stupid_flag_2", StupidFlag2.CAT);
        StupidFlag3 stupidFlag3 = (StupidFlag3) vuo.a(str, "stupid_flag_3", StupidFlag3.DOG);
        return new defpackage.vtt.a().a(false).b(false).a(StupidFlag2.CAT).a(StupidFlag3.DOG).a(StupidFlag4.DOG).a(a2).b(a3).a(stupidFlag2).a(stupidFlag3).a((StupidFlag4) vuo.a(str, "stupid_flag_4", StupidFlag4.DOG)).a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract StupidFlag2 c();

    public abstract StupidFlag3 d();

    public abstract StupidFlag4 e();
}