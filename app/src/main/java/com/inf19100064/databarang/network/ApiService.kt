package com.inf19100064.databarang.network

import com.inf19100064.databarang.ResponseUsersItem
import retrofit2.Call
import retrofit2.http.GET
import javax.security.auth.callback.Callback

interface ApiService {
    @GET("users")
    fun getUser() : Call<List<ResponseUsersItem?>>
}
