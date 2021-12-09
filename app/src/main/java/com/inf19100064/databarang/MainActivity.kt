package com.inf19100064.databarang

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.inf19100064.databarang.network.koneksi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.security.auth.callback.Callback as Callback1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(findViewById(R.id.toolbar))

//        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
//    }
        koneksi.run {
            val enqueue = service.getUser().enqueue (object : Callback<List<ResponseUsersItem?>> {
                override fun onFailure(call: Call<List<ResponseUsersItem?>>, t: Throwable) {
                    Log.d("pesan", t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<List<ResponseUsersItem?>>,
                    response: Response<List<ResponseUsersItem?>>
                ) {
                    if (response.isSuccessful) {
                        Log.d("pesan", response.body().toString());
                    }
                }
            })
            enqueue
        }
    }}

class ResponseUsersItem {

}
