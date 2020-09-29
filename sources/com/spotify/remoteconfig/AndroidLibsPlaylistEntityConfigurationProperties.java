package com.spotify.remoteconfig;

public abstract class AndroidLibsPlaylistEntityConfigurationProperties implements vhh {

    public enum StupidFlag2 implements vgx {
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

    public enum StupidFlag4 implements vgx {
        HOUSE("house"),
        CAR("car");
        
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

        public abstract a a(StupidFlag4 stupidFlag4);

        public abstract a a(boolean z);

        public abstract AndroidLibsPlaylistEntityConfigurationProperties a();

        public abstract a b(boolean z);

        public abstract a c(boolean z);

        public abstract a d(boolean z);

        public abstract a e(boolean z);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract StupidFlag2 e();

    public abstract boolean f();

    public abstract StupidFlag4 g();

    public static AndroidLibsPlaylistEntityConfigurationProperties a(vhj vhj) {
        String str = "android-libs-playlist-entity-configuration";
        boolean a2 = vhj.a(str, "allow_auto_play_of_episodes_in_shuffle_mode_in_playlist", false);
        boolean a3 = vhj.a(str, "enable_weighted_shuffle_playback", true);
        boolean a4 = vhj.a(str, "respect_shows_collection_flag_in_playlist_for_including_episodes", true);
        boolean a5 = vhj.a(str, "stupid_flag", true);
        StupidFlag2 stupidFlag2 = (StupidFlag2) vhj.a(str, "stupid_flag_2", StupidFlag2.DOG);
        boolean a6 = vhj.a(str, "stupid_flag_3", false);
        return new defpackage.vgi.a().a(false).b(true).c(true).d(true).a(StupidFlag2.DOG).e(false).a(StupidFlag4.CAR).a(a2).b(a3).c(a4).d(a5).a(stupidFlag2).e(a6).a((StupidFlag4) vhj.a(str, "stupid_flag_4", StupidFlag4.CAR)).a();
    }
}
