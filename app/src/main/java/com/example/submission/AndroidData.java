package com.example.submission;

import java.util.ArrayList;

public class AndroidData {
    private static String[] androidNames = {
            "Alpha & Beta",
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Baen",
            "Kitkat",
            "Lolipop",
            "Marshmellow",
            "Nougat",
            "Oreo",
            "Pie"
    };

    private static String[] androidDetails = {
        "Versi percobaan sudah mulai dikembangkan pada November 2007. Kode yang digunakan saat itu memakai nama-nama robot dalam kisah fiksi ilmiah. Yaitu Android Astroboy sebagai versi alpha dan Android Bender sebagai versi beta.",
            "Android Cupcake dikenal sebagai generasi pertama. Namun, kalau dilihat dari tingkatan API (Antarmuka Pemrograman Aplikasi), ia merupakan API ke-3. Menggunakan kernel Linux 2.6.7, Android Cupcake telah mendukung pemasangan aplikasi pihak ketiga via Playstore.",
            "Tak lama setelah peluncuran Cupcake, Google kembali merilis Android Doughnut atau Donut pada September 2009. Peluncuran versi yang terlalu cepat membuat pengembangan OS ini tidak begitu banyak. Hanya peningkatan di beberapa fitur seperti kamera, pencarian, dan dukungan untuk resolusi layar WVGA.",
            "Menggunakan nama semacam kue sus asal Prancis, Android Éclair diluncurkan pada Oktober 2009. Hanya berselang 1 bulan dari versi sebelumnya yang dirilis terlalu cepat. Bisa dibilang bahwa Eclair merupakan penyempurnaan dari versi Cupcake. Penyempurnaan fitur animasi layar dan kamera menjadi pembuktiannya.",
            "Merupakan kependekan dari Frozen Yoghurt, Android Froyo diluncurkan ke publik ada Mei 2010. Cukup panjang waktu yang digunakan untuk pengembangannya. Di sini berbagai fitur Android mendapatkan peningkatan signifikan. Mulai dari kinerja, kecepatan, penggunaan memori, hingga fitur keamanan yang mendukung angka dan karakter unik.",
            "Enam bulan masa pengembangan tidaklah sia-sia. Gingerbread segera menjadi favorit sejak awal rilisnya pada Desember 2010. Alasan utama karena kestabilan dan kecepatannya, serta penghematan daya yang semakin mantap.",
            "Android Honeycomb merupakan generasi pertama Android yang dioptimalkan secara khusus untuk perangkat tablet. Dan segera disambut dengan gembira sejak diluncurkan pada Februari 2011.",
            "Membutuhkan lebih dari 8 bulan sejak peluncuran Honeycomb, Ice Cream Sandwich segera membuat penggunanya jatuh cinta. Peningkatan utamanya adalah pada tampilan yang menjadi sangat smooth dan sentuhan yang responsif. Pengguna Android saat itu bahkan sudah sangat senang hanya dengan menggeser-geser layar saja.",
            "Setelah berfokus pada optimalisasi tampilan di Android ICS, Jelly Bean terlihat difokuskan untuk meningkatkan kinerja perangkat. Android yang dirilis pada Juni 2012 ini tidak terlalu banyak perubahan pada tampilan. Akan tetapi efek peningkatan kinerja sistem, keamanan, dan koneksi bluetooth semakin terasa.",
            "Seperti Honeycomb, Android Kitkat diluncurkan untuk mengakomodasi tablet dan smartphone dengan layar besar. Karena itu peningkatan terjadi di berbagai macam lini.",
            "Peluncuran Android Lollipop menunjukkan bahwa Google berfokus mengintegrasikan secara sempurna Android. Sehingga Android dapat digunakan di perangkat apapun dengan lebar dan resolusi layar tingkat berapapun.",
            "Mulai versi ini, Android tak terburu-buru memberikan update karena kestabilannya telah sangat memuaskan. Karena itu versi perantara 5-6 tidak dirilis ke publik. Marshmallow baru diluncurkan versi penuhnya pada Oktober 2015.",
            "Diluncurkan Agustus 2016, Android Nougat memberikan banyak sekali peningkatan fitur. Hingga lebih dari 50 fitur ditambahkan terkait kinerja, kecepatan, tampilan, keamanan, konektivitas, dan kompatibilitas.",
            "Kehadiran Oreo pada Agustus 2017 menghadirkan babak baru yang disebut Treble Project. Yaitu kemampuan perangkat Android untuk mendapatkan update secara langsungnya lewat internet.",
            "Setahun setelah Oreo, Android merilis versi ke-sembilannya, Android Pie, pada Agustus 2018. Secara performa, tingkatan Android setelah Oreo tidak terlalu jauh berbeda dengan versi sebelumnya."
    };

    private static int[] androidImage = {
      R.drawable.alpha,
      R.drawable.cupcake,
      R.drawable.donut,
      R.drawable.eclair,
      R.drawable.froyo,
      R.drawable.gingerbread,
      R.drawable.honeycomb,
      R.drawable.icecream_sandwich,
      R.drawable.jellybean,
      R.drawable.kitkat,
      R.drawable.lolipop,
      R.drawable.marshmellow,
      R.drawable.nougat,
      R.drawable.oreo,
      R.drawable.pie,
    };

    static ArrayList<Android> getListData(){
        ArrayList<Android> list = new ArrayList<>();
        for (int position = 0; position<androidNames.length; position++){
            Android android = new Android();
            android.setName(androidNames[position]);
            android.setDetail(androidDetails[position]);
            android.setImage(androidImage[position]);
            list.add(android);
        }
        return list;
    }
}
