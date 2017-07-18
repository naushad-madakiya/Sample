package com.android.githubsampleandroid;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * Created by Naushad on 14-07-2017.
 */

public interface ServerApi {

    @GET("/orgs/octokit/repos")
    Observable<ResponseBody> getOctoRepository();

}
