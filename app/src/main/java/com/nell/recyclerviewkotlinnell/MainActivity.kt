package com.nell.recyclerviewkotlinnell

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pakaianList = listOf<Pakaian>(
            Pakaian(
                R.drawable.a,
                namePakaian = "Cheongsam S-332",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                            "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                            "\nUkuran      : XS, S, M, L, XL" +
                            "\n" +
                            "\nHarga       : Rp. 1.240.000"
            ),
            Pakaian(
                R.drawable.b,
                namePakaian = "Cheongsam K-392",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.330.000"
            ),
            Pakaian(
                R.drawable.c,
                namePakaian = "Cheongsam D-637",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.100.000"
            ),
            Pakaian(
                R.drawable.d,
                namePakaian = "Cheongsam R-945",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.250.000"
            ),
            Pakaian(
                R.drawable.e,
                namePakaian = "Cheongsam P-845",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.110.000"
            ),
            Pakaian(
                R.drawable.f,
                namePakaian = "Cheongsam AA-888",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.630.000"
            ),
            Pakaian(
                R.drawable.g,
                namePakaian = "Cheongsam S-329",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.820.000"
            ),
            Pakaian(
                R.drawable.h,
                namePakaian = "Cheongsam T-302",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.936.500"
            ),
            Pakaian(
                R.drawable.i,
                namePakaian = "Cheongsam U-198",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.220.300"
            ),
            Pakaian(
                R.drawable.j,
                namePakaian = "Cheongsam N-945",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.970.000"
            ),
            Pakaian(
                R.drawable.k,
                namePakaian = "Cheongsam R-367",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.790.000"
            ),
            Pakaian(
                R.drawable.l,
                namePakaian = "Cheongsam J-643",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.970.200"
            ),
            Pakaian(
                R.drawable.m,
                namePakaian = "Cheongsam RN-031221",
                descPakaian = "Deskripsi  : Pakaian Anak Couple Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.309.000 / Pasang"
            ),
            Pakaian(
                R.drawable.n,
                namePakaian = "Cheongsam M-742",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 2.740.800"
            ),
            Pakaian(
                R.drawable.o,
                namePakaian = "Cheongsam C-117",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.504.200"
            ),
            Pakaian(
                R.drawable.p,
                namePakaian = "Cheongsam B-732",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.930.000"
            ),
            Pakaian(
                R.drawable.q,
                namePakaian = "Cheongsam X-687",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.440.000"
            ),
            Pakaian(
                R.drawable.r,
                namePakaian = "Cheongsam R-210",
                descPakaian = "Deskripsi  : Pakaian Anak Laki-Laki Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.222.500"
            ),
            Pakaian(
                R.drawable.s,
                namePakaian = "Cheongsam F-568",
                descPakaian = "Deskripsi  : Pakaian Anak Perempuan Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.930.700"
            ),
            Pakaian(
                R.drawable.t,
                namePakaian = "Cheongsam L-381",
                descPakaian = "Deskripsi  : Pakaian Anak Laki-Laki Usia 2-5 Tahun" +
                        "\nWarna       : Merah, Merah Muda, Emas, Putih, Biru" +
                        "\nUkuran      : XS, S, M, L, XL" +
                        "\n" +
                        "\nHarga       : Rp. 1.380.400"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kain)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PakaianAdapter (this,pakaianList){
            val intent = Intent (this, DetailPakaianActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}