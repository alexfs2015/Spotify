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
import com.spotify.mobile.android.wrapped2019.stories.templates.othertopartists.OtherTopArtist;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.List;

/* renamed from: keh reason: default package */
public final class keh {
    public static kjm<ked> a() {
        ObservableSource[] observableSourceArr = new ObservableSource[1];
        String str = "https://i.scdn.co/image/8da623db0b43f11f5a87d02837174d8ff80fe56f";
        String str2 = "https://p.scdn.co/mp3-preview/4cfd0499efdbdde3aaeecc5939e96548b2c34546";
        String str3 = "Inter-galactic Citizen";
        String str4 = "Planets are full of music. All over the universe.";
        kdo a = kdo.a(khb.a(ImmutableList.a(kgx.a("Italy", "https://i.scdn.co/image/f910050f26a0001e15f46e6c55957f886e2f5163", "Pika Chu", "https://p.scdn.co/mp3-preview/e5adf90985c8db6818eb12985b1fad9781f7989f"), kgx.a("Canada", "https://i.scdn.co/image/119a8424f9821a9bca4b384b934bbce561da0bd3", "Bulbasaur", "https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90"), kgx.a("Turkey", str, "Pinkfong", str2), kgx.a("Poland", "https://i.scdn.co/image/7342a80c88cde669b25b0776b3283f8266a65e70", "Psy Duck", "https://p.scdn.co/mp3-preview/031beee4d5475adb5fb70042ace2adb05671e3ad")), str3, str4, khc.a(StoryParagraph.builder().a("You've listened to the same song, $1, in $2 different planets.").a((List<String>) ImmutableList.a("Baby Shark", "27")).a())));
        String str5 = "https://p.scdn.co/mp3-preview/54633fb1c75af27495e491a0889ddf02ec3ad25e";
        kdo a2 = kdo.a(kfv.f().e(str5).d("https://i.scdn.co/image/3e5fe8e40f8e7a888ad49a0a235120fad53d5e3d").a("Your top artist of the decade was").b("Your top artist of the decade was Anitta.").c("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor").a());
        kdo a3 = kdo.a("winter", "Winter", "In 2019, you were always in season.", "https://i.scdn.co/image/9f2b5bdec9dd3daf4e8ee93feb19e00b0ab2a9a6", "https://i.scdn.co/image/ab67706f00000002f171f40be1ac9755569bf1b8", "https://i.scdn.co/image/bc37539ee4ad2d9bc3fe51d96cbf443f0d44aece", "https://i.scdn.co/image/7342a80c88cde669b25b0776b3283f8266a65e70", "https://p.scdn.co/mp3-preview/0fa4dbb8b2547fd7f9b7e54dd42e37b78af1edd4", false);
        kdo a4 = kdo.a("spring", "Spring", "In 2019, you were always in season.", "https://i.scdn.co/image/9e1acac44c23779cbdb02385403a733a6706e31a", "https://i.scdn.co/image/db35f97fba5e334b8a1a10285e8bc462c8b89f12", "https://i.scdn.co/image/bb05317292465b8809b29c00906c1a4b6a226194", "https://pl.scdn.co/images/pl/default/216d676e5eed5d7356cc725540f707eba649141f", "https://p.scdn.co/mp3-preview/c8428c5630e7d4645ad28d9c79f3fa3279d797d4", false);
        kdo a5 = kdo.a("summer", "Summer", "In 2019, you were always in season.", "https://i.scdn.co/image/21435daad8428f3d9ef3c552db1c5cb0feae5561", "https://i.scdn.co/image/10c890602bb0c5e2076e29d10c1d3c4addaa152f", "https://i.scdn.co/image/cdca7dc20c778ada42fb18506ea1f26857f01d17", "https://pl.scdn.co/images/pl/default/8ebffdb24cfc7b84ce1e37ee47988811648977dc", "https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90", false);
        kdo a6 = kdo.a("fall", "Fall", "In 2019, you were always in season.", "https://i.scdn.co/image/b1dfbe843b0b9f54ab2e588f33e7637d2dab065a", "https://pl.scdn.co/images/pl/default/f26392a46fb08ebad853478fc22d073ce63a5624", "https://i.scdn.co/image/4eb2647080fac9e75bf723cd955c68ff93346e2b", "https://i.scdn.co/image/ab67706f00000002a6e2870c97bde5e2719c20b8", "https://p.scdn.co/mp3-preview/8df204f0fcde51ea20d04606120fc899d04fd62b", true);
        String str6 = "1";
        String str7 = "The Daily";
        String str8 = "https://i.scdn.co/image/99ef853e48c8d344ce69552d2109e9b27ee6e43e";
        ObservableSource[] observableSourceArr2 = observableSourceArr;
        kdo a7 = kdo.a("fall", "super long text blah", "In 2019, you were always in season.", "https://i.scdn.co/image/b1dfbe843b0b9f54ab2e588f33e7637d2dab065a", "https://pl.scdn.co/images/pl/default/f26392a46fb08ebad853478fc22d073ce63a5624", "https://i.scdn.co/image/4eb2647080fac9e75bf723cd955c68ff93346e2b", "https://i.scdn.co/image/ab67706f00000002a6e2870c97bde5e2719c20b8", "https://p.scdn.co/mp3-preview/3597899d001fd3fdea8c13b3446ad9d99006950c", true);
        kdo kdo = a6;
        kdo kdo2 = a5;
        kdo kdo3 = a4;
        String str9 = "Your top podcasts of 2019";
        String str10 = "11,432";
        String str11 = "You spent $1 minutes listening to podcasts this year.";
        String str12 = "Comedy";
        String str13 = "True Crime";
        kdo kdo4 = a3;
        String str14 = "News";
        kdo kdo5 = a2;
        kdo kdo6 = a;
        String str15 = "Your favorite genre was $1 but you loved some $2 and $3 too.";
        String str16 = "Talking About Talking";
        kdo a8 = kdo.a(TopPodcasts.create(str2, str16, TopPodcastsTop.create(str9, ImmutableList.a(Podcast.create(str7, str6, str8), Podcast.create("The Root of Evil", "2", str), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"), Podcast.create("Stuff You Should Know", "4", "https://i.scdn.co/image/ccce9706e0d2b77820323a8d95199ef9e3bb7a0c"), Podcast.create("Fresh Air", "5", "https://i.scdn.co/image/426f79cb9c42117c8c8342753bf907e601b65adb"))), TopPodcastsStats.create(str8, StoryParagraph.create(str11, ImmutableList.a(str10)), StoryParagraph.create(str15, ImmutableList.a(str14, str13, str12)))));
        String str17 = str5;
        String str18 = str;
        String str19 = str6;
        String str20 = str7;
        kdo a9 = kdo.a(TopPodcasts.create(str2, str16, TopPodcastsTop.create(str9, ImmutableList.a(Podcast.create(str7, str6, str8), Podcast.create("The Root of Evil", "2", str), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"), Podcast.create("Stuff You Should Know", "4", "https://i.scdn.co/image/ccce9706e0d2b77820323a8d95199ef9e3bb7a0c"))), TopPodcastsStats.create(str8, StoryParagraph.create(str11, ImmutableList.a(str10)), StoryParagraph.create(str15, ImmutableList.a(str14, str13, str12)))));
        String str21 = str19;
        String str22 = str20;
        kdo kdo7 = a9;
        String str23 = str21;
        kdo a10 = kdo.a(TopPodcasts.create(str2, str16, TopPodcastsTop.create(str9, ImmutableList.a(Podcast.create(str22, str21, str8), Podcast.create("The Root of Evil", "2", str18), Podcast.create("My Favorite Murder", "3", "https://i.scdn.co/image/ce89eb319d1bae6f56a89a9a98b0c55e82c773b4"))), TopPodcastsStats.create(str8, StoryParagraph.create(str11, ImmutableList.a(str10)), StoryParagraph.create(str15, ImmutableList.a(str14, str13, str12)))));
        String str24 = str23;
        kdo kdo8 = a10;
        kdo a11 = kdo.a(TopPodcasts.create(str2, str16, TopPodcastsTop.create(str9, ImmutableList.a(Podcast.create(str22, str24, str8), Podcast.create("The Root of Evil", "2", str18))), TopPodcastsStats.create(str8, StoryParagraph.create(str11, ImmutableList.a(str10)), StoryParagraph.create(str15, ImmutableList.a(str14, str13, str12)))));
        kdo a12 = kdo.a(TopPodcasts.create(str2, str16, TopPodcastsTop.create(str9, ImmutableList.a(Podcast.create(str22, str24, str8))), TopPodcastsStats.create(str8, StoryParagraph.create(str11, ImmutableList.a(str10)), StoryParagraph.create(str15, ImmutableList.a(str14, str13, str12)))));
        String str25 = "https://p.scdn.co/mp3-preview/2bb534db0407addc3b919265f9635a223fcf1a90";
        String str26 = "Thank you for being premium since";
        String str27 = "Sometimes you just click.";
        String str28 = "Metal";
        String str29 = str17;
        String str30 = "Another year, another ad campaign!";
        String str31 = "So you like music ha!";
        String str32 = "Year is 2019!";
        String str33 = "And you listened to more than 2019 genres. Here is the breakdown.";
        observableSourceArr2[0] = Observable.b(ked.a(ImmutableList.a(kdo6, kdo5, kdo4, kdo3, kdo2, kdo, a7, a8, kdo7, kdo8, a11, a12, kdo.a(TopArtist.create("https://p.scdn.co/mp3-preview/d798cdd39070014dfb0c25c4e1b9e449ee63da20", "One lucky artist was your #1", StoryParagraph.create("You spent $1 hours listening to them", ImmutableList.a("264")), StoryParagraph.create("Your favorite song was \"$1\"", ImmutableList.a("Why I Still Love You - Acapella")), Artist.create("Missy Elliott", "https://i.scdn.co/image/ccbbf5f1d3023fd27ddbb84872853148f12e5687"))), kdo.a("Top Artists", ImmutableList.a(OtherTopArtist.a("https://i.scdn.co/image/c3b71e1bfd7e84280a2a63781a25b58c8b8d5930", "Blood Orange", "#2", "https://p.scdn.co/mp3-preview/031beee4d5475adb5fb70042ace2adb05671e3ad"), OtherTopArtist.a("https://i.scdn.co/image/9ab124f3323d161f87fc9b7f8b82ab1717483b3a", "Taylor Swift", "#3", "https://p.scdn.co/mp3-preview/fc529bd7c299b310b459e9e08afcf5fd6bb9a71f"), OtherTopArtist.a("https://i.scdn.co/image/3e5fe8e40f8e7a888ad49a0a235120fad53d5e3d", "Maggie Rogers", "#4", "https://p.scdn.co/mp3-preview/c8f67773594c078ad1973f5c46b1b600981043dc"), OtherTopArtist.a("https://i.scdn.co/image/fc73afc4489d397dc486f53e1a00720db5824685", "Loyle Carner", "#5", "https://p.scdn.co/mp3-preview/58d01f114b439e7452e650cc3a25fbbed9803365"))), kdo.a("https://p.scdn.co/mp3-preview/8df204f0fcde51ea20d04606120fc899d04fd62b", StoryParagraph.create("And since we’ve been together since $1 why stop there?", ImmutableList.a("2015")), StoryParagraph.create("The $1 wouldn’t have been the same without you.", ImmutableList.a("2010s"))), kdo.a("It's been a wild 5 years.", (List<kgl>) ImmutableList.a(kgl.a("2015", "Top Song", "Uptown Funk!", "https://i.scdn.co/image/77469465db1f618941285359fc3596601859566b", "Top Artist", "Taylor Swift", "https://i.scdn.co/image/62b33d12e2b9a033cf77585f6e3d4b2c6b3a63a1", "https://p.scdn.co/mp3-preview/88a794d97fcb4475f72a27be7baf71b94d5a9dda"), kgl.a("2016", "Top Song", "Love Yourself", "https://i.scdn.co/image/8b47495ce0c4a341f7196f70bcf4361e6257c1a0", "Top Artist", "Adele", "https://i.scdn.co/image/602102500b9cebde7559a5f9c16daaaef2846440", "https://p.scdn.co/mp3-preview/56dc3be142d25a505ef6c1acb5f512c4e52b3d01"), kgl.a("2017", "Top Song", "Despacito", "https://i.scdn.co/image/4a38c8437e101b914aa70ab4f763d75418e53bee", "Top Artist", "Ed Sheeran", "https://i.scdn.co/image/f55cab0739390cf3b2c2f773b9c779b2f0ae8a99", "https://p.scdn.co/mp3-preview/ce2ad348fa47a97fb31940351313bc4e4a744740"), kgl.a("2018", "Top Song", "Havana", "https://i.scdn.co/image/7429b64ba636934d53763b9076492b551b240003", "Top Artist", "Drake", "https://i.scdn.co/image/542d705154be4049fc927050d006987e63739bbd", "https://p.scdn.co/mp3-preview/663b794c2fc8da8f9bbe33698cb1bac567126a23"), kgl.a("2019", "Top Song", "Sunflower", "https://i.scdn.co/image/94105e271865c28853bfb7b44b38353a2fea45d6", "Top Artist", "Post Malone", "https://i.scdn.co/image/3a7ca45d4142d28274abfece4bd2db8a54cedf91", "https://p.scdn.co/mp3-preview/1a2ad1734ef6a402eb275ee47b05e6c0d8078754"))), kdo.a("We'll not make any minute count, but the more we soundtrack the better.", ImmutableList.a(MinutesListened.a(38283, "38,283 mins", 2019), MinutesListened.a(29234, "29,234 mins", 2018), MinutesListened.a(30183, "30,183 mins", 2017), MinutesListened.a(27847, "27,847 mins", 2016), MinutesListened.a(11227, "11,227 mins", 2015)), "https://p.scdn.co/mp3-preview/031beee4d5475adb5fb70042ace2adb05671e3ad"), kdo.a("We'll not make any minute count, but the more we soundtrack the better.", ImmutableList.a(MinutesListened.a(47005, "47,005 mins", 2019), MinutesListened.a(22183, "22,183 mins", 2017), MinutesListened.a(11227, "11,227 mins", 2015)), "https://p.scdn.co/mp3-preview/c8428c5630e7d4645ad28d9c79f3fa3279d797d4"), kdo.a(str25, str26, 2018, str27, StoryParagraph.create("You discovered $1 new artists this year. But you went deep with $2.", ImmutableList.a("1,274", "Lana Del Rey")), StoryParagraph.create("Your explored $1 of their albums, added them to $2 playlists, and spent over $3 hours with them.", ImmutableList.a("4", "3", "21")), "https://i.scdn.co/image/6e8dc460cfb6b89d7970302259febd0aa73b38c6"), kdo.a("One genre to rule them all.", "You don't really like different stuff.", str29, ImmutableList.g().c(kih.c().a(str28).a(100).a()).a()), kdo.a("2019 was a great year.", "So you like music ha!", str29, ImmutableList.g().c(kih.c().a("Jazz").a(50).a()).c(kih.c().a(str28).a(40).a()).a()), kdo.a("A year of music.", "K-Pop and metal don't mix", str29, ImmutableList.g().c(kih.c().a("K-Pop").a(50).a()).c(kih.c().a(str28).a(40).a()).c(kih.c().a("Jazz").a(10).a()).a()), kdo.a(str30, str31, str29, ImmutableList.g().c(kih.c().a("Hip-Hop").a(50).a()).c(kih.c().a(str28).a(20).a()).b((E[]) new kih[]{kih.c().a("Jazz").a(20).a(), kih.c().a("Pop").a(10).a()}).a()), b(), kdo.a(str32, str33, str29, ImmutableList.g().c(kih.c().a("Hip-Hop").a(50).a()).c(kih.c().a(str28).a(20).a()).b((E[]) new kih[]{kih.c().a("Jazz").a(15).a(), kih.c().a("Pop").a(10).a(), kih.c().a("Kitten Metal").a(5).a()}).a()))));
        return kla.a(observableSourceArr2);
    }

    private static kdo b() {
        String str = "WOS";
        return kdo.a("And you loved these songs the most:", (List<kja>) ImmutableList.a(kja.e().a("https://p.scdn.co/mp3-preview/8f1da5b1d357a186e0daae756f00dbf27d3ce2e7").b("https://i.scdn.co/image/a792f5f34e221ca53e6a28b40300a61e8a6a5678").c("Goteo").d("Duki").a(), kja.e().a("https://p.scdn.co/mp3-preview/a2486b829160d65e2bf30038bb3a5f76df3393b1").b("https://i.scdn.co/image/35d679278b52b057721b9fd77f1c078432d1be0d").c("China").d("Anuel AA").a(), kja.e().a("https://p.scdn.co/mp3-preview/2d1ab1a773476e609fffd1730d7107ca420d0cc7").b("https://i.scdn.co/image/96cd2aa91fbf7e897be29254a56b46251ca43def").c("Fresa").d("TINI").a(), kja.e().a("https://p.scdn.co/mp3-preview/ef7179c06e201d1deba58493ead10583cde07d4c").b("https://i.scdn.co/image/76da8428359a21e86aaff5e0447d9f0156a6f029").c("CANGURO").d(str).a(), kja.e().a("https://p.scdn.co/mp3-preview/bbb93b30e71d9c18736fb3ba053b876af87cf9e7").b("https://i.scdn.co/image/8d0aa86a3e84423cb6e3f0f6acd5364edee43549").c("Tutu").d("Camilo").a(), kja.e().a("https://p.scdn.co/mp3-preview/d798cdd39070014dfb0c25c4e1b9e449ee63da20").b("https://i.scdn.co/image/2998f57462e1c53b979d207209038d369bbd5e00").c("Nicki Nicole: Bzrp Music Sessions, Vol. 13").d("Bizarrap").a(), kja.e().a("https://p.scdn.co/mp3-preview/e7d3aa3b859de7c49e2ac5b17df11f98172631b9").b("https://i.scdn.co/image/d50a4a541efc46040860e1b7bb5a66da7d20242b").c("No Me Conoce - Remix").d("Jhay Cortez").a(), kja.e().a("https://p.scdn.co/mp3-preview/20e42ba2122a4176954b35728a219fac5a96119f").b("https://i.scdn.co/image/7a174f5281eddfc3d1bb4b3ed2652effc92a1f08").c("MELÓN VINO").d(str).a(), kja.e().a("https://p.scdn.co/mp3-preview/23c0b25cf824c1bfd7a814fe7cd1264c31a5a9dc").b("https://i.scdn.co/image/4923d440991830ab3a9fec7b2345df16a642287b").c("Callaita").d("Bad Bunny").a(), kja.e().a("https://p.scdn.co/mp3-preview/0fa4dbb8b2547fd7f9b7e54dd42e37b78af1edd4").b("https://i.scdn.co/image/0207cd3be9c941188041e58f115f5d8bf102d686").c("Otro Trago - Remix").d("Sech").a()), kiz.e().a("So we put them all in this playlist for you.").b("https://lineup-images.scdn.co/your-top-songs-2018_DEFAULT-en.jpg").c("spotify:playlist:37i9dQZF1Ejux1QEwzltuo").d("ADD TO YOUR LIBRARY").a());
    }
}
