package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.Artist;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.Podcast;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcastsStats;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcastsTop;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.List;

/* renamed from: kgj reason: default package */
public final class kgj {
    private static final khv a = khv.a(true);
    private static final khv b = khv.a(false);

    /* access modifiers changed from: private */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kgf a(com.spotify.wrapped2019.v1.proto.ConsumerResponse r8) {
        /*
            flc$e<java.lang.String> r0 = r8.d
            com.google.common.collect.ImmutableList$a r1 = com.google.common.collect.ImmutableList.g()
            r2 = 0
            r3 = 0
        L_0x0008:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x01d6
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1915971029: goto L_0x00aa;
                case -1390259508: goto L_0x009f;
                case -1159077519: goto L_0x0095;
                case -318452137: goto L_0x008a;
                case 106306073: goto L_0x0080;
                case 117685908: goto L_0x0075;
                case 271478337: goto L_0x006b;
                case 312270319: goto L_0x0060;
                case 1117905926: goto L_0x0055;
                case 1542016787: goto L_0x004a;
                case 1818097852: goto L_0x003f;
                case 1818097853: goto L_0x0034;
                case 1818097854: goto L_0x0029;
                case 1818097855: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x00b4
        L_0x001e:
            java.lang.String r6 = "season_q4"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 7
            goto L_0x00b5
        L_0x0029:
            java.lang.String r6 = "season_q3"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 6
            goto L_0x00b5
        L_0x0034:
            java.lang.String r6 = "season_q2"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 5
            goto L_0x00b5
        L_0x003f:
            java.lang.String r6 = "season_q1"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 4
            goto L_0x00b5
        L_0x004a:
            java.lang.String r6 = "decades"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 8
            goto L_0x00b5
        L_0x0055:
            java.lang.String r6 = "minutes_listened"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 13
            goto L_0x00b5
        L_0x0060:
            java.lang.String r6 = "podcasts"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 11
            goto L_0x00b5
        L_0x006b:
            java.lang.String r6 = "secondary_artists"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 2
            goto L_0x00b5
        L_0x0075:
            java.lang.String r6 = "top_songs"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 9
            goto L_0x00b5
        L_0x0080:
            java.lang.String r6 = "top_genre"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 3
            goto L_0x00b5
        L_0x008a:
            java.lang.String r6 = "premium"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 10
            goto L_0x00b5
        L_0x0095:
            java.lang.String r6 = "top_artist"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 1
            goto L_0x00b5
        L_0x009f:
            java.lang.String r6 = "global_citizen"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 12
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r6 = "decades_top_tracks_artists"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00b4
            r4 = 0
            goto L_0x00b5
        L_0x00b4:
            r4 = -1
        L_0x00b5:
            switch(r4) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x01af;
                case 2: goto L_0x019d;
                case 3: goto L_0x018b;
                case 4: goto L_0x0175;
                case 5: goto L_0x015f;
                case 6: goto L_0x0148;
                case 7: goto L_0x0131;
                case 8: goto L_0x0110;
                case 9: goto L_0x00f9;
                case 10: goto L_0x01d2;
                case 11: goto L_0x00e6;
                case 12: goto L_0x00d3;
                case 13: goto L_0x00ba;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            goto L_0x01d2
        L_0x00ba:
            com.spotify.wrapped2019.v1.proto.MinutesListenedStory r4 = r8.v()
            java.lang.String r5 = r4.d
            flc$e<com.spotify.wrapped2019.v1.proto.ListenedData> r6 = r4.f
            com.google.common.collect.ImmutableList r6 = com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened.a(r6)
            java.lang.String r4 = r4.e
            khv r7 = a
            kfp r4 = defpackage.kfp.a(r5, r6, r4, r7)
            r1.c(r4)
            goto L_0x01d2
        L_0x00d3:
            com.spotify.wrapped2019.v1.proto.GlobalCitizenStory r4 = r8.s()
            kjo r4 = defpackage.kjo.a(r4)
            khv r5 = b
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x00e6:
            com.spotify.wrapped2019.v1.proto.PodcastsStory r4 = r8.q()
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts r4 = com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts.fromProto(r4)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x00f9:
            com.spotify.wrapped2019.v1.proto.TopSongsStory r4 = r8.t()
            java.lang.String r5 = r4.d
            flc$e<com.spotify.wrapped2019.v1.proto.Track> r4 = r4.e
            com.google.common.collect.ImmutableList r4 = defpackage.kmg.a(r4)
            khv r6 = b
            kfp r4 = defpackage.kfp.a(r5, r4, r6)
            r1.c(r4)
            goto L_0x01d2
        L_0x0110:
            com.spotify.wrapped2019.v1.proto.DecadesStory r4 = r8.w()
            java.lang.String r5 = r4.d
            com.spotify.wrapped2019.v1.proto.Paragraph r6 = r4.k()
            com.spotify.mobile.android.wrapped2019.stories.StoryParagraph r6 = com.spotify.mobile.android.wrapped2019.stories.StoryParagraph.fromProto(r6)
            com.spotify.wrapped2019.v1.proto.Paragraph r4 = r4.l()
            com.spotify.mobile.android.wrapped2019.stories.StoryParagraph r4 = com.spotify.mobile.android.wrapped2019.stories.StoryParagraph.fromProto(r4)
            khv r7 = a
            kfp r4 = defpackage.kfp.a(r5, r6, r4, r7)
            r1.c(r4)
            goto L_0x01d2
        L_0x0131:
            com.spotify.wrapped2019.v1.proto.SeasonStory r4 = r8.p()
            boolean r5 = a(r3, r0)
            kkq r4 = defpackage.kkq.a(r4, r5)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x0148:
            com.spotify.wrapped2019.v1.proto.SeasonStory r4 = r8.o()
            boolean r5 = a(r3, r0)
            kkq r4 = defpackage.kkq.a(r4, r5)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x015f:
            com.spotify.wrapped2019.v1.proto.SeasonStory r4 = r8.n()
            boolean r5 = a(r3, r0)
            kkq r4 = defpackage.kkq.a(r4, r5)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x0175:
            com.spotify.wrapped2019.v1.proto.SeasonStory r4 = r8.m()
            boolean r5 = a(r3, r0)
            kkq r4 = defpackage.kkq.a(r4, r5)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x018b:
            com.spotify.wrapped2019.v1.proto.TopGenreStory r4 = r8.u()
            kls r4 = defpackage.kls.a(r4)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x019d:
            com.spotify.wrapped2019.v1.proto.SecondaryArtistsStory r4 = r8.l()
            kke r4 = defpackage.kke.a(r4)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x01af:
            com.spotify.wrapped2019.v1.proto.TopArtistStory r4 = r8.k()
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist r4 = com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist.fromProto(r4)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
            goto L_0x01d2
        L_0x01c1:
            com.spotify.wrapped2019.v1.proto.DecadeTopTracksArtistsStory r4 = r8.r()
            kiu r4 = defpackage.kiu.a(r4)
            khv r5 = a
            kfp r4 = defpackage.kfp.a(r4, r5)
            r1.c(r4)
        L_0x01d2:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x01d6:
            com.google.common.collect.ImmutableList r8 = r1.a()
            kgf r8 = defpackage.kgf.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgj.a(com.spotify.wrapped2019.v1.proto.ConsumerResponse):kgf");
    }

    public static kmv<kgf> a() {
        ObservableSource[] observableSourceArr = new ObservableSource[1];
        String str = "https://i.scdn.co/image/8da623db0b43f11f5a87d02837174d8ff80fe56f";
        String str2 = "https://p.scdn.co/mp3-preview/4cfd0499efdbdde3aaeecc5939e96548b2c34546";
        String str3 = "https://p.scdn.co/mp3-preview/031beee4d5475adb5fb70042ace2adb05671e3ad";
        String str4 = "Inter-galactic Citizen";
        String str5 = "Planets are full of music. All over the universe.";
        kfp a2 = kfp.a(kjo.a(ImmutableList.a(kjk.a("Italy", "https://i.scdn.co/image/f910050f26a0001e15f46e6c55957f886e2f5163", "Pika Chu", "https://p.scdn.co/mp3-preview/e5adf90985c8db6818eb12985b1fad9781f7989f"), kjk.a("Canada", "https://i.scdn.co/image/119a8424f9821a9bca4b384b934bbce561da0bd3", "Bulbasaur", "https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90"), kjk.a("Turkey", str, "Pinkfong", str2), kjk.a("Poland", "https://i.scdn.co/image/7342a80c88cde669b25b0776b3283f8266a65e70", "Psy Duck", str3)), str4, str5, kjp.a(StoryParagraph.builder().a("You've listened to the same song, $1, in $2 different planets.").a((List<String>) ImmutableList.a("Baby Shark", "27")).a())), b);
        String str6 = "https://p.scdn.co/mp3-preview/54633fb1c75af27495e491a0889ddf02ec3ad25e";
        a aVar = new a(kii.g().f(str6).e("https://i.scdn.co/image/3e5fe8e40f8e7a888ad49a0a235120fad53d5e3d").a("Your Artist of the Decade is").b("Your Artist of the Decade").d("Anitta").c("This is a pretty big deal.").a(), a);
        String str7 = "In 2019, you were always in season.";
        kfp a3 = kfp.a(kkq.j().a("winter").b("Winter").c(str7).d("https://i.scdn.co/image/9f2b5bdec9dd3daf4e8ee93feb19e00b0ab2a9a6").e("https://i.scdn.co/image/ab67706f00000002f171f40be1ac9755569bf1b8").f("https://i.scdn.co/image/bc37539ee4ad2d9bc3fe51d96cbf443f0d44aece").g("https://i.scdn.co/image/7342a80c88cde669b25b0776b3283f8266a65e70").h("https://p.scdn.co/mp3-preview/0fa4dbb8b2547fd7f9b7e54dd42e37b78af1edd4").a(false).a(), a);
        kfp a4 = kfp.a(kkq.j().a("spring").b("Spring").c(str7).d("https://i.scdn.co/image/9e1acac44c23779cbdb02385403a733a6706e31a").e("https://i.scdn.co/image/db35f97fba5e334b8a1a10285e8bc462c8b89f12").f("https://i.scdn.co/image/bb05317292465b8809b29c00906c1a4b6a226194").g("https://pl.scdn.co/images/pl/default/216d676e5eed5d7356cc725540f707eba649141f").h("https://p.scdn.co/mp3-preview/c8428c5630e7d4645ad28d9c79f3fa3279d797d4").a(false).a(), a);
        kfp a5 = kfp.a(kkq.j().a("summer").b("Summer").c(str7).d("https://i.scdn.co/image/21435daad8428f3d9ef3c552db1c5cb0feae5561").e("https://i.scdn.co/image/10c890602bb0c5e2076e29d10c1d3c4addaa152f").f("https://i.scdn.co/image/cdca7dc20c778ada42fb18506ea1f26857f01d17").g("https://pl.scdn.co/images/pl/default/8ebffdb24cfc7b84ce1e37ee47988811648977dc").h("https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90").a(false).a(), a);
        kfp a6 = kfp.a(kkq.j().a("fall").b("Fall").c(str7).d("https://i.scdn.co/image/b1dfbe843b0b9f54ab2e588f33e7637d2dab065a").e("https://pl.scdn.co/images/pl/default/f26392a46fb08ebad853478fc22d073ce63a5624").f("https://i.scdn.co/image/4eb2647080fac9e75bf723cd955c68ff93346e2b").g("https://i.scdn.co/image/ab67706f00000002a6e2870c97bde5e2719c20b8").h("https://p.scdn.co/mp3-preview/8df204f0fcde51ea20d04606120fc899d04fd62b").a(true).a(), a);
        kfp a7 = kfp.a(kkq.j().a("fall").b("super long text blah").c(str7).d("https://i.scdn.co/image/b1dfbe843b0b9f54ab2e588f33e7637d2dab065a").e("https://pl.scdn.co/images/pl/default/f26392a46fb08ebad853478fc22d073ce63a5624").f("https://i.scdn.co/image/4eb2647080fac9e75bf723cd955c68ff93346e2b").g("https://i.scdn.co/image/ab67706f00000002a6e2870c97bde5e2719c20b8").h("https://p.scdn.co/mp3-preview/3597899d001fd3fdea8c13b3446ad9d99006950c").a(true).a(), a);
        String str8 = "1";
        String str9 = "The Daily";
        String str10 = "https://i.scdn.co/image/99ef853e48c8d344ce69552d2109e9b27ee6e43e";
        ObservableSource[] observableSourceArr2 = observableSourceArr;
        kfp kfp = a7;
        kfp kfp2 = a6;
        kfp kfp3 = a5;
        kfp kfp4 = a4;
        kfp kfp5 = a3;
        String str11 = "Your top podcasts of 2019";
        TopPodcastsTop create = TopPodcastsTop.create(str11, ImmutableList.a(Podcast.create(str9, str8, str10), Podcast.create("The Root of Evil", "2", str), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"), Podcast.create("Stuff You Should Know", "4", "https://i.scdn.co/image/ccce9706e0d2b77820323a8d95199ef9e3bb7a0c"), Podcast.create("Fresh Air", "5", "https://i.scdn.co/image/426f79cb9c42117c8c8342753bf907e601b65adb")));
        String str12 = "11,432";
        String str13 = "You spent $1 minutes listening to podcasts this year.";
        a aVar2 = aVar;
        String str14 = "Your favorite genre was $1 but you loved some $2 and $3 too.";
        TopPodcastsStats create2 = TopPodcastsStats.create(str10, StoryParagraph.create(str13, ImmutableList.a(str12)), StoryParagraph.create(str14, ImmutableList.a("News", "True Crime", "Comedy")));
        String str15 = "Talking About Talking";
        kfp a8 = kfp.a(TopPodcasts.create(str2, str15, create, create2), a);
        kfp kfp6 = a2;
        String str16 = str6;
        String str17 = str3;
        kfp a9 = kfp.a(TopPodcasts.create(str2, str15, TopPodcastsTop.create(str11, ImmutableList.a(Podcast.create(str9, str8, str10), Podcast.create("The Root of Evil", "2", str), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"), Podcast.create("Stuff You Should Know", "4", "https://i.scdn.co/image/ccce9706e0d2b77820323a8d95199ef9e3bb7a0c"))), TopPodcastsStats.create(str10, StoryParagraph.create(str13, ImmutableList.a(str12)), StoryParagraph.create(str14, ImmutableList.a("News", "True Crime", "Comedy")))), a);
        kfp a10 = kfp.a(TopPodcasts.create(str2, str15, TopPodcastsTop.create(str11, ImmutableList.a(Podcast.create(str9, str8, str10), Podcast.create("The Root of Evil", "2", str), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"))), TopPodcastsStats.create(str10, StoryParagraph.create(str13, ImmutableList.a(str12)), StoryParagraph.create(str14, ImmutableList.a("News", "True Crime", "Comedy")))), a);
        kfp a11 = kfp.a(TopPodcasts.create(str2, str15, TopPodcastsTop.create(str11, ImmutableList.a(Podcast.create(str9, str8, str10), Podcast.create("The Root of Evil", "2", str))), TopPodcastsStats.create(str10, StoryParagraph.create(str13, ImmutableList.a(str12)), StoryParagraph.create(str14, ImmutableList.a("News", "True Crime", "Comedy")))), a);
        kfp a12 = kfp.a(TopPodcasts.create(str2, str15, TopPodcastsTop.create(str11, ImmutableList.a(Podcast.create(str9, str8, str10))), TopPodcastsStats.create(str10, StoryParagraph.create(str13, ImmutableList.a(str12)), StoryParagraph.create(str14, ImmutableList.a("News", "True Crime", "Comedy")))), a);
        String str18 = str17;
        String str19 = "https://p.scdn.co/mp3-preview/8df204f0fcde51ea20d04606120fc899d04fd62b";
        String str20 = "https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90";
        String str21 = "Thanks";
        String str22 = "In perfect harmony.";
        String str23 = "https://i.scdn.co/image/6e8dc460cfb6b89d7970302259febd0aa73b38c6";
        h hVar = new h(str20, str21, StoryParagraph.create("Thanks for being premium since $1", ImmutableList.a("2018")), str22, StoryParagraph.create("You discovered $1 new artists this year. But you went deep with $2.", ImmutableList.a("1,274", "Lana Del Rey")), StoryParagraph.create("Your explored $1 of their albums, added them to $2 playlists, and spent over $3 hours with them.", ImmutableList.a("4", "3", "21")), str23, a);
        String str24 = str16;
        k kVar = new k("https://p.scdn.co/mp3-preview/0fa4dbb8b2547fd7f9b7e54dd42e37b78af1edd4", "So we put them all in this playlist for you.", "https://lineup-images.scdn.co/your-top-songs-2018_DEFAULT-en.jpg", "spotify:playlist:37i9dQZF1Ejux1QEwzltuo", "ADD TO YOUR LIBRARY", "✓ ADDED TO YOUR LIBRARY", b);
        observableSourceArr2[0] = Observable.b(kgf.a(ImmutableList.a(kfp6, aVar2, kfp5, kfp4, kfp3, kfp2, kfp, a8, a9, a10, a11, a12, kfp.a(TopArtist.create("https://p.scdn.co/mp3-preview/d798cdd39070014dfb0c25c4e1b9e449ee63da20", "One lucky artist was your #1", StoryParagraph.create("You spent $1 hours listening to them", ImmutableList.a("264")), StoryParagraph.create("Your favorite song was \"$1\"", ImmutableList.a("Why I Still Love You - Acapella")), Artist.create("Missy Elliott", "https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687")), a), kfp.a(kke.a("Top Artists", ImmutableList.a(kkd.a("https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687", "Missy Elliott", "#1", str18), kkd.a("https://i.scdn.co/image/c3b71e1bfd7e84280a2a63781a25b58c8b8d5930", "Blood Orange", "#2", str18), kkd.a("https://i.scdn.co/image/9ab124f3323d161f87fc9b7f8b82ab1717483b3a", "Taylor Swift", "#3", "https://p.scdn.co/mp3-preview/fc529bd7c299b310b459e9e08afcf5fd6bb9a71f"), kkd.a("https://i.scdn.co/image/3e5fe8e40f8e7a888ad49a0a235120fad53d5e3d", "A Tribe Called Quest", "#4", "https://p.scdn.co/mp3-preview/c8f67773594c078ad1973f5c46b1b600981043dc"), kkd.a("https://i.scdn.co/image/fc73afc4489d397dc486f53e1a00720db5824685", "The Presidents Of The United States Of America, Earth, Milky Way, and Beyond", "#5", "https://p.scdn.co/mp3-preview/58d01f114b439e7452e650cc3a25fbbed9803365"))), a), kfp.a(kke.a("Top Artists", ImmutableList.a(kkd.a("https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687", "Missy Elliott", "#1", str18), kkd.a("https://i.scdn.co/image/c3b71e1bfd7e84280a2a63781a25b58c8b8d5930", "Blood Orange", "#2", str18), kkd.a("https://i.scdn.co/image/9ab124f3323d161f87fc9b7f8b82ab1717483b3a", "Taylor Swift", "#3", "https://p.scdn.co/mp3-preview/fc529bd7c299b310b459e9e08afcf5fd6bb9a71f"), kkd.a("https://i.scdn.co/image/3e5fe8e40f8e7a888ad49a0a235120fad53d5e3d", "A Tribe Called Quest", "#4", "https://p.scdn.co/mp3-preview/c8f67773594c078ad1973f5c46b1b600981043dc"))), a), kfp.a(kke.a("Top Artists", ImmutableList.a(kkd.a("https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687", "Missy Elliott", "#1", str18), kkd.a("https://i.scdn.co/image/c3b71e1bfd7e84280a2a63781a25b58c8b8d5930", "Blood Orange", "#2", str18), kkd.a("https://i.scdn.co/image/9ab124f3323d161f87fc9b7f8b82ab1717483b3a", "Taylor Swift", "#3", "https://p.scdn.co/mp3-preview/fc529bd7c299b310b459e9e08afcf5fd6bb9a71f"))), a), kfp.a(kke.a("Top Artists", ImmutableList.a(kkd.a("https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687", "Missy Elliott", "#1", str18), kkd.a("https://i.scdn.co/image/c3b71e1bfd7e84280a2a63781a25b58c8b8d5930", "Blood Orange", "#2", str18))), a), kfp.a(str19, StoryParagraph.create("And since we’ve been together since $1 why stop there?", ImmutableList.a("2015")), StoryParagraph.create("The $1 wouldn’t have been the same without you.", ImmutableList.a("2010s")), b), kfp.a(kiu.a(StoryParagraph.create("It's been an iconic $1.", ImmutableList.a("5 years")), ImmutableList.a(kiy.a("2015", "Top Song", "Uptown Funk!", "https://i.scdn.co/image/77469465db1f618941285359fc3596601859566b", "Top Artist", "Taylor Swift", "https://i.scdn.co/image/62b33d12e2b9a033cf77585f6e3d4b2c6b3a63a1", "https://p.scdn.co/mp3-preview/88a794d97fcb4475f72a27be7baf71b94d5a9dda"), kiy.a("2016", "Top Song", "Love Yourself", "https://i.scdn.co/image/8b47495ce0c4a341f7196f70bcf4361e6257c1a0", "Top Artist", "Adele", "https://i.scdn.co/image/602102500b9cebde7559a5f9c16daaaef2846440", "https://p.scdn.co/mp3-preview/56dc3be142d25a505ef6c1acb5f512c4e52b3d01"), kiy.a("2017", "Top Song", "Despacito", "https://i.scdn.co/image/4a38c8437e101b914aa70ab4f763d75418e53bee", "Top Artist", "Ed Sheeran", "https://i.scdn.co/image/f55cab0739390cf3b2c2f773b9c779b2f0ae8a99", "https://p.scdn.co/mp3-preview/ce2ad348fa47a97fb31940351313bc4e4a744740"), kiy.a("2018", "Top Song", "Havana", "https://i.scdn.co/image/7429b64ba636934d53763b9076492b551b240003", "Top Artist", "Drake", "https://i.scdn.co/image/542d705154be4049fc927050d006987e63739bbd", "https://p.scdn.co/mp3-preview/663b794c2fc8da8f9bbe33698cb1bac567126a23"), kiy.a("2019", "Top Song", "Sunflower", "https://i.scdn.co/image/94105e271865c28853bfb7b44b38353a2fea45d6", "Top Artist", "Post Malone", "https://i.scdn.co/image/3a7ca45d4142d28274abfece4bd2db8a54cedf91", "https://p.scdn.co/mp3-preview/1a2ad1734ef6a402eb275ee47b05e6c0d8078754"))), a), kfp.a("We'll not make any minute count, but the more we soundtrack the better.", ImmutableList.a(MinutesListened.a(38283, "38,283 mins", "2019"), MinutesListened.a(29234, "29,234 mins", "2018"), MinutesListened.a(30183, "30,183 mins", "2017"), MinutesListened.a(27847, "27,847 mins", "2016"), MinutesListened.a(11227, "11,227 mins", "2015")), str18, a), kfp.a("We'll not make any minute count, but the more we soundtrack the better.", ImmutableList.a(MinutesListened.a(47005, "47,005 mins", "2019"), MinutesListened.a(22183, "22,183 mins", "2017"), MinutesListened.a(11227, "11,227 mins", "2015")), "https://p.scdn.co/mp3-preview/c8428c5630e7d4645ad28d9c79f3fa3279d797d4", a), hVar, kfp.a(kls.e().a("One genre to rule them all.").b("You don't really like different stuff.").c(str24).a((List<klq>) ImmutableList.g().c(klq.c().a("Metal").a(100).a()).a()).a(), a), kfp.a(kls.e().a("2019 was a great year.").b("So you like music ha!").c(str24).a((List<klq>) ImmutableList.g().c(klq.c().a("Jazz").a(50).a()).c(klq.c().a("Metal").a(40).a()).a()).a(), a), kfp.a(kls.e().a("A year of music.").b("K-Pop and metal don't mix").c(str24).a((List<klq>) ImmutableList.g().c(klq.c().a("K-Pop").a(50).a()).c(klq.c().a("Metal").a(40).a()).c(klq.c().a("Jazz").a(10).a()).a()).a(), a), kfp.a(kls.e().a("Another year, another ad campaign!").b("So you like music ha!").c(str24).a((List<klq>) ImmutableList.g().c(klq.c().a("Hip-Hop").a(50).a()).c(klq.c().a("Metal").a(20).a()).b((E[]) new klq[]{klq.c().a("Jazz").a(20).a(), klq.c().a("Pop").a(10).a()}).a()).a(), a), kfp.a("And you loved these songs the most:", ImmutableList.a(kmg.e().a("https://p.scdn.co/mp3-preview/8f1da5b1d357a186e0daae756f00dbf27d3ce2e7").b("https://i.scdn.co/image/a792f5f34e221ca53e6a28b40300a61e8a6a5678").c("Goteo").d("Duki").a(), kmg.e().a("https://p.scdn.co/mp3-preview/a2486b829160d65e2bf30038bb3a5f76df3393b1").b("https://i.scdn.co/image/35d679278b52b057721b9fd77f1c078432d1be0d").c("China").d("Anuel AA").a(), kmg.e().a("https://p.scdn.co/mp3-preview/2d1ab1a773476e609fffd1730d7107ca420d0cc7").b("https://i.scdn.co/image/96cd2aa91fbf7e897be29254a56b46251ca43def").c("Fresa").d("TINI").a(), kmg.e().a("https://p.scdn.co/mp3-preview/ef7179c06e201d1deba58493ead10583cde07d4c").b("https://i.scdn.co/image/76da8428359a21e86aaff5e0447d9f0156a6f029").c("CANGURO").d("WOS").a(), kmg.e().a("https://p.scdn.co/mp3-preview/bbb93b30e71d9c18736fb3ba053b876af87cf9e7").b("https://i.scdn.co/image/8d0aa86a3e84423cb6e3f0f6acd5364edee43549").c("Tutu").d("Camilo").a(), kmg.e().a("https://p.scdn.co/mp3-preview/d798cdd39070014dfb0c25c4e1b9e449ee63da20").b("https://i.scdn.co/image/2998f57462e1c53b979d207209038d369bbd5e00").c("Nicki Nicole: Bzrp Music Sessions, Vol. 13").d("Bizarrap").a(), kmg.e().a("https://p.scdn.co/mp3-preview/e7d3aa3b859de7c49e2ac5b17df11f98172631b9").b("https://i.scdn.co/image/d50a4a541efc46040860e1b7bb5a66da7d20242b").c("No Me Conoce - Remix").d("Jhay Cortez").a(), kmg.e().a("https://p.scdn.co/mp3-preview/20e42ba2122a4176954b35728a219fac5a96119f").b("https://i.scdn.co/image/7a174f5281eddfc3d1bb4b3ed2652effc92a1f08").c("MELÓN VINO").d("WOS").a(), kmg.e().a("https://p.scdn.co/mp3-preview/23c0b25cf824c1bfd7a814fe7cd1264c31a5a9dc").b("https://i.scdn.co/image/4923d440991830ab3a9fec7b2345df16a642287b").c("Callaita").d("Bad Bunny").a(), kmg.e().a("https://p.scdn.co/mp3-preview/0fa4dbb8b2547fd7f9b7e54dd42e37b78af1edd4").b("https://i.scdn.co/image/0207cd3be9c941188041e58f115f5d8bf102d686").c("Otro Trago - Remix").d("Sech").a()), b), kVar, kfp.a(kls.e().a("Year is 2019!").b("And you listened to more than 2019 genres. Here is the breakdown.").c(str24).a((List<klq>) ImmutableList.g().c(klq.c().a("Hip-Hop").a(50).a()).c(klq.c().a("Metal").a(20).a()).b((E[]) new klq[]{klq.c().a("Jazz").a(15).a(), klq.c().a("Pop").a(10).a(), klq.c().a("Kitten Metal").a(5).a()}).a()).a(), a), new j(kky.d().a("We've been so lucky to share this time with you.").a((List<kkz>) ImmutableList.a(kkz.a("https://i.scdn.co/image/ab67616d0000b273482214974c1f68a0258d14f6", "summary_card_0"), kkz.a("https://charts-images.scdn.co/REGIONAL_GLOBAL_DEFAULT.jpg", "summary_card_1"))).b("https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90").a(), a))));
        return koj.a(observableSourceArr2);
    }

    public static kmv<kgf> a(kgn kgn) {
        return koj.a(kgn.a().f($$Lambda$kgj$b_BcNFMV5DNAAKTlQHZjYS5zp3I.INSTANCE).d());
    }

    private static boolean a(int i, List<String> list) {
        int i2 = i + 1;
        return i2 >= list.size() || !((String) list.get(i2)).startsWith("season_");
    }
}
